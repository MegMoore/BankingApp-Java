package BankingApp.Models;


public class Savings {

	public static String name = "HeirloomsandMoore";
		
	protected static String _description = "Savings";
	public String getDescription() {return _description;}
	public void setDescription(String description) {this._description = description;}
	
	protected static double _balance = 300;
	public static double getBalance() {return _balance;}
	public void setBalance(double balance) {this._balance = balance;}


	public Savings(double amount) {
		_balance = amount;
	}
	public void Savings1(String str) {
		_description = str;
	
	}
	
	public static void deposit(double amount) {
        _balance += amount;
	}
	
	public static void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            return;
        }
        
    /* getters and setters*/    
    }
	public static String getName() {
		return name;
	}
	protected static void setName(String name) {
		Savings.name = name;
	}
	public static String get_description() {
		return _description;
	}
	public static void set_description(String _description) {
		Savings._description = _description;
	}
	public static double get_balance() {
		return _balance;
	}
	protected static void set_balance(double _balance) {
		Savings._balance = _balance;
	}
	
	

}
