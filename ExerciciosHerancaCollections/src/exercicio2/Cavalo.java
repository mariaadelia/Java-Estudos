package exercicio2;

public class Cavalo extends AnimaisCorrer {
	
	private String tipoAnimal = "Cavalo";
	private String somEmite = "Hiiiiii hiiiiii";

	public String getSomEmite() {
		return somEmite;
	}

	public void setSomEmite(String somEmite) {
		this.somEmite = somEmite;
	}

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
