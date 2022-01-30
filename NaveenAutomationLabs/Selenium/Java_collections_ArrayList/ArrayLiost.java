package Java_collections_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLiost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Static array list
		String str[]=new String[3];
		//Dynamic arrayList
		ArrayList<String> aa=new ArrayList<String>();
		aa.add("vijay");
		aa.add("shetty");
		ArrayList arr=new ArrayList();
		arr.add("vijay");
		arr.add(3);
		
		Employee e1=new Employee("vijay",26,"testing");
		Employee e2=new Employee("preveen",24,"tester");
		Employee e3=new Employee("madhu",22,"dev");
		ArrayList<Employee> ee=new ArrayList<Employee>();
		ee.add(e3);
		ee.add(e2);
		ee.add(e1);
		
		Iterator<Employee> it=ee.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("vijay");
		ar1.add("shetty");
		ar1.add("praveen");
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("praveen");
		ar2.add("vali");
		ar2.add("tester");
		
		ar2.addAll(ar1);
		System.out.println(ar2);
		

	}

}
