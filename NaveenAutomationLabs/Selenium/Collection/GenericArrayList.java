package Collection;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> i=new ArrayList<Integer>();
		i.add(100);
		i.add(200);
		
		ArrayList<Double> d=new ArrayList<Double>();
		d.add(100.0);
		//d.add(200);-->not allowed
		d.add(200.200);
		
		ArrayList<String> s=new ArrayList<String>();
		s.add("viajy");
		s.add("shetty");
		s.add("seleniium");
		
		ArrayList<Character> c=new ArrayList<Character>();
		//c.add("a");-->In double quote is not allowed
		c.add('a');
		c.add('e');
		//c.add('vijay');
		
		

	}

}
