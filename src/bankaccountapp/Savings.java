package bankaccountapp;

public class Savings extends Account{
//    List properties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

//    Construtor to initialize settings for the savings properties
    public Savings(String name,String ssn, double initDeposit){
        super(name,ssn,initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
//        System.out.println("ACCOUNT NUMBER " + this.accountNumber);
//        System.out.println("NEW SAVINGS ACCOUNT");
    }

    @Override
    public void setRate(){
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey =(int)(Math.random() * Math.pow(10,4));
    }

//    List any methods specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                        "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
