/**
 * 
 */
package Cap04;

/**
 * @author walberjefferson
 *
 */
public class Conta {
	int numero;
	String dono;
	double saldo, limite;
	
	void saca(double quantidade){
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
}
