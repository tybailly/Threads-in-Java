import java.util.Random;
  
 
public class threadTwo implements Runnable
  {
    
 
String name;
    
int time = 999;
    
Random r = new Random ();
    
 
public threadTwo (String x)
    {
      
name = x;
      
time = r.nextInt (999);
    
} 
 
 
 
 
public void run ()
    {
      
try
      {
	
Thread.sleep (time);
	
Selection.main (null);
      
} catch (Exception e)
      {
    } 
} 
