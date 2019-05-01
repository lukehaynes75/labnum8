package munbal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class labnum8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String repeat = "yes";

		do {
			try {

				String[] students = { "Karl", "Eric", "Tony", "Stefi", "Bonnie", "Amanda" };
				String[] hoTo = { "Rochester, MI", "Troy, MI", "Gary, IN", "Chicago, IL", "New York, NY", "Akron, OH" };
				String[] food = { "Pizza", "Cookies", "Turtle Soup", "Chicken noodle soup", "Fried Chicken",
						"Ham sammich" };

				System.out.println("Which student would you like to learn about 1 - 6?");
				int i = scan.nextInt() - 1;

				System.out.println("Student " + (i + 1) + " is " + students[i]);

				System.out.println("Enter hometown or food to learn about their hometown or favorite food");
				String answer = scan.next();

				if (answer.equalsIgnoreCase("hometown")) {
					System.out.println(hoTo[i]);
				} else if (answer.equalsIgnoreCase("food")) {
					System.out.println(food[i]);
				}
				scan.nextLine();
				System.out.println("Would you like to learn about another student? yes/no");
				repeat = scan.next();
			} catch (InputMismatchException e) {
				System.out.println("Wrong type of input please try again.");
				scan.nextLine();
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Your input was not with the specified limit please try again");
			}

		} while (repeat.equalsIgnoreCase("yes"));
		System.out.println("Hope you enjoyed learning about our students");
	}

}
