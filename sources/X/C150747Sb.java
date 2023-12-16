package X;

import android.util.Base64;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7Sb  reason: invalid class name and case insensitive filesystem */
public class C150747Sb {
    public String A00;
    public AnonymousClass7XH A01;

    public String A00(JSONObject jSONObject) {
        try {
            String str = this.A00;
            if (str.isEmpty()) {
                return null;
            }
            Matcher matcher = Pattern.compile("\\[([^\\]]*)\\]").matcher(str);
            StringBuffer stringBuffer = new StringBuffer(1000);
            while (matcher.find()) {
                String group = matcher.group();
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(jSONObject.optString(group.substring(1, group.length() - 1))));
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public C150747Sb(AnonymousClass7XH r8) {
        String str;
        this.A01 = r8;
        String str2 = "";
        for (String str3 : new String(Base64.decode("MS03LTItNA==", -1)).split("-")) {
            StringBuilder A0l = AnonymousClass000.A0l(str2);
            Properties properties = this.A01.A05;
            if (properties != null) {
                str = properties.getProperty(str3);
            } else {
                str = null;
            }
            str2 = AnonymousClass000.A0X(str, A0l);
        }
        this.A00 = new String(Base64.decode(str2, -1));
    }
}
