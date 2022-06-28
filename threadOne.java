 import java.util.Random;


 
public class threadOne implements Runnable
{
  
String name;
  
int time = 999;
  
Random r = new Random ();
  
 
public threadOne (String x)
  {
    
name = x;
    
time = r.nextInt (999);
  
} 
 
public void run ()
  {
    
try
    {
      
histo.run ();
      
System.out.println ("Thread one is sleeping for " + time);
      
Thread.sleep (time);
    
} catch (Exception e)
    {
  } 
} 
 
 
 
