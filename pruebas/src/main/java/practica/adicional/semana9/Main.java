package practica.adicional.semana9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class Main {

public static void main(String[] args) throws Exception { 
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		List<Alumno> listAlumno= new ArrayList<Alumno>();
		
		
		Set<Materia> setMateria = new HashSet<Materia>();
		Set<Alumno> setAlumno = new HashSet<Alumno>();
		
		
		
		boolean validador=false;
		
		while(!validador) {
			System.out.println("Ingrese lo que desea realiar: ");
			System.out.println("1. Ingresar alumno" );
			System.out.println("2. Ingresar materia");
			System.out.println("3. Ingrese inscipcion materias");
			
			
			try {
				int opcion =teclado.nextInt();
				teclado.nextLine();
				
				
				switch(opcion){
				case 1:
					System.out.println("Ingrese nombre del alumno");
					String nombre=teclado.next();
					teclado.next();
					System.out.println("Ingrese apellido del alumno");
					String apellido =teclado.next();
					teclado.next();
					
					System.out.println("Ingrese el dni del alumno");
					int dni=teclado.nextInt();
					teclado.nextLine();
					
					Alumno user = new Alumno(nombre, apellido, dni);
					setAlumno.add(user);
					
					
					break;
					
				case 2:
					
					System.out.println("Ingrese nombre de la materia");
					String nombreMate=teclado.nextLine();
					teclado.nextLine();
					
					System.out.println("Ingrese id materia");
					int id=teclado.nextInt();
					teclado.nextLine();
					
					
					System.out.println("Ingrese turno");
					String turno =teclado.nextLine();
					
					Materia materia =new Materia(id,nombreMate, turno);
					setMateria.add(materia);
					
							
							
					break;
				case 3:
					if(setAlumno.isEmpty() || setMateria.isEmpty()) { 
						System.out.println("No hay datos");
						validador =true;
					}else {
						Aplicacion app= new Aplicacion(setAlumno,setMateria);
						app.Inscribir(teclado);
						Set<Inscripciones> setInscrip = app.getSetInscripciones();
						System.out.println(setInscrip);
						
					}
					break;
				
					
				}
			}catch (Exception e) {
				e.printStackTrace();
				validador = true;
			}
		
		}
	
}
			

		

}
					
				
					
					
					
			
			
			
				
				
			
				
			
		
