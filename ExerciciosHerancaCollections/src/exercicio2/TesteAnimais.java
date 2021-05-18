package exercicio2;

public class TesteAnimais {
	
	public static void main(String[] args) {
	
		Cachorro cachorro1 = new Cachorro ();
		Cavalo cavalo1 = new Cavalo ();
		Preguica preguica1 = new Preguica ();
		
		//cachorro
		cachorro1.setNome("Marcos");
		cachorro1.setIdade(7);
		cachorro1.setCorrer("Corre");
		
		System.out.println("Tipo do animal: " + cachorro1.getTipoAnimal());
		System.out.println("Nome: " + cachorro1.getNome());
		System.out.println("Idade: " + cachorro1.getIdade());
		System.out.println("O que faz: " + cachorro1.getCorrer());
		cachorro1.emitirSom();
	
		//Cavalo
		cavalo1.setNome("Luna");
		cavalo1.setIdade(1);
		cavalo1.setCorrer("Corre");
		
		System.out.println("\n\nTipo do animal: " + cavalo1.getTipoAnimal());
		System.out.println("Nome: " + cavalo1.getNome());
		System.out.println("Idade: " + cavalo1.getIdade());
		System.out.println("O que faz: " + cavalo1.getCorrer());
		cavalo1.emitirSom();;

		
		preguica1.setNome("Flash");
		preguica1.setIdade(3);
		preguica1.setSubirArvores("Sobe em árvores");
		
		System.out.println("\n\nTipo do animal: " + preguica1.getTipoAnimal());
		System.out.println("Nome: " + preguica1.getNome());
		System.out.println("Idade: " + preguica1.getIdade());
		System.out.println("O que faz: " + preguica1.getSubirArvores());
		preguica1.emitirSom();
	}

}
