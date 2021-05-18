package exercicio1;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNomeCliente("Carolina Oliveira");
		cliente.setCpfCliente(435609384);
		cliente.setIdadeCliente(25);
		cliente.setQuantAnosCliente(7);
		cliente.setCompraCliente(600);
		
		cliente.descontoCliente();
		cliente.valorTotalCompra();
		cliente.cadastro();
		
		
	}

}
