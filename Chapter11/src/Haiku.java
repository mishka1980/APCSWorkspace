/**
 * 
 */

/**
 * @author jack
 *
 */
public class Haiku extends Poem{

	/**
	 * @param args
	 */
	private int lines=3;
	
	
	public int getSyllables(int k)
	{
		if(k==0||k==2)
			return 5;
		else
			return 7;
	}
	
	public int numLines()
	{
		return lines;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
