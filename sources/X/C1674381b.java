package X;

import java.io.IOException;

/* renamed from: X.81b  reason: invalid class name and case insensitive filesystem */
public final class C1674381b implements C185238tJ {
    public int A00;
    public boolean A01;
    public final /* synthetic */ AnonymousClass81U A02;

    public C1674381b(AnonymousClass81U r1) {
        this.A02 = r1;
    }

    public boolean BIe() {
        return this.A02.A01;
    }

    public void BL1() {
        C157457iK r1 = this.A02.A0B;
        IOException iOException = r1.A01;
        if (iOException == null) {
            AnonymousClass6E2 r0 = r1.A00;
            if (r0 != null) {
                int i = r0.A04;
                IOException iOException2 = r0.A03;
                if (iOException2 != null && r0.A00 > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public int BiJ(C1463279v r9, AnonymousClass6Jl r10, int i) {
        int i2 = this.A00;
        if (i2 == 2) {
            r10.A00 = 4 | r10.A00;
            return -4;
        } else if ((i & 2) == 2 || i2 == 0) {
            r9.A00 = this.A02.A06;
            this.A00 = 1;
            return -5;
        } else {
            AnonymousClass81U r6 = this.A02;
            if (!r6.A01) {
                return -3;
            }
            if (r6.A02) {
                r10.A00 = 0;
                r10.A00 = 1 | r10.A00;
                r10.A01(r6.A00);
                r10.A01.put(r6.A04, 0, r6.A00);
                if (!this.A01) {
                    C160767oH r4 = r6.A07;
                    C166637z1 r3 = r6.A06;
                    r4.A05(r3, C162097rD.A01(r3.A0S), 0);
                    this.A01 = true;
                }
            } else {
                r10.A00 = 4 | r10.A00;
            }
            this.A00 = 2;
            return -4;
        }
    }

    public int BpO(long j) {
        if (j <= 0 || this.A00 == 2) {
            return 0;
        }
        this.A00 = 2;
        if (this.A01) {
            return 1;
        }
        AnonymousClass81U r0 = this.A02;
        C160767oH r4 = r0.A07;
        C166637z1 r3 = r0.A06;
        r4.A05(r3, C162097rD.A01(r3.A0S), 0);
        this.A01 = true;
        return 1;
    }
}
