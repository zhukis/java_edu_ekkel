package interfaces.separationimpl.adapter;

import interfaces.separationimpl.Apply;
import interfaces.separationimpl.filter.BandPass;
import interfaces.separationimpl.filter.HighPass;
import interfaces.separationimpl.filter.LowPass;
import interfaces.separationimpl.filter.Waveform;

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(
                new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}
