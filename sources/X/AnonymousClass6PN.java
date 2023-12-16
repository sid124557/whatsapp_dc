package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.6PN  reason: invalid class name */
public final class AnonymousClass6PN extends AnonymousClass6PJ {
    public C1690187q A00;
    public AnonymousClass6PR A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C153417bH A05;
    public final C158647kK A06;
    public final C186428vI A07;
    public final boolean A08;

    public void A00() {
        this.A04 = false;
        this.A03 = false;
        super.A00();
    }

    public void Biv(C187628xY r4) {
        C1690187q r2 = (C1690187q) r4;
        if (r2.A02 != null) {
            C186428vI r1 = r2.A03;
            r1.getClass();
            r1.Biv(r2.A02);
        }
        if (r4 == this.A00) {
            this.A00 = null;
        }
    }

    /* renamed from: A04 */
    public C1690187q B0w(AnonymousClass6PS r4, C183888qp r5, long j) {
        C1690187q r2 = new C1690187q(r4, r5, j);
        C186428vI r1 = this.A07;
        C161487pm.A04(AnonymousClass000.A1X(r2.A03));
        r2.A03 = r1;
        if (this.A04) {
            Object obj = r4.A04;
            if (this.A01.A00 != null && obj.equals(AnonymousClass6PR.A02)) {
                obj = this.A01.A00;
            }
            r2.A00(r4.A00(obj));
        } else {
            this.A00 = r2;
            if (!this.A03) {
                this.A03 = true;
                A03(r1, (Object) null);
                return r2;
            }
        }
        return r2;
    }

    public final void A05(long j) {
        C1690187q r6 = this.A00;
        int A042 = this.A01.A04(r6.A05.A04);
        if (A042 != -1) {
            long j2 = this.A01.A09(this.A05, A042, false).A01;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = AnonymousClass6C8.A0Q(j2, 1);
            }
            r6.A00 = j;
        }
    }

    public C151877Wq B9V() {
        return this.A07.B9V();
    }

    public void BL3() {
    }

    public AnonymousClass6PN(C186428vI r6, boolean z) {
        boolean z2;
        Timeline r2;
        this.A07 = r6;
        if (!z || (r6 instanceof AnonymousClass6PM)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.A08 = z2;
        this.A06 = new C158647kK();
        this.A05 = new C153417bH();
        if (r6 instanceof AnonymousClass6PM) {
            AnonymousClass6PM r62 = (AnonymousClass6PM) r6;
            int i = r62.A00;
            AnonymousClass6PR r0 = r62.A01.A01;
            if (i != Integer.MAX_VALUE) {
                r2 = new AnonymousClass6OA(r0, i);
            } else {
                r2 = new AnonymousClass6PP(r0);
            }
            this.A01 = new AnonymousClass6PR(r2, (Object) null, (Object) null);
            this.A02 = true;
            return;
        }
        this.A01 = new AnonymousClass6PR(new AnonymousClass6OM(r6.B9V()), C158647kK.A0F, AnonymousClass6PR.A02);
    }

    public void A02(C178288hI r3) {
        super.A02(r3);
        if (!this.A08) {
            this.A03 = true;
            A03(this.A07, (Object) null);
        }
    }
}
