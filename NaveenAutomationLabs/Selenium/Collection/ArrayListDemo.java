package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Static array
		int[] a=new int[4];
		a[0]=18;//Static array we can store the specified values only
		
		
		//Dynamic Array(ArrayList)
		 //raw type Arary
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add("vijay"); 
		ar.add(10);
		ar.add(true);
		ar.add('t');
		ar.add("testing");
		System.out.println(ar);
		System.out.println(ar.get(2));
		//System.out.println(ar.get(-1));-->Throws the error(Array bound Exception)
		System.out.println(ar.size());
		System.out.println("LI ="+0);
		System.out.println("HI ="+(ar.size()-1));
		

	}

}
