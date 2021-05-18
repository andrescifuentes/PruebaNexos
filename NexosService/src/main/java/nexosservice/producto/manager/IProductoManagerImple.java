package nexosservice.producto.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nexosservice.model.entity.Producto;
import nexosservice.model.entity.Usuario;
import nexosservice.producto.dao.IServiceProductoDao;
import nexosservice.producto.dto.ExceptionDTO;
import nexosservice.producto.service.IProductoService;
import nexosservice.producto.service.IUsuarioService;

import static nexosservice.producto.utils.RouterConstas.*;

@Service
public class IProductoManagerImple implements IProductoManager {

	@Autowired
	private IProductoService iProductoService;
	

	@Autowired
	private IUsuarioService iUsuarioService;

	@Override
	public List<Producto> findAll() {

		return (List<Producto>) iProductoService.findAll();
	}

	@Override
	public Producto findById(Long id) throws ExceptionDTO {

		try {

			Producto responseBD = iProductoService.findById(id);

			if (responseBD != null) {

				return responseBD;

			} else {

				throw new ExceptionDTO(EXCEPTION_NOT_FIND_BY_ID, STATUS_BAD_REQUEST);

			}

		} catch (ExceptionDTO e) {

			throw new ExceptionDTO(e.getMensaje(), e.getStatus());

		}

	}

	@Override
	public Producto actulizar(Long id,Producto producto) throws ExceptionDTO, ParseException {

		Date fechaActual = new Date();
		Date fechaIngreso = new Date();
		Producto responseSaveDb = new Producto();
		Usuario usuario = new Usuario();
		
		try {
                 	
			Producto responseBD = iProductoService.findById(id);

			if (responseBD != null) {

				producto.getNombre_producto().toLowerCase();

				responseBD.setNombre_producto(producto.getNombre_producto());
				responseBD.setCantidad(producto.getCantidad());
				responseBD.setUsuario(producto.getUsuario());
				responseBD.setFch_ingreso(producto.getFch_ingreso());

				fechaIngreso = formatoFecha(responseBD.getFch_ingreso());

				if (fechaIngreso.before(fechaActual) || fechaIngreso.equals(fechaActual)) {

					int contador = iProductoService.contadorNombreProducto(responseBD.getNombre_producto());

					if (contador > 0) {

						throw new ExceptionDTO(EXCEPTION_NAME_PRODUCTO, STATUS_BAD_REQUEST);

					} else {

						responseSaveDb = iProductoService.actulizar(responseBD);

						return responseSaveDb;

					}

				}

			} else {

				throw new ExceptionDTO(BAD_REQUEST, STATUS_BAD_REQUEST);
				
			}

		} catch (ExceptionDTO e) {

			throw new ExceptionDTO(e.getMensaje(), e.getStatus());
		}

		return responseSaveDb;
	}

	@Override
	public Producto save(Producto producto) throws ExceptionDTO, ParseException {

		
		Date fechaActual = new Date();
		Date fechaIngreso = new Date();
		Producto responseSaveDb = new Producto();

		try {


			if (producto != null) {

				producto.getNombre_producto().toLowerCase();

				fechaIngreso = formatoFecha(producto.getFch_ingreso());

				if (fechaIngreso.before(fechaActual) || fechaIngreso.equals(fechaActual)) {

					int contador = iProductoService.contadorNombreProducto(producto.getNombre_producto());

					if (contador > 0) {

						throw new ExceptionDTO(EXCEPTION_NAME_PRODUCTO, STATUS_BAD_REQUEST);

					} else {

						responseSaveDb = iProductoService.actulizar(producto);

						return responseSaveDb;

					}

				}

			} else {

				throw new ExceptionDTO(BAD_REQUEST, STATUS_BAD_REQUEST);
				
			}

		} catch (ExceptionDTO e) {

			throw new ExceptionDTO(e.getMensaje(), e.getStatus());
		}

		return responseSaveDb;
	}


	@Override
	public void delete(Long id,Producto producto) throws ExceptionDTO {
		
		try {
		Producto responseBD = iProductoService.findById(id);

		if (responseBD != null && responseBD.getUsuario().equals(producto.getUsuario()) ) {
			
			iProductoService.delete(id);
			
		}else {
			
			throw new ExceptionDTO(EXECEPTION_ELIMINAR_DATE, STATUS_BAD_REQUEST);
			
		}
		}catch (ExceptionDTO e) {
			throw new ExceptionDTO (e.getMensaje(), e.getStatus());
		}	
	

	}

	// metodos

	public Date formatoFecha(String date) throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date fechaActual = new Date();
		Date fechaIngreso = new Date();

		fechaIngreso = dateFormat.parse(date);

		return fechaIngreso;

	}

}
