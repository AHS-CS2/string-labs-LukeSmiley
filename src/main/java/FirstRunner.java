//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Luke Smiley
//Date - 2/24/26
//Class - Comp Sci 1
//Lab  - First Runner

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() + "\n\n" );
		
		//add more test cases
		//Instead of making a new FirstAndLast use line 21 below
		demo.setString("World");	
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast() + "\n\n");

		//Another test case for JukeBox
		demo.setString("JukeBox");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast() + "\n\n");

		//Test for TCEA
		demo.setString("TCEA");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast() + "\n\n");

		//UIL test case
		demo.setString("UIL");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast());
	}
}