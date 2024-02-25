package bankaccountapp;

import java.util.List;

public class BankAccountApp {
    public static void main(String[] args){

        String file = "C:\\Users\\DELL\\OneDrive\\Desktop\\Scaler\\NewBankAccounts.csv";
        /*Checking chkacc1 = new Checking("Tim Cook","526345786",1500);

        Savings savacc1 = new Savings("MS dhoni","356428557",2500);



        savacc1.showInfo();
        System.out.println("*************");
        chkacc1.showInfo();*/

//        savacc1.deposit(5000);
//        savacc1.withdraw(200);
//        savacc1.transfer("Brokerage",3000);

//        Read a CSV file then Create new accoounts based on the data
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders){
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
    }
}
