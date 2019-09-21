
public class Checkan_P3 {

	public static void main(String[] args) {
		String [] topics = new String [5];
		topics[0] = "Climate Change";
		topics [1] = "Global Politics";
		topics [2] = "Space Exploration";
		topics [3] = "Economic Growth";
		topics [4] = "Violence amongst youth";
		
		int [][] responses = new int[5][10];
		
		System.out.println("Rate the following topics from 1 to 10 based on importance to you");
		for (int i=0; i<5 ;i++)
		{
			System.out.println(topics[i]);
		}
		
	}

}
