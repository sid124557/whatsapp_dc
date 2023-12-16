package X;

import com.whatsapp.util.Log;

/* renamed from: X.9fQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198749fQ implements Runnable {
    public final /* synthetic */ AnonymousClass99P A00;

    public final void run() {
        AnonymousClass99P r3 = this.A00;
        Log.d("Bloks: BloksPayloadUtil: shouldConnectIgServer = false");
        if (!r3.A0G() || !r3.A0H()) {
            r3.A0F((C85034Er) null, "daily_cron_job", true);
        }
    }

    public /* synthetic */ C198749fQ(AnonymousClass99P r1) {
        this.A00 = r1;
    }
}
