package exercises6;

import java.util.Calendar;

public class GreetingCalendar {
	Calendar greetings = Calendar.getInstance();
	int hour;
	int ampm;
	int minute;
	int second;
	
	public GreetingCalendar() {
		hour = greetings.get(Calendar.HOUR_OF_DAY);
		ampm = greetings.get(Calendar.AM_PM);
		minute = greetings.get(Calendar.MINUTE);
		second = greetings.get(Calendar.SECOND);
		
		System.out.println("현재시간: "+((ampm == Calendar.AM) ? "오전 " : "오후 ")+hour +"시 "+minute+"분 "+second+"초");
	}
	
	protected String printCalender(){
		if(4<hour && hour<12){
			return "Good Morning";
		} else if(12<=hour && hour<18){
			return "Good Afternoon";
		} else if(18<=hour && hour<20){
			return "Good Evening";
		} else 
			return "Good Night";
	}

	public static void main(String[] args) {
		GreetingCalendar gc = new GreetingCalendar();
		System.out.println(gc.printCalender());
	}

}
