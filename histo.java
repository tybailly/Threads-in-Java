import java.util.Random;

 
public class histo
{				// Histogram class
  
 
 
public static void run ()
  {
    
 
int[] orig = new int[51];	// array holding 50 values
    
for (int i = 0; i < orig.length; i++)
      {
	
orig[i] = i;
      
 
} 
 
Random r = new Random ();
    
 
for (int a = 0; a < orig.length; a++)
      {
	
r.nextInt (orig.length);
	
orig[a] = a;
      
 
 
} 
 
System.out.println ("Histogram ");
    
printHistogram (orig);
  
} 
 
private static void printHistogram (int[]array)
  {
    
for (int range = 0; range < array.length; range++)
      {
	
String label = range + " : ";
	
System.out.println (label + convertToStars (array[range]));
  
}} 
 
 
private static String convertToStars (int num)
  {
    
StringBuilder builder = new StringBuilder ();
    
for (int j = 0; j < num; j++)
      {
	
builder.append ('*');
      
} 
return builder.toString ();
  
}
  
