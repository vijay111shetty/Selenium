package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("vijay");
		arr.add("testing");
		arr.add("praveen");
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("banglore");
		arr1.add("mysore");
		arr1.add("belgaum");
		
		System.out.println(arr);
		//arr.addAll(arr1);
		//arr.addAll(1, arr1);
		//System.out.println(arr);
		//arr1.clear();
		//System.out.println(arr1);
		
		ArrayList<String> clonelist=(ArrayList<String>)arr.clone();
		System.out.println(clonelist);
		
		System.out.println(arr1.contains("banglore")); 	
		System.out.println(arr1.contains("m"));//we cannot check a single value
		
		System.out.println(arr1.indexOf("belgaum")==2);
		
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("vijay","praveen","ravi","raju","paddya","vijay","praveen"));
		System.out.println(list1);
		
		int i=list1.lastIndexOf("vijay");
		System.out.println(i);
		
		list1.remove(1);
		System.out.println(list1);
		
		list1.remove("praveen");
		System.out.println(list1);
		
		ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		num.removeIf(num1->num1%2==0);
		System.out.println(num);
		
		ArrayList<String> namelist=new ArrayList<String>(Arrays.asList("vijay","praveen","ravi","raju","paddya","vijay","praveen"));
		namelist.retainAll(Collections.singleton("vijay"));
		System.out.println(namelist);
		
		ArrayList<Integer> num1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> sublist=new ArrayList<Integer>(num1.subList(0, 6));
		System.out.println(sublist);
	}

}
