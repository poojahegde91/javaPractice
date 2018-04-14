package question2;

public class exp3 {

	public static void main(String[] args) {
		// NumberFormatException
		
		String name = "pooja";
//to handle this have to put it in try catch block		
//		try{
			int integerValue = Integer.parseInt(name);
		
			System.out.println(integerValue);
//		}
//		catch(NumberFormatException e)
//		{
//			System.out.println("Error: NumberFormatException");
//		}
	}

}
