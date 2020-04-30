class TesteModificador {
   public static void main(String[] args){
	
	Conta joao = new Conta();
	joao.numero = 123;
	
	joao.setLimite(100.0);
	joao.deposita(500.00);
	joao.saca(600.0);
	
	System.out.println("O saldo de Joao é: " + joao.getSaldo());
	   
   
   }
}
