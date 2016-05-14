import java.util.*;
public class client {
	public static void main(String []args){
patient [] patients; int numberofpatients;int time;String patienttime;String date;
	Scanner sn=new Scanner(System.in);
	Doctor doctor1 = new Doctor();
time =doctor1.fixtimeslots();	

   System.out.println("enter the number of patients");
   numberofpatients=sn.nextInt();
   patients =new patient[numberofpatients];

   for (int i=0;i<numberofpatients;i++){
	 
	   patient p=new patient();
	   patients[i]=p;
	   
	   
   }
   for (int i=0;i<numberofpatients;i++){
   patients[i].observers(patients);}
   
   for (int i=0;i<numberofpatients;i++){
	   System.out.println("enter the time and date ");
	   patienttime =sn.next();
	   date=sn.next();
	   patients[i].fixappointment(date,patienttime);
	   
   }
	
}

}
