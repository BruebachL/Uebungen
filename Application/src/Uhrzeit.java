import java.time.LocalDateTime;
public class Uhrzeit {
	public static void main(String[] args)
	{
		LocalDateTime cal = LocalDateTime.now();
        int hour = cal.getHour();
        int minute = cal.getMinute();
        int second = cal.getSecond();
        int time = second + minute*60 + hour*3600;
        int midnight = 24*60*60;
        int timeUntilMidnight = midnight-time;
        float percentOfDay = (float)time/((float)midnight/100.0f);
        System.out.println(time + " " + timeUntilMidnight + " " + percentOfDay + "%");
	}
}
