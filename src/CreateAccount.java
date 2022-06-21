import com.globalpayex.bank.entities.Account;
import com.globalpayex.bank.exceptions.MinBalNotMaintainedException;

public class CreateAccount {
	
	public static void main(String[] args) {
		Account a = new Account("Savings", "123ABC", 1000);
		
		//System.out.println(a.deposit(1000));
		
		a.getDetails().ifPresent(o -> System.out.println(o.toUpperCase()));
		/*
		try {
			System.out.println(a.withdraw(0));
		}
		catch(IllegalStateException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		*/
		
		/*
		Try avoiding this as this affects readability of the code.
		catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		*/
		
		/*
		try {
			System.out.println(a.withdraw(9000));
		} catch (MinBalNotMaintainedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Account emptyAccount  = new Account(null, null, 0);
		//System.out.println(emptyAccount.getDetails().toUpperCase());
		//null checks
		/*  
		 String d = emptyAccount.getDetails();
		 if(d != null){
		 	System.out.println(d.toUpperCase());
		 }
		 */
		
		/*
		emptyAccount
			.getDetails()
			.ifPresent(details -> System.out.println(details.toUpperCase()));
		*/
		
		emptyAccount
		.getDetails()
		.ifPresentOrElse(
				details -> System.out.println(details.toUpperCase()),
				() -> System.out.println("Account not initialized")
				
		);
		System.out.println(a.getDetails());
		
		emptyAccount.setAccType("Savings");
		emptyAccount.accNumber = "123456ABC";
		emptyAccount.setBalance(1000);
		
		System.out.println(emptyAccount.getDetails());
		
		
		
		
		
	}

}
