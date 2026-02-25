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
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public String getFirst()
	{
		System.out.println("word :: " + word);
		String first = word.substring(0,1);
		return first;
	}
	
	public char getLast()
	{
		char last = (word.charAt(word.length() - 1));
		return last;
	}

 	public String toString()
 	{
 		String output = ("word :: " + word);
 		return output;
	}
}