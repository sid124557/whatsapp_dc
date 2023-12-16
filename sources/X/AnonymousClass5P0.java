package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5P0  reason: invalid class name */
public final class AnonymousClass5P0 {
    public C183538qC A00;
    public final C102465Iy A01;
    public final C56972sr A02;
    public final C113955mG A03;
    public final C42712Pf A04;
    public final C56982ss A05;
    public final C66473Lo A06;
    public final C56892sj A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass3LP A09;
    public final C103985Pe A0A;
    public final C56072rN A0B;

    public final boolean A00(AnonymousClass3ZH r10, C95814uZ r11) {
        boolean A042;
        AnonymousClass1RL r1;
        C95804uY r112;
        C162457s7.A0J(r10, 0);
        if (r11 != null && !C57362tW.A00(this.A09, r11)) {
            AnonymousClass1VX r12 = this.A08;
            if (!C616831v.A00(r12, r11)) {
                UserJid A032 = AnonymousClass32Y.A03(r11);
                C102465Iy r7 = this.A01;
                AnonymousClass1VX r6 = r7.A01;
                C56422rx r5 = r7.A00;
                AnonymousClass3LP r4 = r7.A02;
                if (!C57172tD.A00(r5, r6, r4, A032) && !C615431g.A00(r5, r6, r4, A032, r7.A03)) {
                    if (r10.A0H instanceof C95804uY) {
                        AnonymousClass31A A0A2 = this.A05.A0A(r11, false);
                        if ((A0A2 instanceof AnonymousClass1RL) && (r1 = (AnonymousClass1RL) A0A2) != null && r1.A0K()) {
                            C103985Pe r13 = this.A0A;
                            if (r11 instanceof C95804uY) {
                                r112 = (C95804uY) r11;
                            } else {
                                r112 = null;
                            }
                            A042 = r13.A01(r112);
                        }
                    } else if (r10.A0T() && !AnonymousClass75P.A00(r12)) {
                        return true;
                    } else {
                        if (r10.A0H instanceof AnonymousClass1fS) {
                            r12.A0X(5968);
                        }
                        if (r12.A0X(6187)) {
                            C113955mG r0 = this.A03;
                            if (r0.A00.A0P(AnonymousClass3ZH.A07(r10))) {
                                return true;
                            }
                        }
                        if (!r10.A0U()) {
                            return false;
                        }
                        GroupJid groupJid = (GroupJid) AnonymousClass3ZH.A04(r10);
                        if (groupJid != null && this.A07.A0C(groupJid)) {
                            A042 = this.A0B.A04(r10, groupJid);
                        }
                    }
                    if (!A042) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public AnonymousClass5P0(C102465Iy r2, C56972sr r3, C113955mG r4, C42712Pf r5, C56982ss r6, C66473Lo r7, C56892sj r8, AnonymousClass1VX r9, AnonymousClass3LP r10, C103985Pe r11, C56072rN r12) {
        C18260x0.A0d(r9, r3, r6, r10);
        C162457s7.A0J(r12, 6);
        C18260x0.A0X(r8, r11, r7);
        C162457s7.A0J(r5, 11);
        this.A08 = r9;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A09 = r10;
        this.A0B = r12;
        this.A03 = r4;
        this.A07 = r8;
        this.A0A = r11;
        this.A06 = r7;
        this.A04 = r5;
    }
}
