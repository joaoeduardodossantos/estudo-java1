class Exercicio6teste {
   String nome;
   String departamento;
   String rg;
   String banco;
   Double salario;
   Data dataAdmissao;
   
   void aumento(double aumento){
      this.salario += aumento;
   }
   
   double ganhoAnual() {
      double ganho = this.salario * 12;
      return ganho;
   }
   
   void mostra(){
      System.out.println(
         " Nome: " + this.nome +
         "\n Depto: " + this.departamento +
         "\n RG: " + this.rg +
         "\n Banco : " + this.banco +
         "\n Salario: " + this.salario +
         "\n Ganho anual: " + this.ganhoAnual());
         System.out.println(" Data: " + this.dataAdmissao.getFormataData());
      }
}

class Data {
   int dia;
   int mes;
   int ano;
   
   String getFormatada() {
      return this.dia + "/" + this.mes + "/" + this.ano;
   }
}

class TestaExer6 {
   public static void main(String[] args) {
   
   Exercicio6 func = new Exercicio6();
 
     func.nome = "João";
     func.departamento = "TI";
     func.rg = "1234567890";
     func.banco = "BB";
     func.salario = 5000.00;
     
     
   
   Data data = new Data();
     func.dataAdmissao = data;
     data.dia = 05;
     data.mes = 03;
     data.ano = 2016;
     
     func.aumento(1000.00);
     func.mostra();
   }
}
