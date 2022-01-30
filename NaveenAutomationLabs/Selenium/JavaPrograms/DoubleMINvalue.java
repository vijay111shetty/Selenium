package JavaPrograms;

public class DoubleMINvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Min of Double number is positive
		System.out.println(Double.MIN_VALUE);// --4.9E-324--positive number
		System.out.println(Integer.MIN_VALUE);// ---(-2147483648)--negative number
		System.out.println(Long.MIN_VALUE);// ----(-9223372036854775808)--negative number
		System.out.println(Math.max(Double.MIN_VALUE, 0.0d));
		// Integer cashing---(-128 to 128)
		Integer num1 = 127;
		Integer num2 = 127;
		if (num1 == num2) {
			System.out.println("numbers are equal");
		} else {
			System.out.println("number are not equal");
		}
	}

}
