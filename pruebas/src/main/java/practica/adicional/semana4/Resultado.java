package practica.adicional.semana4;

public class Resultado {
	private boolean exitoso;
	private String descripcion;
	
	
	
	public Resultado(boolean exitoso, String descripcion) {
		super();
		this.exitoso=exitoso;
		this.descripcion=descripcion;
	}
	
	public Resultado() {
	
	}
	public boolean isExitoso() {
		return exitoso;
	}
	public void setExitoso(boolean exitoso) {
		this.exitoso = exitoso;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
