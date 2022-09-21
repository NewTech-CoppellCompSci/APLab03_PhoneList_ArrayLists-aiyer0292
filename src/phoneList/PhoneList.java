package phoneList;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Phone List
 * 
 * You'll be using an ArrayList of Contact objects
 * to crate a digital address book.
 * 
 * You MUST
 *   - Use an ArrayList
 *   - Keep list in alphabetical order
 *   - Complete the 
 *   
 * You May
 *   - Add methods as you see fit
 *   - Change method parameters and return types
 *   
 * You May NOT
 *   - change the menu method
 *        unless you're changing what methods it calls
 * 
 */


public class PhoneList {

	 /*
	 * Instance Variables
	 */
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	//Constructor
	public PhoneList(ArrayList<Contact> list) {
		//initialize instance variables
		contacts = list;
		
	}
	
	
	/*
	 * This should do the following
	 * (whatever order you feel is best)
	 *   - ask the user for contact's name and number
	 *   - create a new Contact object with that input
	 *   - add that object to the phone list
	 *        in alphabetical order
	 *        Hint: compareTo(String other)
	 *   - tell the user what the new contact is and that 
	 *        it's been added
	 */
	public void addContact() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Name for Contact: ");
		String name = input.nextLine();
	
		
		
		System.out.print("Enter Phone Number for Contact: ");
		String phoneNum = input.nextLine();
		

		Contact c1 = new Contact(name, phoneNum);
		
		int x = 0;
		for(int i = 0; i < contacts.size(); i++){
			if(compare(c1, contacts.get(i)) >= 0){
				contacts.add(i, c1);
				x = 1;
			}
		}

		if(x == 0) {contacts.add(c1);}

	}

	public int compare(Contact c1, Contact listC){
		int a = c1.getName().length();
		int b = listC.getName().length();
		int min = Math.min(a, b);

		for(int i = 0; i < min; i++){
			int c1_ch = (int)c1.getName().charAt(i);
			int listC_ch = (int)listC.getName().charAt(i);

			if(c1_ch < listC_ch){
				return 1;
			}
			else if(c1_ch > listC_ch){
				return -1;
			}
		}

		return 0;
	}
	
	
	/*
	 * This should do the following
	 * (whatever order you feel is best)
	 *   - ask the user for the contact's name
	 *   - search through the list for that contact
	 *   - if the contact is not found
	 *        tell the user and end the method
	 *   - if the contact is found
	 *        Remove the item from the list
	 *        Print the contact's name and number
	 *        Say that contact has been removed
	 *        Remove the item from the list
	 *        
	 */
	public void removeContact() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Contact Name: ");
		String name = input.nextLine();

		for(int i = 0; i < contacts.size(); i++){
			if(name == contacts.get(i).getName()){
				contacts.remove(i);
			}
			else{
				System.out.println("Name was not found in Contancts :(");
			}
		}
		
	}
	
	
	/*
	 * This should
	 *   - Print all items in list
	 *   - Must be headers for all columns
	 *   - print in alphabetical order
	 *   - print line of something to "box" the list
	 *       Examples:
	 *          *****************
	 *          -----------------
	 *          #################
	 */
	public void printList() {
		System.out.println("Contacts: \n \n");
		
		for(int i = 0; i < contacts.size(); i++){
			System.out.println(contacts.get(i).toString());
			System.out.println("\n ************************ \n");
		}
	}

	
	
	/*
	 * GET FAMILIAR WITH THIS MENU!!!!
	 * 
	 * I will be asking you to create programs with menus.
	 * You may do them however you like.  But here is an example
	 * of how to manage them.
	 * 
	 */
	public void menu() {
		
		int input = 0;
		
		String menu = "-----------------------\n"
				    + "     Contacts Menu     \n"
				    + "-----------------------\n"
				    + "  1 - Add Contact      \n"
				    + "  2 - Remove Contact   \n"
				    + "  3 - Print List       \n"
				    + "  4 - Quit             \n\n"
				    + "Enter Choice: ";
		
		while (input != 4) {  //keep looping till user want's to quit
			
			//try getting an input
			try {
				String inputString = getString("\n" + menu);  //get input
				input = Integer.valueOf(inputString);  //try converting to int
			}
			catch (Exception e) {
				//if bad input, set input to 0
				input = 0;  
			}
		
			switch (input) {
			case 1:
				//handle menu line 1: Add Contact
				addContact();
				break;
			case 2:
				//handle menu line 2: Remove Contact
				removeContact();
				
				break;
			case 3:
				//handle menu line 3: Print List
				printList();
				break;
			case 4:
				//handle menu line 4: Quit
				System.out.println("\nGodbye!");
				break;
			default:
				System.out.println("\nNot a valid input.\n"
								 + "Please try again.");
			}
			
			
		
		}
		
	}
	
	public String getString(String str) {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print(str);  //notice it's NOT a print line.  This way input is next to question.
		return inKey.nextLine();
		
	}
	
	
}
