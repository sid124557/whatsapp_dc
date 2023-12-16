package X;

/* renamed from: X.7Wq  reason: invalid class name and case insensitive filesystem */
public final class C151877Wq {
    public final C151377Un A00;
    public final C151387Uo A01;
    public final AnonymousClass7WW A02;
    public final C151397Up A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C151877Wq)) {
            return false;
        }
        C151877Wq r4 = (C151877Wq) obj;
        return C162387ry.A0D(this.A04, r4.A04) && this.A00.equals(r4.A00) && C162387ry.A0D(this.A02, r4.A02) && C162387ry.A0D(this.A01, r4.A01) && C162387ry.A0D(this.A03, r4.A03);
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A03, AnonymousClass000.A08(this.A00, AnonymousClass000.A08(this.A01, (C18310x6.A09(this.A04) + C18280x3.A04(this.A02)) * 31)));
    }

    public C151877Wq(C151377Un r1, C151387Uo r2, AnonymousClass7WW r3, C151397Up r4, String str) {
        this.A04 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
    }
}
