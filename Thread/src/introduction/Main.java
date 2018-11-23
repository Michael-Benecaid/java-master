package introduction;

public class Main {

	public static void main(String[] args) {
		System.out.println(ThreadColor.ANSI_PURPLE + "This is from main Thread");
		AnotherThread at = new AnotherThread();
		at.setName("==Another Thread==");
		at.start();

		new Thread() {
			public void run() {
				System.err.println(ThreadColor.ANSI_GREEN + "Hello from anonymouns");
			}
		}.start();

		Thread myRunnablThread = new Thread(new MyRunnable()){
			@Override
			public void run() {
				System.err.println(ThreadColor.ANSI_RED + "Hello from anonymous class of run()");
				try {
					at.join(2000);
					System.err.println(ThreadColor.ANSI_RED + "Another thread terminated, I am running again.");
				}catch(InterruptedException e){
					System.err.println(ThreadColor.ANSI_RED+ "Be interupted");
				}
			}
		};
		myRunnablThread.start();
		at.interrupt();

		System.out.println(ThreadColor.ANSI_PURPLE+ "This is from main Thread again");
	}

}
