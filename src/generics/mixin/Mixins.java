package generics.mixin;


import java.util.Date;

interface TimeStamped {
    long getStamp();
}

class TimeStampedImp implements TimeStamped {
    private final long timeStamp;

    public TimeStampedImp() {
        timeStamp = new Date().getTime();
    }
    public long getStamp() {
        return timeStamp;
    }
}

interface SerialNumbered {
    long getSerialNumber();
}
class SerialNumberImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;
    public long getSerialNumber() {
        return serialNumber;
    }
}

interface Basic {
    public void set(String val);
    public String get();
}

class BasicImp implements Basic {
    private String value;
    public void set(String val) {
        value = val;
    }
    public String get() {
        return value;
    }
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered {
    private TimeStamped timeStamped = new TimeStampedImp();
    private SerialNumbered serialNumbered = new SerialNumberImp();

    public long getStamp() {
        return timeStamped.getStamp();
    }
    public long getSerialNumber() {
        return serialNumbered.getSerialNumber();
    }
}


public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin();
        Mixin mixin2 = new Mixin();
        mixin1.set("test string 1");
        mixin2.set("test string 2");

        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " +
            mixin1.getSerialNumber());

        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " +
            mixin2.getSerialNumber());
    }
}
