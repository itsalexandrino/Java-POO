package exercicio4;

public class Main {

	public static void main(String[] args) {

		Funcionarios funcionario = new Funcionarios("Matheus", "ABC-0001", 30, true, 31);

		System.out.println(funcionario.mostrarDados());
		System.out.println(funcionario.solicitarFerias());
		System.out.println("");

		Funcionarios funcionario2 = new Funcionarios("Bruno", "ABC-0001", 30, true, 15);

		System.out.println(funcionario2.mostrarDados());
		System.out.println(funcionario2.solicitarFerias());
		System.out.println("");
	}

}
