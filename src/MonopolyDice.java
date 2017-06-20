import java.util.*;

public class MonopolyDice {

	public static void main(String[] args) {
		Random rnd = new Random();
		int rollOne;
		int rollTwo;
		int count = 0;
		
		
		while (true){
			
			if (count == 3){
				System.out.println("Go to Jail!");
				break;
			}
			
			rollOne = 1 + rnd.nextInt(6);
			rollTwo = 1 + rnd.nextInt(6);
			
			System.out.println("User rolls " + rollOne + " and " + rollTwo);
			
			if (rollOne == rollTwo){
				if (count == 2){
					System.out.println("Doubles! Go to jail!");
					break;
				}
				else{
					System.out.println("Doubles! Move " + (rollOne + rollTwo) + " spaces and roll Again");
					count++;
				}
			}
			else{
				System.out.println("Move " + (rollOne + rollTwo) + " spaces");
				break;
			}
			
		}

	}

}
