//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Luke Smiley
//Date - 3/2/26
//Class - Comp Sci 1
//Lab  - String Ripper

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	
	public StringRipper()
	{
		setString();
	}

	public StringRipper(String s)
	{
	}
	
   public void setString(String s)
   {
	word=s;
   }	

	public String ripString(int x, int y)
	{
		word.subString(x, y);
		return "";
	}

 	public String toString()
 	{
		return word;
 		return "\n\n";
	}
}