package X;

import com.whatsapp.jid.UserJid;
import java.util.Random;

/* renamed from: X.7Yv  reason: invalid class name and case insensitive filesystem */
public final class C152427Yv {
    public final C64773Ex A00;
    public final AnonymousClass4FV A01;
    public final AnonymousClass2X0 A02;

    public final C134016iJ A00(UserJid userJid, Boolean bool, Boolean bool2, Integer num, Long l, String str) {
        AnonymousClass3ZH A07;
        AnonymousClass3ZH A072;
        C134016iJ r2 = new C134016iJ();
        if (l == null) {
            l = Long.valueOf(new Random().nextLong());
        }
        r2.A06 = l;
        r2.A00 = bool;
        r2.A01 = bool2;
        r2.A07 = str;
        r2.A04 = num;
        Boolean bool3 = null;
        if (!(userJid == null || (A072 = this.A00.A07(userJid)) == null)) {
            bool3 = Boolean.valueOf(A072.A0R());
        }
        r2.A02 = bool3;
        Boolean bool4 = null;
        if (!(userJid == null || (A07 = this.A00.A07(userJid)) == null)) {
            bool4 = Boolean.valueOf(A07.A0Q());
        }
        r2.A03 = bool4;
        if (userJid != null) {
            r2.A08 = userJid.toString();
        }
        return r2;
    }

    public final C134046iM A01(UserJid userJid, Boolean bool, Boolean bool2, Integer num, Long l, String str) {
        C134046iM r3 = new C134046iM();
        if (l == null) {
            l = Long.valueOf(new Random().nextLong());
        }
        r3.A07 = l;
        r3.A00 = bool;
        r3.A01 = bool2;
        r3.A08 = str;
        r3.A05 = num;
        Boolean bool3 = null;
        C64773Ex r2 = this.A00;
        AnonymousClass3ZH A07 = r2.A07(userJid);
        if (A07 != null) {
            bool3 = Boolean.valueOf(A07.A0R());
        }
        r3.A02 = bool3;
        Boolean bool4 = null;
        AnonymousClass3ZH A072 = r2.A07(userJid);
        if (A072 != null) {
            bool4 = Boolean.valueOf(A072.A0Q());
        }
        r3.A03 = bool4;
        r3.A09 = String.valueOf(userJid);
        return r3;
    }

    public final boolean A02(C624134x r3) {
        if (r3 != null && r3.A1s(262144)) {
            return true;
        }
        AnonymousClass1VX r1 = this.A02.A00;
        if (!r1.A0X(1860) || !r1.A0X(6667)) {
            return false;
        }
        return true;
    }

    public C152427Yv(C64773Ex r1, AnonymousClass4FV r2, AnonymousClass2X0 r3) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
