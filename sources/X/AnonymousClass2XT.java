package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2XT  reason: invalid class name */
public final class AnonymousClass2XT {
    public final AnonymousClass4FV A00;
    public final AnonymousClass2WM A01;

    public AnonymousClass2XT(AnonymousClass4FV r2, AnonymousClass2WM r3) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(UserJid userJid, int i) {
        AnonymousClass1X1 r1 = new AnonymousClass1X1();
        r1.A00 = Integer.valueOf(i);
        if (userJid != null) {
            try {
                String A002 = this.A01.A00(userJid);
                C162457s7.A0D(A002);
                r1.A01 = C18290x4.A0h(A002);
            } catch (NumberFormatException e) {
                Log.e((Throwable) e);
            }
        }
        this.A00.BhD(r1);
    }
}
