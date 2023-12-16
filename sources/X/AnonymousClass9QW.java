package X;

import com.whatsapp.camera.litecamera.LiteCameraView;

/* renamed from: X.9QW  reason: invalid class name */
public class AnonymousClass9QW {
    public final /* synthetic */ C195579Yl A00;

    public AnonymousClass9QW(C195579Yl r1) {
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass9N7 r0 = this.A00.A0D;
        if (r0 != null) {
            LiteCameraView liteCameraView = r0.A00;
            liteCameraView.A01.A01("LiteCamera");
            if (!liteCameraView.A0A || liteCameraView.BHe()) {
                liteCameraView.A0G.A00();
                return;
            }
            C203699oA r2 = liteCameraView.A0E;
            AnonymousClass9VA r1 = liteCameraView.A0G;
            r2.Bn4(r1.A01);
            if (!r1.A08) {
                r1.A03.A01();
                r1.A08 = true;
            }
        }
    }
}
