package inheritanceandabstraction;

import java.util.Scanner;

public class TestCard  {

	public static void main(String[] args) {
		
		PrepaidCard p=new TravelCard(66661111,19900,10000,6);
		Rewardable r=new TravelCard();
		
		Scanner s=new Scanner(System.in);
		System.out.println(p);
		
		System.out.println("Amount in dollars : "+p.availableBalance/60);
		
		System.out.println("Enter the Swipe amount in dollars : " );
		
		 double amount=s.nextDouble();
		 p.swipeCard(amount);
		 
		 
		 System.out.println("Reward Points = "+r.rewards(amount * 60));
				 
		
	}
}
