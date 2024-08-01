import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class SilentErrorListener extends BaseErrorListener {
    private boolean error = false;
    public static final SilentErrorListener INSTANCE = new SilentErrorListener();

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