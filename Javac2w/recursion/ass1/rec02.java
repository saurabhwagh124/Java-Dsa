class recurseit{


	void naturarev(int a){

	if(a==10)
		return;
	else{
	
		a++;
		naturarev(a);
		System.out.println(a);
	}	

	}
	public static void main(String[] sau){
	
		recurseit obj = new recurseit();
		obj.naturarev(1);

	}
}
