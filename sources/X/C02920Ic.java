package X;

import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.0Ic  reason: invalid class name and case insensitive filesystem */
public final class C02920Ic {
    public static final C08700eu A00(String str, int i) {
        C162457s7.A0J(str, 0);
        TreeMap treeMap = C08700eu.A08;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C08700eu r0 = (C08700eu) ceilingEntry.getValue();
                r0.A07 = str;
                r0.A00 = i;
                return r0;
            }
            C08700eu r02 = new C08700eu(i);
            r02.A07 = str;
            r02.A00 = i;
            return r02;
        }
    }

    public static C08700eu A01(String str, String str2) {
        C08700eu A00 = A00(str, 1);
        if (str2 == null) {
            A00.Axt(1);
            return A00;
        }
        A00.Axu(1, str2);
        return A00;
    }
}
