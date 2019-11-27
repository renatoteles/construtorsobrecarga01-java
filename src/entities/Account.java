package entities;

public class Account {
	private int numberAccount;
	private String nameTitular;
	private double saldo;
	
	public Account() {
		
	}
	
	public Account(int numberAccount, String nameTitular) {
		this.numberAccount = numberAccount;
		this.nameTitular = nameTitular;
	}
	
	public Account(int numberAccount, String nameTitular, double depositInitial) {
		this.numberAccount = numberAccount;
		this.nameTitular = nameTitular;
		depositAccount(depositInitial);
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getNameTitular() {
		return nameTitular;
	}

	public void setNameTitular(String nameTitular) {
		this.nameTitular = nameTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void saqueAccount(double valor) {
		saldo = saldo - valor - 5.0;
	}
	
	public void depositAccount(double valor) {
		saldo += valor;
	}

	public String toString() {
		return ("Account " + numberAccount + ", Holder: " + nameTitular + ", Balance: $ " + String.format("%.2f", saldo));
	}
	
	
}
