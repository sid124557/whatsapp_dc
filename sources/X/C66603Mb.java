package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Mb  reason: invalid class name and case insensitive filesystem */
public abstract class C66603Mb implements AnonymousClass4EL {
    public final AnonymousClass4EI A00;

    public final void BQr(Exception exc) {
        Log.e("FBUserEntityManagement : Network failed  while sending the payload");
        this.A00.BQp();
    }

    public final void BSB(Exception exc) {
        Log.e("FBUserEntityManagement : On error response while sending the payload");
        this.A00.BSB(exc);
    }

    public C66603Mb(AnonymousClass4EI r1) {
        this.A00 = r1;
    }
}
