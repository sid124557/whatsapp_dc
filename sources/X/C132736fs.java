package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;

/* renamed from: X.6fs  reason: invalid class name and case insensitive filesystem */
public class C132736fs extends AnonymousClass5TY {
    public final BroadcastReceiver A00 = new C188678zJ(this, 2);
    public final Context A01;
    public final C620633i A02;

    public void A01() {
        C154317cy.A01(this.A00, this.A01, new IntentFilter("android.intent.action.HEADSET_PLUG"), true);
    }

    public void A02() {
        this.A01.unregisterReceiver(this.A00);
    }

    public boolean A03() {
        AudioManager A0G = this.A02.A0G();
        if (A0G == null) {
            return false;
        }
        return A0G.isWiredHeadsetOn();
    }

    public C132736fs(Context context, C620633i r4) {
        this.A01 = context;
        this.A02 = r4;
    }
}
