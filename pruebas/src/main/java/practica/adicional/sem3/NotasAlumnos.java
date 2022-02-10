package practica.adicional.sem3;

import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		
		
Scanner teclado= new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de alumnos");
		int cantAlum=teclado.nextInt();
		
		System.out.println("Ingrese cantidad de examenes");
		int cantExam=teclado.nextInt();
		
		int cantColum=(cantExam*2)+2;
		
		Object [][] infoAlum = new Object [cantAlum][cantColum];
		
		
		
		
		for (int i = 0; i<cantAlum; i++) {
			for (int j = 0; j < cantColum; j++) {
				if (j == 0) {
					System.out.println("Ingrese nombre del alumno "+(i+1));
					infoAlum[i][j] = teclado.next();
				}
				if (j == 1) {
					System.out.println("Ingrese apellido del  alumno "+(i+1));
					infoAlum[i][j] = teclado.next();
				}	
				if (j % 2 == 0 && j != 0) {
					System.out.println("Ingrese el número del examen ");
					infoAlum
					[i][j] = teclado.nextInt();
				}
				if (j % 2 != 0 && j != 1) {
					System.out.println("ingrese la nota " + "del alumno " +( i+1));
					infoAlum[i][j] = teclado.nextDouble();
				}
			}
		}
		
		
		
		teclado.close();
		
		
		
		String mayorCalfAlum = infoAlum[0][0].toString() +  infoAlum[0][1].toString();
		double calfMayor = (Double)infoAlum[0][3];
		
		for (int i = 0; i< cantAlum; i++) {
			for (int j = 3; j < cantAlum; j+=2) {
				if ((Double)infoAlum[i][j] > calfMayor) {
					calfMayor = (Double)infoAlum[i][j];
					mayorCalfAlum = infoAlum[i][0].toString() + " " + infoAlum[i][1].toString();
				}
			}
		}
		
		
		
		System.out.println("Alumno con mayor calificación es: " + mayorCalfAlum+ "con una calificación de: " + calfMayor);
		
		
		
		String menorCalfAlum = infoAlum[0][0].toString() +  infoAlum[0][1].toString();
		double calfmenor = (Double)infoAlum[0][3];
				
		for (int i = 0; i< cantAlum; i++) {
			for (int j = 3; j < cantColum; j+=2) {
				if ((Double)infoAlum[i][j] < calfmenor) {
					calfmenor = (Double)infoAlum[i][j];
					menorCalfAlum = infoAlum[i][0].toString() + infoAlum[i][1].toString();
				}
			}
		}
		
		
		System.out.println("Alumno con menor calificación es: " + menorCalfAlum+ " con una calificación de: " + calfmenor);
		
		
		
		
		Object [][] matrizprom = new Object [cantAlum][2];
		
		for (int i = 0; i < cantAlum; i++) {
			double suma = 0;
			double prome = 0;
			for (int j= 3; j < cantColum; j+=2) {
				suma += (Double)infoAlum[i][j];
			}
			prome = suma/cantExam;
			matrizprom[i][0] = infoAlum[i][0].toString()  + infoAlum[i][1].toString();
			matrizprom[i][1] = prome;
		}
		
		System.out.println("Los alumnos que se promocionan son: ");
		for (int i = 0; i < cantAlum; i++) {
			if ((Double)matrizprom[i][1] >= 7) {
				System.out.println(matrizprom[i][0] + " con promedio de: " + matrizprom[i][1]);
			}
		}
		
		
		System.out.println("Alumnos que deben recursar la materia son: ");
		for (int i = 0; i < cantAlum; i++) {
			if ((Double)matrizprom[i][1] <7) {
				System.out.println(matrizprom[i][0] + " con promedio de: " + matrizprom[i][1]);
			}
			
		}
	}

}

	
