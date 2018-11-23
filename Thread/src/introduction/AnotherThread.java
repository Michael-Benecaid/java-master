package introduction;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "This is from "+ currentThread().getName());

        try{
            Thread.sleep(3000);
        } catch(InterruptedException eInterruptedException){
            System.out.println(ThreadColor.ANSI_BLUE + "Another Thread wake me up");
            return;
        }

        System.out.println(ThreadColor.ANSI_BLUE + "3s passed.");
    }
}