package BankingApp.Models;
import BankingApp.Models.Checking;
import BankingApp.Models.Savings;

public class Program {

	public static void main(String[] args) {
		
		System.out.println(Checking.name);
		System.out.println(Checking._balance);
		System.out.println(Checking._description);
		
		System.out.println(Savings.name);
		System.out.println(Savings._balance);
		System.out.println(Savings._description);
		
		// Deposit %1000 into Checking
		System.out.println("Deposit $1000 into account Checking");
        Checking.deposit(1000);
        System.out.println("New balance after depositing $1000: $" + Checking.getBalance());
        
        
        // Withdraw $600 from account Checking
		System.out.println("Withdraw $600 from account Checking");
        Checking.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + Checking.getBalance());
        
        // Withdraw $250 from Savings (balance falls below $100)
		System.out.println("Try to withdraw $250 from Savings!");
        Savings.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + Savings.getBalance());
        
        System.out.println("Transfer $100 from Checking to Savings");
        Checking.withdraw(100);
        Savings.deposit(100);
        System.out.println("Balance after $100 transfer: $" + Savings.getBalance());
	}

	
}
