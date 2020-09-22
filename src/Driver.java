
public class Driver 
{
	public static void main(String[] args)
	{
		BibleBook b = new BibleBook("Psalms", 150, "Collection of songs written by David.");
		BibleBook b2 = new BibleBook("Acts", 28, "A post-Gospel book written by Luke.");
		BibleBook b3 = new BibleBook("1 Corinthians", 16, "A teaching to the Corinthians by St. Paul.");
		b.display();
		b2.display();
		b3.display();
	}
}
