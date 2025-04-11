package wordprocessor.formatters;
import wordprocessor.Word;

public abstract class TextFormatter {
    protected TextFormatter next;

    public void setNext(TextFormatter next) {
        this.next = next;
    }

    public String format(Word word, String formatted) {
        if (next != null) {
            return next.format(word, formatted);
        }
        return formatted;
    }
}
