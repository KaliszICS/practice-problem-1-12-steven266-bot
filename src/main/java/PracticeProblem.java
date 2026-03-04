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
		String num = scanner.nextLine();
		double radius = Double.parseDouble(num);
		double area = 3.14 * radius * radius;
	    System.out.println(area);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("");
		String num = scanner.nextLine();
		double number = Double.parseDouble(num);
		number = number * 12;
		number = Math.floor(number);
		System.out.println((int)number);

	}

}
