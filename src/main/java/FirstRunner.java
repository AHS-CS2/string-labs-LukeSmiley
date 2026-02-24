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
		System.out.println( "last letter :: " + demo.getLast() );
		
		//add more test cases
		demo = new FirstAndLast("World");	
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast());

		//Another test case for JukeBox
		demo = new FirstAndLast("JukeBox");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast());

		//Test for TCEA
		demo = new FirstAndLast("TCEA");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast());

		//UIL test case
		demo = new FirstAndLast("UIL");
		System.out.println("first letter :: " + demo.getFirst());
		System.out.println("last letter :: " + demo.getLast());
	}
}