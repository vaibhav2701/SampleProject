package test.SampleProject;


import org.junit.Test;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    
    @Test
    public void Sample(){
    	
    	System.out.println("This is first test");
    	Assert.assertTrue("Test Passed", true);
    }
    
    @Test
    public void Sample2(){
    	
    	System.out.println("This is second test");
    	Assert.assertTrue("2nd Test Passed", true);
    }
    
    @Test
    public void Sample3(){
    	
    	System.out.println("This is third test");
    	Assert.assertTrue("3rd Test Passed", true);
    }
    
    @Test
    public void Sample4(){
    	
    	System.out.println("This is fourth test");
    	Assert.assertTrue("4th Test Passed", true);
    }
    
    @Test
    public void Sample5(){
    	
    	System.out.println("This is fifth test");
    	Assert.assertTrue("5th Test Passed", true);
    }
}
