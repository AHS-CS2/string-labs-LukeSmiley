//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Luke Smiley
//Date - 2/24/26
//Class - Comp Sci 1
//Lab  - First And Last

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;

	public FirstAndLast(String s)
	{
		word = "compsci";
	}

	public void setString(String s)
	{
		word = s;
	}

	public String getFirst()
	{
		String first = out.print(word.substring(0));
		return first;
	}
	
	public String getLast()
	{
		String last = out.print(word.charAt(2));
		return last;
	}

 	public String toString()
 	{
 		String output = ("word :: " + word);
 		return output;
	}
}