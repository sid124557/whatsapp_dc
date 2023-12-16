package X;

import android.os.PowerManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5mA  reason: invalid class name and case insensitive filesystem */
public class C113895mA implements AnonymousClass4FW, C183158pa {
    public C116095pj A00;
    public C30721mu A01;
    public C30721mu A02;
    public boolean A03;

    public synchronized C116095pj A00() {
        return this.A00;
    }

    public C30721mu A01() {
        C30721mu r0;
        synchronized (this) {
            r0 = this.A02;
        }
        if (r0 != null) {
            return r0;
        }
        C116095pj A002 = A00();
        if (A002 != null) {
            return A002.A0N;
        }
        C30721mu A022 = A02();
        if (A022 == null) {
            return null;
        }
        return A022;
    }

    public synchronized C30721mu A02() {
        return this.A01;
    }

    public synchronized void A07() {
        this.A01 = null;
    }

    public synchronized void A08(C116095pj r2) {
        A09(r2, false);
    }

    public synchronized void A09(C116095pj r2, boolean z) {
        this.A03 = z;
        this.A00 = r2;
        if (r2 != null && r2.A0z) {
            this.A01 = r2.A0N;
        }
    }

    public synchronized void A0A(boolean z) {
        this.A03 = z;
    }

    public synchronized boolean A0C() {
        return this.A03;
    }

    public void A03() {
        C116095pj r2 = this.A00;
        if (r2 != null) {
            boolean z = true;
            r2.A0R = true;
            PowerManager.WakeLock wakeLock = r2.A0c;
            if (wakeLock == null || !wakeLock.isHeld()) {
                z = false;
            }
            r2.A0a = z;
            r2.A07();
        }
    }

    public void A04() {
        C116095pj r1 = this.A00;
        if (r1 != null) {
            r1.A0D(false);
        }
    }

    public void A05() {
        C116095pj r1 = this.A00;
        if (r1 != null) {
            r1.A0R = false;
            if (r1.A0a) {
                r1.A06();
            }
        }
    }

    public void A06() {
        C116095pj r2 = this.A00;
        if (r2 != null) {
            r2.A0H(true, false);
        }
    }

    public boolean A0B() {
        C116095pj r0 = this.A00;
        if (r0 == null || !r0.A0I()) {
            return false;
        }
        return true;
    }

    public boolean A0D(C624134x r3) {
        C116095pj r0 = this.A00;
        if (r0 != null) {
            if (!C86664Kz.A1X(r0.A0N, r3.A1J)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public void BUH(boolean z) {
        if (!z) {
            A04();
        }
    }

    public /* synthetic */ void BWS(C624134x r1, int i) {
    }

    public /* synthetic */ void BWU(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public void BWf(C95814uZ r4) {
        C30721mu r0;
        C95814uZ r02;
        C116095pj r2 = this.A00;
        if (r2 != null && (r0 = r2.A0N) != null && (r02 = r0.A1J.A00) != null && r02.equals(r4)) {
            r2.A0H(true, true);
        }
    }

    public void BWg(Collection collection, Map map) {
        if (this.A00 != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                C116095pj r0 = this.A00;
                if (C86664Kz.A1X(r0.A0N, A0T.A1J)) {
                    this.A00.A0H(false, true);
                    return;
                }
            }
        }
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }

    public C113895mA(AnonymousClass7KB r2, AnonymousClass1VX r3, AnonymousClass4LY r4) {
        Set set;
        if (r3.A0X(1617)) {
            set = r2.A02;
        } else {
            set = r4.A02;
        }
        set.add(this);
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }
}
