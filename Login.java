package Exception;

public class Login {
	public static void main(String[] args) throws LoginValidation {
		String username="admin";
		String password="abcd";
		try {
		if(username.equals("admin")&&password.equals("abcd")){
			System.out.println("Login");
			
		}
		else {
			throw new LoginValidation("Login failed");
		}
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Executed Even when Exception occure or not");
		}
		System.out.println("Further execution");
	}
	

}
