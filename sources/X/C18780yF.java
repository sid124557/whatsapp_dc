package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.0yF  reason: invalid class name and case insensitive filesystem */
public class C18780yF extends Handler {
    public final boolean A00;
    public final /* synthetic */ C107285b3 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18780yF(Looper looper, C107285b3 r3) {
        super(looper);
        this.A01 = r3;
        this.A00 = AnonymousClass000.A1Y(looper, Looper.getMainLooper());
    }

    public void handleMessage(Message message) {
        long uptimeMillis = SystemClock.uptimeMillis();
        CallInfo callInfo = Voip.getCallInfo();
        boolean z = this.A00;
        C107285b3 r0 = this.A01;
        if (z) {
            C107285b3.A03(r0, callInfo, uptimeMillis);
            r0.A0I.sendEmptyMessageDelayed(0, 1000);
            return;
        }
        r0.A1d.A0S(new C70283aF(this, callInfo, 1, uptimeMillis));
    }
}
