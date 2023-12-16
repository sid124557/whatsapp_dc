package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2hv  reason: invalid class name and case insensitive filesystem */
public class C50282hv {
    public final C116985rC A00;
    public final C56422rx A01;
    public final C48952fk A02;
    public final C49772h4 A03;
    public final C56982ss A04;
    public final C56892sj A05;
    public final AnonymousClass3LP A06;
    public final C52472lX A07;

    public boolean A00(AnonymousClass3ZH r3, C27991fJ r4) {
        C56892sj r0 = this.A05;
        boolean A0C = r0.A0C(r4);
        boolean A0D = r0.A0D(r4);
        if (!A0C || ((!A0D && r3.A14) || this.A04.A06(r4) == 3 || this.A07.A00(r3))) {
            return false;
        }
        return true;
    }

    public boolean A01(UserJid userJid) {
        if (this.A01.A03(userJid)) {
            return false;
        }
        C116985rC r1 = this.A00;
        if ((r1.A07() && ((C1229766o) r1.A04()).BH2(userJid)) || C57362tW.A00(this.A06, userJid) || this.A03.A00(userJid) != null) {
            return false;
        }
        C48952fk r0 = this.A02;
        if (userJid == null || !r0.A00(userJid)) {
            return true;
        }
        return false;
    }

    public C50282hv(C116985rC r1, C56422rx r2, C48952fk r3, C49772h4 r4, C56982ss r5, C56892sj r6, AnonymousClass3LP r7, C52472lX r8) {
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
        this.A07 = r8;
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
    }
}
