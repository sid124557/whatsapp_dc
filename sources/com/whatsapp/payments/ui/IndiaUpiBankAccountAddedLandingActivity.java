package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass303;
import X.AnonymousClass97T;
import X.AnonymousClass99H;
import X.AnonymousClass9DA;
import X.C06560Yg;
import X.C107695bk;
import X.C154437dA;
import X.C158777kX;
import X.C161527pr;
import X.C166557yt;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C190889Af;
import X.C204019og;
import X.C29251iW;
import X.C626936e;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C88834as;
import android.content.Intent;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class IndiaUpiBankAccountAddedLandingActivity extends AnonymousClass9DA {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public C29251iW A04;
    public C158777kX A05;
    public WDSButton A06;
    public WDSButton A07;
    public boolean A08;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0125, code lost:
        r0 = r14.A0l;
        r4 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0129, code lost:
        if (r0 == false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0133, code lost:
        if (r14.A0N.A05(r14.A0A) == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0138, code lost:
        if (r14.A03 != 1) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0142, code lost:
        if (java.lang.Boolean.FALSE.equals(r4.A00) == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0146, code lost:
        r1 = r14.A01;
        r3 = X.AnonymousClass001.A1Z(r4.A00);
        r0 = com.whatsapp.R.drawable.ic_hero_account_added_landing;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0151, code lost:
        if (r3 == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0153, code lost:
        r0 = com.whatsapp.R.drawable.ic_hero_account_added_landing_mpin;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0156, code lost:
        r1.setImageResource(r0);
        r1 = r14.A03;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x015e, code lost:
        if (r3 == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0160, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0163, code lost:
        r1.setText(r0);
        r14.A02.setText(com.whatsapp.R.string.f11nameremoved);
        r14.A06.setText(com.whatsapp.R.string.f11nameremoved);
        r14.A07.setText(com.whatsapp.R.string.f11nameremoved);
        X.C204249p3.A02(r14.A06, r14, 36);
        r1 = r14.A07;
        r0 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x018b, code lost:
        A7a(r14.A01);
        r14.A03.setText(com.whatsapp.R.string.f11nameremoved);
        r3 = r14.A02;
        r1 = X.AnonymousClass001.A1Z(r4.A00);
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01a3, code lost:
        if (r1 == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01a5, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01a8, code lost:
        X.AnonymousClass97T.A0g(r3, r14, r0);
        r1 = r14.A06;
        r0 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x026d, code lost:
        X.C204249p3.A02(r1, r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0272, code lost:
        r3 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x027c, code lost:
        if (r14.A0N.A05(r14.A0A) == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0281, code lost:
        if (r14.A03 != 1) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x028b, code lost:
        if (java.lang.Boolean.FALSE.equals(r3.A00) == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x028d, code lost:
        A7a(r14.A01);
        r14.A03.setText(com.whatsapp.R.string.f11nameremoved);
        r14.A02.setText(com.whatsapp.R.string.f11nameremoved);
        r0 = r14.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02a4, code lost:
        if (r0 == null) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02a6, code lost:
        r0 = r0.A08;
        X.C626936e.A06(r0);
        A7b((X.AnonymousClass99H) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02b0, code lost:
        r14.A06.setText(com.whatsapp.R.string.f11nameremoved);
        r14.A07.setVisibility(8);
        X.C204249p3.A02(r14.A06, r14, 33);
        r14.A00.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02cd, code lost:
        r1 = r14.A01;
        r3 = X.AnonymousClass001.A1Z(r3.A00);
        r0 = com.whatsapp.R.drawable.ic_hero_account_added_landing;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02d8, code lost:
        if (r3 == false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02da, code lost:
        r0 = com.whatsapp.R.drawable.ic_hero_account_added_landing_mpin;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02dd, code lost:
        r1.setImageResource(r0);
        r1 = r14.A03;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02e5, code lost:
        if (r3 == false) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02e7, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02ea, code lost:
        r1.setText(r0);
        r14.A02.setText(com.whatsapp.R.string.f11nameremoved);
        r14.A06.setText(com.whatsapp.R.string.f11nameremoved);
        r14.A07.setVisibility(8);
        r1 = r14.A06;
        r0 = 26;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r5 = r14
            super.onCreate(r15)
            X.AnonymousClass6C7.A0y(r14)
            r0 = 2131625118(0x7f0e049e, float:1.8877435E38)
            r14.setContentView((int) r0)
            X.0R8 r2 = X.AnonymousClass97T.A0Y(r14)
            r1 = 1
            if (r2 == 0) goto L_0x0021
            r0 = 2131891866(0x7f12169a, float:1.9418464E38)
            java.lang.String r0 = r14.getString(r0)
            r2.A0J(r0)
            r2.A0N(r1)
        L_0x0021:
            java.lang.String r12 = X.C1899593h.A0Z(r14)
            X.9ca r6 = r14.A0S
            r0 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = 0
            java.lang.String r10 = r14.A0b
            java.lang.String r11 = "registration_complete"
            X.303 r7 = r14.A7V()
            r6.A09(r7, r8, r9, r10, r11, r12)
            r2 = 2131430581(0x7f0b0cb5, float:1.8482867E38)
            android.widget.ImageView r2 = X.C86654Ky.A0M(r14, r2)
            r14.A01 = r2
            r2 = 2131434290(0x7f0b1b32, float:1.849039E38)
            android.widget.TextView r2 = X.C18310x6.A0L(r14, r2)
            r14.A03 = r2
            r2 = 2131429396(0x7f0b0814, float:1.8480464E38)
            android.widget.TextView r2 = X.C18310x6.A0L(r14, r2)
            r14.A02 = r2
            r2 = 2131432617(0x7f0b14a9, float:1.8486997E38)
            android.view.View r2 = r14.findViewById(r2)
            com.whatsapp.wds.components.button.WDSButton r2 = (com.whatsapp.wds.components.button.WDSButton) r2
            r14.A06 = r2
            r2 = 2131433379(0x7f0b17a3, float:1.8488542E38)
            android.view.View r2 = r14.findViewById(r2)
            com.whatsapp.wds.components.button.WDSButton r2 = (com.whatsapp.wds.components.button.WDSButton) r2
            r14.A07 = r2
            r2 = 2131430698(0x7f0b0d2a, float:1.8483104E38)
            android.view.View r2 = r14.findViewById(r2)
            r3 = 2131431882(0x7f0b11ca, float:1.8485506E38)
            android.view.View r4 = r14.findViewById(r3)
            r14.A00 = r4
            X.1VX r11 = r14.A0D
            X.3Wi r8 = r14.A05
            X.5hX r7 = r14.A00
            X.33i r10 = r14.A08
            r3 = 2131431881(0x7f0b11c9, float:1.8485504E38)
            com.whatsapp.TextEmojiLabel r9 = X.AnonymousClass0x7.A0K(r4, r3)
            r3 = 2131891879(0x7f1216a7, float:1.941849E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r13 = "learn-more"
            java.lang.String r12 = X.AnonymousClass002.A0F(r14, r13, r1, r0, r3)
            java.lang.String r1 = "https://faq.whatsapp.com/general/payments/about-payments-data"
            android.net.Uri r6 = android.net.Uri.parse(r1)
            X.C107635bd.A0E(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            android.view.View r1 = r14.A00
            r1.setVisibility(r0)
            android.view.View r1 = r14.A00
            r0 = 2131431883(0x7f0b11cb, float:1.8485508E38)
            X.C86604Kt.A1B(r1, r0)
            X.6hm r0 = r14.A0A
            if (r0 == 0) goto L_0x030a
            X.6hx r0 = r0.A08
            if (r0 == 0) goto L_0x030a
            r14.setupIncentiveInfoContainer(r2)
            X.6hm r0 = r14.A0A
            X.6hx r2 = r0.A08
            X.99H r2 = (X.AnonymousClass99H) r2
            X.9W6 r1 = r14.A0N
            java.lang.String r0 = r2.A0B
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x011a
            android.widget.TextView r1 = r14.A03
            r0 = 2131894696(0x7f1221a8, float:1.9424204E38)
            r1.setText(r0)
            android.widget.TextView r1 = r14.A02
            r0 = 2131894694(0x7f1221a6, float:1.94242E38)
            X.AnonymousClass97T.A0g(r1, r14, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 32
            X.C204249p3.A02(r1, r14, r0)
            r0 = 2131431882(0x7f0b11ca, float:1.8485506E38)
            android.view.View r1 = r14.findViewById(r0)
            X.1VX r11 = r14.A0D
            X.3Wi r8 = r14.A05
            X.5hX r7 = r14.A00
            X.33i r10 = r14.A08
            r0 = 2131431881(0x7f0b11c9, float:1.8485504E38)
            com.whatsapp.TextEmojiLabel r9 = X.AnonymousClass0x7.A0K(r1, r0)
            r0 = 2131894695(0x7f1221a7, float:1.9424202E38)
            java.lang.String r12 = X.C86604Kt.A0m(r14, r13, r0)
            java.lang.String r0 = "https://faq.whatsapp.com/797709544841009"
            android.net.Uri r6 = android.net.Uri.parse(r0)
            X.C107635bd.A0E(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0101:
            r14.A7b(r2)
            X.1iW r0 = r14.A04
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x010a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0312
            java.lang.Object r0 = r1.next()
            X.2Ub r0 = (X.C43942Ub) r0
            r0.A00()
            goto L_0x010a
        L_0x011a:
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x0120;
                case 1: goto L_0x01b1;
                case 2: goto L_0x01fd;
                case 3: goto L_0x0243;
                case 4: goto L_0x0243;
                case 5: goto L_0x0125;
                case 6: goto L_0x0243;
                case 7: goto L_0x011f;
                case 8: goto L_0x0243;
                case 9: goto L_0x0243;
                case 10: goto L_0x0243;
                case 11: goto L_0x0243;
                default: goto L_0x011f;
            }
        L_0x011f:
            goto L_0x0101
        L_0x0120:
            java.lang.String r0 = "Wrong onboarding type 0"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0125:
            boolean r0 = r14.A0l
            X.7yt r4 = r2.A05
            if (r0 == 0) goto L_0x018b
            X.9W6 r1 = r14.A0N
            X.6hm r0 = r14.A0A
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0146
            int r1 = r14.A03
            r0 = 1
            if (r1 != r0) goto L_0x0146
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r4.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0146
            goto L_0x028d
        L_0x0146:
            android.widget.ImageView r1 = r14.A01
            java.lang.Object r0 = r4.A00
            boolean r3 = X.AnonymousClass001.A1Z(r0)
            r0 = 2131232303(0x7f08062f, float:1.8080711E38)
            if (r3 == 0) goto L_0x0156
            r0 = 2131232304(0x7f080630, float:1.8080713E38)
        L_0x0156:
            r1.setImageResource(r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131886598(0x7f120206, float:1.940778E38)
            if (r3 == 0) goto L_0x0163
            r0 = 2131886597(0x7f120205, float:1.9407777E38)
        L_0x0163:
            r1.setText(r0)
            android.widget.TextView r1 = r14.A02
            r0 = 2131886593(0x7f120201, float:1.940777E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 2131886591(0x7f1201ff, float:1.9407765E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A07
            r0 = 2131886590(0x7f1201fe, float:1.9407763E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 36
            X.C204249p3.A02(r1, r14, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A07
            r0 = 27
            goto L_0x026d
        L_0x018b:
            android.widget.ImageView r0 = r14.A01
            r14.A7a(r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131886599(0x7f120207, float:1.9407781E38)
            r1.setText(r0)
            android.widget.TextView r3 = r14.A02
            java.lang.Object r0 = r4.A00
            boolean r1 = X.AnonymousClass001.A1Z(r0)
            r0 = 2131886595(0x7f120203, float:1.9407773E38)
            if (r1 == 0) goto L_0x01a8
            r0 = 2131886594(0x7f120202, float:1.9407771E38)
        L_0x01a8:
            X.AnonymousClass97T.A0g(r3, r14, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 28
            goto L_0x026d
        L_0x01b1:
            int r1 = r14.A00
            r0 = 20
            if (r1 == r0) goto L_0x0272
            X.7yt r0 = r2.A05
            android.widget.ImageView r1 = r14.A01
            java.lang.Object r0 = r0.A00
            boolean r3 = X.AnonymousClass001.A1Z(r0)
            r0 = 2131232303(0x7f08062f, float:1.8080711E38)
            if (r3 == 0) goto L_0x01c9
            r0 = 2131232304(0x7f080630, float:1.8080713E38)
        L_0x01c9:
            r1.setImageResource(r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131886598(0x7f120206, float:1.940778E38)
            if (r3 == 0) goto L_0x01d6
            r0 = 2131886597(0x7f120205, float:1.9407777E38)
        L_0x01d6:
            r1.setText(r0)
            android.widget.TextView r1 = r14.A02
            r0 = 2131886593(0x7f120201, float:1.940777E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 2131886591(0x7f1201ff, float:1.9407765E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A07
            r0 = 2131886590(0x7f1201fe, float:1.9407763E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 34
            X.C204249p3.A02(r1, r14, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A07
            r0 = 35
            goto L_0x026d
        L_0x01fd:
            X.7yt r0 = r2.A05
            android.widget.ImageView r1 = r14.A01
            java.lang.Object r0 = r0.A00
            boolean r3 = X.AnonymousClass001.A1Z(r0)
            r0 = 2131232303(0x7f08062f, float:1.8080711E38)
            if (r3 == 0) goto L_0x020f
            r0 = 2131232304(0x7f080630, float:1.8080713E38)
        L_0x020f:
            r1.setImageResource(r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131886598(0x7f120206, float:1.940778E38)
            if (r3 == 0) goto L_0x021c
            r0 = 2131886597(0x7f120205, float:1.9407777E38)
        L_0x021c:
            r1.setText(r0)
            android.widget.TextView r1 = r14.A02
            r0 = 2131886593(0x7f120201, float:1.940777E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 2131886590(0x7f1201fe, float:1.9407763E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A07
            r0 = 2131886591(0x7f1201ff, float:1.9407765E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 29
            X.C204249p3.A02(r1, r14, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A07
            r0 = 30
            goto L_0x026d
        L_0x0243:
            boolean r0 = r14.A0l
            if (r0 != 0) goto L_0x0272
            X.7yt r4 = r2.A05
            android.widget.ImageView r0 = r14.A01
            r14.A7a(r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131886599(0x7f120207, float:1.9407781E38)
            r1.setText(r0)
            android.widget.TextView r3 = r14.A02
            java.lang.Object r0 = r4.A00
            boolean r1 = X.AnonymousClass001.A1Z(r0)
            r0 = 2131886595(0x7f120203, float:1.9407773E38)
            if (r1 == 0) goto L_0x0266
            r0 = 2131886594(0x7f120202, float:1.9407771E38)
        L_0x0266:
            X.AnonymousClass97T.A0g(r3, r14, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 31
        L_0x026d:
            X.C204249p3.A02(r1, r14, r0)
            goto L_0x0101
        L_0x0272:
            X.7yt r3 = r2.A05
            X.9W6 r1 = r14.A0N
            X.6hm r0 = r14.A0A
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x02cd
            int r1 = r14.A03
            r0 = 1
            if (r1 != r0) goto L_0x02cd
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r3.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02cd
        L_0x028d:
            android.widget.ImageView r0 = r14.A01
            r14.A7a(r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131886599(0x7f120207, float:1.9407781E38)
            r1.setText(r0)
            android.widget.TextView r1 = r14.A02
            r0 = 2131886592(0x7f120200, float:1.9407767E38)
            r1.setText(r0)
            X.6hm r0 = r14.A0A
            if (r0 == 0) goto L_0x02b0
            X.6hx r0 = r0.A08
            X.C626936e.A06(r0)
            X.99H r0 = (X.AnonymousClass99H) r0
            r14.A7b(r0)
        L_0x02b0:
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 2131887053(0x7f1203cd, float:1.9408702E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r14.A07
            r3 = 8
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 33
            X.C204249p3.A02(r1, r14, r0)
            android.view.View r0 = r14.A00
            r0.setVisibility(r3)
            goto L_0x0101
        L_0x02cd:
            android.widget.ImageView r1 = r14.A01
            java.lang.Object r0 = r3.A00
            boolean r3 = X.AnonymousClass001.A1Z(r0)
            r0 = 2131232303(0x7f08062f, float:1.8080711E38)
            if (r3 == 0) goto L_0x02dd
            r0 = 2131232304(0x7f080630, float:1.8080713E38)
        L_0x02dd:
            r1.setImageResource(r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131886598(0x7f120206, float:1.940778E38)
            if (r3 == 0) goto L_0x02ea
            r0 = 2131886597(0x7f120205, float:1.9407777E38)
        L_0x02ea:
            r1.setText(r0)
            android.widget.TextView r1 = r14.A02
            r0 = 2131886593(0x7f120201, float:1.940777E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 2131887053(0x7f1203cd, float:1.9408702E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A07
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            r0 = 26
            goto L_0x026d
        L_0x030a:
            java.lang.String r0 = "Screen called without valid account, finishing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r14.finish()
        L_0x0312:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity.onCreate(android.os.Bundle):void");
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
            this.A05 = C1899593h.A0O(r2);
            this.A04 = C1899693i.A0L(r2);
        }
    }

    public final AnonymousClass303 A7V() {
        if (C161527pr.A02(this.A0F) || !this.A0W.A0t(this.A0G)) {
            return null;
        }
        return C190889Af.A00();
    }

    public void A7W() {
        this.A0S.A09(A7V(), AnonymousClass001.A0f(), C18290x4.A0a(), this.A0b, "registration_complete", (String) null);
    }

    public void A7X() {
        this.A0S.A09(A7V(), AnonymousClass001.A0f(), C18290x4.A0c(), this.A0b, "registration_complete", (String) null);
    }

    public void A7Y() {
        this.A0S.A09(A7V(), AnonymousClass001.A0f(), 47, this.A0b, "registration_complete", (String) null);
    }

    public final void A7Z() {
        Class cls;
        if (this.A0E != null || !C161527pr.A03(this.A0I)) {
            if (C154437dA.A00(this.A0D)) {
                cls = IndiaUpiSendPaymentActivityBottomSheet.class;
            } else {
                cls = IndiaUpiSendPaymentActivity.class;
            }
            Intent A082 = AnonymousClass0x9.A08(this, cls);
            A7O(A082);
            startActivity(A082);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("openPaymentActivity, jid and vpa is null, payment entry type = ");
            A0o.append(this.A02);
            C18280x3.A13(A0o);
        }
        finish();
    }

    public final void setupIncentiveInfoContainer(View view) {
        String A0s;
        if (this.A00 == 20) {
            A0s = getString(R.string.f11nameremoved);
        } else if (C161527pr.A02(this.A0F) || !this.A0W.A0t(this.A0G)) {
            view.setVisibility(8);
            return;
        } else {
            Object[] A0L = AnonymousClass002.A0L();
            C166557yt r0 = this.A0F;
            C626936e.A06(r0);
            Object obj = r0.A00;
            C626936e.A06(obj);
            A0s = C86614Ku.A0s(this, obj, A0L, R.string.f11nameremoved);
        }
        view.setVisibility(0);
        C18300x5.A0G(view, R.id.incentive_info_text).setText(A0s);
    }

    public IndiaUpiBankAccountAddedLandingActivity(int i) {
        this.A08 = false;
        C204019og.A00(this, 48);
    }

    public final void A7a(ImageView imageView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        int applyDimension = (int) TypedValue.applyDimension(1, 64.0f, AnonymousClass000.A0B(this));
        layoutParams.width = applyDimension;
        layoutParams.height = applyDimension;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.ic_hero_bank_added);
    }

    public final void A7b(AnonymousClass99H r6) {
        View findViewById = findViewById(R.id.account_layout);
        C06560Yg.A02(findViewById, R.id.progress).setVisibility(8);
        C86604Kt.A1E(findViewById, R.id.divider, 8);
        C86604Kt.A1E(findViewById, R.id.radio_button, 8);
        AnonymousClass97T.A0f(findViewById, this.A0A);
        C18300x5.A0G(findViewById, R.id.account_number).setText(this.A05.A02(this.A0A, false));
        C18300x5.A0G(findViewById, R.id.account_name).setText((CharSequence) C1899593h.A0X(r6.A03));
        C18300x5.A0G(findViewById, R.id.account_type).setText(r6.A0E());
        if (!(!"OD_UNSECURED".equals(r6.A0B))) {
            TextView A0L = C18310x6.A0L(this, R.id.overdraft_description);
            A0L.setVisibility(0);
            A0L.setText(R.string.f11nameremoved);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        A7W();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A7W();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiBankAccountAddedLandingActivity() {
        this(0);
    }
}
