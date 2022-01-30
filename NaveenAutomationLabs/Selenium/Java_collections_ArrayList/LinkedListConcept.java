package Java_collections_ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("vijay");
		ll.add("shetty");
		ll.add("QA support");
		ll.add("tester");
		ll.add("testing");
		System.out.println(ll.size());
		System.out.println(ll.get(0));

		ll.addFirst("praveen");
		ll.addLast("vali:");
		System.out.println(ll.get(0));

		ll.add(0, "madhu");
		System.out.println(ll.get(0));
		ll.removeFirst();
		System.out.println(ll.get(0));
		ll.removeLast();
		System.out.println(ll.get(0));
		System.out.println(ll);
		ll.set(0, "vvvv");
		System.out.println(ll.get(0));

		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		//using for loop is also possiable 
	}

}
