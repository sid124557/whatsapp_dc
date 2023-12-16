package X;

import java.util.HashSet;

/* renamed from: X.840  reason: invalid class name */
public class AnonymousClass840 implements C180468l7 {
    public boolean B2k(HashSet hashSet, String[] strArr) {
        for (String contains : strArr) {
            if (hashSet.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
