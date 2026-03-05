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
   }

	public String getFirst()
	{
		String first = (name.substring(0,5));
		return first;
	}

	public String getLast()
	{
		String last = name;
		if(name.length() == 8){
			last = name.substring(5,8);
		}else if(name.length() == 11){
				last = name.substring(6,11);
			}else if(name.length() == 13){
				last = name.substring(6,13);
			}else if(name.length() == 16){
				last = name.substring(6,16);
			}
		return last;
	}

 	public String toString()
 	{
		System.out.println(name);
 		return "";
	}
}