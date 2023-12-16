package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.6Cb  reason: invalid class name and case insensitive filesystem */
public class C124386Cb extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass7KB A00;

    public C124386Cb(AnonymousClass7KB r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (C18280x3.A1V(intent, "android.media.AUDIO_BECOMING_NOISY")) {
            for (C113895mA A04 : this.A00.A02) {
                A04.A04();
            }
        }
    }
}
