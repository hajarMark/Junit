import fr.wildcodeschool.unittesting.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testWithoutVoyel(){
        Assert.assertEquals("", StringUtils.vowels("Hjr"));

    }
    @Test
    public void testMultipleVoyel(){

        Assert.assertEquals("aa", StringUtils.vowels("Hajar"));

    }

    @Test
    public void testOnlyVoyel(){

        Assert.assertEquals("aei", StringUtils.vowels("aheji"));

    }
}
