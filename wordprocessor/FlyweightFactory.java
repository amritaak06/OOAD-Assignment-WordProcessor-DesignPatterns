package wordprocessor;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String, WordType> wordTypeMap = new HashMap<>();
    private static final Map<String, WordStyle> wordStyleMap = new HashMap<>();

    public static WordType getWordType(String type) {
        return wordTypeMap.computeIfAbsent(type, WordType::new);
    }

    public static WordStyle getWordStyle(String style) {
        return wordStyleMap.computeIfAbsent(style, WordStyle::new);
    }
}
