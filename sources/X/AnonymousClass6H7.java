package X;

import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6H7  reason: invalid class name */
public final class AnonymousClass6H7 extends AnonymousClass08c implements C178378hR {
    public final Set A00;
    public final Semaphore A01 = new Semaphore(0);

    public final void A03() {
        this.A01.drainPermits();
        A09();
    }

    public final /* bridge */ /* synthetic */ Object A06() {
        int i = 0;
        for (C159087l6 r1 : this.A00) {
            if (r1 instanceof C127086Qo) {
                C186128un r0 = ((C127086Qo) r1).A01;
                if (r0 != null && r0.BtC(this)) {
                    i++;
                }
            } else {
                throw C18320x8.A0m();
            }
        }
        try {
            this.A01.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            C18300x5.A11();
            return null;
        }
    }

    public AnonymousClass6H7(Context context, Set set) {
        super(context);
        this.A00 = set;
    }
}
