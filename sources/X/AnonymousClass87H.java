package X;

/* renamed from: X.87H  reason: invalid class name */
public final class AnonymousClass87H implements C183868qn {
    public C166527yp A00;
    public C185598tw A01;
    public C153267ax A02;

    public void AzY(C161467pi r14) {
        long j;
        C153267ax r0 = this.A02;
        C161487pm.A01(r0);
        long A002 = r0.A00();
        if (A002 != -9223372036854775807L) {
            C166527yp r5 = this.A00;
            if (A002 != r5.A0J) {
                C157057he r02 = new C157057he(r5);
                r02.A0H = A002;
                C166527yp A003 = C166527yp.A00(r02);
                this.A00 = A003;
                this.A01.B3T(A003);
            }
            int A004 = C161467pi.A00(r14);
            this.A01.Bkc(r14, A004);
            C185598tw r6 = this.A01;
            C153267ax r52 = this.A02;
            synchronized (r52) {
                long j2 = r52.A01;
                j = -9223372036854775807L;
                if (j2 != -9223372036854775807L) {
                    j = r52.A02 + j2;
                } else {
                    long j3 = r52.A00;
                    if (j3 != Long.MAX_VALUE) {
                        j = j3;
                    }
                }
            }
            r6.Bkh((AnonymousClass7WZ) null, 1, A004, 0, j);
        }
    }

    public void BFv(C187028wK r3, C151897Ws r4, C153267ax r5) {
        this.A02 = r5;
        r4.A02();
        r4.A03();
        C185598tw Br0 = r3.Br0(r4.A00, 5);
        this.A01 = Br0;
        Br0.B3T(this.A00);
    }

    public AnonymousClass87H(String str) {
        C157057he A002 = C157057he.A00();
        A002.A0R = str;
        this.A00 = C166527yp.A00(A002);
    }
}
