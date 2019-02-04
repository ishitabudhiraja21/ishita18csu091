import java.io.*;
import java.util.*;
public class FileDemo2 
{
   
public static void main(String[] args) 
{
 File f = null;

try 
{
            
f = new File("Ishita.txt");
FileWriter fout = new FileWriter(f);
 BufferedWriter bout= new BufferedWriter(fout);
Scanner sc = new Scanner(System.in);
System.out.print("\nEnter a String:");
 while(sc.hasNext())
 {
bout.write(sc.nextLine());
bout.newLine();
}
System.out.println("length= "+f.length());
 bout.close();
}         
    catch (Exception e) 
    {
        
e.printStackTrace();
 }    } }



