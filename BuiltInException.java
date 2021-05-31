public class BuiltInException {

	public static void main(String[] args) {
	
			ArithmaticException();
			NullPointer();
			ArrayIndex();
			NumberFormat();

	}
	
	static void NumberFormat()
	{
		try
		{
			int num = Integer.parseInt("nilesh");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	static void ArrayIndex()
	{
		try
		{
			int a[] = new int[10];
			a[11] = 15;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	static void NullPointer()
	{
		try
		{
			String n = null;
			System.out.println(n.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	static void ArithmaticException()
	{
		try 
		{
            int x = 12, y = 0;
            int z = x / y; 
            System.out.println("Result = " + z);
        }
        catch (ArithmeticException e) {
        	System.err.println(e.getMessage());
        }
	}

}
