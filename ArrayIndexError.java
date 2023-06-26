package Exception;

public class ArrayIndexError {
	public static void main(String[] args) {
		String[]x= {"uma","rani","amu"};
		try {
		System.out.println(x[4]);
	}
		catch (NumberFormatException ne) {
			System.out.println(ne+"It is number exception");
			ne.printStackTrace();
		}
		catch (ArithmeticException ae) {
			System.out.println(ae+"divided by zero");
			ae.printStackTrace();
		}
		catch (NullPointerException ne) {
			System.out.println(ne+"it is null poniter exception");
			ne.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException se ) {
			System.out.println(se+"It is String Index out of exception");
			se.printStackTrace();
		}
		
		catch (IndexOutOfBoundsException i) {
			System.out.println(i+"it is array Index of Exception ");
		}
		
		
		catch (Exception e) {
			System.out.println(e+"some exception");
		}
		finally {
			System.out.println("Executed Even when Exception occure or not");
		}
		System.out.println("Rest of the code");

}
}
