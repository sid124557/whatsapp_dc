package X;

/* renamed from: X.886  reason: invalid class name */
public final class AnonymousClass886 implements C185338tU {
    public int A00;
    public boolean A01;
    public final /* synthetic */ C1690287r A02;

    public AnonymousClass886(C1690287r r1) {
        this.A02 = r1;
    }

    public boolean BIe() {
        return this.A02.A01;
    }

    public void BL1() {
    }

    public int BiK(C147807Fu r8, C126496Oc r9, boolean z) {
        if (!this.A01) {
            C1690287r r0 = this.A02;
            C159017kx r4 = r0.A04;
            C166527yp r3 = r0.A03;
            r4.A01(r3, C162107rG.A00(r3.A0T), 0);
            this.A01 = true;
        }
        int i = this.A00;
        if (i == 2) {
            r9.addFlag(4);
            return -4;
        } else if (z || i == 0) {
            r8.A00 = this.A02.A03;
            this.A00 = 1;
            return -5;
        } else {
            C1690287r r5 = this.A02;
            if (!r5.A01) {
                return -3;
            }
            if (r5.A02 != null) {
                r9.addFlag(1);
                r9.A00 = 0;
                if (r9.A01 == null && r9.A04 == 0) {
                    return -4;
                }
                r9.A01(r5.A00);
                r9.A01.put(r5.A02, 0, r5.A00);
            } else {
                r9.addFlag(4);
            }
            this.A00 = 2;
            return -4;
        }
    }

    public int BpO(long j) {
        if (!this.A01) {
            C1690287r r0 = this.A02;
            C159017kx r4 = r0.A04;
            C166527yp r3 = r0.A03;
            r4.A01(r3, C162107rG.A00(r3.A0T), 0);
            this.A01 = true;
        }
        if (j <= 0 || this.A00 == 2) {
            return 0;
        }
        this.A00 = 2;
        return 1;
    }
}
