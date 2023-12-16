package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.9bj  reason: invalid class name and case insensitive filesystem */
public final class C196779bj implements AnonymousClass4FF {
    public final AnonymousClass1VX A00;

    public C196779bj(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean BJH(String str, int i, int i2) {
        if (this.A00.A0X(3773)) {
            return C195019Vn.A01(str);
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BF6(X.C003203q r9, java.lang.String r10, int r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "PIX QRCode Parsing Started......"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = X.C195019Vn.A01(r10)
            if (r0 == 0) goto L_0x00e5
            X.7yV r6 = new X.7yV
            r6.<init>()
            r5 = 0
        L_0x0011:
            int r0 = r10.length()
            if (r5 >= r0) goto L_0x00eb
            X.9PM r4 = X.C195019Vn.A00(r10, r5)
            X.9Jn r0 = r4.A00
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00a0;
                case 2: goto L_0x00a5;
                case 3: goto L_0x0024;
                case 4: goto L_0x0024;
                case 5: goto L_0x0024;
                case 6: goto L_0x0024;
                case 7: goto L_0x0024;
                case 8: goto L_0x0024;
                case 9: goto L_0x00da;
                case 10: goto L_0x0033;
                case 11: goto L_0x00aa;
                case 12: goto L_0x00b0;
                case 13: goto L_0x00b6;
                case 14: goto L_0x00bc;
                case 15: goto L_0x00c2;
                case 16: goto L_0x00c8;
                case 17: goto L_0x00ce;
                case 18: goto L_0x0029;
                case 19: goto L_0x00d4;
                case 20: goto L_0x0029;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.String r0 = "Not interested in Card Payment Account Information"
        L_0x0026:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0029:
            java.lang.String r0 = r4.A02
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 + 4
            int r5 = r5 + r0
            goto L_0x0011
        L_0x0033:
            java.lang.String r3 = r4.A03
            r0 = 0
            X.9PM r2 = X.C195019Vn.A00(r3, r0)
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "00"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "br.gov.bcb.pix"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = r2.A02
            int r0 = java.lang.Integer.parseInt(r0)
            int r2 = r0 + 4
        L_0x0056:
            int r0 = r3.length()
            if (r2 >= r0) goto L_0x0029
            X.9PM r7 = X.C195019Vn.A00(r3, r2)
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "01"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r7.A03
            r6.A00 = r0
        L_0x006e:
            java.lang.String r0 = r7.A02
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 + 4
            int r2 = r2 + r0
            goto L_0x0056
        L_0x0078:
            java.lang.String r0 = "25"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r7.A03
            r6.A0B = r0
            java.lang.String r0 = "Its a Dynamic PIX QRCode"
        L_0x0086:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x006e
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Found PIX_SCHEMA_ID_UNKNOWN: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ".id"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0086
        L_0x009d:
            java.lang.String r0 = "Not interested parsing other account information"
            goto L_0x0026
        L_0x00a0:
            java.lang.String r0 = r4.A03
            r6.A06 = r0
            goto L_0x0029
        L_0x00a5:
            java.lang.String r0 = r4.A03
            r6.A07 = r0
            goto L_0x0029
        L_0x00aa:
            java.lang.String r0 = r4.A03
            r6.A03 = r0
            goto L_0x0029
        L_0x00b0:
            java.lang.String r0 = r4.A03
            r6.A0A = r0
            goto L_0x0029
        L_0x00b6:
            java.lang.String r0 = r4.A03
            r6.A09 = r0
            goto L_0x0029
        L_0x00bc:
            java.lang.String r0 = r4.A03
            r6.A01 = r0
            goto L_0x0029
        L_0x00c2:
            java.lang.String r0 = r4.A03
            r6.A05 = r0
            goto L_0x0029
        L_0x00c8:
            java.lang.String r0 = r4.A03
            r6.A04 = r0
            goto L_0x0029
        L_0x00ce:
            java.lang.String r0 = r4.A03
            r6.A08 = r0
            goto L_0x0029
        L_0x00d4:
            java.lang.String r0 = r4.A03
            r6.A02 = r0
            goto L_0x0029
        L_0x00da:
            java.lang.String r0 = "Not interested in EMV Co. Reserved Payment Account Information"
            goto L_0x0026
        L_0x00de:
            java.lang.String r0 = "Found Unknown EMV"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0029
        L_0x00e5:
            java.lang.String r0 = "Invalid Pix QRCode Data"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r6 = 0
        L_0x00eb:
            java.lang.String r0 = "......PIX QRCode Parsing Ended."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            if (r6 == 0) goto L_0x0146
            java.lang.String r7 = X.C195219Wq.A07(r11, r12)
            java.lang.String r0 = "unknown"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0110
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " CS:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", MPO:"
            java.lang.String r7 = X.AnonymousClass000.A0Y(r0, r1, r12)
        L_0x0110:
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0140
            boolean r0 = X.C175738Zn.A0V(r0)
            if (r0 != 0) goto L_0x0140
            X.0df r5 = r9.getSupportFragmentManager()
            r4 = 0
            r3 = 1
            X.C162457s7.A0J(r7, r3)
            com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet r2 = new com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet
            r2.<init>()
            r0 = 2
            X.3Z6[] r1 = new X.AnonymousClass3Z6[r0]
            java.lang.String r0 = "bundle_key_pix_qrcode"
            X.AnonymousClass3Z6.A09(r0, r6, r1, r4)
            java.lang.String r0 = "referral_screen"
            X.AnonymousClass3Z6.A09(r0, r7, r1, r3)
            android.os.Bundle r0 = X.C02820Hs.A00(r1)
            r2.A0u(r0)
            X.AnonymousClass344.A01(r2, r5)
            return
        L_0x0140:
            java.lang.String r0 = "Pix key is not available to copy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0146:
            java.lang.String r0 = "Cannot handle Qr code data. Unable to parse"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196779bj.BF6(X.03q, java.lang.String, int, int):void");
    }

    public /* synthetic */ String BAr(String str) {
        return null;
    }

    public /* synthetic */ boolean BJG(String str) {
        return false;
    }

    public /* synthetic */ DialogFragment BBn(C95814uZ r2, String str, String str2, int i) {
        return null;
    }

    public /* synthetic */ void BpE(Activity activity, C95814uZ r2, String str, String str2) {
    }
}
