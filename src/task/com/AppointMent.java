package task.com;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AppointMent {
	String name;
	int age;
	String DoctorName;

	public AppointMent(String name, int age, String doctorName) {
		super();
		this.name = name;
		this.age = age;
		this.DoctorName = doctorName;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Age=" + age + ", DoctorName="+DoctorName ;
	}

	public static void main(String[] args) {
    List<AppointMent> li=new ArrayList<AppointMent>();
		Date gg=new Date();
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\t\tMOKSHITA HOSPITALS PVT LTD.");
		System.out.println("\t\t\t\t  Chandanagar,Hyd-500050");
		System.out.println("\t\t\t\t\t\t\t\t\t  PH:895695685,");
		System.out.println("\t\t\t\t\t\t\t\t\t     040-23655.");
		System.out.println("Date&Time :- "+gg.toString());
		System.out.println("Enter the no of patients for Appointment");
		    int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the Name ");
			String name=sc.next();
			System.out.println("Enter Age");
			int age=sc.nextInt();
			System.out.println("Enter the name of the Doctor");
		    String ss=sc.next();
			System.out.println("Date&Time :- "+gg.toString());
			System.out.println("Appointment Booked");
			li.add(new AppointMent(name, age, ss));
			
		}
	
		System.out.println(li);
	/*	System.out.println(gg.toInstant());
		System.out.println(gg.after(gg));
        System.out.println(gg.getDate());
        System.out.println(gg.getMonth());
        System.out.println(gg.getMinutes());
        System.out.println(gg.getSeconds());
        System.out.println(gg.getDay());
        System.out.println(gg.getTimezoneOffset());
        System.out.println(gg.getYear());
        System.out.println(gg.toString());
       gg.setDate(11/42/1994);
       System.out.println(gg.getMonth());
       */
	}}
       
       
       
       