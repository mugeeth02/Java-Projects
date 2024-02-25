package bankaccountapp;

public abstract class Account implements IBaseRate {

//      List common properties for savings and checking accounts
    String name;
    String ssn;
    double balance;
    String accountNumber;
    protected static int index = 10000;
    protected double rate;

//    Constructor to set base properties and initialize a account
    public Account(String name, String ssn, double initDeposit){
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;
//        System.out.println("Name: " + name + " SSN: " + ssn + " Balance: $"+ balance);
//        Set Account Number
        index++;
        this.accountNumber = setAccountNumber();
//        System.out.println(getBaseRate());
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = ssn.substring(ssn.length()-2,ssn.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accredInterest = balance * (rate/100);
        balance = balance + accredInterest;
        System.out.println("Accred Interest: $" + accredInterest);
        printBalance();
    }

//    List common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdraw $" + amount);
        printBalance();
    }

    public void transfer(String toWhere,double amount){
        balance = balance - amount;
        System.out.println("Transfering $"+ amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is now: $" + balance);
    }


    public void showInfo(){
        System.out.println(
                    "NAME: " + name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: " + balance +
                        "\nRATE: " + rate + "%"
        );
    }
}
