package X;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;

/* renamed from: X.7RS  reason: invalid class name */
public class AnonymousClass7RS {
    public AnonymousClass7GX A00;

    public Pattern A00(String str) {
        LinkedHashMap linkedHashMap;
        Object obj;
        AnonymousClass7GX r2 = this.A00;
        synchronized (r2) {
            linkedHashMap = r2.A01;
            obj = linkedHashMap.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            synchronized (r2) {
                linkedHashMap.put(str, pattern);
            }
        }
        return pattern;
    }

    public AnonymousClass7RS(int i) {
        this.A00 = new AnonymousClass7GX(i);
    }
}
