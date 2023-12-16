package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9Tr  reason: invalid class name and case insensitive filesystem */
public class C194599Tr {
    public final C69263Wi A00;
    public final C56612sH A01;
    public final C66473Lo A02;
    public final C66543Lv A03;
    public final C56892sj A04;
    public final C50012hU A05;
    public final C1906899l A06;
    public final C195909Zz A07;
    public final C193999Re A08;
    public final AnonymousClass9U5 A09;
    public final AnonymousClass9U4 A0A;
    public final AnonymousClass35J A0B;
    public final C56072rN A0C;
    public final AnonymousClass4FS A0D;

    public final void A04(View view, Button button, C624034w r11, C202509m8 r12, boolean z) {
        C624034w r4 = r11;
        UserJid userJid = r11.A0D;
        View A022 = C06560Yg.A02(view, R.id.request_decline_button);
        View A023 = C06560Yg.A02(view, R.id.request_pay_button);
        if (userJid != null) {
            if (!A06(r11) && !r11.A0P) {
                A022.setVisibility(8);
                A023.setVisibility(8);
                view.setVisibility(8);
                if (z) {
                    Button button2 = button;
                    if (button != null) {
                        boolean z2 = false;
                        view.setVisibility(0);
                        button.setVisibility(0);
                        if (r11.A02 == 19) {
                            z2 = true;
                        }
                        A05(button, r11, z2);
                        if (r11.A02 != 19) {
                            button.setOnClickListener(new C195469Xx(button2, r4, userJid, this, r12));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        view.setVisibility(8);
    }

    public final void A05(TextView textView, C624034w r9, boolean z) {
        int i;
        int i2;
        C624034w r1 = r9;
        if (z) {
            textView.setText(R.string.f11nameremoved);
            textView.setEnabled(false);
            i = r9.A02;
            i2 = 19;
        } else {
            textView.setEnabled(true);
            textView.setText(R.string.f11nameremoved);
            i = r9.A02;
            i2 = 12;
        }
        if (i != i2) {
            r9.A02 = i2;
            AnonymousClass9U4.A01(this.A0A).A0g(r1, C1899593h.A0R(r9), i, 0, -1);
        }
    }

    public final synchronized boolean A06(C624034w r6) {
        boolean z;
        C95814uZ r1 = r6.A0C;
        z = false;
        if (r1 != null) {
            AnonymousClass3ZH A012 = this.A02.A01(r1);
            if (A012.A0U()) {
                C56892sj r12 = this.A04;
                Class<C27991fJ> cls = C27991fJ.class;
                C27991fJ r0 = (C27991fJ) A012.A0I(cls);
                C626936e.A06(r0);
                if (r12.A0C(r0)) {
                    C56072rN r13 = this.A0C;
                    C27991fJ r02 = (C27991fJ) A012.A0I(cls);
                    C626936e.A06(r02);
                    if (r13.A04(A012, r02)) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public void A00(Context context, C624034w r7) {
        C203719oC r0;
        int BAv;
        AnonymousClass9SU A0F = this.A0A.A0F(r7.A0G);
        if (A0F != null) {
            r0 = A0F.A01(r7.A0I);
        } else {
            r0 = null;
        }
        if (r0 == null || (BAv = r0.BAv()) == 0) {
            ((AnonymousClass4FU) context).Box(new Object[0], 0, R.string.f11nameremoved);
            return;
        }
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = context.getString(BAv);
        ((AnonymousClass4FU) context).Box(A0L, 0, R.string.f11nameremoved);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r1.A0G().B64().A07(X.C1899593h.A0B(r2)) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r4.A00.A0P(X.AnonymousClass32Y.A03(r0)) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r12, X.C624034w r13, X.C202979mv r14, boolean r15) {
        /*
            r11 = this;
            X.9Re r4 = r11.A08
            com.whatsapp.jid.UserJid r0 = r13.A0D
            if (r0 == 0) goto L_0x0013
            X.2sq r1 = r4.A00
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r0)
            boolean r0 = r1.A0P(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            X.1S4 r0 = r13.A0A
            if (r0 == 0) goto L_0x004a
            java.lang.String r2 = r0.A0L()
        L_0x001c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0041
            X.9U4 r1 = r4.A04
            X.9oC r0 = r1.A0G()
            X.9Tt r0 = r0.B64()
            if (r0 == 0) goto L_0x0041
            X.9oC r0 = r1.A0G()
            X.9Tt r1 = r0.B64()
            X.7yt r0 = X.C1899593h.A0B(r2)
            boolean r1 = r1.A07(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r3 != 0) goto L_0x004c
            if (r0 != 0) goto L_0x004c
            r14.onSuccess()
            return
        L_0x004a:
            r2 = 0
            goto L_0x001c
        L_0x004c:
            android.app.Activity r5 = X.C111095hX.A02(r12)
            com.whatsapp.jid.UserJid r7 = r13.A0D
            X.3QD r2 = X.AnonymousClass3QD.A00()
            X.1S4 r0 = r13.A0A
            java.lang.String r1 = r0.A0L()
            java.lang.String r0 = "paymentHandle"
            X.7yt r8 = X.C1899693i.A0G(r2, r1, r0)
            r9 = 0
            X.9oo r6 = new X.9oo
            r6.<init>(r14, r9)
            r10 = r15
            r4.A00(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194599Tr.A01(android.content.Context, X.34w, X.9mv, boolean):void");
    }

    public C194599Tr(C69263Wi r1, C56612sH r2, C66473Lo r3, C66543Lv r4, C56892sj r5, C50012hU r6, C1906899l r7, C195909Zz r8, C193999Re r9, AnonymousClass9U5 r10, AnonymousClass9U4 r11, AnonymousClass35J r12, C56072rN r13, AnonymousClass4FS r14) {
        this.A01 = r2;
        this.A00 = r1;
        this.A0D = r14;
        this.A05 = r6;
        this.A0C = r13;
        this.A0A = r11;
        this.A03 = r4;
        this.A0B = r12;
        this.A06 = r7;
        this.A08 = r9;
        this.A09 = r10;
        this.A07 = r8;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void A02(View view, Button button, C624034w r7) {
        C203719oC A012;
        C185728u9 B63;
        View A022 = C06560Yg.A02(view, R.id.request_decline_button);
        View A023 = C06560Yg.A02(view, R.id.request_pay_button);
        A022.setVisibility(8);
        A023.setVisibility(8);
        AnonymousClass9SU A0F = this.A0A.A0F(r7.A0G);
        if (A0F == null || (A012 = A0F.A01(r7.A0I)) == null || ((B63 = A012.B63()) == null ? this.A06.A0E() : !B63.Bo1(r7.A0A))) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        button.setVisibility(0);
        button.setOnClickListener(new C204209oz(A012, button, r7, 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (android.text.TextUtils.isEmpty(r0.A0L) != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r25, android.widget.Button r26, X.C624034w r27, X.AnonymousClass9SM r28, X.C202509m8 r29, X.C624134x r30, java.lang.String r31, boolean r32) {
        /*
            r24 = this;
            r7 = r28
            r0 = 2131433052(0x7f0b165c, float:1.8487879E38)
            r4 = r25
            android.view.View r6 = X.C06560Yg.A02(r4, r0)
            r0 = 2131433068(0x7f0b166c, float:1.8487911E38)
            android.view.View r3 = X.C06560Yg.A02(r4, r0)
            android.content.Context r12 = r4.getContext()
            r14 = r24
            r5 = r30
            if (r30 != 0) goto L_0x01d0
            r1 = 0
        L_0x001d:
            r13 = r27
            boolean r0 = r14.A06(r13)
            r2 = 8
            if (r0 != 0) goto L_0x002f
            if (r1 == 0) goto L_0x003c
            boolean r0 = r1.A0G()
            if (r0 != 0) goto L_0x003c
        L_0x002f:
            if (r32 != 0) goto L_0x00b6
            r1 = 0
            r3.setEnabled(r1)
            r6.setEnabled(r1)
        L_0x0038:
            r4.setVisibility(r1)
        L_0x003b:
            return
        L_0x003c:
            int r9 = r13.A03
            r1 = 20
            r17 = r31
            if (r9 != r1) goto L_0x0082
            int r8 = r13.A02
            r0 = 12
            if (r8 != r0) goto L_0x0082
            r2 = 1
            r3.setEnabled(r2)
            r1 = 0
            X.9ox r11 = new X.9ox
            r15 = r29
            r16 = r5
            r18 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r3.setOnClickListener(r11)
            r6.setEnabled(r2)
            X.9ox r0 = new X.9ox
            r11 = r0
            r18 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r6.setOnClickListener(r0)
            r4.setVisibility(r1)
            if (r28 == 0) goto L_0x003b
            X.1S4 r0 = r13.A0A
            X.99L r0 = (X.AnonymousClass99L) r0
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = r0.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 8
            if (r0 == 0) goto L_0x0038
        L_0x0080:
            r1 = 0
            goto L_0x0038
        L_0x0082:
            if (r28 == 0) goto L_0x00b6
            r0 = 40
            if (r9 != r0) goto L_0x00b6
            int r8 = r13.A02
            if (r8 == r1) goto L_0x0098
            r0 = 417(0x1a1, float:5.84E-43)
            if (r8 == r0) goto L_0x0098
            r0 = 418(0x1a2, float:5.86E-43)
            if (r8 == r0) goto L_0x0098
            r0 = 115(0x73, float:1.61E-43)
            if (r8 != r0) goto L_0x00b6
        L_0x0098:
            X.99p r7 = (X.C1907299p) r7
            X.1S4 r9 = r13.A0A
            X.99L r9 = (X.AnonymousClass99L) r9
            if (r9 == 0) goto L_0x003b
            X.9W2 r0 = r9.A0G
            if (r0 == 0) goto L_0x003b
            r10 = 0
            r5 = r26
            if (r8 == r1) goto L_0x0187
            r0 = 115(0x73, float:1.61E-43)
            if (r8 == r0) goto L_0x0156
            r0 = 417(0x1a1, float:5.84E-43)
            r1 = 418(0x1a2, float:5.86E-43)
            if (r8 == r0) goto L_0x00ba
            if (r8 == r1) goto L_0x00ba
        L_0x00b6:
            r4.setVisibility(r2)
            return
        L_0x00ba:
            r3.setVisibility(r2)
            r6.setVisibility(r2)
            if (r26 == 0) goto L_0x00b6
            X.9W2 r6 = r9.A0G
            if (r6 == 0) goto L_0x00b6
            int r0 = r13.A02
            if (r0 == r1) goto L_0x00b6
            X.9Vz r3 = r6.A0C
            if (r3 == 0) goto L_0x00e3
            java.lang.String r1 = "ACCEPT"
            java.lang.String r0 = r3.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e3
            java.lang.String r1 = r3.A09
            java.lang.String r0 = "PENDING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e3
            goto L_0x00b6
        L_0x00e3:
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x0151
            r0 = 0
            r4.setVisibility(r0)
            r5.setVisibility(r0)
            r0 = 1
            r5.setEnabled(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r5.setText(r0)
            r6 = 5
            X.9ow r11 = new X.9ow
            r14 = r7
            r15 = r17
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r5.setOnClickListener(r11)
            X.1VX r1 = r7.A03
            X.9bS r0 = r7.A04
            java.lang.String r0 = r0.A07()
            boolean r0 = X.AnonymousClass9WN.A01(r1, r0)
            if (r0 == 0) goto L_0x003b
            X.1S4 r1 = r13.A0A
            r0 = r1
            X.99L r0 = (X.AnonymousClass99L) r0
            if (r0 == 0) goto L_0x003b
            X.9W2 r0 = r0.A0G
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r0.A0E
            boolean r0 = X.AnonymousClass9WN.A02(r0)
            if (r0 == 0) goto L_0x003b
            X.C626936e.A06(r1)
            X.99L r1 = (X.AnonymousClass99L) r1
            r0 = 2131432102(0x7f0b12a6, float:1.8485952E38)
            android.widget.TextView r3 = X.AnonymousClass002.A09(r4, r0)
            r0 = 0
            r3.setVisibility(r0)
            X.9W2 r0 = r1.A0G
            X.C626936e.A06(r0)
            int r1 = r0.A00()
            if (r1 == 0) goto L_0x01e8
            r0 = 2
            if (r1 == r0) goto L_0x01e0
            r0 = 3
            if (r1 == r0) goto L_0x01e8
            if (r1 == r6) goto L_0x01e8
            r0 = 6
            if (r1 == r0) goto L_0x01e0
            r3.setVisibility(r2)
            return
        L_0x0151:
            r5.setVisibility(r2)
            goto L_0x00b6
        L_0x0156:
            X.9Wq r8 = r7.A09
            long r0 = r9.A04
            X.2sH r8 = r8.A04
            long r8 = r8.A0H()
            long r0 = r0 - r8
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x003b
            android.widget.TextView r3 = (android.widget.TextView) r3
            r14 = 2
            X.9ow r9 = new X.9ow
            r10 = r12
            r11 = r13
            r12 = r7
            r13 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            r0 = 1
            r3.setEnabled(r0)
            r0 = 2131887053(0x7f1203cd, float:1.9408702E38)
            r3.setText(r0)
            r3.setOnClickListener(r9)
            r0 = 0
            r4.setVisibility(r0)
            r6.setVisibility(r2)
            goto L_0x01ca
        L_0x0187:
            X.9Wq r8 = r7.A09
            long r0 = r9.A04
            X.2sH r8 = r8.A04
            long r8 = r8.A0H()
            long r0 = r0 - r8
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x003b
            android.widget.TextView r3 = (android.widget.TextView) r3
            r16 = 3
            X.9ow r11 = new X.9ow
            r14 = r7
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            r23 = 4
            X.9ow r8 = new X.9ow
            r18 = r8
            r19 = r12
            r20 = r13
            r21 = r7
            r22 = r15
            r18.<init>(r19, r20, r21, r22, r23)
            r1 = 1
            r3.setEnabled(r1)
            r3.setOnClickListener(r11)
            r0 = 2131894785(0x7f122201, float:1.9424385E38)
            r3.setText(r0)
            r6.setEnabled(r1)
            r6.setOnClickListener(r8)
            r0 = 0
            r4.setVisibility(r0)
        L_0x01ca:
            if (r26 == 0) goto L_0x003b
            r5.setVisibility(r2)
            return
        L_0x01d0:
            X.9U4 r0 = r14.A0A
            X.36F r1 = X.AnonymousClass9U4.A01(r0)
            X.2z0 r0 = r5.A1J
            java.lang.String r0 = r0.A01
            X.34w r1 = r1.A0F(r0)
            goto L_0x001d
        L_0x01e0:
            r0 = 2131892082(0x7f121772, float:1.9418902E38)
            r3.setText(r0)
            r9 = 1
            goto L_0x01ef
        L_0x01e8:
            r0 = 2131892016(0x7f121730, float:1.9418768E38)
            r3.setText(r0)
            r9 = 0
        L_0x01ef:
            X.9ow r4 = new X.9ow
            r5 = r12
            r6 = r13
            r8 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            r3.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194599Tr.A03(android.view.View, android.widget.Button, X.34w, X.9SM, X.9m8, X.34x, java.lang.String, boolean):void");
    }
}
