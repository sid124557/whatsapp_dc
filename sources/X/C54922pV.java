package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2pV  reason: invalid class name and case insensitive filesystem */
public final class C54922pV {
    public final C56972sr A00;
    public final C56612sH A01;
    public final C56982ss A02;
    public final C59932xj A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass35J A05;
    public final C55832qz A06;

    public final C30601mi A00(C30461mU r5) {
        Map map;
        C162457s7.A0J(r5, 0);
        PhoneUserJid A042 = C56972sr.A04(this.A00);
        if (A042 != null) {
            synchronized (r5.A1K) {
                Map map2 = r5.A05;
                if (map2 != null) {
                    map = C73813g7.A0D(map2);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                return (C30601mi) map.get(A042);
            }
        }
        return null;
    }

    public final boolean A02(C95814uZ r3) {
        C162457s7.A0J(r3, 0);
        if (!C627336j.A0K(r3)) {
            return false;
        }
        int A062 = this.A02.A06(AnonymousClass34R.A01(r3));
        if (A062 == 2 || A062 == 6) {
            return true;
        }
        return false;
    }

    public C54922pV(C56972sr r1, C56612sH r2, C56982ss r3, C59932xj r4, AnonymousClass1VX r5, AnonymousClass35J r6, C55832qz r7) {
        C18260x0.A0f(r2, r5, r1, r3, r7);
        C18260x0.A0U(r4, r6);
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
    }

    public final List A01(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x A002 = C55122pp.A00(this.A06, C18270x1.A02(it));
            if (A002 != null) {
                A0s.add(A002);
            }
        }
        return A0s;
    }
}
