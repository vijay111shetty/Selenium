package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stu=new ArrayList<String>();
		stu.add("vijay");
		stu.add("shetty");
		stu.add("ravi");
		stu.add("mustak");
		stu.add("aaa");
		
		for(int i=0;i<stu.size();i++) {
			System.out.println(stu.get(i));
		}
		for (String s:stu) {
			System.out.println(s);
		}
		
		//java Stream function
		stu.stream().forEach(ele->System.out.println(ele));
		
		//Iterator
		Iterator<String> it=stu.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<String> ss=new ArrayList<String>(Arrays.asList("vijay","shetty","tester","student"));
		System.out.println(ss);
	}

}
