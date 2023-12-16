package X;

import java.util.List;

/* renamed from: X.73M  reason: invalid class name */
public class AnonymousClass73M {
    public static String A00(List list, int i) {
        Object obj = list.get(i);
        if (obj instanceof Number) {
            return obj.toString();
        }
        return (String) obj;
    }
}
