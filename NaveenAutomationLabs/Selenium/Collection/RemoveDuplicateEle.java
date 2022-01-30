package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

 class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ints=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));
		System.out.println(ints);
		//LinkedHashSet
		//does not allow the Duplicate values
		LinkedHashSet<Integer> link=new LinkedHashSet<Integer>(ints);
		System.out.println(link);
		Iterator<Integer> it=link.iterator();
		System.out.println(it.next());
		ArrayList<Integer> withoutdup=new ArrayList<Integer>(link);
		System.out.println(withoutdup);
		
		//2.Stream
		ArrayList<Integer> marks=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));
		List<Integer> mark=marks.stream().distinct().collect(Collectors.toList());
		System.out.println(mark);
		
		
	}

}
