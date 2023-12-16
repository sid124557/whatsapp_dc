package X;

/* renamed from: X.885  reason: invalid class name */
public final class AnonymousClass885 implements C185338tU {
    public boolean A00;
    public final C185338tU A01;
    public final /* synthetic */ C1690087p A02;

    public AnonymousClass885(C1690087p r1, C185338tU r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public boolean BIe() {
        if (AnonymousClass000.A1S((this.A02.A01 > -9223372036854775807L ? 1 : (this.A02.A01 == -9223372036854775807L ? 0 : -1))) || !this.A01.BIe()) {
            return false;
        }
        return true;
    }

    public void BL1() {
        this.A01.BL1();
    }

    public int BiK(C147807Fu r11, C126496Oc r12, boolean z) {
        C1690087p r1 = this.A02;
        if (AnonymousClass000.A1S((r1.A01 > -9223372036854775807L ? 1 : (r1.A01 == -9223372036854775807L ? 0 : -1)))) {
            return -3;
        }
        if (this.A00) {
            r12.flags = 4;
            return -4;
        }
        int BiK = this.A01.BiK(r11, r12, z);
        if (BiK == -5) {
            C166527yp r5 = r11.A00;
            r5.getClass();
            int i = r5.A07;
            if (!(i == 0 && r5.A08 == 0)) {
                int i2 = 0;
                if (r1.A00 == Long.MIN_VALUE) {
                    i2 = r5.A08;
                }
                C157057he r0 = new C157057he(r5);
                r0.A05 = i;
                r0.A06 = i2;
                r11.A00 = C166527yp.A00(r0);
            }
            return -5;
        }
        long j = r1.A00;
        if (j == Long.MIN_VALUE || (BiK != -4 ? !(BiK == -3 && r1.B4y() == Long.MIN_VALUE && !r12.A03) : r12.A00 < j)) {
            return BiK;
        }
        r12.clear();
        r12.flags = 4;
        this.A00 = true;
        return -4;
    }

    public int BpO(long j) {
        if (AnonymousClass000.A1S((this.A02.A01 > -9223372036854775807L ? 1 : (this.A02.A01 == -9223372036854775807L ? 0 : -1)))) {
            return -3;
        }
        return this.A01.BpO(j);
    }
}
