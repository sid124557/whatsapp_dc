package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.6BS  reason: invalid class name */
public class AnonymousClass6BS implements AnonymousClass4BJ {
    public Object A00;
    public final int A01;

    public AnonymousClass6BS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bap(boolean z) {
        AnonymousClass4Rp r0;
        if (this.A01 != 0) {
            C89894fS r1 = (C89894fS) this.A00;
            if (z && (r0 = r1.A01) != null && r0.isShowing()) {
                r1.A01.A03();
                return;
            }
            return;
        }
        C18260x0.A1E("voip/onScreenLockChanged:", AnonymousClass001.A0o(), z);
        C107285b3 r2 = (C107285b3) this.A00;
        r2.A1M = z;
        if (C627436k.A0O(Voip.getCallInfo())) {
            if (z && r2.A1J) {
                AnonymousClass59E.A00(AnonymousClass59E.SCREEN_LOCKED, r2.A1z);
                r2.A1k.BrE();
                Voip.stopVideoCaptureStream();
            }
            if (!r2.A1M && r2.A19 && r2.A0M != null) {
                Log.i("onScreenLockChanged screen is turned on, but ear-near is still true, release and reacquire the proximity wake lock.");
                r2.A0M();
                r2.A0H.sendEmptyMessageDelayed(14, 6000);
            }
        }
    }
}
