package X;

import com.whatsapp.util.Log;

/* renamed from: X.9T0  reason: invalid class name */
public class AnonymousClass9T0 {
    public boolean A00;
    public final /* synthetic */ C1903895p A01;

    public AnonymousClass9T0(C1903895p r1) {
        this.A01 = r1;
    }

    public void A00(Exception exc) {
        C1903895p r3 = this.A01;
        C203689o9 r2 = r3.A06;
        if (r2 != null) {
            r3.A00(new AnonymousClass96d(exc));
            if (!this.A00) {
                this.A00 = true;
                r2.BpT("MediaGraphControllerImpl:onMediaGraphRenderError", exc, true);
            }
        }
        if (r3.A0A != null) {
            new AnonymousClass96d(exc);
            Log.e("CameraProcessor/mediaGraphErrorCallback");
        }
    }
}
