package inheritanceandabstraction;


 public abstract class PrepaidCard {
	int cardNo;
	double availableBalance;
	double swipeLimit;
	
	
	public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
		super();
		this.cardNo = cardNo;
		this.availableBalance = availableBalance;
		this.swipeLimit = swipeLimit;
	}
	
	public PrepaidCard()
	{
		
	}

	public abstract boolean swipeCard(double amount);

	 public void rechargeCard(double amount)
	 {
		  availableBalance=amount+availableBalance;
		 System.out.println("Available balance after recharge card"+availableBalance);
	 }

	@Override
	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	
	
	}






	/*
	 * class TravelCard extends PrepaidCard implements Rewardable { double
	 * rewardPoints=0;
	 * 
	 * @Override int swipeCard(int amount) { if(amount<=swipeLimit
	 * ||amount<=availableBalance) {
	 * System.out.println("travel cards are used in USA");
	 * availableBalance=(availableBalance-((amount*60)+(0.05*amount)));
	 * 
	 * }
	 * 
	 * return 0;
	 * 
	 * }
	 * 
	 * @Override public int rewardPoints(int amount) { if(amount==100) {
	 * rewardPoints+=10; } return 0; }
	 * 
	 * }
	 */
	


