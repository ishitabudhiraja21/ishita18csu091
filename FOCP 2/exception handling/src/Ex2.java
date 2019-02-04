import java.lang.NullPointerException;
public class Ex2 
{
private static Integer i = null;	
public static void main(String[] args) 
{
System.out.println(i.toString());
try
 {
System.out.println(i.toString());
} 
catch(NullPointerException e)
{
System.err.println("NullPointerException");
e.printStackTrace();
} 
try 
{
i = 10;
System.out.println(i.toString());
} 
catch(NullPointerException e)
 {
System.err.println(" NullPointerException");
e.printStackTrace();
}
finally 
{
System.out.println("Got");
}
}	
}