package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2af  reason: invalid class name and case insensitive filesystem */
public class C45842af {
    public final C55052pi A00;
    public final C59792xU A01;
    public final C103265Mf A02;
    public final C45602aH A03;

    public final void A00(AnonymousClass2UJ r4) {
        C51102jH r0;
        UserJid userJid = r4.A0D;
        if (userJid != null) {
            boolean equals = "image".equals(r4.A0G);
            C45602aH r02 = this.A03;
            C626936e.A06(userJid);
            if (equals) {
                r0 = r02.A01;
            } else {
                r0 = r02.A02;
            }
            r0.A01(userJid);
        }
    }

    public C45842af(C55052pi r1, C59792xU r2, C103265Mf r3, C45602aH r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
