class Conta {
   int numero;
   String titular;
}

class Programa {

   public static void main(String[] args) {
      Conta teste = new Conta();
      teste.numero = 123;
      teste.titular ="teste";
      
      System.out.println(teste.numero);
      System.out.println(teste.titular);
   }
}

