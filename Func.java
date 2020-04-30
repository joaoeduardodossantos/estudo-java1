class Func {
   String nome;
   String rg;
   String departamento;
   double salario;
  
   void recebeAumento(double aumento){
     this.salario += aumento;
   }
   
   double calculaGanhoAnual() {
   double ganhoAnual = this.salario * 12;
     return ganhoAnual;
   }
}


class TestaFunc {
   public static void main(String[] args){
      Func func = new Func();
      
      func.nome = "Joao";
      func.rg = "1234567890";
      func.departamento = "TI";
      func.salario = 5000.00;
      func.recebeAumento(1000.00);
    
      System.out.println("salario atual: " + func.salario);
      System.out.println("Ganho anual: " + func.calculaGanhoAnual());
    }
}
