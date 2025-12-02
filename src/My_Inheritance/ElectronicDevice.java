package My_Inheritance;

public class ElectronicDevice {
	void powerOn() {
        System.out.println("Device is powering on...");
    }
	
}

class Computer extends ElectronicDevice{
	void showComp() {
		System.out.println("Device is powering on computer");

	}
}

class Tv extends ElectronicDevice{
	void showTv() {
		System.out.println("Device is powering on TV");

	}
}

class MobilePhone extends ElectronicDevice{
	void showMob() {
		System.out.println("Device is powering on MobilePhone");

	}
}


class Lcd_tv extends Tv{
	void LCD() {
		System.out.println("Device is powering on LCD TV");

	}
}

class Led_tv extends Tv{
	void LED() {
		System.out.println("Device is powering on LED TV");

	}
}
