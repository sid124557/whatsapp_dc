package X;

import android.app.KeyguardManager;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.6CQ  reason: invalid class name */
public class AnonymousClass6CQ extends KeyguardManager.KeyguardDismissCallback {
    public final /* synthetic */ VoipActivityV2 A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass6CQ(VoipActivityV2 voipActivityV2, Runnable runnable) {
        this.A00 = voipActivityV2;
        this.A01 = runnable;
    }

    public void onDismissSucceeded() {
        this.A01.run();
    }
}
