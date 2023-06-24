package week9.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearnThrows {
	
	public static void main(String[] args) throws FileNotFoundException, IOException  {
	
		FileInputStream fis = new FileInputStream("./data/LoginExcel.xlsx");
		fis.close();
		
	}

}
