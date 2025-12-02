package My_Inheritance;


public class Device_Main {
    public static void main(String[] args) {

        Computer c = new Computer();
        c.powerOn();
        c.showComp();

        Tv t = new Tv();
        t.powerOn();
        t.showTv();

        MobilePhone m = new MobilePhone();
        m.powerOn();
        m.showMob();

        Lcd_tv lcd = new Lcd_tv();
        lcd.powerOn();
        lcd.LCD();

        Led_tv led = new Led_tv();
        led.powerOn();
        led.LED();
    }
}


