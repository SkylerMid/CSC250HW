
public class BibleBook 
{
	private String bookName;
	private int chap;
	private String sum;
	
	public BibleBook(String bookName, int chap, String sum)
	{
		this.bookName = bookName;
		this.chap = chap;
		this.sum = sum;
	}
	public void display()
	{
		System.out.println("Book Name: " + this.bookName + " (" + this.chap + " Chapters) " + this.sum);
	}
}
