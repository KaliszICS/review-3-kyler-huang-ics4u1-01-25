import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		q1(scanner);
		q2(scanner);
		q3(scanner);
		q4(scanner);
		q5(scanner);
		q6(scanner);
		q7(scanner);
	}

	public static void q1(Scanner scanner) {
		System.out.println("In: ");
		String word_1 = scanner.nextLine();
		char first_character = word_1.charAt(0);

		System.out.println(first_character);

	}

	public static void q2(Scanner scanner) {
		System.out.println("In: ");
		boolean opposite_bool = scanner.nextBoolean();
		System.out.println(!opposite_bool);
		
	}

	public static void q3(Scanner scanner) {
		scanner.nextLine();
		System.out.println("In: ");
		int num_1 = scanner.nextInt();
		System.out.println(num_1 > 5);
		
	}

	public static void q4(Scanner scanner) {
		scanner.nextLine();
		System.out.println("In: ");
		double double_1 = scanner.nextDouble();
    	System.out.println(double_1 >= -2 && double_1 <= 2);
		
	}

	public static void q5(Scanner scanner) {
		scanner.nextLine();
		System.out.println("In: ");
		String hello_world = scanner.nextLine();
		System.out.println(hello_world.equals("Hello World"));
		
	}

	public static void q6(Scanner scanner) {
		System.out.println("In: ");
		int num_2 = scanner.nextInt();
		int num_3 = scanner.nextInt();
		System.out.println(num_2<=num_3);

		
	}

	public static void q7(Scanner scanner) {
		scanner.nextLine();
		System.out.println("In: ");
		double double_2 = scanner.nextDouble();
		double double_3 = scanner.nextDouble();
		System.out.println(double_2>double_3);

		
	}

}
