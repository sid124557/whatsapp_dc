package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9is  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200779is implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserJid A01;

    public final void run() {
        Activity activity = this.A00;
        activity.startActivity(C627736r.A0l(activity, this.A01, (Integer) null, true, true));
    }

    public /* synthetic */ C200779is(Activity activity, UserJid userJid) {
        this.A00 = activity;
        this.A01 = userJid;
    }
}
