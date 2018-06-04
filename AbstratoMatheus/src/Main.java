import javax.swing.JOptionPane;

public class Main {

	public static void main(String args[]) {

		// Animal animal = new Estagiario();
		Pessoa Adulto = new Adulto();
		Pessoa Crianca = new Crianca();
		Pessoa Velho = new Velho();
		Pessoa Jovem = new Jovem();

		String Pessoa;

		Pessoa = JOptionPane.showInputDialog("Qual Pessoa você quer saber (adulto, jovem, criança ou velho)?");

		if (Pessoa.equals("adulto")) {
			Adulto = new Adulto();
			Adulto.Experiencia();
			Adulto.vigor();
			Adulto.Força();
		}
		if (Pessoa.equals("criança")) {
			Crianca = new Crianca();
			Crianca.Experiencia();
			Crianca.vigor();
			Crianca.Força();
		}
		if (Pessoa.equals("Velho")) {
			Velho = new Velho();
			Velho.Experiencia();
			Velho.vigor();
			Velho.Força();
		}

		if (Pessoa.equals("Jovem")) {

			Jovem = new Jovem();
			Jovem.Experiencia();
			Jovem.vigor();
			Jovem.Força();
		}

	}

}
