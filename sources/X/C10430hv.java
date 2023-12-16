package X;

import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0hv  reason: invalid class name and case insensitive filesystem */
public final class C10430hv implements C84724Dl {
    public final /* synthetic */ C47382dA A00;
    public final /* synthetic */ C16430tO A01;
    public final /* synthetic */ WeakReference A02;

    public void BaH(C150917Ss r5) {
        C16430tO r1;
        AnonymousClass0JP r0;
        C162457s7.A0J(r5, 0);
        Context context = (Context) this.A02.get();
        if (context != null) {
            C159377lj.A02(context, r5, C157967jD.A01, this.A00, C73813g7.A0A());
            r1 = this.A01;
            r0 = AnonymousClass0F8.A00;
        } else {
            r1 = this.A01;
            r0 = AnonymousClass0F7.A00;
        }
        r1.BPR(r0);
    }

    public void BaN(C46202bF r3) {
        C162457s7.A0J(r3, 0);
        if (r3.A00() == 5) {
            Log.e("AsyncActionLauncher", "should launch as an async action");
        }
        this.A01.BPR(new AnonymousClass0F5(r3));
    }

    public C10430hv(C47382dA r1, C16430tO r2, WeakReference weakReference) {
        this.A01 = r2;
        this.A02 = weakReference;
        this.A00 = r1;
    }
}
