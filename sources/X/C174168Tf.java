package X;

import java.util.HashSet;

/* renamed from: X.8Tf  reason: invalid class name and case insensitive filesystem */
public final class C174168Tf extends HashSet<C142766xj> {
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C142766xj)) {
            return super.contains(obj);
        }
        return false;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof C142766xj)) {
            return super.remove(obj);
        }
        return false;
    }

    public C174168Tf(String str) {
        C142766xj r0;
        if (str.equals("Facebook")) {
            r0 = C142766xj.A01;
        } else if (str.equals("Instagram")) {
            r0 = C142766xj.A04;
        } else {
            return;
        }
        add(r0);
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
