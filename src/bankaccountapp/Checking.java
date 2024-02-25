package bankaccountapp;

public class Checking extends Account {
//    List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPin;

//    Constructor to initialize checking account properties
    public Checking(String name, String ssn, double initDeposit){
        super(name,ssn,initDeposit);
        accountNumber = "2" + accountNumber;
        setdebitCard();
//        System.out.println("ACCOUNT NUMBER " + this.accountNumber);
//        System.out.println("New CHECKING ACCOUNT");
//        System.out.println("Name: " + name);
    }

    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
    }


    public void setdebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10,12));
        debitCardPin = (int)(Math.random() * Math.pow(10,4));
    }

//    List any methods specific to the checking account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your Checking Account Features" +
                        "\nDebit Card Number: " + debitCardNumber +
                        "\nDebit Card Pin: " + debitCardPin
        );
    }
}
