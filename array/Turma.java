class Turma {
	Alunos alunos[];
	
    void imprimeNotas(){
       for (int i = 0; i < this.alunos.length; i++){
          Alunos alunos = this.alunos[i];
          if (alunos == null) continue;
       	  System.out.println("Nome : " + this.alunos[i].nomes + "\n Notas: " + this.alunos[i].notas);
       }
    }   	 
}

class Alunos{
   String nomes;
   int notas;
}

class TesteNotas {
   public static void main(String[] args){
      Turma fj11 = new Turma();
      
      fj11.alunos = new Alunos[10];
      
      fj11.alunos[0] = new Alunos();
      fj11.alunos[0].nomes = "Joao";
      fj11.alunos[0].notas = 10;
      
      fj11.alunos[1] = new Alunos();
      fj11.alunos[1].nomes = "Edu";
      fj11.alunos[1].notas = 9;
      
      fj11.alunos[3] = new Alunos();
      fj11.alunos[3].nomes = "Jonny";
      fj11.alunos[3].notas = 7;
      
      fj11.imprimeNotas();
   }
}
      
