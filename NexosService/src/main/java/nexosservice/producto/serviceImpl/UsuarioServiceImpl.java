package nexosservice.producto.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import nexosservice.model.entity.Usuario;
import nexosservice.producto.dao.IServiceUsuarioDao;
import nexosservice.producto.manager.IUsuarioManager;


public class UsuarioServiceImpl implements IUsuarioManager{

    @Autowired
	private IServiceUsuarioDao iServiceUsuarioDao; 
	
	@Override
	public Usuario findById(Long id) {
		
		return iServiceUsuarioDao.findById(id).orElse(null);
	}

}
