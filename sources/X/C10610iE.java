package X;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0iE  reason: invalid class name and case insensitive filesystem */
public class C10610iE implements Iterable {
    public int A00 = 0;
    public C13540nL A01;
    public C13540nL A02;
    public WeakHashMap A03 = new WeakHashMap();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10610iE) {
            C10610iE r7 = (C10610iE) obj;
            if (this.A00 == r7.A00) {
                Iterator it = iterator();
                Iterator it2 = r7.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(it);
                    Object next = it2.next();
                    if (A0w == null) {
                        if (next == null) {
                        }
                    } else if (!A0w.equals(next)) {
                        return false;
                    }
                }
                return !it.hasNext() && !it2.hasNext();
            }
        }
        return false;
    }

    public C13540nL A00(Object obj) {
        C13540nL r1 = this.A02;
        while (r1 != null && !r1.A02.equals(obj)) {
            r1 = r1.A00;
        }
        return r1;
    }

    public Iterator iterator() {
        C004104i r2 = new C004104i(this.A02, this.A01);
        this.A03.put(r2, Boolean.FALSE);
        return r2;
    }

    public Object A01(Object obj) {
        C13540nL A002 = A00(obj);
        if (A002 == null) {
            return null;
        }
        this.A00--;
        WeakHashMap weakHashMap = this.A03;
        if (!weakHashMap.isEmpty()) {
            for (C15620rf BqL : weakHashMap.keySet()) {
                BqL.BqL(A002);
            }
        }
        C13540nL r1 = A002.A01;
        C13540nL r0 = A002.A00;
        if (r1 != null) {
            r1.A00 = r0;
        } else {
            this.A02 = r0;
        }
        C13540nL r02 = A002.A00;
        if (r02 != null) {
            r02.A01 = r1;
        } else {
            this.A01 = r1;
        }
        A002.A00 = null;
        A002.A01 = null;
        return A002.A03;
    }

    public Object A02(Object obj, Object obj2) {
        C13540nL A002 = A00(obj);
        if (A002 != null) {
            return A002.A03;
        }
        C13540nL r1 = new C13540nL(obj, obj2);
        this.A00++;
        C13540nL r0 = this.A01;
        if (r0 == null) {
            this.A02 = r1;
        } else {
            r0.A00 = r1;
            r1.A01 = r0;
        }
        this.A01 = r1;
        return null;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AnonymousClass001.A0w(it).hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder A0p = AnonymousClass001.A0p();
        Iterator it = iterator();
        while (it.hasNext()) {
            AnonymousClass000.A1B(it.next(), A0p);
            if (it.hasNext()) {
                AnonymousClass001.A1M(A0p);
            }
        }
        return AnonymousClass000.A0f(A0p);
    }
}
