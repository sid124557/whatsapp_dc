package X;

import android.util.Pair;
import java.util.AbstractMap;
import java.util.Comparator;

/* renamed from: X.4IR  reason: invalid class name */
public class AnonymousClass4IR implements Comparator {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4IR(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final int compare(Object obj, Object obj2) {
        if (this.A02 != 0) {
            Pair pair = (Pair) obj;
            Pair pair2 = (Pair) obj2;
            String A012 = AnonymousClass336.A01((String) pair.first, (String) pair.second);
            String A013 = AnonymousClass336.A01((String) pair2.first, (String) pair2.second);
            AbstractMap abstractMap = (AbstractMap) this.A01;
            return AnonymousClass001.A0K(C18290x4.A0i(A013, abstractMap)) - AnonymousClass001.A0K(C18290x4.A0i(A012, abstractMap));
        }
        int compare = ((Comparator) this.A01).compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        AbstractMap abstractMap2 = (AbstractMap) this.A00;
        return AnonymousClass2A6.A00((Comparable) abstractMap2.get(obj), (Comparable) abstractMap2.get(obj2));
    }
}
