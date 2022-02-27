package practica.adicional.semana9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aplicacion {
	
	private Set<Alumno> setalumno= new HashSet<Alumno>();
	private Set<Materia> setmateria = new HashSet<Materia>();
	private Set<Inscripciones> setInscripciones = new HashSet<Inscripciones>();
	
	public Aplicacion(Set<Alumno>setalumno, Set<Materia>setmateria) {
		this.setalumno=setalumno;
		this.setmateria=setmateria;
		
	}
	
	public void Inscribir(Scanner teclado) {
		
		try {
		
				System.out.println("Ingrese el ID del alumno a inscribir");
				int idAlumno= teclado.nextInt();
				System.out.println("Ingrese el ID e la materia");
				int idMateria = teclado.nextInt();
				
				Alumno alum=null;
				
				for(Alumno user: this.setalumno) {
					if(user.getDni()==idAlumno) {
						alum=user;
						break;
					}
				}
		
				Materia materia=null;
				for(Materia mat: this.setmateria) {
					if(materia.getId()==idMateria) {
						materia=mat;
						break;
					}
				}
		
				if(materia==null || alum ==null) {
				System.out.println("Inconsistencias en los valores");
			
				}else {
					this.setInscripciones.add(new Inscripciones(alum, materia));
				}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	
	public Set<Inscripciones> getSetInscripciones() {
		return setInscripciones;
	}
}
