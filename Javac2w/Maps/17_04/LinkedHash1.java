import java.util.*;

class lhash1{

	public static void main(String[] sau){
	
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("Abhinav","Sonal");
		lhm.put("Pratik","Sakshi");
		lhm.put("Piyush","Divya");
		lhm.put("Pranav","Siddhi");

		System.out.println(lhm);

		lhm.put("Abhinav","Pratiksha");

		System.out.println(lhm);
	}
}
