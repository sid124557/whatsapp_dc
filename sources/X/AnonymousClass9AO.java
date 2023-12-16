package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.9AO  reason: invalid class name */
public class AnonymousClass9AO extends AnonymousClass9OC {
    public final Context A00;
    public final C55682qk A01;
    public final C69263Wi A02;
    public final AnonymousClass31C A03;
    public final AnonymousClass9U1 A04;
    public final C196629bS A05;
    public final C40602Ha A06;
    public final AnonymousClass9AG A07;
    public final C194259Se A08;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C195109Vz r9, X.AnonymousClass99L r10, java.lang.String r11, java.util.List r12, boolean r13) {
        /*
            X.9W2 r2 = r10.A0G
            if (r2 == 0) goto L_0x00c5
            long r0 = r2.A02
            r7 = 1000(0x3e8, double:4.94E-321)
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0019
            long r0 = r0 / r7
            java.lang.String r4 = "start-ts"
            X.39V r3 = new X.39V
            r3.<init>((java.lang.String) r4, (long) r0)
            r12.add(r3)
        L_0x0019:
            long r0 = r2.A01
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x002a
            long r0 = r0 / r7
            java.lang.String r4 = "end-ts"
            X.39V r3 = new X.39V
            r3.<init>((java.lang.String) r4, (long) r0)
            r12.add(r3)
        L_0x002a:
            java.lang.String r1 = r2.A0G
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = "amount-rule"
            X.C1899593h.A1R(r0, r1, r12)
        L_0x0033:
            java.lang.String r1 = r2.A0E
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "frequency-rule"
            X.C1899593h.A1R(r0, r1, r12)
        L_0x003c:
            X.7yt r1 = r2.A07
            boolean r0 = X.C161527pr.A03(r1)
            if (r0 != 0) goto L_0x004f
            java.lang.Object r1 = X.C1899593h.A0X(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "mandate-name"
            X.C1899593h.A1R(r0, r1, r12)
        L_0x004f:
            boolean r0 = r2.A0N
            java.lang.String r1 = X.C1899693i.A0Z(r0)
            java.lang.String r0 = "is-revocable"
            X.C1899593h.A1R(r0, r1, r12)
            java.lang.String r3 = "seq-no"
            if (r11 == 0) goto L_0x00c6
            X.39V r1 = new X.39V
            r1.<init>((java.lang.String) r3, (java.lang.String) r11)
        L_0x0063:
            r12.add(r1)
        L_0x0066:
            if (r9 == 0) goto L_0x0081
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x0081
            X.7yt r1 = r9.A02
            boolean r0 = X.C161527pr.A02(r1)
            if (r0 != 0) goto L_0x0081
            java.lang.Object r1 = X.C1899593h.A0X(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "mandate-update-info"
            X.C1899593h.A1R(r0, r1, r12)
        L_0x0081:
            if (r13 == 0) goto L_0x00c5
            java.lang.String r0 = r2.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0092
            java.lang.String r1 = "recurrence-rule"
            java.lang.String r0 = r2.A0K
            X.C1899593h.A1R(r1, r0, r12)
        L_0x0092:
            java.lang.String r0 = r2.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r1 = "recurrence-day"
            java.lang.String r0 = r2.A0J
            X.C1899593h.A1R(r1, r0, r12)
        L_0x00a1:
            X.7yt r0 = r2.A0A
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r0.A00
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bc
            X.7yt r0 = r2.A0A
            java.lang.Object r1 = X.C1899593h.A0X(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "purpose-code"
            X.C1899593h.A1R(r0, r1, r12)
        L_0x00bc:
            java.lang.String r1 = r10.A0M
            if (r1 == 0) goto L_0x00c5
            java.lang.String r0 = "mcc"
            X.C1899593h.A1R(r0, r1, r12)
        L_0x00c5:
            return
        L_0x00c6:
            java.lang.String r0 = r10.A0S
            if (r0 == 0) goto L_0x0066
            X.39V r1 = new X.39V
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9AO.A00(X.9Vz, X.99L, java.lang.String, java.util.List, boolean):void");
    }

    public final void A02(C624034w r5, List list) {
        C1899593h.A1R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r5.A0K, list);
        C1899593h.A1R("device-id", this.A08.A01(), list);
        AnonymousClass99L A0K = C1899693i.A0K(r5);
        AnonymousClass9W2 r2 = A0K.A0G;
        C626936e.A06(r2);
        C1899593h.A1R("sender-vpa", A0K.A0Q, list);
        if (!TextUtils.isEmpty(A0K.A0R)) {
            C1899593h.A1R("sender-vpa-id", A0K.A0R, list);
        }
        C1899593h.A1R("receiver-vpa", A0K.A0O, list);
        if (!TextUtils.isEmpty(A0K.A0P)) {
            C1899593h.A1R("receiver-vpa-id", A0K.A0P, list);
        }
        if (!C161527pr.A02(r2.A08)) {
            C1899593h.A1R("mandate-no", (String) C1899593h.A0X(r2.A08), list);
        }
    }

    public AnonymousClass9AO(Context context, C55682qk r2, C69263Wi r3, AnonymousClass31C r4, AnonymousClass9U1 r5, C196629bS r6, C40602Ha r7, C153607bd r8, AnonymousClass9U5 r9, AnonymousClass9AG r10, C194259Se r11) {
        super(r8, r9);
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A08 = r11;
        this.A07 = r10;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r1 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (X.C161527pr.A03(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        X.C1899593h.A1R("upi-bank-info", (java.lang.String) X.C1899593h.A0X(r1), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r6 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = r3.A04.A06("MPIN", r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        X.C1899593h.A1R("mpin", r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        X.C1899593h.A1R("credential-id", r4.A0A, r7);
        r0 = (X.AnonymousClass99H) r4.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r0 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C166587yw r4, java.lang.String r5, java.util.HashMap r6, java.util.List r7) {
        /*
            r3 = this;
            int r0 = r5.hashCode()
            switch(r0) {
                case -1747997465: goto L_0x003c;
                case -1206140285: goto L_0x0045;
                case 417679030: goto L_0x004e;
                case 485726418: goto L_0x0057;
                case 1224051264: goto L_0x0060;
                default: goto L_0x0007;
            }
        L_0x0007:
            r2 = 7
        L_0x0008:
            if (r6 == 0) goto L_0x0019
            X.9U1 r1 = r3.A04
            java.lang.String r0 = "MPIN"
            java.lang.String r1 = r1.A06(r0, r6, r2)
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = "mpin"
            X.C1899593h.A1R(r0, r1, r7)
        L_0x0019:
            if (r4 == 0) goto L_0x003b
            java.lang.String r1 = "credential-id"
            java.lang.String r0 = r4.A0A
            X.C1899593h.A1R(r1, r0, r7)
            X.6hx r0 = r4.A08
            X.99H r0 = (X.AnonymousClass99H) r0
            if (r0 == 0) goto L_0x003b
            X.7yt r1 = r0.A06
            boolean r0 = X.C161527pr.A03(r1)
            if (r0 != 0) goto L_0x003b
            java.lang.Object r1 = X.C1899593h.A0X(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "upi-bank-info"
            X.C1899593h.A1R(r0, r1, r7)
        L_0x003b:
            return
        L_0x003c:
            java.lang.String r0 = "upi-resume-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 12
            goto L_0x0068
        L_0x0045:
            java.lang.String r0 = "upi-update-mandate-by-url"
            boolean r0 = r5.equals(r0)
            r2 = 9
            goto L_0x0068
        L_0x004e:
            java.lang.String r0 = "upi-create-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 8
            goto L_0x0068
        L_0x0057:
            java.lang.String r0 = "upi-pause-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 11
            goto L_0x0068
        L_0x0060:
            java.lang.String r0 = "upi-revoke-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 10
        L_0x0068:
            if (r0 != 0) goto L_0x0008
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9AO.A01(X.7yw, java.lang.String, java.util.HashMap, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass36K[] A03(X.C624034w r10) {
        /*
            r9 = this;
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            X.1S4 r0 = r10.A0A
            if (r0 == 0) goto L_0x006c
            X.39L r2 = r0.A01
            if (r2 == 0) goto L_0x006c
            X.9U5 r3 = r9.A01
            java.lang.String r5 = "amount"
            int r0 = r2.A00()
            long r7 = (long) r0
            int r6 = r2.A00
            X.4Fi r4 = r2.A01
            X.36K r0 = r3.A06(r4, r5, r6, r7)
        L_0x001d:
            r1.add(r0)
        L_0x0020:
            X.1S4 r0 = r10.A0A
            X.99L r0 = (X.AnonymousClass99L) r0
            X.9W2 r2 = r0.A0G
            X.C626936e.A06(r2)
            X.39L r0 = r2.A05
            if (r0 == 0) goto L_0x004c
            X.9U5 r3 = r9.A01
            java.lang.String r5 = "original-amount"
            int r0 = r0.A00()
            long r7 = (long) r0
            X.39L r0 = r2.A05
            int r6 = r0.A00
            X.4Fi r4 = r0.A01
            X.36K r0 = r3.A06(r4, r5, r6, r7)
        L_0x0040:
            r1.add(r0)
        L_0x0043:
            int r0 = r1.size()
            X.36K[] r0 = X.C18280x3.A1a(r1, r0)
            return r0
        L_0x004c:
            X.7yt r2 = r2.A09
            boolean r0 = X.C161527pr.A03(r2)
            if (r0 != 0) goto L_0x0043
            java.lang.Object r2 = r2.A00
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r2)
            X.4Fi r4 = X.AnonymousClass1S3.A05
            X.39Q r3 = X.C1899593h.A08(r4, r0)
            X.9U5 r2 = r9.A01
            java.lang.String r0 = "original-amount"
            X.36K r0 = r2.A05(r4, r3, r0)
            goto L_0x0040
        L_0x006c:
            X.39Q r4 = r10.A08
            if (r4 == 0) goto L_0x0020
            X.9U5 r3 = r9.A01
            java.lang.String r2 = "amount"
            X.4Fi r0 = X.AnonymousClass1S3.A05
            X.36K r0 = r3.A05(r0, r4, r2)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9AO.A03(X.34w):X.36K[]");
    }
}
