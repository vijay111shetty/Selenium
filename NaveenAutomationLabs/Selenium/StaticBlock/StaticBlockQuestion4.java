package StaticBlock;

public class StaticBlockQuestion4 {

	// 4.is it possiable to compile and run the java program without using the
	// main() method---yes by using static block
	static int age = 20;
	static {
		System.out.println("I am the static block");
	}

}
