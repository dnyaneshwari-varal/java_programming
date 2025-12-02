package Containtment;

public class Student {
    MyDate birthDate;

    Student() {
        birthDate = new MyDate();
    }

    Student(int d, int m, int y) {
        birthDate = new MyDate(d, m, y);
    }

    void display() {
        System.out.println("Student Birth Date: " + birthDate);
    }
}

