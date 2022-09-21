package phoneList;

import java.util.ArrayList;

public class Runner {
    
	public static void main(String[] args) {

        Contact c1 = new Contact("Jango Fett", "(420)420-6969");

        ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(c1);

		PhoneList app = new PhoneList(contacts);
		app.menu();
	}
}
