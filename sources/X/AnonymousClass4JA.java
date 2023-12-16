package X;

import com.whatsapp.util.Log;

/* renamed from: X.4JA  reason: invalid class name */
public class AnonymousClass4JA implements AnonymousClass4CS {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4JA(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public void BSk() {
        if (this.A02 != 0) {
            Log.i("WabaiConsentManager/sync/error");
            ((C84164Bh) this.A00).BaR(false);
            return;
        }
        Log.i("BonsaiTos/error/error");
        ((AnonymousClass4GP) this.A00).invoke();
    }
}
