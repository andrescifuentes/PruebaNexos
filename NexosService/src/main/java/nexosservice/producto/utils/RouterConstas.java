package nexosservice.producto.utils;

public class RouterConstas {
	
	/*
	 * path controller
	 */
	public static final String  CROSS_ORIGIN = "*" ;
	public static final String  CONTROLLER_PATH = "/api";
	public static final String  CONTROLLER_PATH_CARGO = "/cargo";
	public static final String  FIND_ALL = "/listar";
	public static final String  FIND_BY_ID = "/buscarId/{id}";
	public static final String  UPDATE = "/actualizar/{id}";
	public static final String  SAVE = "/guardar";
	public static final String  DELETE = "/eliminar/{id}";
	
	/*
	 * exception
	 */
	
	
	public static final String  BAD_REQUEST = "Alguno de los campos viene null, porfavor validar ";  
	public static final String STATUS_BAD_REQUEST = "400";
	public static final String EXCEPTION_NOT_FIND_BY_ID = "No encontro informacion por este id";
	public static final String EXCEPTION_NAME_PRODUCTO = "El nombre del producto ya se encuentra repetido"; 
	public static final String EXCEPTION_FORMAT_DATE = "Fecha invalida tiene que estar ser menor a la fecha actual";
	public static final String EXECEPTION_ELIMINAR_DATE = "No se puede eliminar la informacion";
	
	
	


}
