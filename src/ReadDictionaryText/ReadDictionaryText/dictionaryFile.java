package ReadDictionaryText;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class dictionaryFile {
    ArrayList<String> allFirstWords = new ArrayList<>();

    public dictionaryFile(String file) throws FileNotFoundException {
        File newFile = new File(file);
        Scanner inputFile = new Scanner(newFile);
        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            String firstWord = line.split(" ")[0];
            allFirstWords.add(firstWord);
        }
        inputFile.close();
    }

    public boolean getWord(String word) {
        boolean retWord = false;
            for (String newWord : allFirstWords) {
                if (newWord.equalsIgnoreCase(word)) {
                    retWord = true;
                    break;
                }
            }
        return retWord;
    }
}




