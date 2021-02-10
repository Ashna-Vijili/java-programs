package practiceexercise;

class EmployeeName{
			
			String firstname;
			String lastname;
			public EmployeeName(String firstname, String lastname) {
				super();
				this.firstname = firstname;
				this.lastname = lastname;
			}
			
		}
		
		public class Exception3 {
			public static void main(String[] args) {
				EmployeeName e=new EmployeeName("sam", "duo");
				
				if(e.firstname==null && e.lastname==null) {
			         throw new NullPointerException("Entry missing");
			      }
			      else {
			         System.out.println("Have a good day"); 
			      }
				
				if(firstName.length equals(3) ) {
			         throw new NullPointerException("name should be minimum 3 character");
			      }
			      else {
			         System.out.println("Have a good day"); 
			      }
				
			   }


	}


