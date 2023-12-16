package X;

import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.89k  reason: invalid class name and case insensitive filesystem */
public class C1694689k implements C180898lo {
    public final /* synthetic */ C160847oP A00;

    public C1694689k(C160847oP r1) {
        this.A00 = r1;
    }

    public final void Ba1(C127866Tp r4) {
        if (r4.A01 == 0) {
            C160847oP r2 = this.A00;
            r2.BC3((IAccountAccessor) null, ((C127196Ra) r2).A01);
            return;
        }
        C178408hU r0 = this.A00.A0K;
        if (r0 != null) {
            ((C1694589j) r0).A00.onConnectionFailed(r4);
        }
    }
}
