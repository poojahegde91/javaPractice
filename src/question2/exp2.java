package question2;

public class exp2 {
	
	public static void main(String[] args) {
		
	//code for Nullpointer exception
		
	String name = null;
	
	//to handle this have to put it in try catch block
	//try{
	if(name.equals("pooja"))
	{
		System.out.println("Matched");
	}
	else
	{
		System.out.println("Not matched");
	}
//	}
//	catch(NullPointerException e)
//	{
//		System.out.println("Error: Nullpointer exception");
//	}

}
}
