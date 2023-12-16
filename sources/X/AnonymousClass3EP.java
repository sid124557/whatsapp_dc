package X;

import com.whatsapp.util.Log;

/* renamed from: X.3EP  reason: invalid class name */
public final class AnonymousClass3EP implements AnonymousClass4CR {
    public final /* synthetic */ C84164Bh A00;
    public final /* synthetic */ C43412Sa A01;

    public AnonymousClass3EP(C84164Bh r1, C43412Sa r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BSk() {
        Log.i("WabaiConsentManager/accept/error");
        this.A00.BaR(false);
    }

    public void onSuccess() {
        Log.i("WabaiConsentManager/accept/success");
        ((C54282oT) this.A01.A05.getValue()).A01("yes", true);
        this.A00.BaR(true);
    }
}
