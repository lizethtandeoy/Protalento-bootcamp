package practica.adicional.semana9;

public class Alumno {
	
	private static int contador=0;
	
	private int dni;
	private int id;
	private String nombre;
	private String apellido;
	
	public Alumno(String nombre, String apellido, int dni) {
		contador+=1;
		this.id=contador;
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (dni != other.dni)
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
	
	

	
	
	
}
