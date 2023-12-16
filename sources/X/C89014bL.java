package X;

import androidx.appcompat.widget.Toolbar;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.4bL  reason: invalid class name and case insensitive filesystem */
public class C89014bL extends AnonymousClass4LB {
    public int A00 = 0;
    public int A01;
    public Toolbar A02;
    public WaEditText A03;
    public C89224c7 A04;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final C55682qk A0E;
    public final AnonymousClass4CE A0F = new AnonymousClass694(this, 6);
    public final C69263Wi A0G;
    public final C620633i A0H;
    public final AnonymousClass33p A0I;
    public final AnonymousClass4A3 A0J;
    public final AnonymousClass487 A0K;
    public final AnonymousClass5IY A0L;
    public final C27821ej A0M;
    public final AnonymousClass5Y0 A0N;
    public final EmojiSearchProvider A0O;
    public final AnonymousClass1VX A0P;
    public final C60152y5 A0Q;
    public final C105895Wv A0R;
    public final String A0S;

    public void onBackPressed() {
        if (this.A04.isShowing()) {
            this.A04.dismiss();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.text.TextWatcher] */
    /* JADX WARNING: type inference failed for: r12v4, types: [X.52T] */
    /* JADX WARNING: type inference failed for: r12v5, types: [X.52M] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r29) {
        /*
            r28 = this;
            r4 = r28
            r0 = r29
            super.onCreate(r0)
            r0 = 2131429692(0x7f0b093c, float:1.8481064E38)
            android.view.View r1 = X.AnonymousClass0HG.A00(r4, r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r4.A02 = r1
            int r0 = r4.A0D
            r1.setTitle((int) r0)
            r4.setTitle(r0)
            r0 = 2131431930(0x7f0b11fa, float:1.8485603E38)
            android.view.View r8 = r4.findViewById(r0)
            r0 = 12
            X.C633839a.A00(r8, r4, r0)
            r0 = 2131428509(0x7f0b049d, float:1.8478664E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 13
            X.C633839a.A00(r1, r4, r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            r0 = 2131429188(0x7f0b0744, float:1.8480042E38)
            android.view.View r11 = X.AnonymousClass0HG.A00(r4, r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2131429657(0x7f0b0919, float:1.8480993E38)
            android.view.View r0 = X.AnonymousClass0HG.A00(r4, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r4.A03 = r0
            X.33j r7 = r4.A04
            X.C107555bV.A09(r0, r7)
            int r10 = r4.A0C
            r3 = 0
            if (r10 == 0) goto L_0x0063
            int r0 = r4.A01
            if (r0 != 0) goto L_0x005b
            r11.setVisibility(r3)
        L_0x005b:
            X.5e4 r0 = new X.5e4
            r0.<init>(r10)
            r2.add(r0)
        L_0x0063:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0076
            com.whatsapp.WaEditText r1 = r4.A03
            android.text.InputFilter[] r0 = new android.text.InputFilter[r3]
            java.lang.Object[] r0 = r2.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r1.setFilters(r0)
        L_0x0076:
            boolean r1 = r4.A06
            X.5Y0 r5 = r4.A0N
            X.33i r0 = r4.A0H
            r27 = r0
            X.2y5 r0 = r4.A0Q
            r25 = r0
            X.487 r9 = r4.A0K
            com.whatsapp.WaEditText r6 = r4.A03
            int r2 = r4.A01
            boolean r0 = r4.A07
            if (r1 == 0) goto L_0x01c5
            X.52M r1 = new X.52M
            r12 = r1
            r13 = r6
            r14 = r11
            r15 = r27
            r16 = r7
            r17 = r9
            r18 = r5
            r19 = r25
            r20 = r10
            r21 = r2
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x00a4:
            com.whatsapp.WaEditText r0 = r4.A03
            r0.addTextChangedListener(r1)
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x00b8
            com.whatsapp.WaEditText r2 = r4.A03
            r1 = 1
            X.68I r0 = new X.68I
            r0.<init>(r8, r1, r4)
            r2.addTextChangedListener(r0)
        L_0x00b8:
            com.whatsapp.WaEditText r1 = r4.A03
            int r0 = r4.A0B
            r1.setInputType(r0)
            android.view.Window r0 = r4.getWindow()
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            r0 = -1
            r1.width = r0
            r0 = 48
            r1.gravity = r0
            android.view.Window r0 = r4.getWindow()
            r0.setAttributes(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0101
            android.view.Window r2 = r4.getWindow()
            if (r2 == 0) goto L_0x0101
            X.C86634Kw.A1G(r2)
            android.app.Activity r0 = r4.A01
            int r0 = X.C86634Kw.A03(r0)
            r2.setStatusBarColor(r0)
            androidx.appcompat.widget.Toolbar r1 = r4.A02
            boolean r0 = r1 instanceof X.AnonymousClass578
            if (r0 == 0) goto L_0x01c2
            X.578 r1 = (X.AnonymousClass578) r1
            X.5Z7 r0 = r1.A08
            X.5IC r1 = r0.A00
        L_0x00f9:
            X.579 r0 = X.AnonymousClass579.A00
            if (r1 != r0) goto L_0x0101
            r0 = 1
            X.C107405bG.A0C(r2, r0)
        L_0x0101:
            r0 = 2131429691(0x7f0b093b, float:1.8481062E38)
            android.view.View r15 = r4.findViewById(r0)
            com.whatsapp.KeyboardPopupLayout r15 = (com.whatsapp.KeyboardPopupLayout) r15
            r0 = 2131429681(0x7f0b0931, float:1.8481042E38)
            android.view.View r14 = r4.findViewById(r0)
            android.widget.ImageButton r14 = (android.widget.ImageButton) r14
            android.app.Activity r6 = r4.A01
            X.1VX r13 = r4.A0P
            X.5Wv r12 = r4.A0R
            X.2qk r11 = r4.A0E
            X.1ej r10 = r4.A0M
            X.5IY r9 = r4.A0L
            com.whatsapp.emoji.search.EmojiSearchProvider r8 = r4.A0O
            X.33p r2 = r4.A0I
            com.whatsapp.WaEditText r1 = r4.A03
            X.4c7 r0 = new X.4c7
            r23 = r8
            r24 = r13
            r26 = r12
            r21 = r10
            r22 = r5
            r19 = r7
            r20 = r9
            r17 = r27
            r18 = r2
            r16 = r1
            r13 = r14
            r14 = r11
            r11 = r0
            r12 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.A04 = r0
            r0 = 2131429717(0x7f0b0955, float:1.8481115E38)
            android.view.View r1 = r4.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r1 = (com.whatsapp.emoji.search.EmojiSearchContainer) r1
            X.4c7 r0 = r4.A04
            X.5S9 r8 = new X.5S9
            r11 = r8
            r13 = r7
            r14 = r0
            r15 = r10
            r16 = r5
            r17 = r1
            r18 = r25
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r0 = 4
            X.AnonymousClass5S9.A00(r8, r4, r0)
            X.4c7 r2 = r4.A04
            X.4CE r0 = r4.A0F
            r2.A0C(r0)
            r1 = 32
            X.3bx r0 = new X.3bx
            r0.<init>(r4, r1, r8)
            r2.A0E = r0
            r2 = 8
            X.68w r0 = new X.68w
            r0.<init>(r4, r2)
            r4.setOnCancelListener(r0)
            r0 = 2131429448(0x7f0b0848, float:1.848057E38)
            android.view.View r1 = r4.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r4.A00
            if (r0 != 0) goto L_0x01b9
            r1.setVisibility(r2)
        L_0x018c:
            int r1 = r4.A0A
            if (r1 == 0) goto L_0x0195
            com.whatsapp.WaEditText r0 = r4.A03
            r0.setHint(r1)
        L_0x0195:
            com.whatsapp.WaEditText r2 = r4.A03
            java.lang.String r1 = r4.A0S
            java.lang.CharSequence r0 = X.C107345b9.A05(r6, r5, r1)
            r2.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01ab
            com.whatsapp.WaEditText r0 = r4.A03
            r0.selectAll()
        L_0x01ab:
            com.whatsapp.WaEditText r0 = r4.A03
            r0.A07(r3)
            android.view.Window r1 = r4.getWindow()
            r0 = 5
            r1.setSoftInputMode(r0)
            return
        L_0x01b9:
            r1.setVisibility(r3)
            int r0 = r4.A00
            r1.setText(r0)
            goto L_0x018c
        L_0x01c2:
            r1 = 0
            goto L_0x00f9
        L_0x01c5:
            X.52T r1 = new X.52T
            r12 = r1
            r13 = r6
            r14 = r11
            r15 = r27
            r16 = r7
            r17 = r9
            r18 = r5
            r19 = r25
            r20 = r10
            r21 = r2
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89014bL.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89014bL(android.app.Activity r9, X.C55682qk r10, X.C69263Wi r11, X.C620633i r12, X.C56612sH r13, X.AnonymousClass33p r14, X.C620733j r15, X.AnonymousClass4A3 r16, X.AnonymousClass487 r17, X.AnonymousClass5IY r18, X.C27821ej r19, X.AnonymousClass5Y0 r20, com.whatsapp.emoji.search.EmojiSearchProvider r21, X.AnonymousClass1VX r22, X.C60152y5 r23, X.C105895Wv r24, java.lang.String r25, int r26, int r27, int r28, int r29, int r30, int r31) {
        /*
            r8 = this;
            r7 = 2131624814(0x7f0e036e, float:1.8876818E38)
            r0 = 1
            r2 = r8
            r6 = r15
            r5 = r13
            r4 = r12
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A05 = r0
            r0 = 0
            r8.A00 = r0
            r1 = 6
            X.694 r0 = new X.694
            r0.<init>(r8, r1)
            r8.A0F = r0
            r0 = r22
            r8.A0P = r0
            r8.A0G = r11
            r0 = r24
            r8.A0R = r0
            r8.A0E = r10
            r0 = r20
            r8.A0N = r0
            r0 = r19
            r8.A0M = r0
            r0 = r18
            r8.A0L = r0
            r8.A0H = r12
            r0 = r21
            r8.A0O = r0
            r8.A0I = r14
            r0 = r23
            r8.A0Q = r0
            r0 = r17
            r8.A0K = r0
            r0 = r26
            r8.A08 = r0
            r0 = r31
            r8.A0B = r0
            r0 = r16
            r8.A0J = r0
            r0 = r27
            r8.A0D = r0
            r0 = r28
            r8.A0C = r0
            r0 = r29
            r8.A0A = r0
            r0 = r30
            r8.A09 = r0
            r0 = r25
            r8.A0S = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89014bL.<init>(android.app.Activity, X.2qk, X.3Wi, X.33i, X.2sH, X.33p, X.33j, X.4A3, X.487, X.5IY, X.1ej, X.5Y0, com.whatsapp.emoji.search.EmojiSearchProvider, X.1VX, X.2y5, X.5Wv, java.lang.String, int, int, int, int, int, int):void");
    }
}
