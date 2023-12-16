package X;

import android.os.SystemClock;

/* renamed from: X.3RD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3RD implements AnonymousClass4DF {
    public final /* synthetic */ AnonymousClass3P7 A00;
    public final /* synthetic */ C56452s0 A01;
    public final /* synthetic */ boolean A02;

    public final void BX8(C95804uY r5) {
        C56452s0 r0 = this.A01;
        boolean z = this.A02;
        AnonymousClass3P7 r3 = this.A00;
        AnonymousClass2T0 A002 = r0.A0D.A00(r5, z);
        if (A002 != null) {
            r3.BYy(A002, SystemClock.elapsedRealtime());
        }
    }

    public /* synthetic */ void onError(Throwable th) {
    }

    public /* synthetic */ AnonymousClass3RD(AnonymousClass3P7 r1, C56452s0 r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }
}
