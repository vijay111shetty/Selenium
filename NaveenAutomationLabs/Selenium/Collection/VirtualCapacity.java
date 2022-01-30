package Collection;

import java.util.ArrayList;

public class VirtualCapacity {//default capacity of the ArrayList is -->10

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr=new ArrayList<Object>();
		//Virtual Capacity of the arraylist is 10(0,1,2,3,4,5,6,7,8,9)-->by default
		//But basically it is zero
		System.out.println(arr.size());//op--0
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		System.out.println(arr.size());
		
		

	}

}
