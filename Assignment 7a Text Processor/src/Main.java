public class Main {

    static String text = "Dude Java is like the rockstar of programming languages and " +
            "here is why I'm totally into it. First off it is the ultimate multi tasker write " +
            "code once run it anywhere. No platform drama just smooth compatibility. " +
            "Java is the best";

    public static void main(String[] args) {

        TextProcessor textProcessor = new TextProcessor();

        textProcessor.printWordsAlphabetically(text);
        System.out.println("\n");
        textProcessor.printDistinctWords(text);
        System.out.println("\n");
        textProcessor.printDistinctWordsAlphabetically(text);
        System.out.println("\n");
        textProcessor.printTextWithReplacedWord(text, "Java", "Lava");
        System.out.println("\n");
        textProcessor.printWordOccurrences(text);
        System.out.println("\n");
        textProcessor.printWordsWithFirstCapitalLetter(text);

    }
}
