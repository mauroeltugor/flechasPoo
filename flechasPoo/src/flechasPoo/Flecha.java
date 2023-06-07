package flechasPoo;

public class Flecha {

	int longitud;
	String color;
	
	/*La clase Flecha representa una flecha y tiene dos variables de instancia: longitud (que representa la longitud de la flecha) y color (que representa el color de la flecha).*/
	
	
	public Flecha() {
		longitud=18;
		color="negro";
	}
	
	/*El constructor sin argumentos Flecha() se utiliza para crear una flecha con valores predeterminados. En este caso, la longitud se establece en 18 y el color se establece en "negro".*/
	
	public Flecha(int longitud, String color) {
		this.longitud=longitud;
		this.color=color;
	}
	
	/*El constructor con argumentos Flecha(int longitud, String color) se utiliza para crear una flecha con valores específicos proporcionados por el usuario. 
	 Los valores de longitud y color se asignan a las variables de instancia correspondientes utilizando la palabra clave this.*/
	
	public void imprimirEspacio() {
		System.out.println();
	}
	
	/*El método imprimirEspacio() imprime una línea en blanco en la consola.*/
	
	public void construirFlecha() {
		for(int index = 0; index < longitud; index += 1) {
			imprime("-");
		}
		imprime(">");
	}
	
	/*El método construirFlecha() construye la representación de la flecha imprimiendo una serie de guiones ("-") seguidos de un símbolo de flecha (">").
	  La cantidad de guiones se determina por el valor de longitud.*/
	
	private void imprime(String simbolo) {
		if(color.equals("negro")) {
			System.out.print(simbolo);
		}else {
			System.out.print(simbolo);
		}
	}
	
	/*El método privado imprime(String simbolo) se utiliza internamente para imprimir un símbolo en la consola. Si el color de la flecha es "negro",
	  se imprime el símbolo sin cambios. Si el color es diferente de "negro", también se imprime el símbolo sin cambios. En resumen, este método actualmente no aplica ninguna diferencia basada en el color de la flecha.*/

}
