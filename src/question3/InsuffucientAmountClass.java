package question3;

public class InsuffucientAmountClass extends Exception{

	InsuffucientAmountClass()
    {
        
    }
    @Override
    public String toString() {
        return "Withdrawal amount should not be grater than balance";
    }
	
}
