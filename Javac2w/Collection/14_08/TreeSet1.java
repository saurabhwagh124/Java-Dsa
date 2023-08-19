import java.util.*;
class Movies implements Comparable{

	String movie = null;
	double collection = 0;
	Movies(String movie, double collection){
	
		this.movie = movie;
		this.collection = collection;
	}
	public int compareTo(Object obj){
	
		return movie.compareTo(((Movies)obj).movie);

	}
	public String toString(){
	
		return movie +":"+ collection;
	}

}

class treedemo{

	public static void main(String[] args){
	
		TreeSet ts = new TreeSet();
		ts.add(new Movies("FightClub", 630.00));
		ts.add(new Movies("Spectre",700.00));
		ts.add(new Movies("Batman", 790.00));
		ts.add(new Movies("Batman", 790.00));
		ts.add(new Movies("Spectre",700.00));
		

		System.out.println(ts);
	}
}
