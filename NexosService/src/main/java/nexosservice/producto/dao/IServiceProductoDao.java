package nexosservice.producto.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nexosservice.model.entity.Producto;

@Repository
public interface IServiceProductoDao  extends CrudRepository<Producto,Long >{
	
	
	@Query(value ="select count(*) from producto P where P.nombre_Producto =?1",nativeQuery = true )
	public int contadorNombreProducto(String nombreProducto);
	
	
	
	
	
	
	

}
