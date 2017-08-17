package interfaces.factory;

public class ImplementationFactory implements ServiceFactory {
    public Service getService() {
        return new Implementations1();
    }
}
