package nexosservice.producto.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nexosservice.model.entity.Cargo;

@Repository
public interface IServiceCargoDao extends CrudRepository<Cargo, Long>{

}
