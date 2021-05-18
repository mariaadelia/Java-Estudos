package exercicio1;

public class Cliente {
	
	//Atributo
	private String nomeCliente;
	private int idadeCliente;
	private int quantAnosCliente, cpfCliente;
	private double compraCliente, descontoCliente, valorTotalCompra;
	
	//get and set
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public int getIdadeCliente() {
		return idadeCliente;
	}
	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}
	public int getQuantAnosCliente() {
		return quantAnosCliente;
	}
	public void setQuantAnosCliente(int quantAnosCliente) {
		this.quantAnosCliente = quantAnosCliente;
	}
	public double getCompraCliente() {
		return compraCliente;
	}
	public void setCompraCliente(double compraCliente) {
		this.compraCliente = compraCliente;
	}
	public double getDescontoCliente() {
		return descontoCliente;
	}
	public void setDescontoCliente(double descontoCliente) {
		this.descontoCliente = descontoCliente;
	}
	public double getValorTotalCompra() {
		return valorTotalCompra;
	}
	public void setValorTotalCompra(double valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}
	
	//Metodo
	
	double descontoCliente() {
		if (quantAnosCliente > 5) {
			descontoCliente = compraCliente * 0.2;
		}
		else {
			descontoCliente = compraCliente * 0.1;
		}
		return descontoCliente;
	}
	
	double valorTotalCompra() {
		valorTotalCompra = compraCliente - descontoCliente;
		return valorTotalCompra;
	}
	
	void cadastro() {
		System.out.println("Nome: " + nomeCliente);
		System.out.println("CPF: " + cpfCliente);
		System.out.println("Idade: " + idadeCliente);
		System.out.println("Há quantos anos é cliente da loja: " + quantAnosCliente);
		System.out.println("Valor total da compra (com desconto) :R$ " + valorTotalCompra);
	}
	

}
