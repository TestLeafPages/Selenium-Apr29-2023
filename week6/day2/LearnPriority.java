package week6.day2;

import org.testng.annotations.Test;

public class LearnPriority {
  @Test(priority = 1)
  public void createLead() {
	  System.out.println("Create Lead");
  }
  
  @Test(priority = 2)
  public void editLead() {
	  System.out.println("Edit Lead");
  }
  @Test
  public void deleteLead() {
	  System.out.println("Delete Lead");
  }
  @Test
  public void duplicateLead() {
	  System.out.println("Duplicate Lead");
  }
  @Test(priority  = 3)
  public void mergeLead() {
	  System.out.println("Merge Lead");
  }
  
  
}
