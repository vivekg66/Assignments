public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "My name is Vinod. People call me vinod.";
        StringUtil stringUtil = new StringUtil();
        String[] arrayOfWords = stringUtil.splitIntoWords(input);
        for (int i = 0; i < arrayOfWords.length; i++) {
            System.out.println("word " + i + " is " + arrayOfWords[i]);
            int wordCount = stringUtil.getWordCount(arrayOfWords, arrayOfWords[i]);
            if (wordCount > 1) {
                arrayOfWords[i] = arrayOfWords[i].replaceFirst(arrayOfWords[i], "");

            }
        }
        for (int i = 0; i < arrayOfWords.length; i++) {
            System.out.print(" " + arrayOfWords[i]);

        }

    }
}