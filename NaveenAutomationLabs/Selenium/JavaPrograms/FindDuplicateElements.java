package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infra[]= {"GCP","Amazon","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP"};
		//1.BruteForce
		//2.HashSet
		//3.HashMap<key,value>
		//4.Streams
		//1.BruteForce
		System.out.println("*********BruteForce*********");
		for(int i=0;i<infra.length;i++)
		{
			for(int j=i+1;j<infra.length;j++)
			{
				if(infra[i].equals(infra[j]))
				{
					System.out.println(infra[i]);
				}
			}
		}
		//2.HashSet
		System.out.println("*********HashSet*********");
		HashSet<String> data=new HashSet<String>();
		for(String e:infra)
		{
			if(data.add(e) == false)
			{
				System.out.println(e);
			}
		}
		
		//3.HashMap
		System.out.println("*********HashSet*********");
		HashMap<String,Integer> infraset=new HashMap<String,Integer>();
		for (String e:infra)
		{
			Integer count=infraset.get(e);
			if(count==null)
			{
				infraset.put(e, 1);
			}
			else
			{
				infraset.put(e, ++count);
			}
		}
		System.out.println(infraset);
		
		//4.Streams
		System.out.println("*********Stream*********");
		//String infra[]= {"GCP","Amazon","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP"};
		HashSet<String> dataset=new HashSet<String>();
		Set<String> dupset=Arrays.asList(infra).stream().filter(e->!dataset.add(e)).collect(Collectors.toSet());
		System.out.println(dupset);
	}

}
