import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("");
		int num= scanner.nextInt();
		num = num + 3;
		System.out.println(num);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner scanner= new Scanner(System.in);
		System.out.print("");
		String num = scanner.nextLine();   
        num = num + "4";                
        double num1 = Double.parseDouble(num);
        num1 = num1 + 2;                      
        System.out.println(num1);


	}

	public static void q3() {
		//Write question 3 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("");
		double radius =scanner.nextDouble();
	    System.out.println(radius*radius*3.14);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("");
		double num = scanner.nextDouble();
		double number = num * 12;
		double number1 = Math.floor(number);
		System.out.println(number1);

	}

}
