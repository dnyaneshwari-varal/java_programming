//MyDate class is already created
//(It will store day, month, year)
//
//Create Account class
//
//It should have a MyDate object inside it
//
//This MyDate object will represent account creation date
//
//You need default constructor and parameterized constructor
//
//Create Student class
//
//It should also have a MyDate object inside it
//
//This MyDate object will represent student birthdate
//
//Again use default + parameterized constructors
//
//Write DateMain class
//
//With main() method
//
//Create objects of all classes
//
//Show HAS-A relationship
//(means one class has object of another class)



package Containtment;

public class MyDate {

	
		int day, month, year;

	    MyDate() {
	        day = 1;
	        month = 1;
	        year = 2000;
	    }

	    MyDate(int d, int m, int y) {
	        day = d;
	        month = m;
	        year = y;
	    }

	    public String toString() {
	        return day + "/" + month + "/" + year;
	    }

	

}
