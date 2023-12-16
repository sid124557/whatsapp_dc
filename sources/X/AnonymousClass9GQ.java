package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9GQ  reason: invalid class name */
public class AnonymousClass9GQ extends AnonymousClass5ZM {
    public final C66543Lv A00;
    public final Runnable A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        synchronized (this) {
            C66543Lv r1 = this.A00;
            r1.A0O((C95814uZ) null, (UserJid) null);
            r1.A0H();
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }

    public AnonymousClass9GQ(C66543Lv r1, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = r1;
    }
}
