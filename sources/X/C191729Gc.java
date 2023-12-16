package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Gc  reason: invalid class name and case insensitive filesystem */
public class C191729Gc extends AnonymousClass5ZM {
    public final int A00;
    public final AnonymousClass36F A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A01.A0P((C95814uZ) null, this.A00);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String A0M;
        C166557yt A0H;
        Object obj2;
        List list = (List) obj;
        WeakReference weakReference = this.A02;
        if (weakReference.get() != null) {
            HashMap hashMap = ((C1902494w) weakReference.get()).A09;
            hashMap.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C624034w A0E = C1899693i.A0E(it);
                AnonymousClass1S4 r3 = A0E.A0A;
                if (r3 != null) {
                    int i = A0E.A02;
                    if (i == 405) {
                        A0M = r3.A0L();
                        A0H = r3.A0G();
                    } else if (i == 106 || i == 12) {
                        A0M = r3.A0M();
                        A0H = r3.A0H();
                    }
                    if (!TextUtils.isEmpty(A0M)) {
                        if (!C161527pr.A02(A0H)) {
                            obj2 = C1899593h.A0X(A0H);
                        } else {
                            obj2 = A0M;
                        }
                        hashMap.put(A0M, obj2);
                    }
                }
            }
        }
    }

    public C191729Gc(AnonymousClass36F r2, C1902494w r3, int i) {
        this.A01 = r2;
        this.A02 = AnonymousClass0x9.A14(r3);
        this.A00 = i;
    }
}
