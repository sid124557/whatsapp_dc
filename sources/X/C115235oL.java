package X;

import android.os.Handler;
import com.whatsapp.profile.SetAboutInfo;

/* renamed from: X.5oL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C115235oL implements AnonymousClass4B6 {
    public final /* synthetic */ SetAboutInfo A00;

    public final void BkI(int i) {
        Handler handler = this.A00.A08;
        handler.removeMessages(0);
        handler.sendEmptyMessage(0);
    }

    public /* synthetic */ C115235oL(SetAboutInfo setAboutInfo) {
        this.A00 = setAboutInfo;
    }
}
