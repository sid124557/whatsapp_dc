package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3PJ  reason: invalid class name */
public final class AnonymousClass3PJ implements AnonymousClass4D2 {
    public final C56972sr A00;
    public final C52352lL A01;

    public AnonymousClass3PJ(C56972sr r1, C52352lL r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(AnonymousClass1A3 r4, C624134x r5) {
        DeviceJid A002;
        if (r5.A1n()) {
            C172548Lq A09 = C18270x1.A09(r4, r5.A1a);
            AnonymousClass1ES r1 = (AnonymousClass1ES) r4.A00;
            r1.bitField1_ |= 4;
            r1.messageSecret_ = A09;
            if (r5.A1J.A02 && (A002 = this.A01.A00(r5)) != null) {
                UserJid userJid = A002.userJid;
                if (!this.A00.A0a(userJid)) {
                    String A07 = C627336j.A07(userJid);
                    if (!C107575bX.A0F(A07)) {
                        AnonymousClass1ES A0X = C18310x6.A0X(r4);
                        A07.getClass();
                        A0X.bitField1_ |= 16;
                        A0X.originalSelfAuthorUserJidString_ = A07;
                    }
                }
            }
        }
    }

    public void BYV(C52952mJ r1, AnonymousClass1A3 r2, C624134x r3) {
        C18260x0.A0O(r3, r2);
        A00(r2, r3);
    }

    public void BYW(C50972j4 r2, AnonymousClass1ES r3, C624134x r4) {
        C18260x0.A0O(r3, r4);
        if ((r3.bitField1_ & 4) != 0) {
            r4.A1a = r3.messageSecret_.A07();
        }
    }
}
