import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -6626721605103365817L;
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	
	public void mailCheck() {
		System.out.println("Mailing a check to "+name+" "+address);
	}

}
