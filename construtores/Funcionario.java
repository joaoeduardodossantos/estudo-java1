class Funcionario {
	private int numeroFunc;
	private String nome;
	private Double salario;
	private String data;
	private int rg;
	public String departamento;

	private static int identificador = 1;

	public Funcionario(){
		this.numeroFunc = identificador;
		identificador++;

	}

	public int getNumeroFunc(){
		return this.numeroFunc;
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getData(){
		return this.data;
	}

	public void setData(String data){
		this.data = data;
	}

	public int getRg(){
		return this.rg;
	}

	public void setRg(int rg){
		this.rg = rg;
	}

	public String getDepto(){
		return this.departamento;
	}

	public void setDepto(String depto){
		this.departamento = depto;
	}

	public Double getSalario(){
		return this.salario;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public Double getGanhoAnual(){
		return this.salario * 12;
	}

	public void mostraFunc(){
		System.out.println("\n"
			+ "Numero Funcionario: " + this.numeroFunc
			+ "\n Nome: " + this.nome
			+ "\n Rg: " + this.rg
			+ "\n Depto: " + this.departamento
			+ "\n Data: " + this.data
			+ "\n Salario: " + this.salario
			+ "\n Ganho Anual: " + this.getGanhoAnual());
	}
	
}