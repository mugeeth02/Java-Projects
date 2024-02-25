package bankaccountapp;

public interface IBaseRate {
//    Write a method to return the Base Rate
    default double getBaseRate(){
        return 2.5;
    }
}
