package day13;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> h=new HashMap();
h.put("sachin", "Opening batsman");
h.put("balu", "Umpire");
h.put("rahul", "middle order");
h.put("anand", "wicket keeper");
//h.put("rahul", "head coach");

System.out.println(h);
System.out.println(h.get("sachin"));
System.out.println(h.containsKey("sam"));

System.out.println("Getting keys : "+h.keySet());
System.out.println("Getting values : "+h.values());
System.out.println("Getting both keys & keys : "+h.entrySet());


//h.clear();
//System.out.println(h);
		
	}

}
