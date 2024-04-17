import java.util.*;

public class TextProcessor {


    public void printWordsAlphabetically(String text) {
        String[] textSplit = text.split("[ .,]+");

        ArrayList<String> textList = new ArrayList<String>(
                Arrays.asList(textSplit));

        textList.sort(String::compareToIgnoreCase);
        System.out.println("Total number of words: " + textList.size());

        for (String s : textList)
            System.out.print(s + " ");

    }

    public void printDistinctWords(String text) {
        String[] textSplit = text.split("[ .,]+");

        ArrayList<String> textList = new ArrayList<String>(
                Arrays.asList(textSplit));


        Set<String> distinctTextlist = new HashSet<String>(textList);

        System.out.println("Total number of words: " + distinctTextlist.size());

        for (String s : distinctTextlist)
            System.out.print(s + " ");

    }

    public void printDistinctWordsAlphabetically(String text) {
        String[] textSplit = text.split("[ .,]+");

        ArrayList<String> textList = new ArrayList<String>(
                Arrays.asList(textSplit));


        Set<String> distinctTextlist = new HashSet<String>(textList);

        ArrayList<String> distinctSetToList = new ArrayList(distinctTextlist);

        distinctSetToList.sort(String::compareToIgnoreCase);

        System.out.println("Total number of words: " + distinctSetToList.size());

        for (String s : distinctSetToList)
            System.out.print(s + " ");

    }

    public void printTextWithReplacedWord(String text, String replacedWord, String replaceWith) {
        String[] textSplit = text.split(" ");

        ArrayList<String> textList = new ArrayList<String>(
                Arrays.asList(textSplit));

        Collections.replaceAll(textList, replacedWord, replaceWith);

        for (String s : textList)
            System.out.print(s + " ");
    }

    public void printWordOccurrences(String text) {

        String[] textSplit = text.split("[ .,]+");

        ArrayList<String> textList = new ArrayList<String>(
                Arrays.asList(textSplit));


        for (String key : textList) {
            System.out.println(key + ": " + Collections.frequency(textList, key));
        }
    }

    public void printWordsWithFirstCapitalLetter(String text) {

        String[] textSplit = text.split(" ");

        ArrayList<String> textList = new ArrayList<String>(
                Arrays.asList(textSplit));


        StringBuilder result = new StringBuilder();

        for (String s : textList) {
            result.append(Character.toTitleCase(s.charAt(0)))
                    .append(s.substring(1))
                    .append(" ");
        }


        System.out.print(result);

    }

}
