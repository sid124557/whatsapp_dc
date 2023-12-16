package X;

import com.whatsapp.status.StatusesFragment;

/* renamed from: X.5Oo  reason: invalid class name and case insensitive filesystem */
public class C103825Oo {
    public C102165Hs A00;
    public C1226265c A01;
    public final C104715Sb A02;
    public final C65173Gm A03;
    public final AnonymousClass58A A04;
    public final C113995mK A05;
    public final C104745Se A06;
    public final C183538qC A07;

    public final void A00() {
        C102165Hs r0 = this.A00;
        if (r0 != null) {
            C104715Sb r4 = this.A02;
            C115815pH r3 = r0.A01;
            if (r3.A01 != null) {
                boolean z = r4.A01;
                StatusesFragment statusesFragment = r3.A02;
                statusesFragment.A1E.get();
                if (z != C86604Kt.A1Y(r3.A01)) {
                    statusesFragment.A1E.get();
                    r3.A00(z, r4.A00);
                }
            }
        }
    }

    public C103825Oo(C65173Gm r5, AnonymousClass58A r6, C113995mK r7, C104745Se r8, C183538qC r9, boolean z) {
        boolean A1S;
        this.A06 = r8;
        this.A03 = r5;
        this.A05 = r7;
        this.A07 = r9;
        this.A04 = r6;
        boolean z2 = true;
        if (r8.A00()) {
            A1S = false;
        } else {
            r9.get();
            A1S = AnonymousClass0x7.A1S(C18300x5.A0v(r5.A03));
        }
        this.A02 = new C104715Sb(A1S, (z || !A1S) ? false : z2, false, false);
        if (!r8.A00()) {
            r9.get();
            this.A01 = new C124116Ba(this, 1);
        }
    }
}
