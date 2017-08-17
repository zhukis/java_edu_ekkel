package inhcompos.compose;

public class Demo {
    public static void main(String[] args) {
        Bath bath = new Bath();

        Soap soap = bath.getSoap();
        System.out.println(soap == null);
    }
}
