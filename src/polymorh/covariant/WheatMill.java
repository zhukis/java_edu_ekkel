package polymorh.covariant;

public class WheatMill extends Mill {
    Wheat process() {
        return new Wheat();
    }
}
