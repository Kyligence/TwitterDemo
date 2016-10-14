package io.kyligence.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xiefan on 16-10-14.
 */
public class RegExpUtil {
    private static final Pattern p = Pattern.compile("<a[^>]*>([^<]*)</a>");

    public static String getPlatformInfo(String rawSource){
        Matcher m = p.matcher(rawSource);
        if(m.find()){
            return m.group(1);
        }else{
            return rawSource;
        }
    }
}
