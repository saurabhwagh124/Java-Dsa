class Mythread extends Thread{

	public void run(){
	
		System.out.println("New thread = "+Thread.currentThread().getName());
		for(int i=0;i<10;i++){
		
			System.out.println("In run");
			try{

				Thread.sleep(127);
			}catch(InterruptedException e){

			}
		}
	}
}


class ThreadDemo{

	public static void main(String[] sau)throws InterruptedException{
	
		System.out.println("Main Thread = "+Thread.currentThread().getName());
		Mythread obj = new Mythread();
		obj.start();
		for(int i=0;i<10;i++){
		
			System.out.println("In main");
			Thread.sleep(126);
		}
	}
}
