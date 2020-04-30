class Funcionario {
  String nome;
  String departamento;
  double salario;
  String banco;
  String rg;
  
  void recebeAumento (double valor){
  	double novoSalario = this.salario + valor;
  }
  
  double calculaGanhoAnual() {
     double ganhoAnual = this.salario * 12;
     return ganhoAnual;
  }
  
}

class Programa1 {

    public static void main(String[] args) {

    
    Funcionario func = new Funcionario();
    
      func.nome = "Joao Eduardo";
      func.departamento = "TI";
      func.salario = 5000;
      func.banco = "BB";
      func.rg = "1234567890";
      
      func.recebeAumento(1000);
      func.calculaGanhoAnual();
      
      System.out.println("Dados Funcionario: ");
      System.out.println("Nome: " + func.nome);
      System.out.println("Depto: " + func.departamento);
      System.out.println("Salario: " + func.salario);
      System.out.println("Banco: " + func.banco);
      System.out.println("Rg: " + func.rg);
      System.out.println("O ganho anual é: " + func.calculaGanhoAnual());
      
    }
}
