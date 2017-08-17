package threads.resourceaccess.atomic;

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    // Add synchronized
    public static int nextSerialNumber() {
        return serialNumber++;
    }
}
