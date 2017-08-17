package exceptions.constr2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
            // Exception below
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("error during in.close()");
            }
            throw e;
        } finally {
            // Here file not close
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("error during execution readLine()");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successes");
        } catch (IOException e2) {
            throw new RuntimeException("error during execution in.close()");
        }
    }
}
