import javax.swing.JOptionPane;

public class Main {

	public static void main(String args[]) {

		//Animal animal = new Estagiario();
		Animal estagiario = new Estagiario();
		Animal Cachorro = new Cachorro();
		Animal Gato = new Gato();
		Animal Peixe = new Peixe();
		Animal Andre = new Andre();

		String tipoAnimal;

		tipoAnimal = JOptionPane.showInputDialog("Qual animal você quer?");

		if (tipoAnimal.equals("Cachorro") || tipoAnimal.equals("cachorro") || tipoAnimal.equals("cão") ) {
			Cachorro = new Cachorro();
			Cachorro.emitirSom();
			Cachorro.dormir();
		}
		if (tipoAnimal.equals("Gato") || tipoAnimal.equals("gato")) {
			Gato = new Gato();
			Gato.emitirSom();
			Gato.dormir();
		}
		if (tipoAnimal.equals("Peixe") || tipoAnimal.equals("peixe")) {
			Peixe = new Peixe();
			Peixe.emitirSom();
			Peixe.dormir();
		}

		if (tipoAnimal.equals("Andre") || tipoAnimal.equals("andre") || tipoAnimal.equals("Takaiama") || tipoAnimal.equals("Tanaka") || tipoAnimal.equals("Kataiama") || tipoAnimal.equals("Professor")) {

			Andre = new Andre();
			Andre.emitirSom();
			Andre.dormir();
		}
		
		if (tipoAnimal.equals("Estagiario") || tipoAnimal.equals("estagiario") ){
			
			estagiario = new Estagiario();
			estagiario.emitirSom();
			estagiario.dormir();
		}

		// animal.emitirSom();

		// animal.dormir();

	}

}
