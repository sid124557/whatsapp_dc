package X;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0nD  reason: invalid class name and case insensitive filesystem */
public final class C13460nD implements Comparator {
    public static final Pattern A00 = Pattern.compile(".*(\\d\\d\\d\\d\\d\\d\\d\\d).*");
    public static final Pattern A01 = Pattern.compile("WA(\\d\\d\\d\\d)");

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Pattern pattern = A00;
        Matcher matcher = pattern.matcher(str);
        Matcher matcher2 = pattern.matcher(str2);
        int A002 = A00(matcher);
        int A003 = A00(matcher2);
        if (A002 == A003) {
            Pattern pattern2 = A01;
            Matcher matcher3 = pattern2.matcher(str);
            Matcher matcher4 = pattern2.matcher(str2);
            A002 = A00(matcher3);
            A003 = A00(matcher4);
        }
        return -(A002 - A003);
    }

    public static final int A00(Matcher matcher) {
        if (matcher.find()) {
            return C615531h.A01(matcher.group(1), 0);
        }
        return 0;
    }
}
