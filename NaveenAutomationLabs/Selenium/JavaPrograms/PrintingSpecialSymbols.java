package JavaPrograms;

public class PrintingSpecialSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// /"Hello"/
		// /'Hello'/
		// "Hello"
		// I "love" java and "coading"
		// I love "java" and "movies" and "programing"

		System.out.println("/\"HEllo\"/");
		System.out.println("/" + "'" + "HEllo" + "'" + "/");
		System.out.println("/" + "'" + "HEllo" + "'" + "/");
		// System.out.println("/"+"""+"Hello"+"' "+"/");--Double cotes in side the
		// double cotes are not allowed for this just use \ before the double quote
		System.out.println(" I \"love\" java and \"coading\"");
		System.out.println("I love \"java\" and \"movies\" and \"programing\"");
	}

}
