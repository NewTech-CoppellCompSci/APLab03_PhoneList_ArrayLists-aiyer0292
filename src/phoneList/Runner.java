package phoneList;

import java.util.ArrayList;

public class Runner {
    
	public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		PhoneList app = new PhoneList(contacts);
		app.menu();
	}
}
