package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0gE  reason: invalid class name and case insensitive filesystem */
public class C09460gE implements C16240sh {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C16780tx Bqm(AnonymousClass01G r2, C09320g0 r3) {
        return new C09270fv(r2, this, r3);
    }

    public C09460gE(String str, List list, boolean z) {
        this.A00 = str;
        this.A01 = list;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShapeGroup{name='");
        A0o.append(this.A00);
        A0o.append("' Shapes: ");
        A0o.append(Arrays.toString(this.A01.toArray()));
        return AnonymousClass000.A0d(A0o);
    }
}
