package practica.adicional.semana4;

public class  Helicoptero extends Voladores implements Aterrizable {
	private String modeloH;
	private int capacidadPasajerosHeli;

	public Helicoptero(String nombre, String color, String tamanio, String modeloH, int capacidadPasajerosHeli) {
		super(nombre, color, tamanio);
		this.modeloH = modeloH;
		this.capacidadPasajerosHeli = capacidadPasajerosHeli;
	}

	public String getModeloH() {
		return modeloH;
	}

	public void setModeloH(String modeloH) {
		this.modeloH = modeloH;
	}

	public int getCapacidadPasajerosHeli() {
		return capacidadPasajerosHeli;
	}

	public void setCapacidadPasajerosHeli(int capacidadPasajerosHeli) {
		this.capacidadPasajerosHeli = capacidadPasajerosHeli;
	}

	@Override
	public String toString() {
		return "Helicoptero [modeloH=" + modeloH + ", capacidadPasajerosHeli=" + capacidadPasajerosHeli + "]";
	}
	
	public Resultado Aterrizable() {
		System.out.println("El helicoptero puede aterrizar");
		return null;
		
	}
	
	

}