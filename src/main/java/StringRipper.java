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

	}

	public StringRipper(String s)
	{
		setString(s);
	}
	
   public void setString(String s)
   {
	word = s;
   }	

	public String ripString(int x, int y)
	{
		String list = (word.substring(x,y));
		return list;
	}

 	public String toString()
 	{
		System.out.print(word);
 		return "\n\n";
	}
}