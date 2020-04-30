class TesteConta {
	
	public static void main(String[] args){

	Conta conta1 = new Conta();

	conta1.setNome("Joao");
	conta1.setNumero(12345);
	conta1.Deposito(5000.0);

	conta1.mostra();

	Conta conta2 = new Conta();

	conta2.setNome("Chris");
	conta2.setNumero(54321);
	conta2.Deposito(5500.0);

	conta2.mostra();
		
	
	}
}	