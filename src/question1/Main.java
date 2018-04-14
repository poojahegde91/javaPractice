package question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Manager();
		Manager manager = new Manager();
        
        employee.display();
        manager.display();

	}

}

/*  employee and manager both are calling constructor of Manager class that extends employee class   */