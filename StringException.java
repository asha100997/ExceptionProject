package Exception;

public class StringException {
	public static void main(String[] args) {
		String a="uma";
		try {
		char b=a.charAt(3);
		System.out.println(b);
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
		catch (Exception e) {
			System.out.println(e+"some exception");
		}
		finally {
			System.out.println("Executed Even when Exception occure or not");
		}
		System.out.println("Rest of the code");

}
}