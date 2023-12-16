package com.whatsapp.payments.ui;

import X.AnonymousClass31C;
import X.AnonymousClass33K;
import X.AnonymousClass5WY;
import X.AnonymousClass97S;
import X.AnonymousClass9SH;
import X.AnonymousClass9TJ;
import X.AnonymousClass9TR;
import X.AnonymousClass9U4;
import X.AnonymousClass9VB;
import X.AnonymousClass9VU;
import X.AnonymousClass9W3;
import X.AnonymousClass9bR;
import X.C107695bk;
import X.C133786hw;
import X.C166587yw;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C1902294r;
import X.C1906899l;
import X.C1907099n;
import X.C191049Av;
import X.C191109By;
import X.C194029Rh;
import X.C194219Sa;
import X.C194489Tb;
import X.C194649Ty;
import X.C194929Vc;
import X.C195089Vv;
import X.C196709bc;
import X.C204019og;
import X.C29261iX;
import X.C40602Ha;
import X.C617332a;
import X.C621433s;
import X.C626936e;
import X.C64333Db;
import X.C88834as;
import android.os.Build;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilPaymentCardDetailsActivity extends C191109By {
    public C617332a A00;
    public AnonymousClass31C A01;
    public AnonymousClass9bR A02;
    public C195089Vv A03;
    public C196709bc A04;
    public C194929Vc A05;
    public C1907099n A06;
    public AnonymousClass9VU A07;
    public AnonymousClass9W3 A08;
    public AnonymousClass9VB A09;
    public AnonymousClass9TR A0A;
    public AnonymousClass9TJ A0B;
    public C194649Ty A0C;
    public C1902294r A0D;
    public C194219Sa A0E;
    public boolean A0F;

    public void A77(boolean z) {
        FingerprintBottomSheet fingerprintBottomSheet;
        String A0b = C1899693i.A0b(this);
        PinBottomSheetDialogFragment A002 = AnonymousClass9SH.A00();
        if (Build.VERSION.SDK_INT >= 23) {
            fingerprintBottomSheet = C1899693i.A07();
        } else {
            fingerprintBottomSheet = null;
        }
        C191049Av r8 = new C191049Av(this.A01, this.A06, this.A05, this.A08, A0b, this.A08.A0A);
        C1902294r r1 = this.A0D;
        if (r1 != null) {
            r1.A0E(this, fingerprintBottomSheet, r8, A002, A0b, "REMOVEMETHOD", "FB");
        }
    }

    public void A5r() {
        if (!this.A0F) {
            this.A0F = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            this.A04 = C64333Db.A04(r2);
            this.A0I = C64333Db.A8y(r2);
            this.A09 = (AnonymousClass33K) r2.AaW.get();
            this.A06 = C64333Db.A07(r2);
            this.A05 = (AnonymousClass5WY) r2.AUS.get();
            this.A07 = C64333Db.A2t(r2);
            this.A0D = C1899593h.A0I(r2);
            this.A0G = C1899593h.A0O(r2);
            this.A0A = (C1906899l) r2.APJ.get();
            this.A0C = C1899593h.A0G(r2);
            this.A0B = (C29261iX) r2.APs.get();
            this.A0C = C1899593h.A0Q(r2);
            this.A01 = C64333Db.A3D(r2);
            this.A04 = C1899593h.A0E(r2);
            this.A05 = C1899593h.A0F(r2);
            this.A09 = (C194029Rh) r2.ANN.get();
            this.A08 = C1899693i.A0P(r2);
            this.A07 = C1899693i.A0O(r2);
            this.A02 = (C40602Ha) C1899693i.A0Y(r2);
            this.A06 = r1.AN7();
            this.A03 = (C194489Tb) r2.APu.get();
            this.A01 = C64333Db.A5u(r2);
            this.A09 = (AnonymousClass9VB) r1.A8j.get();
            this.A03 = (C195089Vv) r1.A16.get();
            this.A02 = (AnonymousClass9bR) r1.A14.get();
            this.A0B = (AnonymousClass9TJ) r1.A17.get();
            this.A06 = C1899593h.A0H(r2);
            this.A0A = (AnonymousClass9TR) r1.A8k.get();
            this.A00 = C1899593h.A09(r2);
            this.A0E = (C194219Sa) r1.A18.get();
            this.A04 = A0I.ACj();
            this.A05 = (C194929Vc) r2.A3V.get();
            this.A07 = (AnonymousClass9VU) r2.AQH.get();
            this.A08 = (AnonymousClass9W3) r1.A8g.get();
            this.A0C = (C194649Ty) r1.A1I.get();
        }
    }

    public void A75() {
        C621433s.A01(this, 201);
    }

    public final void A7B(String str) {
        if (this.A06.A02.A0X(2984)) {
            BjL();
            C166587yw A022 = AnonymousClass9U4.A02(this.A0D, str);
            C626936e.A06(A022);
            C133786hw r2 = (C133786hw) A022.A08;
            if (r2 != null) {
                String str2 = r2.A0F;
                if (str2.equals("NEEDS_RETOKENIZATION") || str2.equals("NEEDS_RETOKENIZATION_DELETED")) {
                    BpY(AnonymousClass97S.A0C(this, r2, str), 1);
                }
            }
        }
    }

    public BrazilPaymentCardDetailsActivity(int i) {
        this.A0F = false;
        C204019og.A00(this, 26);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A76(X.C166587yw r9, boolean r10) {
        /*
            r8 = this;
            super.A76(r9, r10)
            if (r10 == 0) goto L_0x0028
            r0 = 2131432202(0x7f0b130a, float:1.8486155E38)
            X.C86604Kt.A1L(r8, r0)
            X.94D r1 = new X.94D
            r1.<init>(r8)
            r8.A0B = r1
            X.7yw r0 = r8.A08
            X.6hr r0 = (X.C133736hr) r0
            r1.setCard(r0)
            r0 = 2131432198(0x7f0b1306, float:1.8486147E38)
            android.view.View r2 = r8.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.94D r1 = r8.A0B
            r0 = 0
            r2.addView(r1, r0)
        L_0x0028:
            X.6hx r4 = r9.A08
            X.6hw r4 = (X.C133786hw) r4
            if (r4 == 0) goto L_0x0109
            X.94D r0 = r8.A0B
            if (r0 == 0) goto L_0x00c5
            X.9TJ r5 = r8.A0B
            X.7yw r3 = r8.A08
            r0 = 2131428553(0x7f0b04c9, float:1.8478754E38)
            android.widget.ImageView r2 = X.C86654Ky.A0M(r8, r0)
            android.content.Context r0 = r8.getBaseContext()
            X.93p r1 = new X.93p
            r1.<init>(r0)
            r0 = 1
            r5.A00(r1, r2, r3, r0)
            X.94D r0 = r8.A0B
            r1 = 8
            r0.setCardNameTextViewVisibility(r1)
            X.94D r0 = r8.A0B
            r0.setCardNetworkIconVisibility(r1)
            X.94D r2 = r8.A0B
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131099990(0x7f060156, float:1.7812349E38)
            int r0 = r1.getColor(r0)
            r2.setCardNumberTextColor(r0)
            java.lang.String r5 = r4.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00c5
            X.94D r6 = r8.A0B     // Catch:{ Exception -> 0x00b7 }
            r0 = 0
            char r1 = r5.charAt(r0)     // Catch:{ Exception -> 0x00b7 }
            r0 = 48
            java.lang.String r7 = "Unknown color"
            if (r1 != r0) goto L_0x00b2
            r2 = 1
            char r1 = r5.charAt(r2)     // Catch:{ Exception -> 0x00b7 }
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L_0x008c
            char r1 = r5.charAt(r2)     // Catch:{ Exception -> 0x00b7 }
            r0 = 88
            if (r1 != r0) goto L_0x00b2
        L_0x008c:
            r0 = 2
            java.lang.String r1 = r5.substring(r0)     // Catch:{ Exception -> 0x00b7 }
            r0 = 16
            long r2 = java.lang.Long.parseLong(r1, r0)     // Catch:{ Exception -> 0x00b7 }
            int r1 = r5.length()     // Catch:{ Exception -> 0x00b7 }
            r0 = 8
            if (r1 != r0) goto L_0x00a4
            r0 = -16777216(0xffffffffff000000, double:NaN)
            long r2 = r2 | r0
            goto L_0x00ad
        L_0x00a4:
            r0 = 10
            if (r1 == r0) goto L_0x00ad
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r7)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00b6
        L_0x00ad:
            int r0 = (int) r2     // Catch:{ Exception -> 0x00b7 }
            r6.setCardNumberTextColor(r0)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00c5
        L_0x00b2:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r7)     // Catch:{ Exception -> 0x00b7 }
        L_0x00b6:
            throw r0     // Catch:{ Exception -> 0x00b7 }
        L_0x00b7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: Could not apply label color: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)
            com.whatsapp.util.Log.w(r0, r2)
        L_0x00c5:
            java.lang.String r1 = r4.A0I
            int r0 = r1.hashCode()
            switch(r0) {
                case -1757659853: goto L_0x010d;
                case -591252731: goto L_0x0110;
                case 1124965819: goto L_0x0123;
                case 1925346054: goto L_0x013d;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            r1 = 0
            X.9oM r0 = new X.9oM
            r0.<init>(r8, r1)
            X.0XL r1 = X.AnonymousClass4L0.A0F(r0, r8)
            java.lang.Class<X.9Fw> r0 = X.C191679Fw.class
            X.0Ty r0 = r1.A01(r0)
            X.94r r0 = (X.C1902294r) r0
            r8.A0D = r0
            X.08M r1 = r0.A03
            r0 = 9
            X.C205049qL.A02(r8, r1, r0)
            X.94r r0 = r8.A0D
            X.08M r1 = r0.A00
            r0 = 10
            X.C205049qL.A02(r8, r1, r0)
            X.94r r1 = r8.A0D
            boolean r0 = r1 instanceof X.C191689Fx
            if (r0 == 0) goto L_0x010a
            X.9Fx r1 = (X.C191689Fx) r1
            X.08M r1 = r1.A03
        L_0x00fc:
            r0 = 7
            X.C205049qL.A02(r8, r1, r0)
            X.94r r0 = r8.A0D
            X.08M r1 = r0.A02
            r0 = 8
            X.C205049qL.A02(r8, r1, r0)
        L_0x0109:
            return
        L_0x010a:
            X.08M r1 = r1.A01
            goto L_0x00fc
        L_0x010d:
            java.lang.String r0 = "VOIDED"
            goto L_0x0112
        L_0x0110:
            java.lang.String r0 = "EXPIRED"
        L_0x0112:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ce
            r0 = 0
            r8.A79(r0)
            X.94N r1 = r8.A0A
            if (r1 == 0) goto L_0x00ce
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x0135
        L_0x0123:
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ce
            r0 = 3
            r8.A79(r0)
            X.94N r1 = r8.A0A
            if (r1 == 0) goto L_0x00ce
            r0 = 102(0x66, float:1.43E-43)
        L_0x0135:
            X.9p3 r0 = X.C204249p3.A00(r8, r0)
            r1.setAlertButtonClickListener(r0)
            goto L_0x00ce
        L_0x013d:
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ce
            java.lang.String r1 = "REQUIRES_VERIFICATION"
            java.lang.String r0 = r4.A0M
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0173
            r0 = 4
            r8.A79(r0)
            X.94N r0 = r8.A0A
            if (r0 == 0) goto L_0x00ce
            X.1VX r1 = r8.A0D
            r0 = 1927(0x787, float:2.7E-42)
            boolean r4 = r1.A0X(r0)
            X.94N r3 = r8.A0A
            X.7yw r0 = r8.A08
            java.lang.String r2 = r0.A0A
            r1 = 1
            if (r4 == 0) goto L_0x0169
            r1 = 2
        L_0x0169:
            X.9pM r0 = new X.9pM
            r0.<init>(r1, r2, r8)
            r3.setAlertButtonClickListener(r0)
            goto L_0x00ce
        L_0x0173:
            boolean r0 = r4.A0a
            if (r0 != 0) goto L_0x0180
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x0180
            r8.A78()
            goto L_0x00ce
        L_0x0180:
            java.lang.Long r0 = r4.A09
            if (r0 == 0) goto L_0x00ce
            X.2sH r0 = r8.A06
            long r2 = r0.A0H()
            java.lang.Long r0 = r4.A09
            long r0 = r0.longValue()
            int r1 = X.C107175ap.A00(r2, r0)
            r0 = 30
            if (r1 > r0) goto L_0x00ce
            r0 = 2
            r8.A79(r0)
            java.lang.Long r0 = X.AnonymousClass0x2.A0T()
            r4.A09 = r0
            X.9U4 r0 = r8.A0D
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)
            X.7yw r1 = r8.A08
            r0 = 0
            r2.A03(r0, r1)
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.A76(X.7yw, boolean):void");
    }

    public BrazilPaymentCardDetailsActivity() {
        this(0);
    }
}
