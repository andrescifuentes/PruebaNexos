package nexosservice.producto.manager;

import java.text.ParseException;
import java.util.List;



import nexosservice.model.entity.Producto;
import nexosservice.producto.dto.ExceptionDTO;

public interface IProductoManager {

	public List<Producto> findAll() ; // Buscar todo

	public Producto findById(Long id) throws ExceptionDTO; // buscar por id

	public Producto actulizar(Long id,Producto cliente)throws ExceptionDTO, ParseException;

	public Producto save(Producto cliente)throws ExceptionDTO, ParseException;
	
	public void delete(Long id,Producto producto) throws ExceptionDTO;

}
