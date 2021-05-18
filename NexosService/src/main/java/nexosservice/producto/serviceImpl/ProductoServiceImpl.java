package nexosservice.producto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nexosservice.model.entity.Producto;
import nexosservice.producto.dao.IServiceProductoDao;
import nexosservice.producto.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IServiceProductoDao   iServiceProductoDao;
	

	@Override
	public List<Producto> findAll() {
		
		return (List<Producto>) iServiceProductoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		
		return iServiceProductoDao.findById(id).orElse(null);
	}

	@Override
	public Producto actulizar(Producto cliente) {
	
		return iServiceProductoDao.save(cliente);
	}

	@Override
	public void delete(Long id) {
		
		iServiceProductoDao.deleteById(id);
		
	}

	@Override
	public int contadorNombreProducto(String nombreProducto) {
	
		return iServiceProductoDao.contadorNombreProducto(nombreProducto);
	}

}
