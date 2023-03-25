package Com.Gopi.NextPage;
import java.util.Scanner;
import Com.Afterloginpage.Gopi.AfterLoginPage;
import Com.Gopi.EntrencePage.DetailsPage;
public class EntryPage  extends AfterLoginPage{
	
	static Scanner sc = new Scanner(System.in);
	
	static String regex1="[789][1-9]{9}";static String loginId;	static String password;	public static String name;
	static String Gender;static String mobileNumber;static String HouseNo;static String area;static String Street;
	static String city;static int PinCode;static String District;static String State;	
	static AfterLoginPage af=new AfterLoginPage();
	static DetailsPage vs=new DetailsPage();    
	public static void methodCalling() {
		System.out.println("***************************************************************************************************************************************************");
		System.out.println("***************************************************************************************************************************************************");
		System.out.println("\t\t\t\t\t        WELCOME\n\t\t\t\t\t          TO   ");
		System.out.println("\t\t\t\t\t***- GFINITY MALL APP-***              ");
		System.out.println("\t\t\t\t\t        HYDERBAD                     ");
		System.out.println("*****************************************************************************************************************************************************");
		System.out.println("***************************************************************************************************************************************************");
		System.out.println();
		System.out.println("ENTER *L* FOR LOGIN OR *R* FOR REGISTER");
		String ch=sc.next().trim();
		if(ch.equalsIgnoreCase("l")) login();
		else if(ch.equalsIgnoreCase("r")) Register(); 			
		else System.out.println("ENTER A VALID INPUT"); 
		}
	public static void login() {
		String regex="XXXXXXXXXXXXXXX";	
		System.out.println("LOGIN-");
		System.out.println("ENTER YOUR NAME ");   name=sc.next();    	
		System.out.println("ENTER YOUR PASSWORD");password=sc.next();		
		vs.setName(name);vs.setPassword(password);
		System.out.printf("Name:- %s ;  ",vs.getName());
		System.out.printf("Password:- %s\n",regex);
		AfterLogin(name);		
					  }
	public static void Register(){
		System.out.println("REGISTER YOUR DETAILS-");
		System.out.println("ENTER YOUR NAME ");      	name=sc.next();         vs.setName(name);				
		System.out.println("SPECIFY GENDER");		 	Gender=sc.next();      	vs.setGender(Gender);				
		System.out.println("ENTER YOUR MOBILE NUMBER"); mobileNumber=sc.next();	vs.setMobileNumber(mobileNumber);				
		System.out.println("ENTER YOUR HOUSE NUMBER "); HouseNo=sc.next();		vs.setHouseNo(HouseNo);				
		System.out.println("ENT ER YOUR AREA");			area=sc.next();			vs.setArea(area);		
		System.out.println("ENTER YOUR STREET ");		Street=sc.next();		vs.setStreet(Street);			
		System.out.println("ENTER YOUR CITY ");			city =sc.next();		vs.setCity(city);			
		System.out.println("ENTER YOUR PINCODE ");		PinCode=sc.nextInt();	vs.setPinCode(PinCode);			
		System.out.println("ENTER YOUR DISTRICT ");		District=sc.next();		vs.setDistrict(District);	
		System.out.println("ENTER YOUR STATE ");		State=sc.next();		vs.setState(State);	
		System.out.println("HERE ARE YOUR DETAILS:-");
		System.out.println("NAME        = "+vs.getName()+"\nGender      = "+vs.getGender()+"\nMobileNo    = "+vs.getMobileNumber()+"\nHouseNo     = "+vs.getHouseNo()+
		"\nArea        = "+vs.getArea()+"\nStreet      = "+vs.getStreet()+"\nCity        = "+vs.getCity()+"\nPincode     = "+vs.getPinCode()+"\nDistrict    = "+vs.getDistrict()+"\nState       = "+vs.getState());	
		System.out.println("Check your Details ");
		System.out.println("Press *Y* if it is ok OR Press *N* for Edit");
		String fh=sc.next().trim();
		if(fh.equalsIgnoreCase("y")) SetPasword();
		else if(fh.equalsIgnoreCase("n")) System.out.println("No updating Available sorry!");	
		else System.out.println("ENTER A VALID INPUT"); 
		}
 	public static void SetPasword() {
		System.out.println("Set LoginId       ");vs.setLoginorPh(sc.next());
		System.out.println("Set Your Password ");vs.setPassword(sc.next());				
		System.out.println("ReEnter Password  ");vs.setPassword(sc.next());	
		System.out.printf("Your LoginId  :-%s ;",vs.getLoginorPh());
		System.out.printf("Your Password :-%s",vs.getPassword());
		AfterLogin(name);
	}	
	public static void main(String[] args) {
				
			methodCalling();
}
}