//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Luke Smiley
//Date - 3/3/26
//Class - Comp Sci 1
//Lab  - Name

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
	}

	public Name(String s)
	{
		setName(s);
	}

   public void setName(String s)
   {
		name = s;
		System.out.print(name + "\n");
   }

	public String getFirst()
	{
		String first = (name.substring(0,5));
		return first;
	}

	public String getLast()
	{
		if(name.equals(10)){
			String last = name;
			return last;
		}
		return "";
	}

 	public String toString()
 	{
 		return "";
	}
}