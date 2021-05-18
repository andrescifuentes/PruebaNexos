package nexosservice.producto.dto;


public class ExceptionDTO extends Exception {
	
   
	 public String  mensaje;
	 
     public String status;
     
    

	public ExceptionDTO() {
		super();
	}
	
	

	public ExceptionDTO(String mensaje, String status) {
		super();
		this.mensaje = mensaje;
		this.status = status;
	}



	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
	

}
