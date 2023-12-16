package X;

import android.util.Log;

/* renamed from: X.0hu  reason: invalid class name and case insensitive filesystem */
public class C10420hu implements C84724Dl {
    public final /* synthetic */ C03660Lb A00;
    public final /* synthetic */ String A01;

    public C10420hu(C03660Lb r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void BaH(C150917Ss r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Should not prefetch async actions: ");
        Log.e("WaBkPreloadHelper", AnonymousClass000.A0X(this.A01, A0o));
    }

    public void BaN(C46202bF r6) {
        int A002 = r6.A00();
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A002 == 5) {
            A0o.append("BLOKS: Prefetch successful (");
            A0o.append(this.A01);
        } else {
            A0o.append("BLOKS: Prefetch failed (");
            A0o.append(this.A01);
            A0o.append(", status=");
            A0o.append(A002);
        }
        AnonymousClass000.A1E(")", "WaBkPreloadHelper", A0o);
    }
}
