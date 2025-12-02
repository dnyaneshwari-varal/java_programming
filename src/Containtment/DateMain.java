package Containtment;

public class DateMain {
    public static void main(String[] args) {

        Account a1 = new Account();                 // default
        Account a2 = new Account(12, 6, 2022);       // parameterized
        
        
//        System.out.println(a1);
        Student s1 = new Student();                 // default
        Student s2 = new Student(5, 3, 2001);       // parameterized

        a1.display();
        a2.display();

        s1.display();
        s2.display();
    }
}
