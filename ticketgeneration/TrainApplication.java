package ticketgeneration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TrainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====ticket application===");
		DateTimeFormatter df=DateTimeFormatter.ofPattern("YYYY/MM/DD");
		
		TrainDao trainDao=new TrainDao();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the train id");
		int trainNo=scanner.nextInt();
		
		System.out.println("enter the travel date");
		//String travelDate=scanner.next();
		
		String travelDate=scanner.next();
		LocalDate date=LocalDate.parse(travelDate,df);
		System.out.println("Travel date " +date);
		
		Train train=trainDao.findTrain(trainNo);
		if( train!=null)
			System.out.println("trainname is "+train.getTrainName()+"train priceis "+train.getTicketPrice());
			
		else
			System.out.println("train not found");
		
		/*
		 * LocalDate date=LocalDate.parse(travelDate,pattern);
		 * System.out.println("travel date "+ date);
		 * System.out.println("travel date"+date.format(pattern));
		 */
		Ticket ticket=new Ticket(date,train);
		
		
		System.out.println("enter number of passenger");
		int noofPassenger=scanner.nextInt();
		for(int i=0;i<noofPassenger;i++)
		{
		System.out.println("Passenger name :");
		String name=scanner.nextLine();
		
		System.out.println("Passenger age :");
		int age=scanner.nextInt();
		
		System.out.println("passenger gender :");
		char gender=scanner.next().charAt(0);
		
		ticket.addPassenger(name, age, gender);//new Passenger
		}
		//ticket.display();
		
		
	}
	}
