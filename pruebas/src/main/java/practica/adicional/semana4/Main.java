package practica.adicional.semana4;

public class Main {

	public static void main(String[] args) {
		Avion a= new Avion("Latam","Azul","Mediano","AK893",35);
		Helicoptero h= new Helicoptero("Turismo", "Blanco", "Pequeño", "SRE", 9);
		Ovni o= new Ovni("Marciano", "Verde", "Mini", "KDD2", 3, "Marte");
		Superman s= new Superman("Clark Joseph ", "Rojo", "Normal", "Volar");
		
		
		Voladores [] voladores=new Voladores[] {a,h,o,s};
		
		for (Voladores vol:voladores) {
			if(vol instanceof Aterrizable) {
				Aterrizable at=(Aterrizable)vol;
				Resultado res =at.Aterrizable();
				
			}else {
				System.out.println(vol+"no puede aterrizar");
				
			}
		}
		
	}

}