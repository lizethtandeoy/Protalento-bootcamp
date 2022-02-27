package practica.adicional.semana9;

public class Materia {
	
	private int id;
	private String curso;
	private  String turno;
	
	
	
	public Materia(int id, String curso, String turno) {
		this.id = id;
		this.curso = curso;
		this.turno = turno;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
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
		Materia other = (Materia) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		return true;
	
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return curso;
	}
	public void setNombre(String nombre) {
		this.curso = curso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	

}
		
	
	
	
	
	

