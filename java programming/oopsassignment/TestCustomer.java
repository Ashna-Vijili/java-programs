package oopsassignment;

public class TestCustomer {
	
	public static void main(String[] args) {
		Address a=new Address("1st Main HSR Layout ," ,"Banglore");
		
		
		Customer c=new Customer();
		c.setCustomerName("John");
		c.setResidentialAddress(a);
		
		System.out.println("Customer name: "+c.getCustomerName() +"\nResidential Address : " +c.getResidentialAddress());
		
	}

}
