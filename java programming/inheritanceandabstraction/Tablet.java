package inheritanceandabstraction;

public class Tablet extends Medicine{

	public Tablet(double price, String expiry_date) {
		super(price, expiry_date);
		
	}

	@Override
	void displayLabel() {
		System.out.println("Store in a cool and dry place");
		
	}

	
}
