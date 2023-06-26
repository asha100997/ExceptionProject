package Exception;

public class NumberException {
	public static void main(String[] args) {
		String a="uma";
		try {
		System.out.println(Integer.parseInt(a));
	}
		catch (NumberFormatException ne) {
			System.out.println(ne+"It is number exception");
			ne.printStackTrace();
		}
		finally {
			System.out.println("Executed Even when Exception occure or not");
		}
		System.out.println("Rest of the code");
			
		}

}
