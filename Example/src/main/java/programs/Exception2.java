/*Write a program with nested try-catch blocks, each handling
a different exception type.*/

package programs;

import java.io.IOException;

public class Exception2 {
	
	public static void checkNumber(int n) throws IllegalArgumentException, IOException{
		if(n<0) {
			throw new IllegalArgumentException("Negative");
		}
		 if(n>100) {
			throw new IOException("value too large, io error");
		}
		 System.out.println("positive");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			checkNumber(25);
			try {
				checkNumber(-1);
			}catch(IllegalArgumentException e) {
				System.out.println("exception occured "+e);
			}
			checkNumber(101);
		}catch(IOException e1) {
			System.out.println("exception occured "+e1);
		}
			//checkNumber(-1);
			//checkNumber(25);
			//checkNumber(101);
		
		
		
	}

}
