package contact;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	public void testCotact() {
		String ID = "1";
		String Fname = "Will";
		String Lname = "Roger";
		String Phone_num ="5555555555";
		String Address = "1234 Willaby Way";
		
		
	}
	@Test
	public void testContactIDNull() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact(null, "Will", "Roger","5555555555", "1234 Willaby Way" );
		});
	}
	@Test
	public void testContactIDtoLong() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact("12345678901","Will", "Roger", "5555555555", "1234 Wilaby Way");
		});
	}
	@Test
	public void testfNamenull() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567890",null, "Roger", "5555555555", "1234 Wilaby Way");
		});
	}
	@Test
	public void testfNamenToLong() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567890","Williammmmm", "Roger", "5555555555", "1234 Wilaby Way");
		});
	}
	@Test
	public void testlNamenull() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567890","Will", null, "5555555555", "1234 Wilaby Way");
		});
	}
	@Test
	public void testlNameToLong() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567890","Will", "Rogerrrrrrr", "5555555555", "1234 Wilaby Way");
		});
	}
	@Test
	public void testPhonenull() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567890","Will", "Roger", null, "1234 Wilaby Way");
		});
	}
	@Test
	public void testPhoneToLong() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567890","Will", "Roger", "55555555555", "1234 Wilaby Way");
		});
	}
	@Test
	public void testAddressnull() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567890","Will", "Roger", "5555555555", null);
		});
	}
	@Test
	public void testAddressToLong() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567890","Will", "Roger", "5555555555", "1234 Wilaby Wayyyyyyy");
		});
	}
}