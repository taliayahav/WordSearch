package ReadDictionaryText;
import java.io.*;
import java.util.Scanner;
import java.io.File;

public class dictionaryFile {
    private static Scanner inputFile;
    private String line;

    public dictionaryFile(String file) throws FileNotFoundException {
        File dictionaryFile = new File(file);
        inputFile = new Scanner(dictionaryFile);
    }

  public boolean readNextLine() {
        boolean lineRead;
        lineRead = inputFile.hasNext();
        if (lineRead)
            line = inputFile.nextLine();
        return lineRead;
    }
    public boolean getWord() {
        boolean retWord = false;
        System.out.println("What word would you like to search? ");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.next();
        String firstWord = line.split(" ")[0];
            if (word.equalsIgnoreCase(firstWord)) {
                retWord = true;
            }
            return retWord;
        }

    public void close() throws IOException {
        inputFile.close();
    }
}