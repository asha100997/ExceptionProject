package Exception;

public class Numbers {
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try {
		int divide=num1/num2;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae+" it is an Arithmetic Exception");
		ae.printStackTrace();
		}
		finally {
			System.out.println("Executed Even when Exception occure or not");
		}
		System.out.println("Rest of the code");
	}

}
