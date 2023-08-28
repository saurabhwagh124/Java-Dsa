import java.util.*;
class Movie{

	String movie = null;
	float coll = 0.0f;
	float Imdb = 0.0f;

	Movie(String movie, float coll, float Imdb){
	
		this.movie  =  movie;
		this.coll = coll;
		this.Imdb = Imdb;
	}

	public String toString(){
	
		return movie + ":" + coll + ":" + Imdb;
	}
}

class sortbyname implements Comparator{

	public int compare(Object obj1, Object obj2){
	
		return ((Movie)obj1).movie.compareTo(((Movie)obj2).movie);
	}
}
class sortbycollection implements Comparator{

	public int compare(Object obj1, Object obj2){
	
		return (int) ((((Movie)obj1).coll)-(((Movie)obj2).coll));
	}
}
class sortbyrating implements Comparator{

	public int compare(Object obj1, Object obj2){
	
		return (int) ((((Movie)obj1).Imdb)-(((Movie)obj2).Imdb));
	}
}

class AL2demo{

	public static void main(String[] sau){
	
		ArrayList al = new ArrayList();
		al.add(new Movie("Spectre",120.0f,8.8f ));
		al.add(new Movie("Gadar",47.0f,5.6f));
		al.add(new Movie("Jailer",93.0f,6.8f));
		al.add(new Movie("Omg2",42.0f,7.2f));
		al.add(new Movie("Meg",87.0f,7.5f));
		System.out.println(al);

		Collections.sort(al, new sortbyname());
		System.out.println(al);
		Collections.sort(al, new sortbycollection());
		System.out.println(al);
		Collections.sort(al, new sortbyrating());
		System.out.println(al);
	}
}
