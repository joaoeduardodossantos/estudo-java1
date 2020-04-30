class TestaFuncionario {
	
	public static void main(String[] args){

	    Funcionario func = new Funcionario();

	    func.setNome("Joao");
	    func.setSalario(5000.00);
	    func.setData("30/08/2016");
	    func.setRg(123456789);
	    func.setDepto("TI");

	    
	    Funcionario func2 = func;
	    System.out.println(func == func2);


	}
}