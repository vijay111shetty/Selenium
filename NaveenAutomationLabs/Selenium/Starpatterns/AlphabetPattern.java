package Starpatterns;

public class AlphabetPattern {
  /*A 
	A B 
 	A B C 
	A B C D 
	A B C D E 
	A B C D E F */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpha=65;//aski value
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		System.out.println((char)66);
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+i )+" ");
			}System.out.println();
			
		}
		
	}

}
