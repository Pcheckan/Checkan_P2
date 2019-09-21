import java.util.Scanner;
public class Checkan_P3 {

	public static void main(String[] args) {
		String [] topics = new String [5];
		topics[0] = "Climate Change";
		topics [1] = "Global Politics";
		topics [2] = "Space Exploration";
		topics [3] = "Economic Growth";
		topics [4] = "Violence amongst youth";
		
		int [][] responses = new int[5][10];
		
		System.out.println("Rate the following topics from 1 to 10 based on importance to you\n");
		for (int i=0; i<5 ;i++)
		{
			System.out.println(topics[i]);
		}
		System.out.println("\n");
		
			Scanner userInput = new Scanner(System.in);
			int userChoice = 0;
			while (userChoice != -1)
			{
				for (int i = 0; i < 5; i++) 
				{
					System.out.println("Rate the importance of " + topics[i]);
					userChoice = userInput.nextInt();
				}
				System.out.println("Input -1 to terminate, or any other number to continue");
				userChoice = userInput.nextInt();
			}
	}

}
