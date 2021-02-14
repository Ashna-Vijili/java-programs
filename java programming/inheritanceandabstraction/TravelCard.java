package inheritanceandabstraction;


	public class TravelCard extends PrepaidCard implements Rewardable{
	
	double rewardPoints=0;
	
	public TravelCard(int cardNo, double availableBalance, double swipeLimit, int rewardPoints) {
		super(cardNo, availableBalance, swipeLimit);
		this.rewardPoints = rewardPoints;
	}

	public TravelCard()
	{
		super();
	
	}
	

	@Override
	public boolean swipeCard(double amount) {
		
		amount=amount * 60;
		if(amount <= swipeLimit && amount <= availableBalance)
		{
			double remainBalance = availableBalance - amount;
			remainBalance=remainBalance - (0.05 * remainBalance);
			 System.out.println("Balance after SwipeCard = " + remainBalance);
			 
			 System.out.println("Transaction Successfull");
			 
			 return true;
		}
		else {
			
		System.out.println("Transaction Failed");
		
		return false;
	}}
	
		
	@Override
	public double rewards(double amount) {
		while (amount >= 100)
		{
			rewardPoints +=5;
			amount = amount - 100;
		}
		return rewardPoints;
	}	
	
	}	
