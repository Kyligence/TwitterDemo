import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xiefan on 16-10-14.
 */
public class RegExpTest {

    @Test
    public void test(){
        String str1 = "<a href=\\\"http://twitter.com\\\" rel=\\\"nofollow\\\">Twitter Web Client</a>";
        String str2 = "\\u003ca href\\u003d\\\"https://about.twitter.com/products/tweetdeck\\\" rel\\u003d\\\"nofollow\\\"\\u003eTweetDeck\\u003c/a\\u003e";

        Pattern p = Pattern.compile("<a[^>]*>([^<]*)</a>");
        Matcher m = p.matcher(str1);
        while(m.find()) {
            System.out.println(m.group(1));
        }
        m = p.matcher(str2);
        while(m.find()){
            System.out.println(m.group(1));
        }
    }

    @Test
    public void test2(){

    }
}
