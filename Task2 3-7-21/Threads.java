import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Count implements Runnable
{
    Thread thread1;
    Count()
    {
        thread1 = new Thread(this, "runnable thread");
        System.out.println("thread1 is created\n" + thread1);
        thread1.start();
    }
    public void run()
    {
        try
        {
            for (int i=0 ;i<10;i++)
            {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                System.out.println(format.format(now));
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("thread1 is interrupted");
        }
        System.out.println("thread1 is over" );
    }
}
class Runnable1
{
    public static void main(String args[])
    {
        Count cnt = new Count();
        try
        {
            while(cnt.thread1.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over" );
    }
}
