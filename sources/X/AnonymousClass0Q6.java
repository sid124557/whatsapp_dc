package X;

import android.util.Log;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.0Q6  reason: invalid class name */
public class AnonymousClass0Q6 {
    public final Map A00 = new LinkedHashMap();

    public void A02(AnonymousClass0NF... r8) {
        C162457s7.A0J(r8, 0);
        for (AnonymousClass0NF r4 : r8) {
            int i = r4.A01;
            int i2 = r4.A00;
            Map map = this.A00;
            Integer valueOf = Integer.valueOf(i);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            AbstractMap abstractMap = (AbstractMap) obj;
            Integer valueOf2 = Integer.valueOf(i2);
            if (abstractMap.containsKey(valueOf2)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Overriding migration ");
                A0o.append(abstractMap.get(valueOf2));
                Log.w("ROOM", AnonymousClass000.A0P(r4, " with ", A0o));
            }
            abstractMap.put(valueOf2, r4);
        }
    }

    public List A00(int i, int i2) {
        if (i == i2) {
            return AnonymousClass8UF.A0n();
        }
        boolean z = false;
        if (i2 > i) {
            z = true;
        }
        return A01(AnonymousClass001.A0s(), i, i2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(java.util.List r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
        L_0x0000:
            if (r10 == 0) goto L_0x0051
            if (r8 >= r9) goto L_0x0055
        L_0x0004:
            java.util.Map r0 = r6.A00
            java.lang.Object r5 = X.AnonymousClass001.A0i(r0, r8)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            r4 = 0
            if (r5 == 0) goto L_0x0054
            if (r10 == 0) goto L_0x004c
            java.util.NavigableSet r0 = r5.descendingKeySet()
        L_0x0015:
            java.util.Iterator r3 = r0.iterator()
        L_0x0019:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r2 = r3.next()
            java.lang.Number r2 = (java.lang.Number) r2
            if (r10 == 0) goto L_0x0040
            int r0 = r8 + 1
            X.C162457s7.A0B(r2)
            int r1 = r2.intValue()
            if (r0 > r1) goto L_0x0019
            if (r1 > r9) goto L_0x0019
        L_0x0034:
            java.lang.Object r0 = r5.get(r2)
            X.C162457s7.A0H(r0)
            r7.add(r0)
            r8 = r1
            goto L_0x0000
        L_0x0040:
            X.C162457s7.A0B(r2)
            int r1 = r2.intValue()
            if (r9 > r1) goto L_0x0019
            if (r1 >= r8) goto L_0x0019
            goto L_0x0034
        L_0x004c:
            java.util.Set r0 = r5.keySet()
            goto L_0x0015
        L_0x0051:
            if (r8 <= r9) goto L_0x0055
            goto L_0x0004
        L_0x0054:
            return r4
        L_0x0055:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q6.A01(java.util.List, int, int, boolean):java.util.List");
    }

    public final boolean A03(int i, int i2) {
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return false;
        }
        Map map2 = (Map) map.get(valueOf);
        if (map2 == null) {
            map2 = C73813g7.A0A();
        }
        return map2.containsKey(Integer.valueOf(i2));
    }
}
