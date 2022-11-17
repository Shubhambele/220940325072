import java.util.*;
class Arrli
{
	public static void main(String args[])
	{
		ArrayList<String> elements= new ArrayList<String>();
		elements.add("ONE");
		elements.add("TWO");
		elements.add("THREE");
		elements.add("FOUR");
		elements.add("FIVE");
		elements.add("SIX");
		elements.add("SEVEN");
		System.out.println(elements);
		for(String s:elements)
		{
			System.out.println(s);
		}
	}
}