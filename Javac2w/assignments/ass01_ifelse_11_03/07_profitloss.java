class pfls{

	public static void main(String[] sau){
	
		float sp=400f;
		float cp=-900f;

		if(sp>cp){
			float pf = sp-cp;
			System.out.println("Profit is of "+pf);
		}else if(cp>sp){
			float ls = cp-sp;
			System.out.println("Loss is of "+ls);
		}else
			System.out.println("Neither profit nor loss");
	}
}
