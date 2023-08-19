class Player{

	private int jerno = 0;
	private String name = null;
	Player(int jerno, String name){
	
		this.jerno = jerno;		
		this.name = name;
		System.out.println(System.identityHashCode(name));
		System.out.println(name.hashCode());
		System.out.println("In constructor");

	}
	void info(){
	
		System.out.println(jerno+ " = " +name);
	}
}

class Client{

	public static void main(String[] sau){
	
		Player obj1 = new Player(18,"Virat");
		obj1.info();
	
		Player obj2 = new Player(45,"Virat");
		obj2.info();
	}

}
