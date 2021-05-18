package nexosservice.producto.dao;

import org.springframework.data.repository.CrudRepository;

import nexosservice.model.entity.Usuario;

public interface IServiceUsuarioDao extends CrudRepository<Usuario,Long>{

}
