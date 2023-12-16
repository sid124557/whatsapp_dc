package X;

import com.whatsapp.util.Log;

/* renamed from: X.5jM  reason: invalid class name and case insensitive filesystem */
public final class C112205jM implements AnonymousClass4CT {
    public final /* synthetic */ C113485lV A00;

    public C112205jM(C113485lV r1) {
        this.A00 = r1;
    }

    public void BSk() {
        Log.d("bonsaiwaitlisthourlycron/failed to sync, ignore");
    }

    public void onSuccess() {
        C113485lV r2 = this.A00;
        if (r2.A01.A01() == C372121j.AI_AVAILABLE) {
            r2.A02.A00();
        }
    }
}
