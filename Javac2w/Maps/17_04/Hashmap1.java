import java.util.*;
class Hashdemo1{

	public static void main(String[] sau){
	
		HashMap hm = new HashMap();
		hm.put("Abhinav","PTC");
		hm.put("Piyush","Infosys");
		hm.put("Pratik","TCS");
		hm.put("Natesh","JIO");
		System.out.println("HashMap output: "+ hm);


		HashSet hs = new HashSet();
		
		hs.add("Abhinav");
		hs.add("Piyush");
		hs.add("Pratik");
		hs.add("Natesh");
		System.out.println("HashSet output: "+ hs);
	}
}
