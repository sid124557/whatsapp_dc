package X;

import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.5Um  reason: invalid class name and case insensitive filesystem */
public final class C105325Um {
    public final C111095hX A00;
    public final C69263Wi A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final C56842se A04;
    public final AnonymousClass5YD A05;
    public final AnonymousClass32F A06;
    public final AnonymousClass3S7 A07;
    public final C55952rB A08;
    public final AnonymousClass4FS A09;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C89654ea r6, int r7, int r8) {
        /*
            r5 = this;
            r4 = 0
            X.C162457s7.A0J(r6, r4)
            r1 = -1
            if (r8 == r1) goto L_0x0011
            boolean r0 = r5.A09()
            if (r0 == 0) goto L_0x0011
            r5.A02(r6, r8, r1)
        L_0x0010:
            return
        L_0x0011:
            X.2rB r0 = r5.A08     // Catch:{ IllegalArgumentException -> 0x0026 }
            X.2rs r0 = r0.A06     // Catch:{ IllegalArgumentException -> 0x0026 }
            int r1 = r0.A00(r7)     // Catch:{ IllegalArgumentException -> 0x0026 }
            r0 = 1
            if (r1 < r0) goto L_0x0023
            r0 = 400(0x190, float:5.6E-43)
            if (r1 >= r0) goto L_0x0023
            X.585 r3 = X.AnonymousClass585.TRUE     // Catch:{ IllegalArgumentException -> 0x0026 }
            goto L_0x0028
        L_0x0023:
            X.585 r3 = X.AnonymousClass585.FALSE     // Catch:{ IllegalArgumentException -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            X.585 r3 = X.AnonymousClass585.ERROR
        L_0x0028:
            int r0 = r3.ordinal()
            r2 = 1
            if (r0 == r2) goto L_0x004f
            r1 = 2
            if (r0 == r1) goto L_0x004f
            if (r0 != r4) goto L_0x0010
            X.585 r0 = r5.A00(r7)
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x0078
            if (r0 == r1) goto L_0x0071
            if (r0 != r4) goto L_0x0010
            X.1VX r0 = r5.A03
            int r0 = X.C106505Zg.A00(r0)
            if (r7 == r0) goto L_0x0078
            r0 = -1
            r5.A02(r6, r8, r0)
            return
        L_0x004f:
            X.585 r0 = X.AnonymousClass585.ERROR
            if (r3 != r0) goto L_0x006f
            r5.A01(r7)
        L_0x0056:
            X.1VX r1 = r5.A03
            r0 = 3946(0xf6a, float:5.53E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0078
            if (r2 != 0) goto L_0x0071
            java.lang.ref.WeakReference r1 = X.AnonymousClass0x9.A14(r6)
            X.63H r0 = new X.63H
            r0.<init>(r5, r1, r7)
            r5.A08(r6, r0, r7)
            return
        L_0x006f:
            r2 = 0
            goto L_0x0056
        L_0x0071:
            r0 = 2131891130(0x7f1213ba, float:1.9416971E38)
            r6.Bot(r0)
            return
        L_0x0078:
            java.lang.ref.WeakReference r1 = X.AnonymousClass0x9.A14(r6)
            X.1VX r0 = r5.A03
            int r0 = X.C106505Zg.A00(r0)
            if (r7 != r0) goto L_0x0089
            r0 = 0
        L_0x0085:
            r5.A07(r6, r0, r7)
            return
        L_0x0089:
            X.5z8 r0 = new X.5z8
            r0.<init>(r5, r1)
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105325Um.A02(X.4ea, int, int):void");
    }

    public final void A04(C89654ea r3, C95804uY r4, AnonymousClass4GQ r5, int i) {
        AnonymousClass581 r0;
        C162457s7.A0J(r3, 0);
        AnonymousClass63W r02 = new AnonymousClass63W(r4, this, AnonymousClass0x9.A14(r3), i);
        if (r5 == null) {
            r5 = r02;
        }
        if (i == 12) {
            r0 = AnonymousClass581.ADMIN_INVITE;
        } else {
            r0 = AnonymousClass581.CONSUMER;
        }
        A05(r3, r0, r5);
    }

    public final void A05(C89654ea r8, AnonymousClass581 r9, AnonymousClass4GQ r10) {
        AnonymousClass585 r0;
        int A1Y = AnonymousClass0x2.A1Y(r8, r9);
        if (A09()) {
            r10.invoke(Boolean.FALSE);
            return;
        }
        AnonymousClass1VX r3 = this.A03;
        int A022 = C106505Zg.A02(r3, r9);
        try {
            int A002 = this.A08.A06.A00(A022);
            if (A002 < A1Y || A002 >= 400) {
                r0 = AnonymousClass585.FALSE;
            } else {
                r0 = AnonymousClass585.TRUE;
            }
        } catch (IllegalArgumentException unused) {
            r0 = AnonymousClass585.ERROR;
        }
        int ordinal = r0.ordinal();
        if (ordinal != A1Y) {
            if (ordinal == 2) {
                A01(A022);
                if (!r3.A0X(3946)) {
                    r8.Bot(R.string.f11nameremoved);
                    return;
                }
            } else if (ordinal != 0) {
                return;
            }
            A06(r8, r9, r10);
            return;
        }
        A08(r8, new AnonymousClass63R(r8, r9, this, r10), C106505Zg.A02(r3, r9));
    }

    public final void A07(C89654ea r10, AnonymousClass4GP r11, int i) {
        WeakReference A14 = AnonymousClass0x9.A14(r10);
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass4GP r5 = r11;
        AnonymousClass32F.A00(r10, AnonymousClass5W0.A05, new C115175oF(r10, r5, new C119955xo(this), new C119965xp(this), new AnonymousClass631(this, A14)), valueOf, (String) null);
    }

    public final AnonymousClass585 A00(int i) {
        try {
            if (this.A08.A05(i)) {
                return AnonymousClass585.TRUE;
            }
            return AnonymousClass585.FALSE;
        } catch (IllegalArgumentException unused) {
            return AnonymousClass585.ERROR;
        }
    }

    public final void A01(int i) {
        if (this.A03.A0X(3992)) {
            this.A07.BEx(C18290x4.A12(new C622234e(i, 0, 1, this.A02.A0D(), 2)), false, true);
        }
    }

    public final void A03(C89654ea r6, AnonymousClass1RL r7, int i) {
        if (r7.A00 > 0) {
            A04(r6, r7.A0I(), (AnonymousClass4GQ) null, i);
            return;
        }
        this.A04.A03(r7, new C120945zQ(r7, this, AnonymousClass0x9.A14(r6), i));
    }

    public final void A06(C89654ea r10, AnonymousClass581 r11, AnonymousClass4GQ r12) {
        AnonymousClass1VX r3 = this.A03;
        AnonymousClass585 A002 = A00(C106505Zg.A02(r3, r11));
        int ordinal = A002.ordinal();
        AnonymousClass4GQ r8 = r12;
        if (ordinal == 1 || ordinal == 2) {
            C89654ea r4 = r10;
            if (A002 != AnonymousClass585.ERROR || r3.A0X(3946)) {
                Integer valueOf = Integer.valueOf(C106505Zg.A02(r3, r11));
                AnonymousClass32F.A00(r10, AnonymousClass5W0.A05, new C115175oF(r4, (AnonymousClass4GP) null, (AnonymousClass4GP) null, (AnonymousClass4GP) null, r8), valueOf, (String) null);
                return;
            }
            r10.Bot(R.string.f11nameremoved);
        } else if (ordinal == 0) {
            r12.invoke(Boolean.FALSE);
        }
    }

    public final boolean A09() {
        int i;
        int i2;
        AnonymousClass1VX r1 = this.A03;
        String A0Q = r1.A0Q(3810);
        if (A0Q != null) {
            i = Integer.parseInt(A0Q);
        } else {
            i = 20601216;
        }
        AnonymousClass585 A002 = A00(i);
        AnonymousClass585 r2 = AnonymousClass585.TRUE;
        if (!(A002 == r2 || A00(C106505Zg.A01(r1)) == r2)) {
            Integer A062 = C829745q.A06(C56952sp.A08(r1, 6498));
            if (A062 != null) {
                i2 = A062.intValue();
            } else {
                i2 = 20610101;
            }
            if (A00(i2) == r2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C105325Um(C111095hX r1, C69263Wi r2, C56612sH r3, AnonymousClass1VX r4, C56842se r5, AnonymousClass5YD r6, AnonymousClass32F r7, AnonymousClass3S7 r8, C55952rB r9, AnonymousClass4FS r10) {
        C18260x0.A0f(r4, r3, r1, r8, r7);
        C18260x0.A0g(r9, r5, r2, r10, r6);
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A07 = r8;
        this.A06 = r7;
        this.A08 = r9;
        this.A04 = r5;
        this.A01 = r2;
        this.A09 = r10;
        this.A05 = r6;
    }

    public final void A08(C89654ea r8, AnonymousClass4GQ r9, int i) {
        WeakReference A14 = AnonymousClass0x9.A14(r8);
        r8.Bp9(R.string.f11nameremoved);
        this.A09.BkM(new C71433c6(this, A14, r9, i, 31));
    }
}
