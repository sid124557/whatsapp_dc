package X;

import java.util.HashSet;

/* renamed from: X.83z  reason: invalid class name and case insensitive filesystem */
public class C1680683z implements C180468l7 {
    public boolean B2k(HashSet hashSet, String[] strArr) {
        for (String contains : strArr) {
            if (!hashSet.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}
