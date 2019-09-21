import java.util.Scanner;
public class Checkan_p1 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Input the 4 digit number");
		// take user input
		int input = userInput.nextInt();
		// Split the numbers up into individual
		int firstDigit = input / 1000;
		int secondDigit = (input % 1000) / 100;
		int thirdDigit = (input % 100) / 10;
		int fourthDigit = (input % 10);

		firstDigit = encrypt(firstDigit);
		secondDigit = encrypt(secondDigit);
		thirdDigit = encrypt(thirdDigit);
		fourthDigit = encrypt(fourthDigit);
		
		swap(firstDigit, thirdDigit);
		swap (secondDigit, fourthDigit);
		
	}
	
	public static int encrypt(int number)
	{
		number = (number + 7) % 10;		
		return number;
	}
	
	public static void swap(int num1, int num2)
	{
		int temp1 = num1;
		num1 = num2;
		num2 = temp1;
		System.out.print(num1 + "" + num2);
	}

}
