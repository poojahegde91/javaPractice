package question3;

public class main {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setBalance(1000);
		Bank bank = new Bank(account);
		bank.withdrawAmount(1010);
		System.out.println("Remaining Balance : " + account.getBalance());
		

	}

}
