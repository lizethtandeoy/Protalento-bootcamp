package practica.adicional.semana4;

public abstract class Voladores {
	protected String nombre;
	protected String color; 
	protected String tamanio;
	public Voladores(String nombre, String color, String tamanio) {
		super();
		this.nombre=nombre;
		this.color=color;
		this.tamanio=tamanio;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	@Override
	public String toString() {
		return "Voladores [nombre=" + nombre + ", color=" + color + ", tamanio=" + tamanio + "]";
	}
	
	
	
	
}