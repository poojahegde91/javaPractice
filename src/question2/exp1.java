package question2;

public class exp1 {

	public static void main(String[] args) {
		//code for ArrayIndexOutOfBoundException
		
		String fruits [] = {"Apple", "Banana"}; 
		
				
		//to handle this have to put it in try catch block
		
		 //try{
		  for(int i=0; i<=fruits.length; i++)
		  {
			System.out.println(fruits[i]);
		  }
//		  }
//		  catch(ArrayIndexOutOfBoundsException e)
//		  {
//		  	System.out.println("Error : Size of array crossed");
//		  }
//		  
		 
	}

}
