package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.34P  reason: invalid class name */
public class AnonymousClass34P {
    public final AnonymousClass1VX A00;

    public static boolean A02(C624134x r4) {
        byte b;
        AnonymousClass2z0 r3 = r4.A1J;
        if (r3.A02) {
            return false;
        }
        if (!(r4.A09 == 1 || (b = r4.A1I) == 81 || C627636p.A0I(b) || b == 78 || b == 82)) {
            if (b != 2) {
                return false;
            }
            if (!(r3.A00 instanceof C95804uY) && r4.A0z() == null) {
                return false;
            }
        }
        int i = r4.A0D;
        if (i == 9 || i == 10) {
            return false;
        }
        return true;
    }

    public AnonymousClass34P(AnonymousClass1VX r1) {
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Set A00(java.util.HashMap r8) {
        /*
            java.util.HashSet r7 = X.AnonymousClass002.A0K()
            java.util.Iterator r8 = X.AnonymousClass001.A0u(r8)
        L_0x0008:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x005b
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r8)
            java.lang.Object r0 = r1.getKey()
            X.2xw r0 = (X.C60062xw) r0
            X.4uZ r6 = r0.A00
            java.lang.Object r0 = r1.getKey()
            X.2xw r0 = (X.C60062xw) r0
            X.4uZ r5 = r0.A01
            java.lang.Object r4 = r1.getValue()
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            java.lang.Long[] r3 = new java.lang.Long[r0]
            int r0 = r4.size()
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
        L_0x0035:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0052
            java.lang.Object r0 = r4.get(r1)
            X.2fY r0 = (X.C48832fY) r0
            java.lang.Object r0 = r0.A00
            r3[r1] = r0
            java.lang.Object r0 = r4.get(r1)
            X.2fY r0 = (X.C48832fY) r0
            java.lang.Object r0 = r0.A01
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0052:
            X.2b1 r0 = new X.2b1
            r0.<init>(r6, r5, r3, r2)
            r7.add(r0)
            goto L_0x0008
        L_0x005b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34P.A00(java.util.HashMap):java.util.Set");
    }

    public static Set A01(Set set) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C46062b1 r6 = (C46062b1) it.next();
            int i = 0;
            C60062xw r4 = new C60062xw(r6.A01, r6.A00, false);
            ArrayList A0s = AnonymousClass001.A0s();
            while (true) {
                Long[] lArr = r6.A02;
                if (i >= lArr.length) {
                    break;
                }
                A0s.add(new C48832fY(lArr[i], r6.A03[i]));
                i++;
            }
            if (A0t.containsKey(r4)) {
                ((List) A0t.get(r4)).addAll(A0s);
            } else {
                A0t.put(r4, A0s);
            }
        }
        return A00(A0t);
    }
}
