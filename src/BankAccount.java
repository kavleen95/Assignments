//WAP to create a BankAccount with below attributes
//accountNumber, accountHolderName, balance, accountType.

public class BankAccount {

    //Initialise the attributes
    double AccNumber;
    String AccName;
    double balance;
    String AccType;

    //Create a constructor to initialize these properties
    public BankAccount(double accNumber, String accName, double balance, String accType) {
        AccNumber = accNumber;
        AccName = accName;
        this.balance = balance;
        AccType = accType;
    }

//Create methods for Deposit and Withdraw money
    public  void Deposit(double amount){
        System.out.println("Let's find the balance of the deposited amount");
        balance = amount + balance;
        System.out.println(balance);
    }

    public void WithDraw(double amount) {
        System.out.println("Let's withdraw some money");
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(balance);
        } else {
            System.out.println("Sorry , you have insufficient funds");
        }
    }

    public void AcctDetails( String accName , String accType){
        System.out.println("The Account details are : ");
       String Name = accName ;
       String Type = accType ;
        System.out.println(Name);
        System.out.println(Type);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2 , "Ish" , 15000 , "Savings");
        bankAccount.Deposit(1000.00);
        bankAccount.WithDraw(2000.00);
        bankAccount.AcctDetails("Kav" , "Saving");
    }
}
