class Conta {
   int numero;
   Cliente titular;
   private double saldo;
   private double limite;
   
   public void saca(double valor){
   	if (valor > this.saldo + this.limite) {
   		System.out.println("Valor maior que saldo, saque não permitido!");
   	} else {
   	     this.saldo = this.saldo - valor;
  	}
   }
   
   public void deposita(double valor){
       this.saldo = this.saldo + valor;
   }
   
   public double getSaldo(){
	return this.saldo;
   }

   public void setLimite(double novoLimite){
   	this.limite = novoLimite;
   }	
	
}

class Cliente {
   String nome;
   String endereco;
}
