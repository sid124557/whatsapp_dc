package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.34W  reason: invalid class name */
public final class AnonymousClass34W {
    public AnonymousClass9WE A00;

    public /* synthetic */ AnonymousClass34W(AnonymousClass9WE r9, C378924l r10, int i) {
        this.A00 = AnonymousClass9WE.A00(new C60952zR((C624034w) null, (UserJid) null, (AnonymousClass39I) null, AnonymousClass213.NONE, (C30791n7) null, (Boolean) null, (List) null));
    }

    public final AnonymousClass9WE A00(C624034w r11, UserJid userJid, AnonymousClass39I r13, AnonymousClass213 r14, C30791n7 r15, Boolean bool, List list) {
        AnonymousClass9WE A002;
        AnonymousClass213 r6 = r14;
        C624034w r3 = r11;
        C30791n7 r7 = r15;
        AnonymousClass39I r5 = r13;
        UserJid userJid2 = userJid;
        Boolean bool2 = bool;
        List list2 = null;
        if (bool == null) {
            C60952zR r0 = (C60952zR) this.A00.A01;
            if (r0 != null) {
                bool2 = r0.A05;
            } else {
                bool2 = null;
            }
        }
        if (userJid == null) {
            C60952zR r02 = (C60952zR) this.A00.A01;
            if (r02 != null) {
                userJid2 = r02.A01;
            } else {
                userJid2 = null;
            }
        }
        if (r13 == null) {
            C60952zR r03 = (C60952zR) this.A00.A01;
            if (r03 != null) {
                r5 = r03.A02;
            } else {
                r5 = null;
            }
        }
        if (r15 == null) {
            C60952zR r04 = (C60952zR) this.A00.A01;
            if (r04 != null) {
                r7 = r04.A04;
            } else {
                r7 = null;
            }
        }
        if (r11 == null) {
            C60952zR r05 = (C60952zR) this.A00.A01;
            if (r05 != null) {
                r3 = r05.A00;
            } else {
                r3 = null;
            }
        }
        if (r14 == null) {
            C60952zR r06 = (C60952zR) this.A00.A01;
            if (r06 != null) {
                r6 = r06.A03;
            } else {
                r6 = null;
            }
        }
        if (list == null) {
            C60952zR r07 = (C60952zR) this.A00.A01;
            if (r07 != null) {
                list2 = r07.A06;
            }
        } else {
            list2 = list;
        }
        C60952zR r2 = new C60952zR(r3, userJid2, r5, r6, r7, bool2, list2);
        if (r2.A02 != null) {
            A002 = AnonymousClass9WE.A02(r2, new Throwable("An error occurred"));
        } else if (r2.A04 == null || (r2.A01 != null && r2.A03 == AnonymousClass213.NONE)) {
            A002 = AnonymousClass9WE.A00(r2);
        } else {
            A002 = AnonymousClass9WE.A01(r2);
        }
        this.A00 = A002;
        C162457s7.A0H(A002);
        return A002;
    }

    public AnonymousClass34W() {
        this((AnonymousClass9WE) null, (C378924l) null, 1);
    }
}
