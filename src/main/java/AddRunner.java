//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Luke Smiley
//Date - 2/19/26
//Class - Comp Sci 1
//Lab  - AddRunner

import static java.lang.System.*;

public class AddRunner
{
	public static void main ( String[] args )
	{
		AddStrings demo = new AddStrings("hello ","world");
		demo.add();
		out.println(demo);

		demo.setStrings("jim ","bob");
		demo.add();
		out.println(demo);

		//add more test cases	
		demo.setStrings("sally ", "sue");
		demo.add();
		out.println(demo);

		//more test cases
		demo.setStrings("computer ", "science");
		demo.add();
		out.println(demo);

		//last test case
		demo.setStrings("uil ","contests");
		demo.add();
		out.println(demo);
	}
}