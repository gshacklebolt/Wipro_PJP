package map.assignment4;

public class Assignment4 {

	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Ghazali", 226512);
		contactsList.addContact("Tony Stark", 123543);
		contactsList.addContact("Random", 987654321);
				
		System.out.println("Ghazali: " + contactsList.checkContactExists("Ghazali"));
		System.out.println("987654321: " + contactsList.checkNumberExists(987654321));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}
