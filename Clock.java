import java.util.Timer;
import java.util.TimerTask;
public class Clock
{
    public static void main(String[] args)
    {
        // 
        Timer clock = new Timer();
        TimerTask clockTask = new TimerTask()
        {
            int clockTick = 0;

            @Override
            public void run() 
            {
                if (clockTick < 10) 
                {       
                    int t;
                    t = clockTick;
                    System.out.println("Beat");
                    clockTick++;
                }
                else
                {
                    clock.cancel();
                }
            }
        };
        clock.scheduleAtFixedRate(clockTask, 0, 1500);    
    }
}