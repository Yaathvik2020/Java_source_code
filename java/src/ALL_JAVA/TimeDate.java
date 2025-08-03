package ALL_JAVA;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class TimeDate {
	public static void main(String a[]) throws ParseException{
		//LocalDate
		LocalDate to=LocalDate.now();
		LocalDate yes=to.plusDays(1);
		LocalDate lef=LocalDate.of(2020, 1, 10);
		boolean islef=lef.isLeapYear();
		System.out.println("CurrentDte :"+yes);
		System.out.println("LeafYear or not : "+islef);
		// convert date 
		String sDate1="31/12/1998";
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		System.out.println(sDate1+"\t"+date1);
		//LocalTime
		LocalTime ti=LocalTime.now();
		System.out.println("CurretTime: "+ti);
		System.out.println("SetTime "+ti.of(10, 59,7));
		System.out.println("Get Hour: "+ti.getHour());
		
		//simple DateFormat
		DateFormat fo=new SimpleDateFormat("hh:mm:ss aa");//"hh:mm:ss"
		Date d1=fo.parse("04:00:00 PM");
		System.out.println(d1+"chinna");
		DateFormat dt=new SimpleDateFormat("yyy-MM-ddhh:mm:ss aa");//"hh:mm:ss"
		Date dt1=dt.parse("2017-06-15 08:40:08 PM");
		System.out.println("setting date and time: "+dt1);
		//Calender
		Calendar c1=Calendar.getInstance();//jan 01 1970
		c1.setTime(d1);
		c1.add(c1.DATE, 6);
		c1.add(c1.MONTH, 2);
		System.out.println("after adding month and day"+c1.getTime());
	
		//given time is between two time.
		Date d2=fo.parse("08:00:00PM");
		Date d3=fo.parse("05-32-08PM");
		if(d3.after(d1)&&(d3.before(d2))){
			//LocalTime t3=LocalTime.parse("05:32:08");
			 String d=DateFormat.getTimeInstance().format(d3);
			System.out.println(d3+" : lie between" +" and "+d);
		}
		//dateformat
		String d=DateFormat.getDateTimeInstance().format(d1);
		System.out.println(d+"chinnns..");
		 d=DateFormat.getTimeInstance().format(d1);
		 System.out.println(d+"chinna...3");
		 
		 // all test
		 String str1="2017-10-1 10:30:33 PM";
			String str2="2017-10-2 12:30:33 PM";
			String str3="2017-10-1 07:30:33 PM";
			DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
			Calendar c=Calendar.getInstance();
			
			try {
				Date dt11=df.parse(str1);
				Date dt2=df.parse(str2);
				Date dt3=df.parse(str3);
				c.setTime(dt3);
				c.add(c.DATE, 1);
				Date dt33=c.getTime();
				System.out.println("chinna: "+dt33);
				if(dt33.after(dt11)&&dt3.before(dt2)){
					String str=DateFormat.getTimeInstance().format(dt33);
					System.out.println("The 3rd Date is coming after date "+str+"\n"+dt33);
					
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
}
