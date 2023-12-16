package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass97T;
import X.AnonymousClass9DA;
import X.C107695bk;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C192799Lp;
import X.C204019og;
import X.C64333Db;
import X.C88834as;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;

public class IndiaUpiOnboardingErrorEducationActivity extends AnonymousClass9DA {
    public int A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public WDSButton A04;
    public boolean A05;

    public void onBackPressed() {
        A7W(1);
        if (this.A00 != 4059001) {
            A7V();
        } else {
            finish();
        }
    }

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
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
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0144 A[LOOP:0: B:32:0x013e->B:34:0x0144, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r2 = r17
            r0 = r18
            super.onCreate(r0)
            r0 = 2131625134(0x7f0e04ae, float:1.8877467E38)
            r2.setContentView((int) r0)
            r1 = 2131233348(0x7f080a44, float:1.808283E38)
            r0 = 2131433256(0x7f0b1728, float:1.8488293E38)
            r2.A7K(r1, r0)
            X.0R8 r3 = r2.getSupportActionBar()
            r1 = 1
            if (r3 == 0) goto L_0x002a
            r0 = 2131892083(0x7f121773, float:1.9418904E38)
            java.lang.String r0 = r2.getString(r0)
            r3.A0J(r0)
            r3.A0N(r1)
        L_0x002a:
            r0 = 2131430580(0x7f0b0cb4, float:1.8482865E38)
            android.widget.ImageView r0 = X.C86654Ky.A0M(r2, r0)
            r2.A01 = r0
            r0 = 2131429883(0x7f0b09fb, float:1.8481451E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r2, r0)
            r2.A03 = r0
            r0 = 2131429882(0x7f0b09fa, float:1.848145E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r2, r0)
            r2.A02 = r0
            r0 = 2131431933(0x7f0b11fd, float:1.848561E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r2.A04 = r0
            android.content.Intent r4 = r2.getIntent()
            r0 = -1
            java.lang.String r3 = "error_code"
            int r0 = r4.getIntExtra(r3, r0)
            r2.A00 = r0
            r4 = 0
            X.303[] r0 = new X.AnonymousClass303[r4]
            r5 = 0
            X.303 r9 = new X.303
            r9.<init>(r5, r0)
            int r0 = r2.A00
            r9.A02(r3, r0)
            X.9ca r8 = r2.A0S
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            java.lang.String r7 = "error"
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r6 = "extra_referral_screen"
            java.lang.String r13 = r0.getStringExtra(r6)
            r11 = r5
            r12 = r7
            r10 = r16
            r8.BKE(r9, r10, r11, r12, r13)
            int r3 = r2.A00
            r0 = 446(0x1be, float:6.25E-43)
            if (r3 == r0) goto L_0x0346
            r0 = 11498(0x2cea, float:1.6112E-41)
            if (r3 == r0) goto L_0x0329
            r0 = 1383026(0x151a72, float:1.938032E-39)
            if (r3 == r0) goto L_0x0301
            r0 = 4059001(0x3def79, float:5.687872E-39)
            if (r3 == r0) goto L_0x02d5
            android.content.Intent r0 = r2.getIntent()
            int r8 = r0.getIntExtra(r7, r4)
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = "error_text"
            java.lang.String r3 = r3.getStringExtra(r0)
            r0 = 2131894682(0x7f12219a, float:1.9424176E38)
            if (r8 == r0) goto L_0x0301
            android.content.Intent r7 = r2.getIntent()
            java.lang.String r0 = "error_type"
            int r12 = r7.getIntExtra(r0, r4)
            android.content.Intent r7 = r2.getIntent()
            java.lang.String r0 = "extra_bank_account"
            android.os.Parcelable r7 = r7.getParcelableExtra(r0)
            X.6hu r7 = (X.C133766hu) r7
            if (r7 == 0) goto L_0x0259
            X.7yt r0 = r7.A01
            java.lang.Object r10 = X.C1899593h.A0X(r0)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r13 = r7.A04
        L_0x00d1:
            r14 = 5
            if (r12 < r1) goto L_0x025e
            r0 = 4
            if (r12 > r0) goto L_0x025e
            X.2sr r0 = r2.A01
            X.1RR r0 = X.C86634Kw.A0V(r0)
            java.lang.String r7 = X.AnonymousClass36P.A02(r0)
            r3 = 0
            if (r7 == 0) goto L_0x00ec
            r3 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r3 = r7.replace(r3, r0)
        L_0x00ec:
            X.33j r0 = r2.A00
            java.lang.String r11 = r0.A0I(r3)
            r0 = 2131430081(0x7f0b0ac1, float:1.8481853E38)
            android.view.View r7 = r2.findViewById(r0)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r0 = 2131430082(0x7f0b0ac2, float:1.8481855E38)
            android.widget.TextView r9 = X.AnonymousClass002.A09(r7, r0)
            java.util.ArrayList r3 = X.AnonymousClass002.A0I(r14)
            r14 = 2
            if (r12 != r1) goto L_0x01b5
            com.whatsapp.wds.components.button.WDSButton r9 = r2.A04
            r0 = 2131892242(0x7f121812, float:1.9419227E38)
            r9.setText(r0)
            android.widget.TextView r15 = r2.A03
            r12 = 2131886602(0x7f12020a, float:1.9407787E38)
            java.lang.Object[] r9 = new java.lang.Object[r1]
            X.33j r0 = r2.A00
            java.lang.String r0 = r0.A0H(r10)
            r9[r4] = r0
            X.AnonymousClass001.A0y(r2, r15, r9, r12)
            r10 = 2131889662(0x7f120dfe, float:1.9413994E38)
            if (r8 != r10) goto L_0x013a
            android.widget.TextView r9 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x01a6
            r0 = 2131889663(0x7f120dff, float:1.9413996E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r2, r11, r1, r0)
        L_0x0137:
            r9.setText(r1)
        L_0x013a:
            java.util.Iterator r10 = r3.iterator()
        L_0x013e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x029b
            java.lang.String r9 = X.AnonymousClass001.A0m(r10)
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r9)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167795(0x7f070a33, float:1.7949874E38)
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            X.93z r1 = new X.93z
            r1.<init>(r0)
            int r0 = r9.length()
            r8.setSpan(r1, r4, r0, r4)
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r2)
            r9.setText(r8)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131102351(0x7f060a8f, float:1.7817137E38)
            X.C18320x8.A11(r1, r9, r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167753(0x7f070a09, float:1.7949788E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r9.setTextSize(r4, r0)
            android.content.res.Resources r0 = r2.getResources()
            r8 = 2131167752(0x7f070a08, float:1.7949786E38)
            int r0 = r0.getDimensionPixelSize(r8)
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.setLineSpacing(r1, r0)
            android.content.res.Resources r0 = r2.getResources()
            int r0 = r0.getDimensionPixelSize(r8)
            r9.setPadding(r4, r4, r4, r0)
            r7.addView(r9)
            goto L_0x013e
        L_0x01a6:
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r8[r4] = r11
            X.33j r0 = r2.A00
            java.lang.String r0 = r0.A0I(r13)
            java.lang.String r1 = X.AnonymousClass002.A0F(r2, r0, r8, r1, r10)
            goto L_0x0137
        L_0x01b5:
            if (r12 != r14) goto L_0x0203
            android.widget.ImageView r3 = r2.A01
            if (r3 == 0) goto L_0x01c1
            r0 = 2131232315(0x7f08063b, float:1.8080736E38)
            X.C18290x4.A1A(r2, r3, r0)
        L_0x01c1:
            android.widget.TextView r3 = r2.A03
            r0 = 2131888601(0x7f1209d9, float:1.9411842E38)
            r3.setText(r0)
            r0 = 2131888598(0x7f1209d6, float:1.9411836E38)
            r9.setText(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r0 = 2131888594(0x7f1209d2, float:1.9411828E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r2, r11, r1, r0)
            r3.add(r0)
            r0 = 2131888595(0x7f1209d3, float:1.941183E38)
            java.lang.String r0 = r2.getString(r0)
            r3.add(r0)
            r0 = 2131888596(0x7f1209d4, float:1.9411832E38)
            java.lang.String r0 = r2.getString(r0)
            r3.add(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r8 > r0) goto L_0x013a
            r0 = 2131888597(0x7f1209d5, float:1.9411834E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r2, r11, r1, r0)
            r3.add(r0)
            goto L_0x013a
        L_0x0203:
            r0 = 3
            if (r12 != r0) goto L_0x023d
            android.widget.ImageView r3 = r2.A01
            if (r3 == 0) goto L_0x0210
            r0 = 2131232315(0x7f08063b, float:1.8080736E38)
            X.C18290x4.A1A(r2, r3, r0)
        L_0x0210:
            android.widget.TextView r3 = r2.A03
            r0 = 2131888602(0x7f1209da, float:1.9411844E38)
            r3.setText(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r8 > r0) goto L_0x022c
            r0 = 2131888600(0x7f1209d8, float:1.941184E38)
            java.lang.String r0 = r2.getString(r0)
            r3.add(r0)
        L_0x022c:
            r0 = 2131888593(0x7f1209d1, float:1.9411826E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r2, r11, r1, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0137
            android.widget.TextView r9 = r2.A02
            goto L_0x0137
        L_0x023d:
            android.widget.ImageView r1 = r2.A01
            if (r1 == 0) goto L_0x0247
            r0 = 2131232315(0x7f08063b, float:1.8080736E38)
            X.C18290x4.A1A(r2, r1, r0)
        L_0x0247:
            android.widget.TextView r1 = r2.A03
            r0 = 2131888601(0x7f1209d9, float:1.9411842E38)
            r1.setText(r0)
            android.widget.TextView r1 = r2.A02
            r0 = 2131888599(0x7f1209d7, float:1.9411838E38)
            r1.setText(r0)
            goto L_0x013a
        L_0x0259:
            java.lang.String r10 = ""
            r13 = r10
            goto L_0x00d1
        L_0x025e:
            if (r8 <= 0) goto L_0x02ab
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0278
            if (r12 != r14) goto L_0x0278
        L_0x0268:
            android.widget.TextView r3 = r2.A02
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.33j r0 = r2.A00
            java.lang.String r0 = r0.A0H(r10)
            r1[r4] = r0
            X.AnonymousClass001.A0y(r2, r3, r1, r8)
            goto L_0x02ab
        L_0x0278:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0282
            r0 = 6
            if (r12 != r0) goto L_0x0282
            goto L_0x0268
        L_0x0282:
            r0 = 7
            if (r12 != r0) goto L_0x0293
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 2131892242(0x7f121812, float:1.9419227E38)
            r1.setText(r0)
        L_0x028d:
            android.widget.TextView r0 = r2.A02
            r0.setText(r3)
            goto L_0x02ab
        L_0x0293:
            if (r3 != 0) goto L_0x028d
            android.widget.TextView r0 = r2.A02
            r0.setText(r8)
            goto L_0x02ab
        L_0x029b:
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x02ab
            r7.setVisibility(r4)
            android.widget.TextView r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
        L_0x02ab:
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 59
            X.C204249p3.A02(r1, r2, r0)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "extra_error_screen_name"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x02cd
            X.9ca r4 = r2.A0S
            java.lang.String r3 = X.C1899693i.A0a(r2, r1)
            java.lang.String r1 = X.C1899693i.A0a(r2, r6)
            r0 = r16
            r4.BKB(r0, r5, r3, r1)
        L_0x02cd:
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r2)
            r2.onConfigurationChanged(r0)
            return
        L_0x02d5:
            r1 = 2131232315(0x7f08063b, float:1.8080736E38)
            android.widget.ImageView r0 = r2.A01
            X.C18290x4.A1A(r2, r0, r1)
            r1 = 2131892245(0x7f121815, float:1.9419233E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131891948(0x7f1216ec, float:1.941863E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            r0 = 56
            X.9p3 r3 = X.C204249p3.A00(r2, r0)
            r1 = 2131892242(0x7f121812, float:1.9419227E38)
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A04
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A04
            r0.setOnClickListener(r3)
            return
        L_0x0301:
            r1 = 2131231921(0x7f0804b1, float:1.8079937E38)
            android.widget.ImageView r0 = r2.A01
            X.C18290x4.A1A(r2, r0, r1)
            r1 = 2131894683(0x7f12219b, float:1.9424178E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131894682(0x7f12219a, float:1.9424176E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 2131894681(0x7f122199, float:1.9424174E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 60
            X.C204249p3.A02(r1, r2, r0)
            return
        L_0x0329:
            r1 = 2131231921(0x7f0804b1, float:1.8079937E38)
            android.widget.ImageView r0 = r2.A01
            X.C18290x4.A1A(r2, r0, r1)
            r1 = 2131886603(0x7f12020b, float:1.940779E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131894712(0x7f1221b8, float:1.9424237E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 57
            goto L_0x0362
        L_0x0346:
            r1 = 2131231921(0x7f0804b1, float:1.8079937E38)
            android.widget.ImageView r0 = r2.A01
            X.C18290x4.A1A(r2, r0, r1)
            r1 = 2131892245(0x7f121815, float:1.9419233E38)
            android.widget.TextView r0 = r2.A03
            r0.setText(r1)
            r1 = 2131894863(0x7f12224f, float:1.9424543E38)
            android.widget.TextView r0 = r2.A02
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            r0 = 58
        L_0x0362:
            X.C204249p3.A02(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiOnboardingErrorEducationActivity(int i) {
        this.A05 = false;
        C204019og.A00(this, 69);
    }

    public final void A7V() {
        Class<IndiaUpiPaymentsAccountSetupActivity> cls;
        int i = 0;
        if (getIntent() != null) {
            i = getIntent().getIntExtra("try_again", 0);
        }
        if (this.A0k || i <= 0) {
            cls = IndiaUpiPaymentsAccountSetupActivity.class;
        } else {
            if (i == 1) {
                cls = C192799Lp.A00(this.A0D);
            }
            finish();
        }
        Intent A08 = AnonymousClass0x9.A08(this, cls);
        A7O(A08);
        startActivity(A08);
        finish();
    }

    public final void A7W(int i) {
        if (getIntent().hasExtra("extra_error_screen_name")) {
            this.A0S.BKB(AnonymousClass001.A0f(), Integer.valueOf(i), C1899693i.A0a(this, "extra_error_screen_name"), C1899593h.A0a(this));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A7W(1);
        if (this.A00 != 4059001) {
            A7V();
            return true;
        }
        finish();
        return true;
    }

    public IndiaUpiOnboardingErrorEducationActivity() {
        this(0);
        this.A00 = -1;
    }
}
