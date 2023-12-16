package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2Xt  reason: invalid class name and case insensitive filesystem */
public final class C44862Xt {
    public final AnonymousClass4FV A00;
    public final AnonymousClass2WM A01;

    public C44862Xt(AnonymousClass4FV r2, AnonymousClass2WM r3) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(C52842m8 r3, UserJid userJid, int i) {
        AnonymousClass1ZM r1 = new AnonymousClass1ZM();
        r1.A03 = Integer.valueOf(i);
        if (r3 != null) {
            if (r3.A01 != null) {
                r1.A00 = Boolean.TRUE;
            }
            if (r3.A02 != null) {
                r1.A01 = Boolean.TRUE;
            }
            if (r3.A00 != null) {
                r1.A02 = Boolean.TRUE;
            }
        }
        if (userJid != null) {
            try {
                String A002 = this.A01.A00(userJid);
                C162457s7.A0D(A002);
                r1.A04 = C18290x4.A0h(A002);
            } catch (NumberFormatException e) {
                Log.e((Throwable) e);
            }
        }
        this.A00.BhD(r1);
    }
}
