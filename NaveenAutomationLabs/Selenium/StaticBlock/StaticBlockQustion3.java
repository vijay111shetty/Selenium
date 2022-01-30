package StaticBlock;

public class StaticBlockQustion3 {
	int age;
	static {
		StaticBlockQustion3 obj1=new StaticBlockQustion3();
	}
	public static int createobject()
	{
		StaticBlockQustion3 obj1=new StaticBlockQustion3();
		obj1.age=30;
		return obj1.age;
	}
	private StaticBlockQustion3() {//we cannot access this class out side this class
		age=30;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockQustion3 obj=new StaticBlockQustion3();
		System.out.println(obj.age);
		//StaticBlockQuestion4 obj1=new StaticBlockQuestion4();
		System.out.println(StaticBlockQuestion4.age);

	}

}
