package X;

/* renamed from: X.2c4  reason: invalid class name and case insensitive filesystem */
public class C46702c4 {
    public final C56922sm A00;
    public final C66543Lv A01;
    public final C55792qv A02;
    public final C613830m A03;
    public final C54762pF A04;
    public final C72303dV A05;

    public C46702c4(C56922sm r1, C66543Lv r2, C55792qv r3, C613830m r4, C54762pF r5, C72303dV r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
    }

    public final boolean A00(C43912Ty r9, AnonymousClass2Y7 r10, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StorageUsageManager/deleteMessagesInternal ");
        C95814uZ r0 = r9.A07;
        C18260x0.A0m(r0, A0o);
        int i3 = i2;
        r10.A00(r0, i2, i);
        C66543Lv r1 = this.A01;
        r1.A0N(r0);
        return r1.A0o(r9, new C65263Gv(r9, r10, this, i3, i), false);
    }
}
