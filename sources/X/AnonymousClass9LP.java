package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.9LP  reason: invalid class name */
public class AnonymousClass9LP {
    public static AnonymousClass99V A00(String str, List list, Map map, int i, int i2, int i3) {
        boolean A1T = AnonymousClass000.A1T(list.size() % 4);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("BloksFieldStatParser/parseFieldStat/invalid serialization/length=", A0o, list);
        C626936e.A0E(A1T, A0o.toString());
        int size = list.size() / 4;
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = i4 * 4;
            int A09 = AnonymousClass000.A09(list, i5 + 2);
            Object obj = list.get(i5 + 3);
            Object A00 = AnonymousClass9LQ.A00(obj, A09, false);
            if (A00 != null) {
                int A092 = AnonymousClass000.A09(list, i5);
                A0s.add(new AnonymousClass9PD(A00, AnonymousClass9LQ.A00(obj, A09, true), AnonymousClass001.A0n(list, i5 + 1), A092));
            }
        }
        return new AnonymousClass99V(new AnonymousClass5ZC(C615531h.A01(C18310x6.A0o("sample_rate_debug", map), 1), C615531h.A01(C18310x6.A0o("sample_rate_beta", map), 20), C615531h.A01(C18310x6.A0o("sample_rate_beta", map), 20), C615531h.A01(C18310x6.A0o("sample_rate_release", map), 20), C1899693i.A0y(map.get("log_all_for_debug"))), str, (AnonymousClass9PD[]) A0s.toArray(new AnonymousClass9PD[0]), i, i2, i3);
    }
}
