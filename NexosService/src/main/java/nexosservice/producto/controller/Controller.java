package nexosservice.producto.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static nexosservice.producto.utils.RouterConstas.*;

import nexosservice.model.entity.Producto;
import nexosservice.producto.dto.ExceptionDTO;
import nexosservice.producto.manager.IProductoManager;

@CrossOrigin(origins =  CROSS_ORIGIN ) // *
@RestController // API REST
@RequestMapping(CONTROLLER_PATH)
public class Controller {

	@Autowired
	private IProductoManager iProductoManager;

	@GetMapping(FIND_ALL)
	public List<Producto> findAll() {

		return iProductoManager.findAll();
	}

	@GetMapping(FIND_BY_ID)
	public Producto findById(@PathVariable Long id) throws ExceptionDTO {

		return iProductoManager.findById(id);
	}

	@PostMapping(UPDATE)
	public Producto actulizar(@PathVariable Long id , @RequestBody Producto producto) throws ExceptionDTO, ParseException {

		return iProductoManager.actulizar(id,producto);
	}

	@PostMapping(SAVE)
	public Producto save(@RequestBody Producto producto) throws ExceptionDTO,ParseException {

		return iProductoManager.save(producto);
	}

	@DeleteMapping(DELETE)
	public void delete(@PathVariable Long id,@RequestBody Producto producto)throws ExceptionDTO {
		
		iProductoManager.delete(id,producto);

	}

}
