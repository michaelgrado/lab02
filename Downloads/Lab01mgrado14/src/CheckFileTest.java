import static org.junit.Assert.*;

import org.junit.Test;

public class CheckFileTest {

	@Test
	public void test() {
		CheckFile a = new CheckFile();
		assertTrue(a!=null);
	}
	@Test
	public void testCheckFile() throws Exception{
		CheckFile a = new CheckFile();
		
		assertTrue("4.txt".equals(a.CheckFile(4)));
		assertTrue("9.txt".equals(a.CheckFile(9)));
		
	}
	
	@Test public void testFileExists() throws Exception{
		
		assertTrue(CheckFile.fileExists("english")==true);
	}
	
	public void testCheckFileString() throws Exception{
		CheckFile a = new CheckFile();
		
		assertTrue("enable1.txt".equals(a.CheckFileString("enable1")));
		assertTrue("more_words.txt".equals(a.CheckFileString("more_words")));

	}
	
	

}
