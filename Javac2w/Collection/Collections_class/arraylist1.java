import java.util.*;
class ALdemo{

	public static void main(String[] sau){
	
		ArrayList al = new ArrayList();
		al.add("Harvey");
		al.add("Jonh");
		al.add("Mike");
		al.add("Tyson");
		al.add("James");
		al.add("Mikek");
		al.add("Harveyi");

		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);
	}
}
