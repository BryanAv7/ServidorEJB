package ec.edu.ups.pweb.services;

public class ErrorMessage {
	
	 // Código de error (puede indicar un tipo específico de error o éxito)
	private int codigo;
	
	 // Mensaje descriptivo relacionado con el error o el éxito de la operación
	private String mensaje;
	
	public ErrorMessage(int codigo, String mensaje) {
		this.codigo = codigo;
		this.mensaje = mensaje;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
