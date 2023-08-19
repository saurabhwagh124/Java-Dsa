class run{

	public static void main(String[] sau){
	
		float r = 34.5f;
		if(r>=20){
			System.out.println("Inhuman speed " +r);
		}else if(r>=10){
			System.out.println("exceptional runner "+r);
		}else if(r>=8){
			System.out.println("running at speed of "+r);
		}else if(r>=5){
			System.out.println("jogging at speed of "+r);
		}else if(r>=1){
			System.out.println("walking at speed of "+r);
		}else if(r>=0){
			System.out.println("Still");
		}else
			System.out.println("Invalid");
	}
}
