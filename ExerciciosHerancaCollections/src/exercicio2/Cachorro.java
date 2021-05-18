package exercicio2;

public class Cachorro extends AnimaisCorrer {
	
	private String tipoAnimal = "Cachorro";
	private String somEmite = "Au au au";


	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getSomEmite() {
		return somEmite;
	}

	public void setSomEmite(String somEmite) {
		this.somEmite = somEmite;
	}
	
	public void emitirSom() {
		System.out.println("Som que o cachorro emite: Au au au au!");
		
	}
	

}
