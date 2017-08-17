package interfaces.separationimpl.adapter;

import interfaces.separationimpl.Processor;
import interfaces.separationimpl.filter.Filter;
import interfaces.separationimpl.filter.Waveform;

public class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
