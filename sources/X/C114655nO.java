package X;

import android.os.SystemClock;

/* renamed from: X.5nO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C114655nO implements C83854Ab {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass4UA A01;

    public final void BXc(C66513Ls r9, boolean z) {
        AnonymousClass4UA r7 = this.A01;
        long elapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.A00);
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        r7.A0I.A0T(new C117665sI(r7, r9, 18, z), elapsedRealtime);
    }

    public /* synthetic */ C114655nO(AnonymousClass4UA r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
