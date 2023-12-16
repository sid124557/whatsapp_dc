package X;

import com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher;
import com.whatsapp.messaging.offline.DelayedStanzasFetcher$onAppForegrounded$1;
import com.whatsapp.util.Log;

/* renamed from: X.3CL  reason: invalid class name */
public final class AnonymousClass3CL implements AnonymousClass4CD {
    public final AnonymousClass66R A00;
    public final AnonymousClass66R A01;
    public final AnonymousClass4C6 A02;
    public volatile boolean A03 = true;

    public AnonymousClass3CL(AnonymousClass1VX r2, AnonymousClass31C r3, AnonymousClass4C6 r4) {
        C18270x1.A10(r2, 1, r3);
        this.A02 = r4;
        this.A00 = C154517dI.A01(new C78863vh(r3));
        this.A01 = C154517dI.A01(new C78873vi(r2));
    }

    public void onAppBackgrounded() {
        this.A03 = true;
    }

    public void BMV() {
        Log.d("DelayedStanzasManager/onAppForegrounded");
        this.A03 = false;
        if (((DelayedStanzasFetcher$StanzaFetcher) this.A00.getValue()).A01.get() && C18270x1.A1V(this.A01)) {
            Log.i("DelayedStanzasManager/onAppForegrounded pulling delayed notifications");
            C616131n.A02((C85494Gl) null, new DelayedStanzasFetcher$onAppForegrounded$1(this, (C84814Du) null), this.A02, (AnonymousClass20D) null, 3);
        }
    }
}
