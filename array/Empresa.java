class Empresa{

String nome;
int cnpj;
Funcionario [] funcionarios;

public void adiciona(Funcionario f){
	for (int i = 0; i < funcionarios.length;i++){
		if (funcionarios[i] == null){
		   funcionarios[i] = f;
		   break;	
		} 
	} 
}
