package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2h0  reason: invalid class name and case insensitive filesystem */
public final class C49732h0 {
    public int A00;
    public UserJid A01;
    public boolean A02;
    public boolean A03;
    public final C54712pA A04;

    public final void A00(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        if (this.A03) {
            Log.w("onStart: can be called only once per instance");
            return;
        }
        this.A03 = true;
        this.A01 = userJid;
        this.A00 = this.A04.A00(897463359);
    }

    public final void A01(AnonymousClass4GQ r2) {
        String str;
        if (this.A02) {
            Log.d("onLoggable: this instance has completed logging");
            return;
        }
        if (!this.A03) {
            str = "onLoggable: onStart was not called?";
        } else {
            this.A02 = true;
            UserJid userJid = this.A01;
            if (userJid != null) {
                r2.invoke(userJid);
                return;
            }
            str = "onLoggable: bizJid should not be null by this moment!";
        }
        Log.e(str);
    }

    public C49732h0(C54712pA r1) {
        this.A04 = r1;
    }
}
