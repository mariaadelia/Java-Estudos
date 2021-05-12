package exercicio2;

public class Cachorro extends AnimaisCorrer implements InterfaceAnimal {
	
	private String tipoAnimal = "Cachorro";


	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public void emitirSom() {
		System.out.println("Som que o cachorro emite: Au au au au!");
		
	}
	
	
	

}
