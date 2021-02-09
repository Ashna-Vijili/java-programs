package inheritanceandabstraction;

abstract class Medicine {
	double price;
	String expiry_date;
	public Medicine(double price, String expiry_date) {
		super();
		this.price = price;
		this.expiry_date = expiry_date;
	}
	abstract void displayLabel();
	void getDetails()
	{
		System.out.println("price of drug is: "+price+" "+"expiry date is: "+ expiry_date);
	}

	

}
