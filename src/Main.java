import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws Exception {
        SilentErrorListener errorListener = new SilentErrorListener();
        BufferedReader reader = new BufferedReader(new FileReader("src/test.txt"));
        String line = reader.readLine();
        while(line != null) {
            System.out.print("Processing: " + line);
            CharStream input = CharStreams.fromString(line);

            AutogradeLexer lexer = new AutogradeLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            AutogradeParser parser = new AutogradeParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            parser.start();
            if (errorListener.error()) {
                System.out.println(", invalid");
            } else {
                System.out.println(", valid");
            }
            errorListener.reset();

            line = reader.readLine();
        }
    }
}

//public class  Main {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new FileReader("src/test.txt"));
//        String line = reader.readLine();
//        while(line != null) {
//            System.out.println("Processing: " + line);
//            CharStream input = CharStreams.fromString(line);
//
//            AutogradeLexer lexer = new AutogradeLexer(input);
//
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//            AutogradeParser parser = new AutogradeParser(tokens);
//
//            parser.start();
//
//            line = reader.readLine();
//        }
//    }
//}


