package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3Gk  reason: invalid class name and case insensitive filesystem */
public final class C65153Gk implements AnonymousClass4FW {
    public boolean A00 = true;
    public final AnonymousClass4FS A01;
    public final C104745Se A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final HashMap A06 = AnonymousClass001.A0t();

    public C65153Gk(AnonymousClass4FS r2, C104745Se r3, C183538qC r4, C183538qC r5, C183538qC r6) {
        C162457s7.A0J(r2, 1);
        C18260x0.A0e(r3, r4, r5, r6);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public void BWU(C624134x r6, int i) {
        AnonymousClass4FS r2;
        int i2;
        C162457s7.A0J(r6, 0);
        if (i == 24 && r6.A0J > 0 && AnonymousClass36X.A07(r6) && this.A02.A00()) {
            C106245Ye.A01(C624134x.A0C(r6, "XFamilyCrosspostMessageObserver/checking is auto-share crossposting message ", AnonymousClass001.A0o()));
            C108845de r0 = r6.A0O;
            if (r0 == null) {
                C106245Ye.A01("XFamilyCrosspostMessageObserver/handle auto share message in previous app session");
                r2 = this.A01;
                i2 = 2;
            } else if (!r0.A03) {
                return;
            } else {
                if (this.A00 || this.A06.containsKey(r6.A1J.A01)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("XFamilyCrosspostMessageObserver/handle omitted auto share message. statusFragmentDestroyed: ");
                    C106245Ye.A01(C18300x5.A0m(A0o, this.A00));
                    r2 = this.A01;
                    i2 = 3;
                } else {
                    return;
                }
            }
            r2.BkM(new C70163a3(r6, i2, this));
        }
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public void BWS(C624134x r4, int i) {
        C108845de r0;
        if ((C624134x.A07(r4).A00 instanceof C135166kE) && AnonymousClass36X.A07(r4) && (r0 = r4.A0O) != null && r0.A03 && this.A02.A00()) {
            this.A01.BkM(new C70163a3(this, 4, r4));
        }
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWg(Collection collection, Map map) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
