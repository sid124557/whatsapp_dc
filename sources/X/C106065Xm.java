package X;

import android.view.View;
import com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.5Xm  reason: invalid class name and case insensitive filesystem */
public class C106065Xm {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C56962sq A02;
    public final C29441ip A03;
    public final C64773Ex A04;
    public final C56612sH A05;
    public final AnonymousClass33p A06;
    public final C56892sj A07;
    public final C56662sM A08;
    public final C104395Qu A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass5U1 A0B;
    public final C66493Lq A0C;
    public final C66433Lk A0D;
    public final C56072rN A0E;
    public final AnonymousClass4FS A0F;

    public void A01(View view, C89654ea r15, C621033m r16, AnonymousClass653 r17, C624134x r18, int i, boolean z) {
        AnonymousClass33p r3 = this.A06;
        C89654ea r6 = r15;
        View view2 = view;
        C621033m r7 = r16;
        AnonymousClass653 r8 = r17;
        C624134x r10 = r18;
        int i2 = i;
        boolean z2 = z;
        if (EphemeralDmKicBottomSheetDialog.A02(r15.getSupportFragmentManager(), r3)) {
            C08270df supportFragmentManager = r15.getSupportFragmentManager();
            C95814uZ r1 = r10.A1J.A00;
            C114105mV r4 = new C114105mV(view2, r6, r7, r8, this, r10, i2, z2);
            int i3 = 7;
            if (z) {
                i3 = 6;
            }
            EphemeralDmKicBottomSheetDialog.A00(supportFragmentManager, r3, r4, r1, i3);
            return;
        }
        A00(r15, view, r7, r8, r10, i2, z2);
    }

    public boolean A02(C624134x r7) {
        GroupJid A002;
        if (this.A0B.A01(r7) && !C106215Yb.A02(r7)) {
            C95814uZ r1 = r7.A1J.A00;
            if (C627336j.A0K(r1) && (A002 = AnonymousClass32V.A00(r1)) != null) {
                AnonymousClass3ZH A072 = this.A04.A07(A002);
                C27991fJ A032 = AnonymousClass34R.A03(A002);
                if (!(A072 == null || A032 == null)) {
                    if (!this.A0E.A04(A072, A002) || this.A07.A0D(A002)) {
                        C66493Lq r2 = this.A0C;
                        if (r2.A0S.A07(A032) == 3) {
                            if (this.A0A.A0X(2844)) {
                                Log.i("KeepInChatManager/shouldEnableKeepOption CAG supports keep in chat");
                            }
                        }
                        return r2.A0e(A072, A032);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean A03(C624134x r10) {
        GroupJid A002;
        boolean A012 = this.A0B.A01(r10);
        boolean A022 = C106215Yb.A02(r10);
        if (!A012) {
            return A022;
        }
        if (A022) {
            AnonymousClass2z0 r7 = r10.A1J;
            C95814uZ r1 = r7.A00;
            if (C627336j.A0K(r1) && (A002 = AnonymousClass32V.A00(r1)) != null) {
                AnonymousClass3ZH A072 = this.A04.A07(A002);
                C27991fJ A032 = AnonymousClass34R.A03(A002);
                if (!(A072 == null || A032 == null)) {
                    C66493Lq r2 = this.A0C;
                    if (r2.A0S.A07(A032) != 3 || this.A0A.A0X(2844)) {
                        C56892sj r12 = this.A07;
                        if (!r12.A0D(A002)) {
                            if (r12.A0C(A002) && 1 == r10.A0j() && r7.A02) {
                                return true;
                            }
                            if (this.A0E.A04(A072, A002)) {
                                return false;
                            }
                        }
                        return r2.A0e(A072, A032);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public C106065Xm(C69263Wi r2, C56972sr r3, C56962sq r4, C29441ip r5, C64773Ex r6, C56612sH r7, AnonymousClass33p r8, C56892sj r9, C56662sM r10, C104395Qu r11, AnonymousClass1VX r12, AnonymousClass5U1 r13, C66493Lq r14, C66433Lk r15, C56072rN r16, AnonymousClass4FS r17) {
        this.A05 = r7;
        this.A0A = r12;
        this.A00 = r2;
        this.A01 = r3;
        this.A0F = r17;
        this.A04 = r6;
        this.A0D = r15;
        this.A0E = r16;
        this.A08 = r10;
        this.A02 = r4;
        this.A0C = r14;
        this.A09 = r11;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r5;
        this.A0B = r13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r1.A0B(r0, r4) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        if (r0 != false) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r23, android.view.View r24, X.C621033m r25, X.AnonymousClass653 r26, X.C624134x r27, int r28, boolean r29) {
        /*
            r22 = this;
            r12 = 8
            r11 = 5
            r10 = 4
            r8 = 3
            r7 = 1
            r9 = r22
            r6 = r23
            r21 = r24
            r20 = r25
            r2 = r26
            r5 = r27
            r19 = r28
            r13 = r29
            if (r29 == 0) goto L_0x00bd
            java.lang.Long r1 = r5.A0r
            X.2z0 r0 = r5.A1J
            X.4uZ r0 = r0.A00
            r16 = r0
            com.whatsapp.jid.GroupJid r15 = X.AnonymousClass32V.A00(r16)
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A03(r16)
            X.2sr r14 = r9.A01
            com.whatsapp.jid.UserJid r4 = X.C627636p.A06(r14, r5)
            X.1ip r0 = r9.A03
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0062
            r1 = 1
        L_0x0037:
            X.5Qu r0 = r9.A09
            r0.A01(r5, r1, r13)
            if (r1 == 0) goto L_0x0152
            if (r1 == r7) goto L_0x0292
            if (r1 == r8) goto L_0x0289
            if (r1 == r10) goto L_0x0059
            if (r1 == r11) goto L_0x0162
            if (r1 != r12) goto L_0x0058
            r1 = 607(0x25f, float:8.5E-43)
        L_0x004a:
            java.lang.Class<X.4ea> r0 = X.C89654ea.class
            android.app.Activity r0 = X.C621633u.A01(r6, r0)
            if (r0 == 0) goto L_0x0055
            X.C621433s.A01(r0, r1)
        L_0x0055:
            r2.Ayt()
        L_0x0058:
            return
        L_0x0059:
            r1 = 2131890353(0x7f1210b1, float:1.9415395E38)
            r0 = r21
            X.C106215Yb.A01(r6, r0, r1)
            goto L_0x0055
        L_0x0062:
            if (r15 == 0) goto L_0x0074
            boolean r0 = X.C627336j.A0K(r16)
            if (r0 == 0) goto L_0x0074
            X.2sj r0 = r9.A07
            boolean r0 = r0.A0E(r15, r4)
            if (r0 != 0) goto L_0x0074
            r1 = 3
            goto L_0x0037
        L_0x0074:
            X.2sq r0 = r9.A02
            boolean r0 = r0.A0P(r3)
            if (r0 == 0) goto L_0x007f
            r1 = 8
            goto L_0x0037
        L_0x007f:
            if (r1 == 0) goto L_0x008f
            long r15 = r1.longValue()
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x008f
            r1 = 4
            goto L_0x0037
        L_0x008f:
            X.2sM r1 = r9.A08
            X.1md r0 = r5.A1S
            if (r0 == 0) goto L_0x00ba
            com.whatsapp.jid.UserJid r4 = X.C627636p.A06(r14, r0)
            com.whatsapp.jid.UserJid r0 = X.C627636p.A06(r14, r5)
            if (r4 == 0) goto L_0x00a6
            boolean r0 = r1.A0B(r0, r4)
            r3 = 1
            if (r0 != 0) goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            int r0 = r5.A0j()
            boolean r1 = X.AnonymousClass000.A1T(r0)
            boolean r0 = r14.A0a(r4)
            if (r3 == 0) goto L_0x00ba
            if (r1 == 0) goto L_0x00ba
            r1 = 5
            if (r0 == 0) goto L_0x0037
        L_0x00ba:
            r1 = 0
            goto L_0x0037
        L_0x00bd:
            java.lang.Long r0 = r5.A0r
            r18 = r0
            X.2z0 r14 = r5.A1J
            X.4uZ r15 = r14.A00
            com.whatsapp.jid.GroupJid r4 = X.AnonymousClass32V.A00(r15)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r15)
            X.2sr r0 = r9.A01
            com.whatsapp.jid.UserJid r3 = X.C627636p.A06(r0, r5)
            X.1ip r0 = r9.A03
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x00f4
            r1 = 1
        L_0x00dc:
            X.5Qu r0 = r9.A09
            r0.A01(r5, r1, r13)
            if (r1 == 0) goto L_0x0146
            if (r1 == r7) goto L_0x0292
            if (r1 == r8) goto L_0x0285
            if (r1 == r10) goto L_0x0227
            if (r1 == r11) goto L_0x01d6
            r0 = 6
            if (r1 == r0) goto L_0x01fa
            if (r1 != r12) goto L_0x0058
            r1 = 608(0x260, float:8.52E-43)
            goto L_0x004a
        L_0x00f4:
            if (r4 == 0) goto L_0x0106
            boolean r0 = X.C627336j.A0K(r15)
            if (r0 == 0) goto L_0x0106
            X.2sj r0 = r9.A07
            boolean r0 = r0.A0E(r4, r3)
            if (r0 != 0) goto L_0x0106
            r1 = 3
            goto L_0x00dc
        L_0x0106:
            X.2sq r0 = r9.A02
            boolean r0 = r0.A0P(r1)
            if (r0 == 0) goto L_0x0111
            r1 = 8
            goto L_0x00dc
        L_0x0111:
            X.1VX r15 = r9.A0A
            java.lang.Long r0 = r5.A0r
            if (r0 == 0) goto L_0x012f
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r0.longValue()
            long r16 = X.C18280x3.A08(r3, r0)
            r0 = 1698(0x6a2, float:2.38E-42)
            long r3 = X.C56952sp.A06(r15, r0)
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x012f
            r1 = 6
            goto L_0x00dc
        L_0x012f:
            if (r18 == 0) goto L_0x013f
            long r15 = r18.longValue()
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x013f
            r1 = 4
            goto L_0x00dc
        L_0x013f:
            boolean r0 = r14.A02
            r1 = 0
            if (r0 == 0) goto L_0x00dc
            r1 = 5
            goto L_0x00dc
        L_0x0146:
            X.4FS r4 = r9.A0F
            X.3ca r3 = new X.3ca
            r1 = r19
            r0 = r20
            r3.<init>((X.C621033m) r0, (X.C624134x) r5, (int) r1)
            goto L_0x015d
        L_0x0152:
            X.4FS r4 = r9.A0F
            X.3cT r3 = new X.3cT
            r1 = r19
            r0 = r20
            r3.<init>(r0, r5, r1)
        L_0x015d:
            r4.BkM(r3)
            goto L_0x0055
        L_0x0162:
            X.3Lk r8 = r9.A0D
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
            r0 = 2131625250(0x7f0e0522, float:1.8877703E38)
            android.view.View r9 = X.C18310x6.A0H(r1, r0)
            r0 = 2131433559(0x7f0b1857, float:1.8488907E38)
            android.widget.TextView r4 = X.C18300x5.A0G(r9, r0)
            r0 = 2131433558(0x7f0b1856, float:1.8488905E38)
            android.widget.TextView r3 = X.C18300x5.A0G(r9, r0)
            r0 = 2131430897(0x7f0b0df1, float:1.8483508E38)
            android.widget.ImageView r1 = X.AnonymousClass0x9.A0E(r9, r0)
            r0 = 2131890379(0x7f1210cb, float:1.9415448E38)
            r4.setText(r0)
            r0 = 2131890378(0x7f1210ca, float:1.9415446E38)
            r3.setText(r0)
            r0 = 2131233003(0x7f0808eb, float:1.8082131E38)
            r1.setImageResource(r0)
            r0 = 2131431930(0x7f0b11fa, float:1.8485603E38)
            android.view.View r5 = X.C06560Yg.A02(r9, r0)
            r0 = 2131430947(0x7f0b0e23, float:1.848361E38)
            android.view.View r4 = X.C06560Yg.A02(r9, r0)
            X.0zH r0 = X.AnonymousClass5V0.A02(r6, r9)
            r0.A0i(r7)
            X.043 r3 = r0.create()
            r1 = 0
            X.6AD r0 = new X.6AD
            r0.<init>(r2, r1)
            r3.setOnDismissListener(r0)
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x01c8
            android.view.Window r1 = r3.getWindow()
            r0 = 2131102581(0x7f060b75, float:1.7817604E38)
            X.C18310x6.A0x(r6, r1, r0)
        L_0x01c8:
            r0 = 19
            X.C633839a.A00(r5, r3, r0)
            r0 = 43
            X.C109725f5.A00(r4, r6, r8, r3, r0)
            r3.show()
            return
        L_0x01d6:
            X.4FS r3 = r9.A0F
            X.0zH r4 = X.AnonymousClass5V0.A00(r6)
            r0 = 2131890381(0x7f1210cd, float:1.9415452E38)
            r4.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            X.69g r0 = new X.69g
            r9 = r3
            r10 = r2
            r11 = r8
            r6 = r0
            r7 = r20
            r8 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A0Y(r0, r1)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 64
            goto L_0x0220
        L_0x01fa:
            X.3Wi r3 = r9.A00
            X.4FS r0 = r9.A0F
            r13 = 0
            X.4I6 r1 = new X.4I6
            r7 = r1
            r8 = r6
            r9 = r3
            r10 = r20
            r11 = r5
            r12 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.0zH r4 = X.AnonymousClass5V0.A00(r6)
            r0 = 2131888667(0x7f120a1b, float:1.9411976E38)
            r4.A0T(r0)
            r0 = 2131893212(0x7f121bdc, float:1.9421194E38)
            r4.A0Y(r1, r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 65
        L_0x0220:
            X.C1235268t.A04(r4, r2, r0, r1)
            X.C18280x3.A0q(r4)
            return
        L_0x0227:
            X.4FS r8 = r9.A0F
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
            r0 = 2131625454(0x7f0e05ee, float:1.8878116E38)
            android.view.View r9 = X.C18310x6.A0H(r1, r0)
            X.0zH r1 = X.AnonymousClass5V0.A00(r6)
            r0 = 2131895528(0x7f1224e8, float:1.9425892E38)
            r1.A0U(r0)
            r0 = 2131895526(0x7f1224e6, float:1.9425888E38)
            r1.A0T(r0)
            r1.A0a(r9)
            X.043 r4 = r1.create()
            r0 = 2131428326(0x7f0b03e6, float:1.8478293E38)
            android.widget.TextView r3 = X.C18300x5.A0G(r9, r0)
            r0 = 2131428327(0x7f0b03e7, float:1.8478295E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r9, r0)
            r0 = 2131895527(0x7f1224e7, float:1.942589E38)
            r3.setText(r0)
            r0 = 2131102498(0x7f060b22, float:1.7817436E38)
            X.AnonymousClass0x2.A0q(r6, r3, r0)
            X.5er r0 = new X.5er
            r16 = 4
            r13 = r6
            r14 = r21
            r15 = r4
            r9 = r0
            r10 = r8
            r11 = r20
            r12 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r3.setOnClickListener(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1.setText(r0)
            X.C18310x6.A19(r1, r2, r4, r7)
            r4.show()
            return
        L_0x0285:
            r1 = 2131890377(0x7f1210c9, float:1.9415444E38)
            goto L_0x028c
        L_0x0289:
            r1 = 2131890376(0x7f1210c8, float:1.9415442E38)
        L_0x028c:
            r0 = r21
            X.C106215Yb.A01(r6, r0, r1)
            return
        L_0x0292:
            X.3Wi r1 = r9.A00
            r0 = 2131890354(0x7f1210b2, float:1.9415397E38)
            r1.A0H(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106065Xm.A00(android.app.Activity, android.view.View, X.33m, X.653, X.34x, int, boolean):void");
    }
}
