package X;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Vv  reason: invalid class name and case insensitive filesystem */
public class C105645Vv {
    public final int A00;
    public final Map A01;

    public C105645Vv(Map map, int i) {
        this.A01 = map;
        this.A00 = i;
    }

    public static C105645Vv A00(Context context, AnonymousClass3LZ r12, List list) {
        int i;
        File A012;
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            C624134x A0T = C18300x5.A0T(it);
            boolean z = A0T instanceof AnonymousClass1n2;
            String str = null;
            if (z || (A0T instanceof C30721mu) || (A0T instanceof C31981pC)) {
                A012 = C30471mV.A01((C30471mV) A0T);
                if (A012 != null) {
                    if (!z) {
                        if (A0T instanceof C30721mu) {
                            i3 = 1;
                        } else {
                            i4 = 1;
                        }
                        A0r.put(A0T, new C102205Hw(A012, str));
                    }
                }
            } else if (A0T instanceof C30481mW) {
                C30481mW r1 = (C30481mW) A0T;
                C162457s7.A0J(r1, 0);
                AnonymousClass4QG A002 = C100715Bz.A00(context, (AnonymousClass67B) null, r1);
                A012 = r12.A00(r1, A002);
                List list2 = A002.A0D;
                if (list2.size() > 0) {
                    str = AnonymousClass001.A0n(list2, 0);
                }
                if (A012 == null) {
                }
            }
            i2 = 1;
            A0r.put(A0T, new C102205Hw(A012, str));
        }
        if (i2 + i3 + i4 > 1) {
            i = 7;
        } else {
            int size = A0r.size();
            if (i2 != 0) {
                if (size != 1) {
                    i = 4;
                }
            } else if (i3 != 0) {
                i = 5;
                if (size == 1) {
                    i = 2;
                }
            } else if (i4 == 0) {
                return new C105645Vv(A0r, 0);
            } else {
                i = 6;
                if (size == 1) {
                    i = 3;
                }
            }
        }
        return new C105645Vv(A0r, i);
    }
}
