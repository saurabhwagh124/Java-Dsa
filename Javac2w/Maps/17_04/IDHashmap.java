import java.util.*;
class Idhashmap1{

	public static void main(String [] sau){
	
		IdentityHashMap ihm = new IdentityHashMap();
		//Identity hash map checks the address of the elements rather than their values
		ihm.put(10,"Ishan");
		ihm.put(new Integer(10),"Messi");
		ihm.put(new Integer(10),"Mohit");
		ihm.put(new Integer(10),"Abhinav");
		ihm.put(new Integer(10),"Pranav");
		ihm.put(new Integer(10),"Krishna");
		System.out.println(ihm);

	}
}
