package X;

/* renamed from: X.4jb  reason: invalid class name and case insensitive filesystem */
public final class C91434jb extends C151447Uv {
    public boolean A00;
    public boolean A01;
    public final C106155Xv A02;
    public final C142076wb A03 = C142076wb.BOTTOM_CENTER;
    public final C141346vQ A04 = C141346vQ.A02;
    public final C56612sH A05;
    public final AnonymousClass1VX A06;
    public final boolean A07;

    public boolean A00(C158527k7 r4) {
        C162457s7.A0J(r4, 0);
        if (super.A00(r4) || !r4.A03 || r4.A00 != 0.0f) {
            return true;
        }
        return false;
    }

    public boolean A01(C158527k7 r4) {
        C162457s7.A0J(r4, 0);
        if (!super.A01(r4) || !r4.A03 || r4.A00 != 0.0f) {
            return false;
        }
        if (this.A02.A03().getInt("ss_tooltip_show_count", 0) == 0 || (this.A07 && !this.A01)) {
            return C56952sp.A0K(this.A06, 5341, false);
        }
        return false;
    }

    public C91434jb(C106155Xv r2, C56612sH r3, AnonymousClass1VX r4, boolean z) {
        this.A05 = r3;
        this.A06 = r4;
        this.A02 = r2;
        this.A07 = z;
    }
}
