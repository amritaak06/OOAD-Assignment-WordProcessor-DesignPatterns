package wordprocessor.formatters;
import wordprocessor.Word;

public class BoldFormatter extends TextFormatter {
    @Override
    public String format(Word word, String formatted) {
        if (word.getStyles().stream().anyMatch(s -> s.getStyle().equalsIgnoreCase("bold"))) {
            formatted = "<b>" + formatted + "</b>";
        }
        return super.format(word, formatted);
    }
}
