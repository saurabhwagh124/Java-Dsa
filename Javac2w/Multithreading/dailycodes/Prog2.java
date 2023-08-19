class MyThread extends Thread{

	public void run(){
	
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
	public void start(){ //Overriding start method is not is wrong as it is then is runned by main thread itself
	
		System.out.println("In method start");
		run();
	}
}
class ThreadDemo{

	public static void main(String[] sau){
	
		MyThread obj = new MyThread();
		obj.start();
		System.out.println(Thread.currentThread().getName());
	}
}
