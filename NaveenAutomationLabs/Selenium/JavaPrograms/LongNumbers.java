package JavaPrograms;

public class LongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long longnumberwithoutL = 1000 * 60 * 60 * 24 * 365;
		long longnumverwithL = 1000 * 60 * 60 * 24 * 365L;
		System.out.println(longnumberwithoutL);// 1471228928--101 0111 1011 0001 0010 1100 0000 0000
		// in binary it will trunacate the first digits
		// Actual output in calculator is==31536000000

		System.out.println(longnumverwithL);// 31536000000--111 0101 0111 1011 0001 0010 1100 0000 0000

	}

}
