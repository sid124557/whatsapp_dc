package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5NG  reason: invalid class name */
public class AnonymousClass5NG {
    public final HashMap A00;
    public final Pattern A01;

    public CharSequence A00(CharSequence charSequence) {
        Matcher matcher = this.A01.matcher(charSequence);
        if (!matcher.find()) {
            return charSequence;
        }
        StringBuffer stringBuffer = new StringBuffer(charSequence.length());
        do {
            matcher.appendReplacement(stringBuffer, C18320x8.A0e(matcher.group(), this.A00));
        } while (matcher.find());
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public AnonymousClass5NG(String[] strArr) {
        int length = strArr.length;
        this.A00 = new HashMap(length / 2);
        for (int i = 0; i < length; i += 2) {
            this.A00.put(strArr[i], strArr[i + 1]);
        }
        this.A01 = Pattern.compile(TextUtils.join("|", this.A00.keySet()));
    }
}
