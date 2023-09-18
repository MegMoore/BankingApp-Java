package BankingApp.Models;


public class Checking {

	public static String name = "HeirloomsandMoore";
		
	
	protected static String _description = "Checking";
	public String getDescription() {return _description;}
	public void setDescription(String description) {this._description = description;}
	
	protected static double _balance = 100;
	public static double getBalance() {return _balance;}
	public void setBalance(double balance) {Checking._balance = balance;}

	public Checking(double amount) {
		_balance = amount;
	}
	public void Checking1(String str) {
		_description = str;
	}
	
	public static void deposit(double amount) {
        _balance += amount;
	}
	public static double withdraw(double amount) {
        if (_balance >= amount) {
            _balance -= amount;
        } else {
            System.out.println("Insufficient balance");
            return _balance;
        }
		return amount;
        
        
    /*getters and setter*/
	}
	public static String getName() {
		return name;
	}
	protected static void setName(String name) {
		Checking.name = name;
	}
	public static String get_description() {
		return _description;
	}
	public static void set_description(String _description) {
		Checking._description = _description;
	}
	public static double get_balance() {
		return _balance;
	}
	protected static void set_balance(double _balance) {
		Checking._balance = _balance;
	}
	
	
}
