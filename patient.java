import java.util.ArrayList;
import java.util.Arrays;


public class patient implements subject {
 private String date,time;patient object;patient [] patients=new patient[500];
 int lenght;
 

  public void observers(patient []a){
	  this.patients=a;
	  
  }
  


@Override
public void fixappointment(String date, String time) {
	
	this.date=date;
	  this.time=time;
	  notifyobserver();
}
@Override
public void notifyobserver() {
	lenght=patients.length;
	grabber a=new grabber();
	for(int i=0;i<lenght;i++){
		patient aa=patients[i];
	int 
       a.update(date,time,);
	}
}

  
}
