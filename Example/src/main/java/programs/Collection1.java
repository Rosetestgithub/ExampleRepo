package programs;
import java.util.*;
public class Collection1 {
	
	public static void main(String[] args) {
		List<Integer> n=new LinkedList<Integer>();
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		System.out.println(n);
		
		List<String> str=new ArrayList<String>();
		str.add("pen");
		str.add("ball");
		str.add("Rubber");
		str.add("Box");
		str.add("Rubber");
			//Duplicate allowed in list
		System.out.println(str);
		
		Set<Integer> n1=new HashSet<Integer>();
		n1.add(10);
		n1.add(20);
		n1.add(30);
		n1.add(40);
		System.out.println(n1);
		
		Set<String> str1=new HashSet<String>();
		str1.add("color");
		str1.add("pen");
		str1.add("pencil");
		str1.add("tin");
		str1.add("tin");	//duplicate not allowed in set
		System.out.println(str1);
		
		//list methods
		System.out.println(n.get(2));
		
		n.set(2, 10);
		System.out.println(n);
		
		System.out.println(str.indexOf("Rubber"));
		
		n.remove(0);
		System.out.println(n);
		
		System.out.println(str.contains("ball"));
		
		//set methods
		
	}		
}
