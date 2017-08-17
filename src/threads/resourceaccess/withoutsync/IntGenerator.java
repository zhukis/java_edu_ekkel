package threads.resourceaccess.withoutsync;

public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    // For cancelling
    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
