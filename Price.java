package Exception;

public class Price {
	public static void main(String[] args) throws InvalidPrice {
		int price=10;
		try {
		if(price>0) {
			System.out.println("positive");
		}
		else {
			throw new InvalidPrice("negative");
		}
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Executed Even when Exception occure or not");
		}
		System.out.println("Further exception");
		
		
	}
	

}
