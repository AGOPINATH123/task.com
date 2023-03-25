package task.com;

public class Encapsulation1 extends  Encapsulation{

	public static void main (String args[]) {
		Encapsulation En=new Encapsulation();
		
		En.setEmpoyeeId(256);
		En.setEmpoyeeMobileno(939120755);
		En.setEmpoyeeName("gopi");
		En.setEmpoyeesalary(25000);
		
		System.out.println(En.getEmpoyeeId());
		System.out.println(En.getEmpoyeeMobileno());
		System.out.println(En.getEmpoyeeName());
		System.out.println(En.getEmpoyeesalary());
	}

	public void setGender(String string) {
		// TODO Auto-generated method stub
		
	}
	  
	

}
