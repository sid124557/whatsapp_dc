package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.5Oz  reason: invalid class name and case insensitive filesystem */
public final class C103935Oz {
    public final Context A00;
    public final View A01;
    public final CompoundButton.OnCheckedChangeListener A02;
    public final C89654ea A03;
    public final C621033m A04;
    public final C56612sH A05;
    public final AnonymousClass33p A06;
    public final C620733j A07;
    public final C56982ss A08;
    public final C95814uZ A09;
    public final AnonymousClass1R1 A0A;
    public final AnonymousClass4GP A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a8, code lost:
        if (X.AnonymousClass000.A1S((r10.A00() > 0 ? 1 : (r10.A00() == 0 ? 0 : -1))) != false) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r12 = this;
            X.1R1 r0 = r12.A0A
            X.4uZ r6 = r12.A09
            X.2sa r10 = X.AnonymousClass1R1.A00(r6, r0)
            android.view.View r2 = r12.A01
            boolean r0 = r2 instanceof com.whatsapp.ListItemWithLeftIcon
            if (r0 == 0) goto L_0x0140
            r0 = 2131431046(0x7f0b0e86, float:1.848381E38)
            android.widget.TextView r8 = X.AnonymousClass0x2.A0I(r2, r0)
            r0 = 2131431043(0x7f0b0e83, float:1.8483804E38)
            android.widget.TextView r5 = X.AnonymousClass0x2.A0I(r2, r0)
            r0 = 2131431634(0x7f0b10d2, float:1.8485003E38)
            android.view.View r4 = r2.findViewById(r0)
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            if (r4 != 0) goto L_0x0049
            r9 = r2
            com.whatsapp.ListItemWithLeftIcon r9 = (com.whatsapp.ListItemWithLeftIcon) r9
            android.content.Context r7 = r12.A00
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            android.widget.LinearLayout$LayoutParams r3 = X.C86624Kv.A0C()
            r1 = 0
            r0 = 2130970081(0x7f0405e1, float:1.7548862E38)
            com.whatsapp.wds.components.toggle.WDSSwitch r4 = new com.whatsapp.wds.components.toggle.WDSSwitch
            r4.<init>(r7, r1, r0)
            r0 = 2131431634(0x7f0b10d2, float:1.8485003E38)
            r4.setId(r0)
            r4.setLayoutParams(r3)
            r9.A07(r4)
        L_0x0049:
            X.2ss r1 = r12.A08
            X.33p r0 = r12.A06
            boolean r6 = X.C622334f.A01(r0, r1, r6)
            r7 = 0
            r4.setOnCheckedChangeListener(r7)
            r3 = 8
            r5.setVisibility(r3)
            r1 = 3
            X.542 r0 = new X.542
            r0.<init>(r1, r12, r6)
            r2.setOnClickListener(r0)
            r0 = 2131886111(0x7f12001f, float:1.9406792E38)
            if (r6 == 0) goto L_0x006b
            r0 = 2131886459(0x7f12017b, float:1.9407497E38)
        L_0x006b:
            X.C107295b4.A03(r2, r0)
            android.content.Context r2 = r12.A00
            r0 = 2131101327(0x7f06068f, float:1.781506E38)
            if (r6 != 0) goto L_0x007f
            r1 = 2130969995(0x7f04058b, float:1.7548688E38)
            r0 = 2131101335(0x7f060697, float:1.7815077E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
        L_0x007f:
            X.AnonymousClass0x2.A0q(r2, r8, r0)
            if (r6 != 0) goto L_0x008d
            X.4ea r1 = r12.A03
            r0 = 2131886151(0x7f120047, float:1.9406873E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x008d:
            r4.setContentDescription(r7)
            r0 = r6 ^ 1
            r4.setEnabled(r0)
            r4.setClickable(r0)
            r7 = 0
            if (r6 != 0) goto L_0x00aa
            long r8 = r10.A00()
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00ab
        L_0x00aa:
            r0 = 1
        L_0x00ab:
            r4.setChecked(r0)
            if (r6 != 0) goto L_0x00e6
            long r1 = r10.A00()
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x013c
            long r2 = r10.A00()
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00cc
            r8 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00e1
        L_0x00cc:
            r5.setVisibility(r7)
            X.33j r6 = r12.A07
            r8 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00e7
            r0 = 2131890891(0x7f1212cb, float:1.9416487E38)
            java.lang.String r0 = r6.A0B(r0)
        L_0x00de:
            r5.setText(r0)
        L_0x00e1:
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r12.A02
            r4.setOnCheckedChangeListener(r0)
        L_0x00e6:
            return
        L_0x00e7:
            long r0 = java.lang.System.currentTimeMillis()
            int r11 = X.C107175ap.A00(r0, r2)
            r8 = 1
            r10 = 2131890901(0x7f1212d5, float:1.9416507E38)
            if (r11 == 0) goto L_0x012f
            r9 = -1
            r10 = 2131890902(0x7f1212d6, float:1.9416509E38)
            if (r11 == r9) goto L_0x012f
            r9 = -30
            if (r11 <= r9) goto L_0x011b
            java.text.DateFormat r0 = X.C107505bQ.A08(r6)
            java.lang.String r1 = X.C86624Kv.A0c(r0, r2)
            java.lang.String r0 = X.C107145am.A00(r6, r2)
            java.lang.String r2 = X.C107175ap.A04(r6, r1, r0)
        L_0x010f:
            r1 = 2131890900(0x7f1212d4, float:1.9416505E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r2
            java.lang.String r0 = r6.A0E(r1, r0)
            goto L_0x00de
        L_0x011b:
            boolean r0 = X.C107175ap.A06(r0, r2)
            if (r0 == 0) goto L_0x012a
            java.text.DateFormat r0 = X.C107505bQ.A08(r6)
            java.lang.String r2 = X.C86624Kv.A0c(r0, r2)
            goto L_0x010f
        L_0x012a:
            java.lang.String r2 = X.C107505bQ.A06(r6, r2)
            goto L_0x010f
        L_0x012f:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = X.C107145am.A00(r6, r2)
            r1[r7] = r0
            java.lang.String r0 = r6.A0E(r10, r1)
            goto L_0x00de
        L_0x013c:
            r5.setVisibility(r3)
            goto L_0x00e1
        L_0x0140:
            r0 = 2131431634(0x7f0b10d2, float:1.8485003E38)
            android.view.View r4 = X.C06560Yg.A02(r2, r0)
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            r0 = 2131431629(0x7f0b10cd, float:1.8484993E38)
            android.widget.TextView r5 = X.AnonymousClass0x2.A0I(r2, r0)
            r0 = 2131431631(0x7f0b10cf, float:1.8484997E38)
            android.widget.TextView r8 = X.AnonymousClass0x2.A0I(r2, r0)
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103935Oz.A00():void");
    }

    public C103935Oz(Context context, View view, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, C621033m r5, C56612sH r6, AnonymousClass33p r7, C620733j r8, C56982ss r9, C95814uZ r10, AnonymousClass1R1 r11, AnonymousClass4GP r12) {
        C18260x0.A0f(r6, r8, r9, r11, r5);
        C18260x0.A0W(r7, view, onCheckedChangeListener);
        C162457s7.A0J(r10, 9);
        this.A05 = r6;
        this.A07 = r8;
        this.A08 = r9;
        this.A0A = r11;
        this.A04 = r5;
        this.A06 = r7;
        this.A01 = view;
        this.A02 = onCheckedChangeListener;
        this.A09 = r10;
        this.A00 = context;
        this.A0B = r12;
        this.A03 = (C89654ea) C111095hX.A01(context);
    }
}
