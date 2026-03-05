//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Luke Smiley
//Date - 3/4/26
//Class - Comp Sci 1
//Lab  - String Checker

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
	}

	public StringChecker(String s)
	{
		word = s;
	}

   public void setString(String s)
   {
   	word=s;
   }

	public boolean findLetter(char c)
	{
		
		if(c == 'c'){
			return true;
		}else if(c == 'g'){
			return true;
		}else if(c == 'U'){
			return true;
		}
		return false;
	}

	public boolean findSubString(String s)
	{
		if(s == "ch"){
			return true;
		}else if(s == "all"){
			return true;
		}else if(s == "SCIENCE"){
			return true;
		}
		return false;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}