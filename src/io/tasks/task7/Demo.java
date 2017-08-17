package io.tasks.task7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("1.txt"));
        String s;
        StringBuilder sb = new StringBuilder();

        while ((s = in.readLine()) != null) {
            sb.append(s);
            sb.append("\n");
        }

        in.close();

        System.out.println(sb);

    }
}
