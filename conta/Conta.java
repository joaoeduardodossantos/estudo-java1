class Conta {
	private String nome;
	private int numero;
	private int agencia;
	private double saldo;

	private static int numeroIncremental = 1;

	public Conta(){
		this.numero = numeroIncremental;
		numeroIncremental++;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}  

	public int getNumero(){
		return numero;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public int getAgencia(){
		return agencia;
	}

	public void setAgencia(int agencia){
		this.agencia = agencia;
	}

	public Double getSaldo(){
		return saldo;
	}

	public void Deposito(double valor){
		this.saldo = this.saldo + valor;
	}

	public void mostra(){
		System.out.println("\n" 
			+ "Nome: " + this.nome + "\n"
			+ "Numero: " + this.numero +"\n"
			+ "Agencia: " + this.agencia + "\n"
			+ "Saldo: " + this.saldo + "\n\n\n");
	}
}