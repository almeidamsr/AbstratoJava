import javax.swing.JOptionPane;

public class Main {

	public static void main(String args[]) {

		// Animal animal = new Estagiario();
		Pessoa Adulto = new Adulto();
		Pessoa Crianca = new Crianca();
		Pessoa Velho = new Velho();
		Pessoa Jovem = new Jovem();

		String Pessoa;

		Pessoa = JOptionPane.showInputDialog("Qual Pessoa voc� quer saber (adulto, jovem, crian�a ou velho)?");

		if (Pessoa.equals("adulto")) {
			Adulto = new Adulto();
			Adulto.Experiencia();
			Adulto.vigor();
			Adulto.For�a();
		}
		if (Pessoa.equals("crian�a")) {
			Crianca = new Crianca();
			Crianca.Experiencia();
			Crianca.vigor();
			Crianca.For�a();
		}
		if (Pessoa.equals("Velho")) {
			Velho = new Velho();
			Velho.Experiencia();
			Velho.vigor();
			Velho.For�a();
		}

		if (Pessoa.equals("Jovem")) {

			Jovem = new Jovem();
			Jovem.Experiencia();
			Jovem.vigor();
			Jovem.For�a();
		}

	}

}
