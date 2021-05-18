package nexosservice.producto.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import nexosservice.model.entity.Cargo;
import nexosservice.producto.dao.IServiceCargoDao;
import nexosservice.producto.service.ICargoService;

public class CargoServiceImpl implements ICargoService{
	
	@Autowired
	private IServiceCargoDao iServiceCargoDao;

	@Override
	public Cargo saveCargo(@RequestBody  Cargo cargo) {
		
		return iServiceCargoDao.save(cargo);
	}

}
