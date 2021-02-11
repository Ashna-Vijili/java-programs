package day13;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> javaBatch =new ArrayList<String>();
		ArrayList<String> softSkillBatch =new ArrayList<String>();
		
		javaBatch.add( "Aarti");
		javaBatch.add( "Abhay");
		javaBatch.add( "Deepa");
		javaBatch.add( "Darshan");
		javaBatch.add( "Sarita");
		
		System.out.println(javaBatch);
		
		softSkillBatch.add( "Anjali");
		softSkillBatch.add( "Nikhil");
		softSkillBatch.add( "Aarti");
		softSkillBatch.add( "Deepa");
		softSkillBatch.add( "Pavan");
		
		System.out.println(softSkillBatch);
		
		softSkillBatch.removeAll(javaBatch);
		System.out.println(softSkillBatch);
		
		
		softSkillBatch.addAll(javaBatch);
		System.out.println(softSkillBatch);
		Collections.sort(softSkillBatch);
		System.out.println(softSkillBatch);
		
		
		
		
	}

}
