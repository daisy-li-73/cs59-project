import org.antlr.v4.runtime.*;

/*
 * CS59 P02: Functional Parser
 * Author: Warren Shepard and Daisy li
 * Date: 30 July 2024
 * Credit: Warren and Daisy code from assignment 01 and 02 and class slides
 */

public class LexerErrorListener extends BaseErrorListener {
    private boolean error = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e) {
        error = true;
    }

    public boolean error() {
        return error;
    }

    public void reset() {
        error = false;
    }
}