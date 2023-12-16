package X;

import android.content.Context;

/* renamed from: X.7aU  reason: invalid class name and case insensitive filesystem */
public final class C152987aU {
    public C157997jG A00;
    public final int A01;
    public final Context A02;
    public final Object A03;
    public final AnonymousClass66R A04 = C154517dI.A00(AnonymousClass58H.NONE, new AnonymousClass8V4(this));

    public static C160247nJ A00(C152987aU r8, C180488l9 r9, Object obj, long j) {
        C159567m6.A01("RC Layout");
        C186448vK AyJ = r9.AyJ(r8, C159227lS.A01(j), C159227lS.A00(j));
        C159567m6.A00();
        C159567m6.A01("RC Reduce");
        C160247nJ A002 = C160497nj.A00(r8, AyJ, r9, obj, j);
        C159567m6.A00();
        r8.A00 = null;
        return A002;
    }

    public final int A01() {
        return this.A01;
    }

    public final Context A02() {
        return this.A02;
    }

    public final C157997jG A03() {
        return (C157997jG) this.A04.getValue();
    }

    public final Object A04() {
        return this.A03;
    }

    public C152987aU(Context context, C157997jG r4, Object obj, int i) {
        this.A02 = context;
        this.A03 = obj;
        this.A01 = i;
        this.A00 = r4;
    }
}
