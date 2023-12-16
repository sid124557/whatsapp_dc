package X;

import android.os.Handler;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.5Qu  reason: invalid class name and case insensitive filesystem */
public class C104395Qu {
    public Handler A00;
    public Runnable A01;
    public final C64773Ex A02;
    public final C56612sH A03;
    public final C56982ss A04;
    public final C56892sj A05;
    public final AnonymousClass4FV A06;
    public final AnonymousClass30N A07;
    public final C66493Lq A08;
    public final AnonymousClass2X6 A09;

    public void A00(AnonymousClass314 r5, C95814uZ r6, Integer num, int i) {
        if (r6 != null) {
            C94534rV r2 = new C94534rV();
            r2.A00 = num;
            int i2 = 4;
            if (i != 1) {
                if (i == 2) {
                    i2 = 7;
                } else if (i != 3) {
                    i2 = 5;
                    if (i != 4) {
                        i2 = 6;
                        if (i == 6) {
                            i2 = 3;
                        } else if (i != 7) {
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 2;
                }
            }
            r2.A01 = Integer.valueOf(i2);
            r2.A03 = this.A07.A04(r6.getRawString());
            C56982ss r0 = r5.A02;
            r0.A0G();
            r2.A02 = AnonymousClass0x9.A0m(r0.A04(r6));
            this.A06.BhD(r2);
        }
    }

    public void A01(C624134x r8, int i, boolean z) {
        int A0S;
        Boolean bool;
        C94844s6 r2 = new C94844s6();
        boolean z2 = true;
        if (z) {
            A0S = 1;
        } else {
            A0S = C18280x3.A0S();
        }
        r2.A03 = A0S;
        C95814uZ r4 = r8.A1J.A00;
        if (r4 != null) {
            C56982ss r0 = this.A04;
            C64773Ex r5 = this.A02;
            r2.A05 = AnonymousClass0x9.A0m(AnonymousClass352.A00(r5, r0, r4));
            if (C627336j.A0K(r4)) {
                C56892sj r3 = this.A05;
                GroupJid groupJid = (GroupJid) r4;
                boolean A0C = r3.A0C(groupJid);
                boolean A0D = r3.A0D(groupJid);
                if (!A0C || !A0D) {
                    z2 = false;
                }
                r2.A02 = Boolean.valueOf(z2);
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            r2.A01 = bool;
            AnonymousClass3ZH A072 = r5.A07(r4);
            if ((r4 instanceof C27991fJ) && A072 != null) {
                r2.A00 = Boolean.valueOf(this.A08.A0e(A072, (C27991fJ) r4));
            }
        }
        r2.A04 = Integer.valueOf(C106215Yb.A00(i, z));
        this.A06.BhD(r2);
    }

    public C104395Qu(C64773Ex r1, C56612sH r2, C56982ss r3, C56892sj r4, AnonymousClass4FV r5, AnonymousClass30N r6, C66493Lq r7, AnonymousClass2X6 r8) {
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = r5;
        this.A02 = r1;
        this.A08 = r7;
        this.A07 = r6;
        this.A05 = r4;
        this.A09 = r8;
    }
}
