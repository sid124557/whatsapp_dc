package X;

import android.util.Log;

/* renamed from: X.0kc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11880kc implements Runnable {
    public final /* synthetic */ C13840np A00;
    public final /* synthetic */ String A01;

    public final void run() {
        String str = this.A01;
        C13840np r2 = this.A00;
        Log.e("FragmentStrictMode", AnonymousClass000.A0V("Policy violation with PENALTY_DEATH in ", str, AnonymousClass001.A0o()), r2);
        throw r2;
    }

    public /* synthetic */ C11880kc(C13840np r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
