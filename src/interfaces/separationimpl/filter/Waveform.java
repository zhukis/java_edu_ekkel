package interfaces.separationimpl.filter;

public class Waveform {
    private static long counter;
    protected final long id = counter++;
    public String toString() {
        return "Waveform " + id;
    }
}
