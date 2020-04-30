class Empresa{

String nome;
int cnpj;
Funcionario [] funcionarios;

     public Empresa(int cnpj) {
        this.cnpj = cnpj;
        this.funcionarios = new Funcionario[10];
     }

	public void adiciona(Funcionario f){
		for (int i = 0; i < funcionarios.length;i++){
			if (funcionarios[i] == null){
			   funcionarios[i] = f;
			   break;	
			} 
		}	
	} 
}

