package X;

import android.view.View;

/* renamed from: X.0h8  reason: invalid class name and case insensitive filesystem */
public final class C10020h8 implements C187568xR {
    public static final C10020h8 A00 = new C10020h8();

    public /* synthetic */ boolean BHX(C187568xR r2) {
        return C1443271c.A00(this, r2);
    }

    public C160097n2 BJd(AnonymousClass7V8 r7, long j) {
        View A002 = AnonymousClass0SV.A00.B0R(r7.A00());
        A002.measure(C159227lS.A01(j), C159227lS.A00(j));
        long max = (long) Math.max(C153927cH.A01(j), A002.getMeasuredWidth());
        return new C160097n2((((long) Math.max(C153927cH.A00(j), A002.getMeasuredHeight())) & 4294967295L) | (max << 32));
    }
}
