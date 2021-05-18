package nexosservice.producto.controller;

import static nexosservice.producto.utils.RouterConstas.*;
import static nexosservice.producto.utils.RouterConstas.CROSS_ORIGIN;
import static nexosservice.producto.utils.RouterConstas.SAVE;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nexosservice.model.entity.Cargo;
import nexosservice.producto.manager.ICargoServiceManager;


@CrossOrigin(origins = { CROSS_ORIGIN }) // *
@RestController // API REST
@RequestMapping(CONTROLLER_PATH_CARGO)
public class CargoController {
	

	private ICargoServiceManager iCargoServiceManager;
	
	@PostMapping(SAVE)
	public Cargo saveCargo(@RequestBody Cargo cargo) {
		
		return iCargoServiceManager.saveCargo(cargo);
	}
	

}
