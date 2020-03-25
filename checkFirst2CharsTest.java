package tddjunit.hometask;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class checkFirst2CharsTest {
	/*		TODO list
	*	“ABCD” => “BCD” 
	    “AACD” => “CD”  
	    “BACD” => “BCD” 
	    “BBAA” => “BBAA”        
	    “AABAA” => “BAA” 
	* 
	*/
	
	@Test
	void test1Aat1character(){
		checkFirst2Chars obj = new checkFirst2Chars();
		String actual = obj.Remove("ABCD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void test2Aas2characters(){
		checkFirst2Chars obj = new checkFirst2Chars();
		String actual = obj.Remove("AACD");
		assertEquals("CD",actual);
	}
	
	@Test
	void test1Aat2character(){
		checkFirst2Chars obj = new checkFirst2Chars();
		String actual = obj.Remove("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	void testnoAcharacters(){
		checkFirst2Chars obj = new checkFirst2Chars();
		String actual = obj.Remove("BBAA");
		assertEquals("BBAA",actual);
	}
	void characters2Awithdifferentlength(){
		checkFirst2Chars obj = new checkFirst2Chars();
		String actual = obj.Remove("AABBAA");
		assertEquals("BBAA",actual);
	}
}
