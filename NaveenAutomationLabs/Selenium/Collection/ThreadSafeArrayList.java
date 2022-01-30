package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to synchronize ArrayList in Java
		//1.Collections.synchronizedList()-method-returns synchronized list
		//2.copyOnWriteArrayList-class-Thread safe variant of Array List
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("vijay");
		nameList.add("ravi");
		nameList.add("raju");
		//To add,remove the value we dont need explicit synchronization
		// to fetch or to traverse the values from this list -- we have to use explicit synchronization
		synchronized (nameList) {//we can use the for also to traverse
			Iterator<String> it=nameList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		//2.Copy ON arraylist is a class
		CopyOnWriteArrayList<String> cpylist = new CopyOnWriteArrayList<String>();
		cpylist.add("vijay");
		cpylist.add("ravi");
		cpylist.add("eee");
		cpylist.add("rrr");
		
		//we dont need any synchronization to traverse the list
		Iterator<String> it=cpylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
