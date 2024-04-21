package javabase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class HelloFile {
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("Hello.txt")).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
