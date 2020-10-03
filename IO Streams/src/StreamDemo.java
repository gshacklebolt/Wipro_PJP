import java.util.*;
public class StreamDemo {

	public static void main(String[] args) {
		System.out.print("Previous username: ");
		System.out.println(System.getProperty("user.name"));
		
		Properties p=System.getProperties();
		p.put("user.name", "KingKong");
		System.setProperties(p);
		
		System.out.print("New username: ");
		System.out.println(System.getProperty("user.name"));
	}

}