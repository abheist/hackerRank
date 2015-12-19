import java.io.*;
class TimeConversion	{
	public static void main(String[] args)throws IOException {
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		String n = in.readLine();
		String hour = n.substring(0,2);
		int changeHour = Integer.parseInt(hour);
		int len = n.length();
		String ampm = n.substring(len-2);
		String restTime = n.substring(2,len-2);
		if((ampm.equals("AM") || ampm.equals("am")) && changeHour == 12)	{
			changeHour = 00;
		}
		if((ampm.equals("PM") || ampm.equals("pm")) && changeHour != 12)	{
			changeHour = 12 + changeHour;
		}
		if (changeHour == 00) {
			System.out.println("00" + restTime);
		}
		else
		{
			if(changeHour < 10)	{
				System.out.println("0" + changeHour + restTime);
			}
			else	{
				System.out.println(changeHour + restTime);	
			}
		}
	}
}