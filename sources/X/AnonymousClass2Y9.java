package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.2Y9  reason: invalid class name */
public final class AnonymousClass2Y9 {
    public final C621133n A00;
    public final AnonymousClass2SC A01;

    public AnonymousClass2Y9(C621133n r2, AnonymousClass2SC r3) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean A00(UserJid userJid, String str, String str2) {
        Iterator A0v = AnonymousClass001.A0v(this.A00.A0G(C18290x4.A13(AnonymousClass36G.A03(userJid))));
        if (!A0v.hasNext()) {
            return false;
        }
        return AnonymousClass36G.A07(((C47932e4) A0v.next()).A00, Base64.decode(str, 2), Base64.decode(str2, 2));
    }
}
