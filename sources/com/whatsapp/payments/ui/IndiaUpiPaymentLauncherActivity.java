package com.whatsapp.payments.ui;

import X.AnonymousClass97T;
import X.AnonymousClass9DA;
import X.AnonymousClass9WN;
import X.C107695bk;
import X.C160757oG;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C202139lR;
import X.C204019og;
import X.C64333Db;
import X.C88834as;

public class IndiaUpiPaymentLauncherActivity extends AnonymousClass9DA implements C202139lR {
    public AnonymousClass9WN A00;
    public boolean A01;
    public final C160757oG A02;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
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
            this.A00 = (AnonymousClass9WN) r1.A6I.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (X.C86614Ku.A0D(r5).getBoolean("intent_source") == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r5 = r17
            r0 = r18
            super.onCreate(r0)
            X.99n r0 = r5.A0O
            boolean r0 = X.C1899693i.A0x(r0)
            r6 = 0
            if (r0 != 0) goto L_0x001b
            X.7oG r1 = r5.A02
            java.lang.String r0 = "payment feature is not enabled."
            r1.A0A(r0, r6)
        L_0x0017:
            r5.finish()
            return
        L_0x001b:
            android.content.Intent r0 = r5.getIntent()
            if (r0 == 0) goto L_0x0017
            android.content.Intent r0 = r5.getIntent()
            android.net.Uri r0 = r0.getData()
            if (r0 == 0) goto L_0x0017
            android.content.Intent r0 = r5.getIntent()
            android.net.Uri r3 = r0.getData()
            android.os.Bundle r0 = X.C86614Ku.A0D(r5)
            if (r0 == 0) goto L_0x0046
            android.os.Bundle r1 = X.C86614Ku.A0D(r5)
            java.lang.String r0 = "intent_source"
            boolean r0 = r1.getBoolean(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            X.7oG r4 = r5.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "received payment intent: isFromQrCode "
            r1.append(r0)
            X.C1899593h.A1L(r4, r1, r2)
            if (r2 == 0) goto L_0x009a
            java.lang.String r9 = "SCANNED_QR_CODE"
            java.lang.String r10 = "payments_camera"
        L_0x005b:
            X.9bS r14 = r5.A0M
            X.3Mh r12 = r5.A06
            X.9ca r15 = r5.A0S
            X.1VX r13 = r5.A0D
            X.9WN r0 = r5.A00
            X.9bk r4 = new X.9bk
            r11 = r4
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            X.9Wl r8 = X.C195179Wl.A00(r3, r9)
            if (r8 == 0) goto L_0x009f
            java.lang.String r1 = r3.toString()
            if (r1 == 0) goto L_0x009f
            java.lang.String r0 = "upi://mandate"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x009f
            X.1VX r1 = r5.A0D
            r0 = 2211(0x8a3, float:3.098E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x009f
            X.9WN r6 = r5.A00
            r1 = 1
            X.9Lk r0 = new X.9Lk
            r0.<init>(r5, r1)
            r7 = r5
            r9 = r0
            r11 = r2
            r6.A07(r7, r8, r9, r10, r11)
            return
        L_0x009a:
            java.lang.String r9 = "DEEP_LINK"
            java.lang.String r10 = "deeplink"
            goto L_0x005b
        L_0x009f:
            if (r2 == 0) goto L_0x00b9
            X.1VX r1 = r5.A0D
            r0 = 1354(0x54a, float:1.897E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r8 = r3.toString()
            r0 = 0
            X.9Wu r7 = new X.9Wu
            r7.<init>(r5, r0)
            r4.A00(r5, r6, r7, r8, r9, r10)
            return
        L_0x00b9:
            java.lang.String r0 = r3.toString()
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r0 = com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment.A00(r6, r0, r9, r10)
            r5.Bon(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiPaymentLauncherActivity(int i) {
        this.A01 = false;
        C204019og.A00(this, 73);
    }

    public IndiaUpiPaymentLauncherActivity() {
        this(0);
        this.A02 = C160757oG.A00("IndiaUpiPaymentLauncherActivity", "payment-settings", "IN");
    }
}
