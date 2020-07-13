package exercicio5;

public class Main {

	public static void main(String[] args) {
		
		Patinete patinete = new Patinete("Azul", "Caloi", false, 0 , 30);
		System.out.println(patinete.mostrarDados());
		System.out.println("\n");
		System.out.println(patinete.andar());
		
	}
}
