package contact;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import contact.Contact;

public class ContactService {
	int currentIDnum = 0;
	public static List<Contact> contactList = new ArrayList<Contact>();
	public void AddContact(String Fname, String Lname, String Phone, String Address) {
		String stringID = Integer.toString(currentIDnum);
		
		Contact newContact = new Contact(stringID, Fname, Lname, Phone, Address);
		++currentIDnum;
	}
	public void DeleteContact(String ID) {
		int intID = Integer.valueOf(ID);


		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContact_ID() == intID) {
				contactList.remove(i);
			}
		}
	}
	

	public void editFName(String ID, String Fname) {
		for(Contact iter : contactList) {
			if(iter.getContact_ID() == Integer.valueOf(ID)) {
				iter.setF_name(Fname);				
			}			
		}	
	}
	

	public void editLName(String contactID, String LName) {
		for(Contact iter : contactList) {
			if(iter.getContact_ID() == Integer.valueOf(contactID)) {
				iter.setL_name(LName);				
			}			
		}	
	}
	public void editPhone(String ID, String phoneNumber) {
		for(Contact iter : contactList) {
			if(iter.getContact_ID() == Integer.valueOf(ID)) {
				iter.setPhone_num(phoneNumber);				
			}			
		}	
	}
	public void editAddress(String ID, String Address) {
		for(Contact iter : contactList) {
			if(iter.getContact_ID() == Integer.valueOf(ID)) {
				iter.setAddress(Address);				
			}			
		}	
	}
}
