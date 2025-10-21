package programs;

import java.util.*;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n=new ArrayList<Integer>();
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		System.out.println(n);
		
		Iterator<Integer> i=n.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(int j:n) {
			System.out.println(j);
		}
	}

}
