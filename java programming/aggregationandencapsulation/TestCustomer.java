package aggregationandencapsulation;

public class TestCustomer {
	
	public static void main(String[] args) {
		Address a=new Address("1st Main HSR Layout ," ,"Banglore");
		Address a2=new Address("1st Main Electronics City, ","Banglore");
		
		Customer c=new Customer();
		c.setCustomerName("John");
		c.setResidentialAddress(a);
		c.setOfficialAddress(a2);
		
		System.out.println("Customer name: "+c.getCustomerName() +"\nResidential Address : " +c.getResidentialAddress()+"\nOfficial Address : "+c.getOfficialAddress());
		
	}

}
