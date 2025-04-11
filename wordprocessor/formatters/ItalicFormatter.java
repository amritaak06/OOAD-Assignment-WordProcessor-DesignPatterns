package wordprocessor.formatters;
import wordprocessor.Word;

public class ItalicFormatter extends TextFormatter {
    @Override
    public String format(Word word, String formatted) {
        if (word.getStyles().stream().anyMatch(s -> s.getStyle().equalsIgnoreCase("italic"))) {
            formatted = "<i>" + formatted + "</i>";
        }
        return super.format(word, formatted);
    }
}
