package contact;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	public void ContactServiceAdding() {
		String ID = "1";
		String Fname ="Will";
		String Lname ="Roger";
		String Phone = "5555555555";
		String Address = "1234 Wilaby Way";
		
		ContactService test = new ContactService();
		test.AddContact(   Fname, Lname, Phone ,Address);
		assertTrue(ContactService.contactList.isEmpty());
		assertEquals(0, ContactService.contactList.get(0).getContact_ID());
		assertEquals(Fname, ContactService.contactList.get(0).getF_name()); 
		assertEquals(Lname, ContactService.contactList.get(0).getL_name());
		assertEquals(Phone, ContactService.contactList.get(0).getPhone_num());
		assertEquals(Address, ContactService.contactList.get(0).getAddress());
	}
	
	@Test 
	public void TestDelete() {
		String Fname ="Will";
		String Lname ="Roger";
		String Phone = "5555555555";
		String Address = "1234 Wilaby Way";
		ContactService test = new ContactService();
		test.AddContact(Fname, Lname, Phone, Address);
		
		assertTrue(ContactService.contactList.isEmpty());
		
		test.AddContact(Fname, Lname, Phone, Address);
		test.AddContact(Fname, Lname, Phone, Address);
		
		
		assertEquals(2, ContactService.contactList.size());
		
		test.DeleteContact("1");
		
		assertEquals(1, ContactService.contactList.size());
		
	}
	@Test
	void TestPhone() {
		String FName = "Will"; 
		String LName = "Roger"; 
		String Phone = "1234567890"; 
		String Address = "1234 Wilaby Way";
		  
		ContactService test = new ContactService();
		test.AddContact(FName, LName, Phone, Address);
		
		
		test.editPhone("0", "1987654321");
		assertEquals("1987654321", ContactService.contactList.get(0).getPhone_num());
	}
	@Test
	void testLname() {
		String FName = "Will"; 
		String LName = "Roger"; 
		String Phone = "1234567890"; 
		String Address = "1234 Wilaby Way";
		
		ContactService test = new ContactService();
		test.AddContact(FName, LName, Phone, Address);
		
		assertEquals(LName, ContactService.contactList.getLast());
		test.editLName("0", "Damon");
		assertEquals("Damon", ContactService.contactList.get(0).getL_name());
	}	
	@Test
	void testFname() {
		String FName = "Will"; 
		String LName = "Roger"; 
		String Phone = "1234567890"; 
		String Address = "1234 Wilaby Way";
		
		ContactService test = new ContactService();
		test.AddContact(FName, LName, Phone, Address);
		
		assertEquals(FName, ContactService.contactList.get(0));
		test.editFName("0", "Geoff");
		assertEquals("Geoff", ContactService.contactList.get(0).getF_name());
	}	
	@Test
	void testAddress() {
		String FName = "Will"; 
		String LName = "Roger"; 
		String Phone = "1234567890"; 
		String Address = "1234 Wilaby Way";
		
		ContactService test = new ContactService();
		test.AddContact(FName, LName, Phone, Address);
		
		assertEquals(Address, ContactService.contactList.get(0));
		test.editAddress("0", "100 Where about");
		assertEquals("100 Where about", ContactService.contactList.get(0).getAddress());
	}	

}