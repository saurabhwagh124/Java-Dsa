class pythagorastrip{

	public static void main(String[] sau){
	
		int a = 4;
		int b = 4;
		int c = 4;
		if(a==b && b==c){
			System.out.println("Not a triplet");
		}
		else if(a*a+b*b==c*c){
			System.out.println("Is a triplet");
		}
		else if(b*b+c*c==a*a){
			System.out.println("Is a triplet");
		}
		else if(c*c+a*a==b*b){
			System.out.println("Is a triplet");
		}
		else
			System.out.println("Not a triplet");
	}
}
