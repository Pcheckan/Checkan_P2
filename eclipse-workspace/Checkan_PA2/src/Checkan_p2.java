import java.util.Scanner;
public class Checkan_p2 {

	public static void main(String[] args) {
		Scanner userChoice = new Scanner(System.in);
		System.out.println("Type 1 for weight in pounds, or 2 for weight in kilos");
		int choice = userChoice.nextInt();
		if (choice == 1)
		{
			System.out.println("Enter your weight in pounds");
			Scanner weightInPounds = new Scanner(System.in);
			int userWeight = weightInPounds.nextInt();
			System.out.println("Enter your height in inches");
			Scanner heightInInches = new Scanner(System.in);
			int userHeight = heightInInches.nextInt();
			double bmiCalc = (703 * (double)userWeight) / ((double)userHeight * (double)userHeight);
			System.out.println("Your BMI is " + bmiCalc);
		}
		
		else if (choice == 2)
		{
			System.out.println("Enter your weight in kilos");
			Scanner weightInKilos = new Scanner(System.in);
			int userWeight = weightInKilos.nextInt();
			System.out.println("Enter your height in meters");
			Scanner heightInMeters = new Scanner(System.in);
			int userHeight = heightInMeters.nextInt();
			double bmiCalc = ((double)userWeight / ((double)userHeight * (double)userHeight));
			System.out.println("Your BMI is " + bmiCalc);
		}
		
		System.out.println("BMI Categories: ");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal Weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}

}
