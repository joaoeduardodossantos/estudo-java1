class Exercico3 {
   String nome;
   String departamento;
   String rg;
   double salario;
   
   void recebeAumento(double aumento){
      this.salario += aumento;
   }
   
   double ganhoAnual(){
   	double ganhoAnual = this.salario * 12;
   	return ganhoAnual;
   }
   
   void mostra(){
      System.out.println("Nome: " + this.nome + " \n Departamento: " + this.departamento + "\n Rg: " + this.rg + " \n Salario: " + this.salario + " \n Ganho anual: " + this.ganhoAnual());
   }
}

class TestaExercicio3 {
   public static void main(String[] args){
      
      Exercico3 func = new Exercico3();
      
      func.nome = "Joao";
      func.departamento = "TI";
      func.rg = "1234567890";
      func.salario = 5000.00;
      func.recebeAumento(1000.00);
      
      func.mostra();
   }
}
      
