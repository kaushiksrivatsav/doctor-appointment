import java.util.*;
public class Doctor {
 
	private String name,reason; private Doctor object;private String  date;int time;
	
	public void getpatientdetails(String name ,String reason){
		this.name=name;
		this.reason=reason;
	}
	public int  fixtimeslots(){
		System.out.println("enter the time  you are available doctor");
		Scanner sn=new Scanner(System.in);
		this.time=sn.nextInt();
		return time;
	}
	
	
}
