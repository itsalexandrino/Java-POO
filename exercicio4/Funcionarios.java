package exercicio4;

public class Funcionarios {

	private String nomeFuncionario;
	private String codigoFuncionario;
	private boolean statusFuncionario;
	private int diasFerias;
	private int feriasDesejadas;

	public Funcionarios(String nomeFuncionario, String codigoFuncionario, int diasFerias, boolean statusFuncionario,
			int feriasDesejadas) {
		this.nomeFuncionario = nomeFuncionario;
		this.codigoFuncionario = codigoFuncionario;
		this.diasFerias = diasFerias;
		this.statusFuncionario = statusFuncionario;
		this.feriasDesejadas = feriasDesejadas;

	}

	public String mostrarDados() {
		String status;
		if (statusFuncionario == true) {
			status = "Funcionario esta trabalhando";
		} else {
			status = "Funcionario ja esta de ferias";
		}
		String informacoes = nomeFuncionario + " " + codigoFuncionario + " " + diasFerias + " " + status + " "
				+ feriasDesejadas;
		return informacoes;
	}

	public String solicitarFerias() {
		String informacao;
		if (feriasDesejadas > diasFerias) {
			informacao = "Voce nao tem todos esses dias disponiveis";
		} else {
			diasFerias = diasFerias - feriasDesejadas;
			informacao = "Dias de ferias restantes: " + diasFerias;
		}
		return informacao;

	}
}
