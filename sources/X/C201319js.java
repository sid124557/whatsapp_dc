package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9js  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201319js implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C196249aX A02;
    public final /* synthetic */ String A03;

    public final void run() {
        C196249aX r0 = this.A02;
        String str = this.A03;
        Activity activity = this.A00;
        UserJid userJid = this.A01;
        ((C66413Li) r0.A0L.get()).A00(AnonymousClass227.A0D, str);
        AnonymousClass9WU.A00(new C200779is(activity, userJid));
    }

    public /* synthetic */ C201319js(Activity activity, UserJid userJid, C196249aX r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = activity;
        this.A01 = userJid;
    }
}
