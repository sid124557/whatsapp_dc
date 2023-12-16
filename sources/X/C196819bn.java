package X;

import android.text.TextUtils;

/* renamed from: X.9bn  reason: invalid class name and case insensitive filesystem */
public class C196819bn implements C85134Fb {
    public final C66663Mh A00;
    public final AnonymousClass33p A01;
    public final C620733j A02;
    public final AnonymousClass1VX A03;
    public final C60152y5 A04;

    public String B65() {
        AnonymousClass33p r0 = this.A01;
        String A0Z = r0.A0Z();
        String A0b = r0.A0b();
        if (TextUtils.isEmpty(A0Z) || TextUtils.isEmpty(A0b)) {
            return this.A02.A06();
        }
        return C106675Zy.A01(A0Z, A0b);
    }

    public C196819bn(C66663Mh r1, AnonymousClass33p r2, C620733j r3, AnonymousClass1VX r4, C60152y5 r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }
}
