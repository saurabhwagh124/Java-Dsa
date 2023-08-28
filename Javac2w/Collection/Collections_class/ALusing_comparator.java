import java.util.*;
class Emp{

	String name = null;
	float sal =0.0f;
	Emp(String name, float sal){
	
		this.name = name;
		this.sal = sal;
	}

	public String toString(){
	
		return name + ":" + sal;
	}
}
class sortbyname implements Comparator <Emp>{
	public int compare(Emp obj1, Emp obj2){

		return obj1.name.compareTo(obj2.name);
}
}
class sortbysalary implements Comparator <Emp>{

	public int compare(Emp obj1, Emp obj2){
	
		return(int) (obj1.sal-obj2.sal);
	}
}

class AL1demo{

	public static void main(String[] sau){
	
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp("Abhinav", 100.0f));
		al.add(new Emp("Pratik",20.0f));
		al.add(new Emp("Piyush", 2.0f));
		al.add(new Emp("Swapnil",100000.0f));
		al.add(new Emp("Swapnil",100000.0f));
		al.add(new Emp("Swapnil",100000.0f));
		al.add(new Emp("Swapnil",100000.0f));
		al.add(new Emp("Swapnil",100000.0f));

		System.out.println(al);

		Collections.sort(al, new sortbyname());
		
		System.out.println(al);
		
		Collections.sort(al, new sortbysalary());
		System.out.println(al);

	}
}

