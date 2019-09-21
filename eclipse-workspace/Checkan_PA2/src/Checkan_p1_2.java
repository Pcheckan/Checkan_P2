import java.util.Scanner;
public class Checkan_p1_2 {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Input the number to be decrypted");
		int input = userInput.nextInt();
		
		int firstDigit = input / 1000;
		int secondDigit = (input % 1000) / 100;
		int thirdDigit = (input % 100) / 10;
		int fourthDigit = (input % 10);		
		
		firstDigit = decrypt(firstDigit);
		secondDigit = decrypt(secondDigit);
		thirdDigit = decrypt(thirdDigit);
		fourthDigit = decrypt(fourthDigit);
		
		arrange(firstDigit, secondDigit, thirdDigit, fourthDigit);
		}
	public static int decrypt(int number)
	{
		number = (number + 3 ) % 10;
		return number;
	}
	
	public static void arrange(int num1, int num2, int num3, int num4)
	{
		int temp1 = num1;
		int temp2 = num3;
		num1 = num2;
		num2 = num4;
		num3 = temp1;
		num4 = temp2;
		System.out.println(num1 + "" + num2 + "" + num3 + "" + num4);
	}
	
}
