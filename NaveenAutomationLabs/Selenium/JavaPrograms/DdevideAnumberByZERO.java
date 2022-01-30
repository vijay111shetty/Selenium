package JavaPrograms;

public class DdevideAnumberByZERO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(12/0);--Arithmetic Exception
		System.out.println(12.0/0);//--Infinity
		System.out.println(0.0/0);//--NaN--(Not a Number)
		System.out.println(Math.sqrt(-4));//--NaN--(Not a Number)
		System.out.println(Float.NaN==Float.NaN);//--false
		Double nan=12.0%0;
		System.out.println((12.0%0)==nan);//--false
	}

}
