package Cap04;

public class Programa {

	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;
		
		System.out.println("Dono da conta: " + minhaConta.dono);
		System.out.println("Saldo atual: " + minhaConta.saldo);
		
		minhaConta.saca(200);
		System.out.println("Saldo depois do  saque: " + minhaConta.saldo);
		
		minhaConta.deposita(500);
		System.out.println("Saldo depois do deposito: " + minhaConta.saldo);
		
		//PARADO NO CAPITULO 4.6
	}

}
