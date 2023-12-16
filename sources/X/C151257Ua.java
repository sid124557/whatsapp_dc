package X;

import java.util.List;

/* renamed from: X.7Ua  reason: invalid class name and case insensitive filesystem */
public final class C151257Ua {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public AnonymousClass1LX A02;
    public final C69263Wi A03;
    public final C56492s4 A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass4FV A08;
    public final C55002pd A09;
    public final C29011i8 A0A;

    public void A00(AnonymousClass8EI r3) {
        r3.A03 = true;
        AnonymousClass1LX r0 = this.A02;
        if (r0 != null) {
            r0.A01(r3);
        }
        List list = r3.A02;
        if (list != null && list.size() > 0) {
            for (AnonymousClass8EI A002 : r3.A02) {
                A00(A002);
            }
        }
    }

    public C151257Ua(C69263Wi r2, C56492s4 r3, C56612sH r4, C54292oU r5, AnonymousClass1VX r6, AnonymousClass4FV r7, C55002pd r8, C29011i8 r9) {
        this.A06 = r5;
        this.A05 = r4;
        this.A07 = r6;
        this.A03 = r2;
        this.A04 = r3;
        this.A08 = r7;
        this.A0A = r9;
        this.A09 = r8;
    }
}
