public class StringUtil {
    public String[] splitIntoWords(String inputString) {
        String[] words = inputString.split(" ");
        return words;
    }

    public int getWordCount(String[] arrayOfWords, String word) {
        int count = 0;
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}