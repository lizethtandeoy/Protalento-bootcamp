package practica.adicional.semana4;

public class Avion  extends Voladores implements Aterrizable{
	private String modeloAvion;
	private int capacidadPasajeroAvion;
	
	
	public Avion(String nombre, String color, String tamanio, String modeloAvion, int capacidadPasajeroAvion) {
		super(nombre, color, tamanio);
		this.modeloAvion = modeloAvion;
		this.capacidadPasajeroAvion = capacidadPasajeroAvion;
	}
	public String getModeloAvion() {
		return modeloAvion;
	}
	public void setModeloAvion(String modeloAvion) {
		this.modeloAvion = modeloAvion;
	}
	public int getCapacidadPasajeroAvion() {
		return capacidadPasajeroAvion;
	}
	public void setCapacidadPasajeroAvion(int capacidadPasajeroAvion) {
		this.capacidadPasajeroAvion = capacidadPasajeroAvion;
	}
	
	public Resultado Aterrizable() {
		System.out.println("El avion puede aterrizar");
		return null;
		
	}


}