import java.text.DecimalFormat;

public class Program {

	public static void main(String[] args) {
		
		 
		double largest = 0, smallest = 0;
		
		
		double [] [] scores = {	{5.6, 3.5, 5.9, 5.4, 5.1}, 
								{4.4, 5.4, 5.4, 5.8, 5.9}, 
								{4.5, 2.4, 4.3, 5.2, 4.5}, 
								{4.4, 5.2, 5.8, 4.9, 5.6}, 
								{5.3, 4.2, 5.5, 4.9, 4.9}, 
								{5.9, 5.6, 0.7, 4.4, 6.0}, 
								{5.1, 5.8, 3.2, 4.9, 2.8}};
		
		largest = scores[0][0];
		
		
		//Helps round scores to 1 decimal place
		DecimalFormat df = new DecimalFormat("#.0");

		for(int skater = 0; skater < scores.length; skater++) {
			System.out.println("Scores for Skater #" + (skater + 1) + ":");
			double sum = 0;
			
						
			for(int r = 0; r < scores.length; r = r + 1) {
				for (int c = 0; c < scores[0].length; c = c + 1) {	
					if(scores[r][c] > largest)
						largest = scores[r][c];
					else
						smallest = scores[r][c];
				}
			
			}
			for(int judge = 0; judge < scores[skater].length; judge++) {
				sum = sum + scores[skater][judge];
				System.out.print(scores[skater][judge] + "\t");
			}
			
			double avg = sum / scores[skater].length;
			System.out.println();
			System.out.println("Average:  " + df.format(avg));
			System.out.println();
			System.out.println(largest);
			System.out.println(smallest);
		}
	}
}
