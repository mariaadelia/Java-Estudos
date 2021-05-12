package exercicio2;

public class Cavalo extends AnimaisCorrer implements InterfaceAnimal{
	
	private String tipoAnimal = "Cavalo";

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public void emitirSom() {
		
		System.out.println("Som que o cavalo emite: Bruuuu bruuuu bruuuu");
	}

	


}
