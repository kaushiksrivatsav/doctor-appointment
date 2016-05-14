
public class grabber implements Observer {
	 private String date,time;int object;
	@Override
	public void update(String date2, String time2, int i) {
		// TODO Auto-generated method stub
		   this.date=date;
		   this.time=time;
		   this.object=i;
		   System.out.println("the patient"+object+"has appointment on "+date+time);
			
	}

}
