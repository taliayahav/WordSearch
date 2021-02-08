package ReadDictionaryText;
import java.io.IOException;

public class readFile {

    public static void main(String[] args) throws IOException {
        dictionaryFile readWord = new dictionaryFile("/Users/taliayahav/Downloads/dictionary.txt");
        System.out.println(readWord.getWord());
        readWord.close();
    }
}
