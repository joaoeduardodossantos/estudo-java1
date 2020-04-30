class Funcionario{
    String nome;
    int rg;
    double salario;
    
        void mostra() {
        System.out.println("Nome: " + this.nome + " RG: " + this.rg +
        			" Salario: " + this.salario);
    }
}


class Empresa{
String nome;
int cnpj;
Funcionario [] funcionarios;

	void adiciona(Funcionario f){
		for (int i = 0; i < this.funcionarios.length;i++){
			if (this.funcionarios[i] == null){
			   this.funcionarios[i] = f;
			   break;	
			} 
		} 
	}

        void mostraEmpregados() {
           for (int i = 0; i < this.funcionarios.length; i++) {
             if (this.funcionarios[i] == null) continue;
             System.out.println("Funcionário na posição: " + i +
             " - Nome: " + this.funcionarios[i].nome +
             " - Rg: " + this.funcionarios[i].rg +
             " - Salario: " + this.funcionarios[i].salario ); 
        
        }
    }
   
}

class TesteEmpresa{

public static void main(String[] args){

	Empresa empresa = new Empresa();
	empresa.funcionarios = new Funcionario[10];

 
	Funcionario func1 = new Funcionario();
	func1.nome = "Joao";
	func1.rg= 123456789;  
	func1.salario = 4000.00;
	empresa.adiciona(func1);
 //      	System.out.println("Nome: " + func1.nome +"  Rg: " + func1.rg);
       				
       	Funcionario func2 = new Funcionario();
	func2.nome = "Eduardo";
	func2.rg= 123456789;  
	func2.salario = 5000.00;
	empresa.adiciona(func2);
 //      	System.out.println("Nome: " + func2.nome +"  Rg: " + func2.rg);
 
 /*       for ( int i = 0; i < empresa.funcionarios.length; i++ ) {
            if(empresa.funcionarios[i] == null) continue;
              empresa.funcionarios[i].mostra();
            
        }
*/
       empresa.mostraEmpregados();
 }
}
