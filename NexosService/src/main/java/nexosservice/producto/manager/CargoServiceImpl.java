package nexosservice.producto.manager;

import nexosservice.model.entity.Cargo;
import nexosservice.producto.service.ICargoService;

public class CargoServiceImpl implements ICargoServiceManager {

	private ICargoService iCargoService;
	
	@Override
	public Cargo saveCargo(Cargo cargo) {
		
		return iCargoService.saveCargo(cargo);
	}

}
