package lab2;

public class Time {
	public int hour;
	public int minute;
	public int second;
	public Time(int hour, int minute, int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public void check()
	{
		if(hour>24)
			System.out.println("Error");
		
	}
	public String toUniversal()
	{
		String s="";
		if(hour<10) s+="0";
		
		s+=hour+":";
		
		if(minute<10) s+="0";
		s+=minute+":";
		if(second<10) s+="0";
		s+=second;
		return s;
	}
	public String toStandard()
	{
		check();
		int newHour=hour;
		String v="";
		String z="";
		if(hour>12)
			{
			newHour-=12; 
			z="PM";
			}
		if(hour<=12) z="AM";
		if(newHour<10) v+="0";
		v+=newHour+":";
		if(minute<10) v+="0";
		v+=minute+":";
		if(second<10) v+="0";
		v+=second+" "+z;
		
		return v;
	}
	public void Add(Time t2)
	{
		int curM=minute;
		int curS=second;
		second=(second+t2.second)%60;
		minute=(minute+t2.minute)%60+(curS+t2.second)/60;
		hour=(hour+t2.hour)%60+(curM+t2.minute)/60;
	}
}
