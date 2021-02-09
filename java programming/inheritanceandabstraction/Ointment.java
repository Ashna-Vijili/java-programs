package inheritanceandabstraction;

public class Ointment extends Medicine{

	public Ointment(double price, String expiry_date) {
		super(price, expiry_date);
		
	}

	@Override
	void displayLabel() {
		System.out.println("for external use only ");
		
	}
	

}
