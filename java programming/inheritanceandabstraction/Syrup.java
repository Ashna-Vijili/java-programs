package inheritanceandabstraction;

public class Syrup extends Medicine {

	public Syrup(double price, String expiry_date) {
		super(price, expiry_date);
		
	}

	@Override
	void displayLabel() {
		System.out.println("Shake well before use :");
	}

	
}
