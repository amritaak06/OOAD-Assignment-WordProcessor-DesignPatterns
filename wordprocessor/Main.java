package wordprocessor;
import java.util.Arrays;
import java.util.List;
import wordprocessor.formatters.*;

public class Main {
    public static void main(String[] args) {
        TextFormatter boldFormatter = new BoldFormatter();
        TextFormatter italicFormatter = new ItalicFormatter();
        TextFormatter underlineFormatter = new UnderlineFormatter();
        boldFormatter.setNext(italicFormatter);
        italicFormatter.setNext(underlineFormatter);

        List<Word> testWords = Arrays.asList(
            new Word("run", 1, FlyweightFactory.getWordType("verb"), Arrays.asList(FlyweightFactory.getWordStyle("bold"))),
            new Word("walk", 2, FlyweightFactory.getWordType("verb"), Arrays.asList(FlyweightFactory.getWordStyle("italic"))),
            new Word("jump", 3, FlyweightFactory.getWordType("verb"), Arrays.asList(FlyweightFactory.getWordStyle("underline"))),
            new Word("climb", 4, FlyweightFactory.getWordType("verb"), Arrays.asList(
                FlyweightFactory.getWordStyle("bold"),
                FlyweightFactory.getWordStyle("italic")
            )),
            new Word("slide", 5, FlyweightFactory.getWordType("verb"), Arrays.asList(
                FlyweightFactory.getWordStyle("bold"),
                FlyweightFactory.getWordStyle("underline")
            )),
            new Word("crawl", 6, FlyweightFactory.getWordType("verb"), Arrays.asList(
                FlyweightFactory.getWordStyle("italic"),
                FlyweightFactory.getWordStyle("underline")
            )),
            new Word("sprint", 7, FlyweightFactory.getWordType("verb"), Arrays.asList(
                FlyweightFactory.getWordStyle("bold"),
                FlyweightFactory.getWordStyle("italic"),
                FlyweightFactory.getWordStyle("underline")
            ))
        );
        for (Word word : testWords) {
            String styled = boldFormatter.format(word, word.getText());
            System.out.println("Formatted output (" + word.getText() + "): " + styled);
        }
    }
}
