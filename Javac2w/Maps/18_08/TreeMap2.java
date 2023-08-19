import java.util.*;
class Platform implements Comparable{

	String str = null;
	int Year = 0;
	Platform(String str, int Year){
	
		this.str = str;
		this.Year = Year;
	}
	public String toString(){
	
		return "{" + str + ":" + Year + "}";
	}
	public int compareTo(Object obj){
	
		return this.Year - ((Platform)obj).Year;

	}
}
class TM2{

	public static void main(String [] sau){
	
		TreeMap tm = new TreeMap(); 

		tm.put(new Platform("Saurabh",2003),"B.E.");
		tm.put(new Platform("Pranav",2002),"A.B.M.");
		tm.put(new Platform("Pranav", 2005),"B.B.A.");
		tm.put(new Platform("Krishna",2007),"Dipl");

		System.out.println(tm);

	}

}
