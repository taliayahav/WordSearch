package ReadDictionaryText;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class dictionaryFileTest {

    @Test
    public void getWord() throws FileNotFoundException {
        dictionaryFile readWord = new dictionaryFile("/Users/taliayahav/Downloads/dictionary.txt");
        boolean x = readWord.getWord("AA");
        Assert.assertTrue(x);
        boolean y = readWord.getWord("Talia");
        Assert.assertFalse(false);
    }

}
