class TestaFuncionario {
	
	public static void main(String[] args){

	    Funcionario func = new Funcionario("Joao");

	    //func.setNome("Joao");
	    func.setSalario(5000.00);
	    func.setData("30/08/2016");
	    func.setRg(123456789);
	    func.setDepto("TI");

	    System.out.println(func.getNome() + " " +
	    					" " + func.getSalario() +
	    					" " + func.getData() +
	    					" " + func.getRg() +
	    					" " + func.getDepto() +
	    					" " + func.getGanhoAnual());

	}

}