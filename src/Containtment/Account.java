package Containtment;

public class Account {
    MyDate creationDate;

    Account() {
        creationDate = new MyDate(); // default date
    }

    Account(int d, int m, int y) {
        creationDate = new MyDate(d, m, y); // parameterized date
    }
//    public String toString() {
//    	return "In Account date: "+d =;
//    }
    void display() {
        System.out.println("Account Creation Date: " + creationDate);
    }
}

