package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.5Sa  reason: invalid class name and case insensitive filesystem */
public class C104705Sa {
    public final C159477lu A00;
    public final C54712pA A01;
    public final AnonymousClass4FS A02;
    public final Map A03 = AnonymousClass0x9.A1D();

    public void A01(String str) {
        this.A02.BkM(new C117205rY(this, str, 1, 3));
    }

    public void A02(String str) {
        this.A02.BkM(new C117205rY(this, str, 0, 3));
    }

    public C104705Sa(C159477lu r2, C54712pA r3, AnonymousClass4FS r4) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public void A00(UserJid userJid, String str, int i) {
        Integer A002 = C159477lu.A00(i);
        if (A002 != null) {
            this.A03.put(str, new AnonymousClass7LG(userJid, this.A01.A00(A002.intValue()), i));
        }
    }
}
