package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3E6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3E6 implements AnonymousClass49D {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C49522gf A02;
    public final /* synthetic */ UserJid A03;

    public final void BrK() {
        C49522gf r0 = this.A02;
        Activity activity = this.A00;
        Intent intent = this.A01;
        r0.A01.A0D(activity, new C85704Hh(AnonymousClass0x9.A14(activity), 1, intent), this.A03);
    }

    public /* synthetic */ AnonymousClass3E6(Activity activity, Intent intent, C49522gf r3, UserJid userJid) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = intent;
        this.A03 = userJid;
    }
}
