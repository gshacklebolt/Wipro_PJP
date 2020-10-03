
public class Patient {
	String patientName;
	double height;
	double weight;
	
	Patient(String n,double h,double w){
		patientName=n;
		height=h;
		weight=w;
	}
	
	public double computeBMI() {
		double bmi=weight/height*height;
		return bmi;
	}
	public static void main(String[] args) {
		Patient obj=new Patient("Ghazali",1.626,65);
		System.out.println("BMI of "+obj.patientName+" is "+obj.computeBMI());
	}

}
