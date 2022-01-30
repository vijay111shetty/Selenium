package JavaPrograms;

import java.util.stream.IntStream;

public class PrintnumsWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printnums(1,10);
		IntStream.range(1,100).forEach(e->System.out.println(e));
	}
	/*public static void printnums(int num)
	{
			if(num<=100)
			{
				System.out.println(num);
				num++;
				printnums(num);
			}*/
	public static void printnums(int strnum,int endnum)
	{
			if(strnum<=endnum)
			{
				System.out.println(strnum);
				strnum++;
				printnums(strnum,endnum);
			}
	}
}
