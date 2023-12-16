package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2ca  reason: invalid class name and case insensitive filesystem */
public final class C47022ca {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C66473Lo A02;
    public final C56892sj A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass3LP A05;
    public final C56572sD A06;

    public final boolean A00(C30471mV r8) {
        AnonymousClass3ZH r4;
        C95814uZ r1 = r8.A1J.A00;
        if (r1 == null) {
            return false;
        }
        AnonymousClass3ZH A012 = this.A02.A01(r1);
        if (A012.A0U()) {
            C95814uZ A0n = r8.A0n();
            C64773Ex r12 = this.A01;
            UserJid A0D = r12.A0D((GroupJid) A012.A0I(GroupJid.class));
            AnonymousClass3ZH r5 = null;
            if (A0D != null) {
                r4 = r12.A0A(A0D);
            } else {
                r4 = null;
            }
            PhoneUserJid A042 = C56972sr.A04(this.A00);
            if (A0n != null) {
                r5 = r12.A0A(A0n);
            }
            C27991fJ r13 = (C27991fJ) AnonymousClass3ZH.A04(A012);
            if (r13 != null && this.A03.A0G(r13)) {
                return true;
            }
            if (r4 != null && (r4.A0F != null || AnonymousClass75J.A00(A042, r4.A0H))) {
                return true;
            }
            if (r5 != null && r5.A0F != null) {
                return true;
            }
            C95814uZ A013 = AnonymousClass3ZH.A01(A012);
            if (A013 == null || this.A06.A00(A013) != 1) {
                return false;
            }
            return true;
        } else if (A012.A0F != null || C57362tW.A00(this.A05, A012.A0H)) {
            return true;
        } else {
            C95814uZ A014 = AnonymousClass3ZH.A01(A012);
            if (A014 == null || this.A06.A00(A014) != 1) {
                return false;
            }
            if (A012.A08 == 3 || this.A04.A0Y(C58422vE.A02, 5517)) {
                return true;
            }
            return false;
        }
    }

    public C47022ca(C56972sr r1, C64773Ex r2, C66473Lo r3, C56892sj r4, AnonymousClass1VX r5, AnonymousClass3LP r6, C56572sD r7) {
        C18260x0.A0f(r5, r1, r7, r6, r2);
        C18260x0.A0U(r4, r3);
        this.A04 = r5;
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
