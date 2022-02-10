package practica.adicional.semana4;

public class Ovni extends Voladores {
	private String modeloOv;
	private int capacidadPasajerosOv;
	private String planeta;

	
	public Ovni(String nombre, String color, String tamanio, String modeloOv, int capacidadPasajerosOv,
			String planeta) {
		super(nombre, color, tamanio);
		this.modeloOv = modeloOv;
		this.capacidadPasajerosOv = capacidadPasajerosOv;
		this.planeta = planeta;
	}


	public String getModeloOv() {
		return modeloOv;
	}


	public void setModeloOv(String modeloOv) {
		this.modeloOv = modeloOv;
	}


	public int getCapacidadPasajerosOv() {
		return capacidadPasajerosOv;
	}


	public void setCapacidadPasajerosOv(int capacidadPasajerosOv) {
		this.capacidadPasajerosOv = capacidadPasajerosOv;
	}


	public String getPlaneta() {
		return planeta;
	}


	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}


	@Override
	public String toString() {
		return "Ovni [modeloOv=" + modeloOv + ", capacidadPasajerosOv=" + capacidadPasajerosOv + ", planeta=" + planeta
				+ "]";
	}
	
	
	
	

	

}