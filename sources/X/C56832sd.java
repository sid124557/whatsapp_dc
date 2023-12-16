package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2sd  reason: invalid class name and case insensitive filesystem */
public class C56832sd {
    public final C55682qk A00;
    public final C56972sr A01;
    public final AnonymousClass35J A02;
    public final C45562aD A03;

    public C30341mI A02(GroupJid groupJid, String str, List list, int i, int i2, long j) {
        C31891p1 r0;
        AnonymousClass35J r2 = this.A02;
        AnonymousClass2z0 A04 = r2.A04(groupJid, true);
        if (i == 2) {
            r0 = C31891p1.A02(r2.A04(groupJid, true), i, j);
        } else {
            C31521oQ r02 = new C31521oQ(A04, j);
            r02.A00 = i2;
            r0 = r02;
        }
        r0.A1Z(str);
        if (list != null) {
            r0.A01 = list;
        }
        return r0;
    }

    public C31891p1 A06(C620833k r9, C28011fL r10, AnonymousClass39T r11, int i, long j) {
        C31891p1 r2;
        int i2 = i;
        C626936e.A0D(AnonymousClass34J.A00(i), AnonymousClass000.A0Y("Not supposed to be used for action = ", AnonymousClass001.A0o(), i));
        boolean z = true;
        AnonymousClass39T r4 = r11;
        long j2 = j;
        if (r11 != null) {
            C620833k r3 = r9;
            if (i == 1) {
                r2 = new C31611oZ(r9, r11, j);
            } else if (i == 56) {
                r2 = new C31591oX(r9, r11, j);
            } else {
                r2 = new C31891p1(r3, r4, i2, j2);
            }
            r2.A1O = r11.A00;
            return r2;
        }
        if (r10 == null) {
            z = false;
        }
        C626936e.A0C(z);
        return (C31891p1) this.A03.A00(A00(r10, this), i, j);
    }

    public static AnonymousClass2z0 A00(C95814uZ r2, C56832sd r3) {
        return r3.A02.A04(r2, true);
    }

    public static AnonymousClass2z0 A01(C95814uZ r1, C56832sd r2, boolean z) {
        return r2.A02.A04(r1, z);
    }

    public C30341mI A03(C27991fJ r8, UserJid userJid, AnonymousClass39T r10, int i, long j) {
        C31591oX r0 = (C31591oX) A06((C620833k) null, r8, r10, 56, j);
        r0.A1J(userJid);
        r0.A00 = i;
        return r0;
    }

    public C30341mI A04(C27991fJ r8, C60912zN r9, AnonymousClass39T r10, boolean z) {
        long millis = TimeUnit.SECONDS.toMillis(r9.A00);
        int i = 27;
        if (z) {
            i = 131;
        }
        C31891p1 A06 = A06((C620833k) null, r8, r10, i, millis);
        A06.A1Z(r9.A03);
        A06.A1J(r9.A02);
        return A06;
    }

    public C31341o8 A08(C95814uZ r6, UserJid userJid, UserJid userJid2, long j) {
        C55682qk r2;
        C31341o8 r3 = new C31341o8(this.A02.A04(r6, true), 28, j);
        if (userJid == null && (r2 = r3.A03) != null) {
            r2.A0A("InvalidNumberChangeJid", true, "oldJid = null");
        }
        r3.A01 = userJid;
        r3.A1w(userJid2);
        return r3;
    }

    public final void A0A(UserJid userJid, C31891p1 r3, boolean z) {
        if (this.A01.A0a(userJid)) {
            r3.A00 = 1;
        }
        if (!z) {
            r3.A1J(userJid);
        }
    }

    public C56832sd(C55682qk r1, C56972sr r2, AnonymousClass35J r3, C45562aD r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public C31891p1 A05(C620833k r14, C28011fL r15, UserJid userJid, AnonymousClass39T r17, List list, int i, long j, long j2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SystemMessageFactory/newParticipantsStatusMessage; stanzaKey=");
        AnonymousClass39T r3 = r17;
        A0o.append(r3);
        A0o.append("; gjid=");
        A0o.append(r15);
        A0o.append("; action=");
        int i2 = i;
        A0o.append(i2);
        UserJid userJid2 = userJid;
        C18260x0.A1R(A0o, "; author=", userJid2);
        C31891p1 A06 = A06(r14, r15, r3, i2, j);
        A09(userJid2, A06, list, i2, j2);
        return A06;
    }

    public C31891p1 A07(C28011fL r12, UserJid userJid, AnonymousClass39T r14, int i, long j, long j2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SystemMessageFactory/newParticipantStatusMessage; stanzaKey=");
        A0o.append(r14);
        A0o.append("; gjid=");
        A0o.append(r12);
        C18260x0.A0y("; action=", A0o, i);
        C31891p1 A06 = A06((C620833k) null, r12, r14, i, j);
        A06.A1J(userJid);
        A06.A03 = j2;
        if (i == 4 && this.A01.A0a(userJid)) {
            A06.A00 = 1;
        }
        return A06;
    }

    public final void A09(UserJid userJid, C31891p1 r3, List list, int i, long j) {
        r3.A1J(userJid);
        r3.A1h(list);
        r3.A03 = j;
        if (C627636p.A0K(i) && list.contains(C56972sr.A04(this.A01))) {
            r3.A00 = 1;
        }
    }
}
