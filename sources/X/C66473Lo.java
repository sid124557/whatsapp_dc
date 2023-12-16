package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3Lo  reason: invalid class name and case insensitive filesystem */
public class C66473Lo implements AnonymousClass485 {
    public List A00;
    public Map A01;
    public final C64773Ex A02;
    public final AnonymousClass5ZU A03;
    public final AnonymousClass314 A04;
    public final C56892sj A05;
    public final C66503Lr A06;
    public final AnonymousClass4FS A07;
    public final Object A08 = AnonymousClass002.A0D();

    public static boolean A00(C95814uZ r2, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C836349e) it.next()).B3H(r2)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass3ZH A01(C95814uZ r5) {
        AnonymousClass3ZH A0A = this.A02.A0A(r5);
        AnonymousClass5ZU r2 = this.A03;
        C95814uZ r1 = A0A.A0H;
        if (C627336j.A0K(r1) && !(r1 instanceof C28001fK) && (r2.A0e(A0A, -1) || TextUtils.isEmpty(A0A.A0V))) {
            C70343aL.A01(this.A07, this, A0A, r5, 2);
        }
        return A0A;
    }

    public List A02() {
        List list;
        synchronized (this.A08) {
            if (this.A00 == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.A00 = copyOnWriteArrayList;
                this.A02.A0h(copyOnWriteArrayList);
            }
            list = this.A00;
        }
        return list;
    }

    public List A03(int i) {
        List A052 = this.A04.A05();
        ArrayList A0I = AnonymousClass002.A0I(Math.min(A052.size(), i));
        for (int i2 = 0; i2 < A052.size() && A0I.size() < i; i2++) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("getConversationContact/");
            C18260x0.A0m(A052.get(i2), A0o);
            AnonymousClass3ZH A012 = A01((C95814uZ) A052.get(i2));
            if (!AnonymousClass3ZH.A0E(A012)) {
                A0I.add(A012);
            }
        }
        return A0I;
    }

    public Map A04() {
        Map map;
        C95814uZ r1;
        synchronized (this.A08) {
            if (this.A01 == null) {
                List A022 = A02();
                this.A01 = new HashMap(A022.size(), 1.0f);
                Iterator it = A022.iterator();
                while (it.hasNext()) {
                    AnonymousClass3ZH A0R = C18310x6.A0R(it);
                    Class<C95814uZ> cls = C95814uZ.class;
                    AnonymousClass3ZH r0 = (AnonymousClass3ZH) this.A01.get(A0R.A0I(cls));
                    if ((r0 == null || r0.A0F() > A0R.A0F()) && (r1 = (C95814uZ) A0R.A0I(cls)) != null) {
                        this.A01.put(r1, A0R);
                    }
                }
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it2 = this.A04.A05().iterator();
                while (it2.hasNext()) {
                    C95814uZ A0P = C18300x5.A0P(it2);
                    if (this.A01.get(A0P) == null) {
                        AnonymousClass3ZH A012 = A01(A0P);
                        A0s.add(A012);
                        this.A01.put(A0P, A012);
                    }
                }
                List list = this.A00;
                C626936e.A06(list);
                list.addAll(A0s);
            }
            map = this.A01;
        }
        return map;
    }

    public C66473Lo(C64773Ex r2, AnonymousClass5ZU r3, AnonymousClass314 r4, C56892sj r5, C66503Lr r6, AnonymousClass4FS r7) {
        this.A07 = r7;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
    }
}
