class Fatorial {
   public static void main(String[] args){
   
      long fatorial = 1;
      int numero = 40;
      
      for (int i = 1; i <= numero; i++){
         	fatorial = fatorial * i;
         }
      	     System.out.println("O fatorial de " + numero + " é: " + fatorial);      
   }
}
