import org.testng.annotations.Test;

public class Actitime {
	//when one script is dependent on another script
	  @Test
	    
	    public void createnewcustomer()
	    {
	    	System.out.println("customercreated");
	    }
	    @Test  (dependsOnMethods = ("createnewcustomer"))
	    public void createnewproject()
	    {
	    	System.out.println("projectcreated");
	    }
	    
	//when two task is dependent
//	 @Test
//	    
//	    public void createnewcustomer()
//	    {
//	    	System.out.println("customercreated");
//	    }
//	    @Test  (dependsOnMethods = ("createnewcustomer","12255"))
//	    public void createnewproject()
//	    {
//	    	System.out.println("projectcreated");
//	    }
	    
	    
}
