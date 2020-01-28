import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HtmlTests {
	
	
	
	@Test
	public void testEin() {
		
		String html = "/a>";
		
		Assertions.assertFalse(Lab7Regex.validateHtml(html));
		
	}
	
	@Test
	public void testZwei() {
		
		String html = "<a> </a>";
		
		Assertions.assertTrue(Lab7Regex.validateHtml(html));
		
	}
	
	@Test
	public void testDrei() {
		
		String date = "<a";
		
		Assertions.assertFalse(Lab7Regex.validateHtml(date));
		
	}
	
	@Test
	public void testVier() {
		
		String html = "<<a><";
		
		Assertions.assertFalse(Lab7Regex.validateHtml(html));
		
	}
	
	@Test
	public void testFunf() {
		
		String date = "<z> </z>";
		
		Assertions.assertTrue(Lab7Regex.validateHtml(date));
		
	}

}