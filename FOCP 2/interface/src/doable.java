
	public interface Doable
{
   public static final String NAME="Ishita";

   public void doThis();
   public int doThat();
   public void doThis2 (float value, char ch);
   public boolean doTheOther (int num);
}
public class Something implements Doable
{
   public void doThis ()
   {
      System.out.println("hello");
   }

   public void doThat ()
   {
      System.out.println("hi");
   }

  public void doThis2()
  {
  	System.out.println("hi hi");
  }
  public void doTheOther()
{
	System.out.println("2");

}
}
