class Exercico5 {
   String nome;
   String departamento;
   String rg;
   double salario;
   
   void recebeAumento(double valor){
      this.salario += valor;
   }
   
   double ganhoAnual(){
      double ganhoAnual = this.salario * 12;
      return ganhoAnual;
   }

   void mostra(){
      System.out.println(
         "Nome: " + this.nome +
         "\n Departamento: " + this.departamento +
         "\n Rg: " + this.rg +
         "\n Salario: " + this.salario +
         "\n Ganho Anual: " + this.ganhoAnual());
   }
 }
        
class TestaExercicio5 {
   public static void main(String[] args){
      Exercico5 f1 = new Exercico5();
      
      f1.nome = "Joao";
      f1.salario = 5000.00;
      f1.rg = "1234567890";
      f1.recebeAumento(1000.00);
      f1.mostra();
               
      Exercico5 f2 = f1;
      f2.mostra();
      
      if (f1==f2) {
      	  System.out.println("São iguais");
      	  } else {
      	       System.out.println("São diferentes");
      }
   }
}
      
      
      
      
