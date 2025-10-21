
/*Create a user-defined exception InvalidSalaryException and throw it 
 if salary is less than 10000*/
 

package programs;

public class Exception1 {
	
	public class InvalidSalaryException extends Exception{
		public InvalidSalaryException(String str) {
			
		}
	}
	
	public void checkSalary(double salary) throws InvalidSalaryException {
		if(salary<10000) {
			throw new InvalidSalaryException("Invalid Salary");
		}
		else {
			System.out.println("Valid Salary");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Exception1 ex=new Exception1();
		double salary=1500;
		try {
			ex.checkSalary(salary);
		}
		catch(InvalidSalaryException e){
			System.out.println("Exception occured "+e);
		}
		finally {
			System.out.println("valid salary is above 10000");
		}
	}

}
