package phoneList;


/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */



public class Contact {

	private String name;
	private String phoneNum;
	
	public Contact(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public Contact(String name) {
		this.name = name;
		phoneNum = "(000)000-0000";
	}

	public Contact() {
		name = "Unknown";
		phoneNum = "(000)000-0000";
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName()
			+ "\nPhone Number: " + getPhoneNum();
	}

}
