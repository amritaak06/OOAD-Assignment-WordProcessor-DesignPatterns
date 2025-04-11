package wordprocessor.formatters;
import wordprocessor.Word;

public class UnderlineFormatter extends TextFormatter {
    @Override
    public String format(Word word, String formatted) {
        if (word.getStyles().stream().anyMatch(s -> s.getStyle().equalsIgnoreCase("underline"))) {
            formatted = "<u>" + formatted + "</u>";
        }
        return super.format(word, formatted);
    }
}
