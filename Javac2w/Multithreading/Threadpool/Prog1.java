class Mythread extends Thread{

	Mythread(ThreadGroup tg, String str){
	
		super(tg,str);
	}
	public void run(){
	
		System.out.println(Thread.currentThread());
		try{
		
			Thread.sleep(5000);

		}catch(InterruptedException ie){
		
		//	System.out.println(ie.tostring());
		}
	}

}

class ThreadDemo{

	public static void main(String [] sau)throws InterruptedException{
	
		ThreadGroup pThreadgp = new ThreadGroup("India");

		Mythread t1 = new Mythread(pThreadgp, "Maharashtra");
		Mythread t2 = new Mythread(pThreadgp, "Goa");
		t1.start();
		t2.start();

		ThreadGroup cThreadgp = new ThreadGroup(pThreadgp, "Pakistan");
		
		Mythread t3 = new Mythread(cThreadgp, "karachi");
		Mythread t4 = new Mythread(cThreadgp, "Lahore");
		t3.start();
		t4.start();

		ThreadGroup cThreadgp2 = new ThreadGroup(pThreadgp,"Bangladesh");

		Mythread t5 = new Mythread(cThreadgp2, "Dhaka");
		Mythread t6 = new Mythread(cThreadgp2, "Mirpur");
		t5.start();
		t6.start();
		cThreadgp.interrupt();
		System.out.println(pThreadgp.activeCount());
		System.out.println(pThreadgp.activeGroupCount());
	}
}
