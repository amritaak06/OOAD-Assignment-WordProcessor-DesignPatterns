package wordprocessor;
import java.util.List;

public class Word {
    private final String text;
    private final int position;
    private final WordType type;
    private final List<WordStyle> styles;

    public Word(String text, int position, WordType type, List<WordStyle> styles) {
        this.text = text;
        this.position = position;
        this.type = type;
        this.styles = styles;
    }

    public String getText() {
        return text;
    }

    public int getPosition() {
        return position;
    }

    public WordType getType() {
        return type;
    }

    public List<WordStyle> getStyles() {
        return styles;
    }
}
