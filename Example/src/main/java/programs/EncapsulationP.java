package programs;

public class EncapsulationP {
	
	private int n1;
	private int n2;
	
	public void set(int n1,int n2) {
	
		this.n1=n1;
		this.n2=n2;
	}
	
	public void get() {
		System.out.println("n1= "+n1);
		System.out.println("n2= "+n2);
	}
}
