//(c)  A+ Computer Science
//www.apluscompsci.com

//Name - Luke Smiley
//Date - 2/19/26
//Class - Comp Sci 1
//Lab  - AddStrings

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
    String sum = "blank";
   }

   public AddStrings(String one, String two)
   {
    setStrings(one,two);
    add();
   }

   public void setStrings(String one, String two)
   {
    first = one;
    last = two;
   }

 	public void add( )
 	{
    sum = first + last;
	}

 	public String toString()
 	{
 		String output = ("first :: " + first + "\nlast :: " + last + "\nsum :: " + sum + "\n\n");
 		return output;
	}
}