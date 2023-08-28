import java.util.*;
class Hashdemo2{

	public static void main(String [] sau){
	
		HashMap hm = new HashMap();

		hm.put("Abhinav",150);
		hm.put("Piyush",350);
		hm.put("Pratik",250);
		hm.put("Mangesh",300);
		hm.put("Saurabh",200);

		System.out.println(hm);

		System.out.println(hm.get("Abhinav"));

		System.out.println(hm.keySet());

		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
	}
}
