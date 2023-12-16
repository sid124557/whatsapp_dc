package X;

import android.graphics.Path;

/* renamed from: X.0gH  reason: invalid class name and case insensitive filesystem */
public class C09490gH implements C16240sh {
    public final Path.FillType A00;
    public final C01560Bi A01;
    public final C01620Bo A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C16780tx Bqm(AnonymousClass01G r2, C09320g0 r3) {
        return new C09300fy(r2, this, r3);
    }

    public C09490gH(Path.FillType fillType, C01560Bi r2, C01620Bo r3, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A04 = z;
        this.A00 = fillType;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShapeFill{color=, fillEnabled=");
        A0o.append(this.A04);
        return AnonymousClass000.A0d(A0o);
    }
}
