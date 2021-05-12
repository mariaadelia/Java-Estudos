package exercicio2;

public class Preguica extends Animal implements InterfaceAnimal {
	
	private String subirArvores;
	private String tipoAnimal = "Preguiça";
	
	public String getSubirArvores() {
		return subirArvores;
	}
	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	public void emitirSom() {
		System.out.println("Som que a preguiça emite: Ahhhhhhhhhhh");
		
	}
	
	

	

}
