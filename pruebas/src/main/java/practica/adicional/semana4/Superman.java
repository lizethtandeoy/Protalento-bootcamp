package practica.adicional.semana4;

public class Superman extends Voladores {
	private String poder;
	
	
	public Superman(String nombre, String color, String tamanio, String poder) {
		super(nombre, color, tamanio);
		this.poder = poder;
	}


	public String getPoder() {
		return poder;
	}


	public void setPoder(String poder) {
		this.poder = poder;
	}


	@Override
	public String toString() {
		return "Superman [poder=" + poder + "]";
	}

}