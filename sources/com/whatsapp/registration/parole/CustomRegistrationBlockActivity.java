package com.whatsapp.registration.parole;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C106715a2;
import X.C107695bk;
import X.C18280x3;
import X.C64333Db;
import X.C89644eZ;

public final class CustomRegistrationBlockActivity extends C89644eZ {
    public C106715a2 A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = C18280x3.A0Q(r0);
        }
    }

    public CustomRegistrationBlockActivity(int i) {
        this.A07 = false;
        AnonymousClass4HY.A00(this, 107);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0086, code lost:
        if (r2.length() == 0) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r0 = 2131624029(0x7f0e005d, float:1.8875226E38)
            r6.setContentView((int) r0)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "title_text"
            java.lang.String r0 = r1.getStringExtra(r0)
            r6.A06 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "body_text"
            java.lang.String r0 = r1.getStringExtra(r0)
            r6.A01 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "button_primary_text"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.C626936e.A06(r0)
            X.C162457s7.A0D(r0)
            r6.A03 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "button_secondary_text"
            java.lang.String r0 = r1.getStringExtra(r0)
            r6.A05 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "button_primary_link"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.C626936e.A06(r0)
            X.C162457s7.A0D(r0)
            r6.A02 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "button_secondary_link"
            java.lang.String r0 = r1.getStringExtra(r0)
            r6.A04 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "show_custom_fields"
            boolean r0 = X.AnonymousClass0x9.A1N(r1, r0)
            if (r0 == 0) goto L_0x00fd
            r0 = 2131434290(0x7f0b1b32, float:1.849039E38)
            android.view.View r5 = X.C18290x4.A0L(r6, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131428070(0x7f0b02e6, float:1.8477774E38)
            android.view.View r4 = X.C18290x4.A0L(r6, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r2 = r6.A06
            if (r2 == 0) goto L_0x0088
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0089
        L_0x0088:
            r0 = 1
        L_0x0089:
            r3 = 8
            if (r0 == 0) goto L_0x00d5
            r5.setVisibility(r3)
        L_0x0090:
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x00d1
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00d1
            X.5a2 r2 = r6.A00
            if (r2 == 0) goto L_0x00de
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x00d9
            android.text.SpannableString r1 = r2.A03(r1, r0)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r4.setText(r1, r0)
            X.1VX r0 = r6.A0D
            X.AnonymousClass1Hf.A2C(r4, r6, r0)
        L_0x00b4:
            r0 = 2131432617(0x7f0b14a9, float:1.8486997E38)
            android.view.View r1 = X.C18290x4.A0L(r6, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131433379(0x7f0b17a3, float:1.8488542E38)
            android.view.View r2 = X.C18290x4.A0L(r6, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r0 = r6.A03
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = "buttonPrimaryText"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00d1:
            r4.setVisibility(r3)
            goto L_0x00b4
        L_0x00d5:
            r5.setText(r2)
            goto L_0x0090
        L_0x00d9:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()
            throw r0
        L_0x00de:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00e5:
            r1.setText(r0)
            r0 = 21
            X.AnonymousClass0x2.A10(r1, r6, r0)
            java.lang.String r1 = r6.A05
            if (r1 == 0) goto L_0x00fe
            java.lang.String r0 = r6.A04
            if (r0 == 0) goto L_0x00fe
            r2.setText(r1)
            r0 = 22
            X.AnonymousClass0x2.A10(r2, r6, r0)
        L_0x00fd:
            return
        L_0x00fe:
            r2.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.parole.CustomRegistrationBlockActivity.onCreate(android.os.Bundle):void");
    }

    public CustomRegistrationBlockActivity() {
        this(0);
    }
}
