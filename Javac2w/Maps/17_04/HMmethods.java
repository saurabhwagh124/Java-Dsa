import java.util.*;

class hmmethods{

	public static void main(String[] sau){
	
		HashMap hm = new HashMap();
		
		hm.put("Dominar400","Bajaj");
		hm.put("Triumph400","Bajaj");
		hm.put("ZX100R","Kawasaki");
		hm.put("Bobber 42","Jawa");
		hm.put("Adventurer390","KTM");
		hm.put("Benelli250","Benelli");
		hm.put("Interceptor 650","RE");
		

		System.out.println(hm.keySet());
		System.out.println(hm.values());
		if(hm.containsKey("Bobber 42")){
		
			hm.clone();
			hm.remove("Bobber 42");
		}
		hm.replace("Benelli250","Benelli","BenelliItaly");
		System.out.println(hm.get("Interceptor 650"));
		System.out.println(hm.get("RE"));
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm);
		System.out.println(hm.size());
		

		
	}
}
