package X;

/* renamed from: X.81a  reason: invalid class name and case insensitive filesystem */
public final class C1674281a implements C185238tJ {
    public boolean A00;
    public final C185238tJ A01;
    public final /* synthetic */ AnonymousClass81S A02;

    public C1674281a(AnonymousClass81S r1, C185238tJ r2) {
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

    public int BiJ(C1463279v r11, AnonymousClass6Jl r12, int i) {
        AnonymousClass81S r1 = this.A02;
        if (AnonymousClass000.A1S((r1.A01 > -9223372036854775807L ? 1 : (r1.A01 == -9223372036854775807L ? 0 : -1)))) {
            return -3;
        }
        if (this.A00) {
            r12.A00 = 4;
            return -4;
        }
        int BiJ = this.A01.BiJ(r11, r12, i);
        if (BiJ == -5) {
            C166637z1 r5 = r11.A00;
            r5.getClass();
            int i2 = r5.A07;
            if (!(i2 == 0 && r5.A08 == 0)) {
                int i3 = 0;
                if (r1.A00 == Long.MIN_VALUE) {
                    i3 = r5.A08;
                }
                C157797it r13 = new C157797it(r5);
                r13.A06 = i2;
                r13.A07 = i3;
                r11.A00 = new C166637z1(r13);
            }
            return -5;
        }
        long j = r1.A00;
        if (j == Long.MIN_VALUE || (BiJ != -4 ? !(BiJ == -3 && r1.B4y() == Long.MIN_VALUE) : r12.A00 < j)) {
            return BiJ;
        }
        r12.A00();
        r12.A00 = 4;
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
