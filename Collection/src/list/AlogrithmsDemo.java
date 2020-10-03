package list;

import java.util.*;

public class AlogrithmsDemo {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(new Integer(-8));
		l1.add(new Integer(20));
		l1.add(new Integer(8));
		l1.add(new Integer(-20));
		
		Comparator<Integer> r=Collections.reverseOrder();
		
		Collections.sort(l1,r);
		
		Iterator<Integer> it=l1.iterator();
		
		System.out.print("List sorted in reverse: ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		Collections.shuffle(l1);
		
		it=l1.iterator();
		System.out.print("List shuffled: ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		System.out.println("Minimum: "+Collections.min(l1));
		System.out.println("Maximum: "+Collections.max(l1));
	}

}
