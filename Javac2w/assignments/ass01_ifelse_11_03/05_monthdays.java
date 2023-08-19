class daysofmon{

	public static void main(String[] sau){
	
		int v =3;
		if(v>12){
			System.out.println("Invalid month");
		}else if (v==1){
			System.out.println("January = 31 days");
		}else if(v==2){
			System.out.println("February = 28/29 days");
		}else if(v==3){
                        System.out.println("March = 31 days");
                }else if(v==4){
                        System.out.println("April = 30 days");
                }else if(v==5){
                        System.out.println("May = 31 days");
                }else if(v==6){
                        System.out.println("June = 30 days");
                }else if(v==7){
                        System.out.println("July = 31 days");
                }else if(v==8){
                        System.out.println("August = 31 days");
                }else if(v==9){
                        System.out.println("September = 30 days");
                }else if(v==10){
                        System.out.println("October = 31 days");
                }else if(v==11){
                        System.out.println("November = 30 days");
                }else if(v==12){
                        System.out.println("December = 31 days");
                }else
			System.out.println("Months cannot be negative, you dumb f!");
	}
}
