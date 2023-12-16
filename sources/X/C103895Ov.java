package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Ov  reason: invalid class name and case insensitive filesystem */
public final class C103895Ov {
    public final C69263Wi A00;
    public final C621033m A01;
    public final C56962sq A02;
    public final C29441ip A03;
    public final C64773Ex A04;
    public final C56982ss A05;
    public final C28891hw A06;
    public final AnonymousClass5QF A07;
    public final C66493Lq A08;
    public final C66503Lr A09;

    public final void A00(List list, int i, int i2, int i3, int i4) {
        long j;
        int i5 = i;
        if (i5 != -1) {
            Boolean bool = Boolean.TRUE;
            C29441ip r2 = this.A03;
            if (!r2.A0F()) {
                this.A00.A0H(R.string.f11nameremoved, 0);
                return;
            }
            List list2 = list;
            Iterator it = list2.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                C95814uZ A0P = C18300x5.A0P(it);
                C56982ss r1 = this.A05;
                C64773Ex r0 = this.A04;
                C162457s7.A0H(A0P);
                if (AnonymousClass352.A00(r0, r1, A0P) == 0) {
                    i6++;
                }
                if (i5 != -1) {
                    if (!r2.A0F()) {
                        this.A00.A0H(R.string.f11nameremoved, 1);
                    } else {
                        C626936e.A06(A0P);
                        boolean z = A0P instanceof UserJid;
                        if (!z || !this.A02.A0P((UserJid) A0P)) {
                            boolean z2 = A0P instanceof C27991fJ;
                            if (z2) {
                                C162457s7.A0H(A0P);
                                C66503Lr r12 = this.A09;
                                C162457s7.A0K(A0P, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                                C27991fJ r02 = (C27991fJ) A0P;
                                r12.A0B(new AnonymousClass1FE(this.A06, this.A08, r02, (String) null, (List) null, 224), r02, i5);
                            } else if (z) {
                                C162457s7.A0H(A0P);
                                C621033m r13 = this.A01;
                                C162457s7.A0K(A0P, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                                r13.A0M((UserJid) A0P, bool, i5, 3);
                            } else {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("Ephemeral not supported for this type of jid, type=");
                                C162457s7.A0H(A0P);
                                C18270x1.A1F(A0o, A0P.getType());
                            }
                            AnonymousClass5QF r11 = this.A07;
                            C162457s7.A0J(A0P, 0);
                            C94704rm r10 = new C94704rm();
                            r10.A02 = AnonymousClass0x9.A0m(i5);
                            int i7 = i2;
                            if (i7 == -1) {
                                j = 0;
                            } else {
                                j = (long) i7;
                            }
                            r10.A03 = Long.valueOf(j);
                            r10.A00 = C18290x4.A0b();
                            r10.A04 = r11.A03.A04(A0P.getRawString());
                            if (z2) {
                                C56892sj r14 = r11.A00;
                                C27991fJ A032 = AnonymousClass34R.A03(A0P);
                                C626936e.A06(A032);
                                C129526aS A042 = C56892sj.A01(r14, A032).A04();
                                C162457s7.A0D(A042);
                                r10.A01 = Integer.valueOf(AnonymousClass36M.A03(A042.size()));
                            }
                            r11.A02.BhD(r10);
                        } else {
                            int i8 = R.string.f11nameremoved;
                            if (i == 0) {
                                i8 = R.string.f11nameremoved;
                            }
                            this.A00.A0H(i8, 1);
                        }
                    }
                }
            }
            AnonymousClass5QF r15 = this.A07;
            int i9 = i4;
            r15.A01(list2, 3, i5, i6, i3, i9);
            if (list2.size() > 0) {
                r15.A00(2, i9);
            }
        }
    }

    public C103895Ov(C69263Wi r2, C621033m r3, C56962sq r4, C29441ip r5, C64773Ex r6, C56982ss r7, C28891hw r8, AnonymousClass5QF r9, C66493Lq r10, C66503Lr r11) {
        C18260x0.A0f(r2, r7, r3, r6, r4);
        C18260x0.A0W(r10, r11, r8);
        C162457s7.A0J(r5, 10);
        this.A00 = r2;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A08 = r10;
        this.A09 = r11;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r5;
    }
}
