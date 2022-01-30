package StaticBlock;

public class StatiBlockQuestion1 {
	//1. Explain static block
	static {
		System.out.println("Static block1");
	}
	static {
		System.out.println("Static block2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in method");
	}
	static {
		System.out.println("Static block3");
	}
	static {
		System.out.println("Static block4");
	}

}
