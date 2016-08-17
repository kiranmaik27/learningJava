package Chapter05.Sec01;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by aditya on 8/17/2016.
 */
public class TryWithResourcesDemo {
    public static void main (String[] args) throws IOException{
        List<String> lines = Arrays.asList("Mary had a little lamb.".split(" "));
        try (PrintWriter out = new PrintWriter("output.txt")) {
            for (String line : lines) {
                out.println(line.toLowerCase());
            }
        }
        try (Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
             PrintWriter out = new PrintWriter("output.txt")) {
            while (in.hasNext())
                out.println(in.next().toLowerCase());
        }
    }
}
