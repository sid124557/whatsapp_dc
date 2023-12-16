package X;

import android.os.ConditionVariable;

/* renamed from: X.3UR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3UR implements AnonymousClass4BJ {
    public final /* synthetic */ C56612sH A00;
    public final /* synthetic */ AnonymousClass3DW A01;

    public final void Bap(boolean z) {
        AnonymousClass3DW r4 = this.A01;
        if (r4.A03(z)) {
            C24971Zl r3 = new C24971Zl();
            r3.A05 = Long.valueOf(System.currentTimeMillis());
            r3.A04 = C18280x3.A0S();
            r4.A02(new AnonymousClass3GV((ConditionVariable) null, r4, r3), 1);
        }
    }

    public /* synthetic */ AnonymousClass3UR(C56612sH r1, AnonymousClass3DW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
