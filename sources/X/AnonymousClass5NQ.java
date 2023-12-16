package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5NQ  reason: invalid class name */
public final class AnonymousClass5NQ {
    public final C69263Wi A00;
    public final C85244Fm A01;
    public final C620633i A02;

    public final C88944b3 A00(Context context, C624134x r11, String str) {
        int i;
        Context context2 = context;
        C88944b3 r3 = new C88944b3(context2, this.A01, this.A00, this.A02, str);
        if (r11 instanceof C30481mW) {
            r3.A01 = ((C30481mW) r11).A00;
            r3.A04 = true;
        }
        C95814uZ r1 = r11.A1J.A00;
        if (C627336j.A0K(r1)) {
            i = 3;
        } else if (r1 instanceof UserJid) {
            r3.A00 = 2;
            return r3;
        } else if (r1 instanceof C135166kE) {
            i = 1;
        } else {
            if (r1 instanceof C95804uY) {
                i = 6;
            }
            return r3;
        }
        r3.A00 = i;
        return r3;
    }

    public AnonymousClass5NQ(C69263Wi r1, C85244Fm r2, C620633i r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
