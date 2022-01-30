package JavaPrograms;

public class PrintThenumWithoutUsingNumsinthecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<=100;i++)
		{
			System.out.println(i);
		}*/
		
		
		int one='a'/'a';
		String s1="..........";
		for (int i=one;i<=(s1.length()*s1.length());i++)
		{
			System.out.println(i);
		}
			test(null);

	}
	public static void test(Object o)
	{
		System.out.println("Its in the object");
	}
	public static void test(String s)
	{
		System.out.println("I am in the String");
	}

}
