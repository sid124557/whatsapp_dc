package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5QB  reason: invalid class name */
public class AnonymousClass5QB {
    public final C620433g A00;
    public final C105145Tt A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FS A03;

    public final void A00(UserJid userJid, Boolean bool, Integer num, Integer num2, String str, String str2, int i, int i2) {
        if (this.A02.A0X(1514)) {
            this.A03.BkM(new C117475rz(this, userJid, bool, num, num2, str, str2, i, i2));
        }
    }

    public AnonymousClass5QB(C620433g r1, C105145Tt r2, AnonymousClass1VX r3, AnonymousClass4FS r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void A01(UserJid userJid, String str, int i, int i2, int i3, boolean z) {
        UserJid userJid2 = userJid;
        A00(userJid2, Boolean.valueOf(z), Integer.valueOf(i3), Integer.valueOf(i), str, (String) null, i2, 1);
    }
}
