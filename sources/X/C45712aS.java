package X;

import android.app.Activity;

/* renamed from: X.2aS  reason: invalid class name and case insensitive filesystem */
public final class C45712aS {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C102765Ke A01;
    public final /* synthetic */ C48792fU A02;

    public C45712aS(Activity activity, C102765Ke r2, C48792fU r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = activity;
    }

    public void A00(Exception exc) {
        this.A02.A00();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error with native auth, fallback to web: ");
        AnonymousClass000.A1A(exc, A0o);
        C106245Ye.A02(AnonymousClass000.A0a(" , ", A0o, exc), (Throwable) null);
        C102765Ke r3 = this.A01;
        C69263Wi.A07(r3.A02, r3, this.A00, 46);
    }
}
