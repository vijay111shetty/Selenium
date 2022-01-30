package StaticBlock;

public class StatiBlockQuestion2 {
	static {
		System.out.println("I am in the static block");
	}
	public static void test() {
		System.out.println("I am in static method test");
	}
	public static void cover() {
		System.out.println("I am in static method cover");
		test();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		StatiBlockQuestion2.test();
		cover();
		System.out.println(StaticBlockQustion3.createobject());

	}

}
