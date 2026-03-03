//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Luke Smiley
//Date - 3/3/26
//Class - Comp Sci 1
//Lab  - Name Runner

import static java.lang.System.*;

public class NameRunner
{
	public static void main ( String[] args )
	{
		Name person = new Name("Sally Baker");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("John Doe");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Sammy Lammy");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Benny Programmer");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Sandy Painter");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
	}
}