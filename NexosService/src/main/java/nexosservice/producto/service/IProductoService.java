package nexosservice.producto.service;

import java.util.List;

import nexosservice.model.entity.Producto;



public interface IProductoService {
	

	public List<Producto> findAll(); // Buscar todo 
	
	public Producto findById(Long id); // buscar por id 
	
	public Producto actulizar(Producto cliente);
	
	public int contadorNombreProducto(String nombreProducto);

	public void delete(Long id);
	

}
