package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.32c  reason: invalid class name and case insensitive filesystem */
public final class C617532c {
    public final C56892sj A00;
    public final AnonymousClass4FV A01;

    public static final void A00(C25251aD r2, C95814uZ r3, C30451mT r4) {
        int A02;
        AnonymousClass2z0 r0;
        if (r3 == null) {
            if (r4 == null || (r0 = r4.A1J) == null) {
                r3 = null;
            } else {
                r3 = r0.A00;
            }
        }
        boolean A1Q = AnonymousClass0x9.A1Q(r2.A00);
        if (r3 instanceof C95804uY) {
            A02 = 5;
        } else if (r3 instanceof UserJid) {
            A02 = 1;
        } else if (r3 instanceof C135166kE) {
            A02 = 3;
        } else if (r3 instanceof AnonymousClass1fS) {
            A02 = 4;
        } else {
            A02 = C18310x6.A02(A1Q ? 1 : 0);
        }
        r2.A02 = Integer.valueOf(A02);
    }

    public static final void A01(C25251aD r4, C30451mT r5) {
        long j = r5.A0K;
        r4.A05 = Long.valueOf(C18280x3.A08(j, j % 86400000));
        r4.A06 = AnonymousClass0x9.A0m(r5.A05.size());
    }

    public final void A02(C25251aD r3, C95814uZ r4) {
        boolean z = r4 instanceof C27991fJ;
        r3.A00 = Boolean.valueOf(z);
        if (z) {
            C56892sj r1 = this.A00;
            r3.A01 = Boolean.valueOf(r1.A0D((GroupJid) r4));
            r3.A03 = Integer.valueOf(AnonymousClass36M.A04(r1.A09.A03((C28011fL) r4)));
        }
    }

    public C617532c(C56892sj r1, AnonymousClass4FV r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
