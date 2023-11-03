package bootcamp.neuefische;


import com.github.lalyos.jfiglet.FigletFont;

public class Main {
    public static void main(String[] args) {
        String asciiArt = FigletFont.convertOneLine("Hello World");
        System.out.println(asciiArt);
    }
}



