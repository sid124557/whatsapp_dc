package X;

import com.whatsapp.util.Log;

/* renamed from: X.28l  reason: invalid class name and case insensitive filesystem */
public final class C386328l {
    public static final void A00(C69263Wi r3) {
        C71543cH r1;
        C162457s7.A0J(r3, 0);
        AnonymousClass4FU r2 = r3.A00;
        if (r2 != null) {
            Log.e("UnrecoverableErrorUtils/show error dialog");
            r1 = new C71543cH((Object) r2, 2);
        } else {
            Log.e("UnrecoverableErrorUtils/show error toast");
            r1 = new C71543cH((Object) r3, 3);
        }
        r3.BkS(r1);
    }
}
