package X;

import android.util.Log;

/* renamed from: X.0lk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12560lk implements Runnable {
    public final /* synthetic */ C15650ri A00;
    public final /* synthetic */ AnonymousClass0O9 A01;
    public final /* synthetic */ String A02;

    public final void run() {
        AnonymousClass0O9 r0 = this.A01;
        C15650ri r2 = this.A00;
        String str = this.A02;
        if (r0 != null) {
            try {
                if (AnonymousClass001.A1U(((AnonymousClass08A) r0).A02.compareTo(AnonymousClass0GC.CREATED))) {
                    r2.B1v();
                    return;
                }
            } catch (AnonymousClass0GR e) {
                Log.e("CarApp.Dispatch", AnonymousClass000.A0V("Serialization failure in ", str, AnonymousClass001.A0o()), e);
                return;
            }
        }
        Log.w("CarApp.Dispatch", AnonymousClass000.A0P(r2, "Lifecycle is not at least created when dispatching ", AnonymousClass001.A0o()));
    }

    public /* synthetic */ C12560lk(C15650ri r1, AnonymousClass0O9 r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }
}
