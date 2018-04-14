package question3;

public class Bank {
	
	Account account;
	
	public Bank(Account account) {
		this.account = account;
	}
	
	public int withdrawAmount(int amnt){
				
		int balance = account.getBalance();
		try{
		if(amnt<balance)
		{
			balance = balance - amnt;
			account.setBalance(balance);
		
			return balance;
		}
		else
		{
			throw new InsuffucientAmountClass();
		}
		}catch(InsuffucientAmountClass e)
		{
			 System.out.println(e.toString());
		}
		
		return balance;
	}
	public void depositAmount(int amnt){
		int balance1 = account.getBalance();
		account.setBalance(balance1+amnt);
	}
	

}
