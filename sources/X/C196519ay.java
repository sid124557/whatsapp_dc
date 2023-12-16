package X;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9ay  reason: invalid class name and case insensitive filesystem */
public class C196519ay implements C202929mq {
    public final C69263Wi A00;
    public final C56492s4 A01;
    public final C56612sH A02;
    public final C29251iW A03;
    public final C1906899l A04;
    public final C1906999m A05;
    public final C620933l A06;
    public final AnonymousClass9U4 A07;
    public final AnonymousClass9TJ A08;

    public C196519ay(C69263Wi r1, C56492s4 r2, C56612sH r3, C29251iW r4, C1906899l r5, C1906999m r6, C620933l r7, AnonymousClass9U4 r8, AnonymousClass9TJ r9) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
        this.A03 = r4;
        this.A05 = r6;
    }

    public void Awv(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C166587yw A0C = C1899693i.A0C(it);
            int A082 = A0C.A08();
            if (!(A082 == 1 || A082 == 4)) {
                if (A082 == 5) {
                    C194979Vj A0C2 = this.A07.A0C("merchant_account_linking_context");
                    A0C2.A08(A0C2.A01("add_business"));
                } else if (!(A082 == 6 || A082 == 7)) {
                    C18260x0.A1S(AnonymousClass001.A0o(), "PAY: Not supported method type for Brazil: ", A0C);
                }
            }
            AnonymousClass9U4 r2 = this.A07;
            r2.A0C("p2p_context").A09("add_card");
            r2.A0C("p2m_context").A09("add_card");
        }
        C69263Wi r3 = this.A00;
        C29251iW r22 = this.A03;
        Objects.requireNonNull(r22);
        r3.BkS(new C70013Zn(r22, 26));
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C166587yw Axj(X.C166587yw r7) {
        /*
            r6 = this;
            int r2 = r7.A08()
            r0 = 1
            if (r2 == r0) goto L_0x0125
            r0 = 4
            if (r2 == r0) goto L_0x0125
            r0 = 5
            if (r2 == r0) goto L_0x0021
            r0 = 6
            if (r2 == r0) goto L_0x0125
            r0 = 7
            if (r2 == r0) goto L_0x0125
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: method type not expected: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
        L_0x001d:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0020:
            return r7
        L_0x0021:
            X.6hx r4 = r7.A08
            X.99J r4 = (X.AnonymousClass99J) r4
            if (r4 == 0) goto L_0x0121
            X.9U4 r0 = r6.A07
            X.8EA r1 = X.AnonymousClass9U4.A03(r0)
            java.lang.String r0 = r7.A0A
            X.7yw r3 = r1.A08(r0)
            if (r3 == 0) goto L_0x0020
            X.6hx r0 = r3.A08
            if (r0 == 0) goto L_0x0020
            r1 = r3
            X.6ho r1 = (X.C133706ho) r1
            X.7YE r0 = new X.7YE
            r0.<init>(r1)
            java.lang.String r2 = r0.A00()
            X.33l r0 = r6.A06
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r0)
            java.lang.String r0 = "payment_merchant_previous_display_state"
            X.C18270x1.A0j(r1, r0, r2)
            X.6hx r3 = r3.A08
            X.99J r3 = (X.AnonymousClass99J) r3
            java.lang.String r0 = r4.A09
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r3.A09
            r4.A09 = r0
        L_0x0060:
            java.lang.String r0 = r4.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r3.A0C
            r4.A0C = r0
        L_0x006c:
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r3.A03
            r4.A03 = r0
        L_0x0078:
            java.lang.String r0 = r4.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = r3.A06
            r4.A06 = r0
        L_0x0084:
            java.lang.String r0 = r4.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = r3.A07
            r4.A07 = r0
        L_0x0090:
            java.lang.String r0 = r4.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r3.A0B
            r4.A0B = r0
        L_0x009c:
            boolean r0 = r3.A0E
            r4.A0E = r0
            boolean r0 = r3.A0F
            r4.A0F = r0
            int r0 = r3.A00
            r4.A00 = r0
            java.lang.String r2 = "ACTIVE"
            java.lang.String r5 = r4.A07
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = "INITED"
            java.lang.String r1 = r3.A07
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "MERCHANT_LINKED"
        L_0x00be:
            r4.A04 = r0
        L_0x00c0:
            java.lang.String r0 = r4.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = r3.A08
            r4.A08 = r0
        L_0x00cc:
            java.lang.String r0 = r4.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = r3.A05
            r4.A05 = r0
        L_0x00d8:
            int r1 = r4.A01
            r0 = -1
            if (r1 != r0) goto L_0x0020
            int r0 = r3.A01
            r4.A01 = r0
            return r7
        L_0x00e2:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x00eb
            java.lang.String r0 = "MERCHANT_VERIFIED"
            goto L_0x00be
        L_0x00eb:
            java.lang.String r2 = "PENDING"
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L_0x00fb
            java.lang.String r0 = "INITED"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x010e
        L_0x00fb:
            java.lang.String r1 = r3.A07
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "INITED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            goto L_0x00be
        L_0x010e:
            java.lang.String r1 = "EXTERNALLY_DISABLED"
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = r3.A07
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c0
            java.lang.String r0 = "MERCHANT_DISABLED"
            goto L_0x00be
        L_0x0121:
            java.lang.String r0 = "PAY:BrazilPaymentStorageObserver/beforeMethodAdded: methodData is null"
            goto L_0x001d
        L_0x0125:
            X.6hx r2 = r7.A08
            X.99I r2 = (X.AnonymousClass99I) r2
            if (r2 == 0) goto L_0x0020
            java.lang.String r1 = r2.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x013f
            byte[] r0 = r7.A0D
            if (r0 == 0) goto L_0x013f
            X.2s4 r0 = r6.A01
            byte[] r0 = X.C195169Wk.A09(r0, r1)
            r7.A0D = r0
        L_0x013f:
            X.9U4 r0 = r6.A07
            X.8EA r1 = X.AnonymousClass9U4.A03(r0)
            java.lang.String r0 = r7.A0A
            X.7yw r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0020
            X.6hx r3 = r0.A08
            if (r3 == 0) goto L_0x0020
            X.99I r3 = (X.AnonymousClass99I) r3
            X.2sH r4 = r6.A02
            boolean r0 = r2.A0a
            if (r0 != 0) goto L_0x0161
            boolean r0 = r3.A0Q
            r2.A0Q = r0
            int r0 = r3.A02
            r2.A02 = r0
        L_0x0161:
            java.lang.String r0 = r2.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = r3.A06
            r2.A06 = r0
        L_0x016d:
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0179
            java.lang.String r0 = r3.A03
            r2.A03 = r0
        L_0x0179:
            java.lang.String r0 = r2.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01c7
            java.lang.String r1 = r2.A0C
            java.lang.String r0 = r3.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01c7
            r0 = 0
            r2.A0E = r0
        L_0x018e:
            r2.A0D = r0
        L_0x0190:
            java.lang.String r0 = r2.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ac
            java.lang.String r1 = r2.A0J
            java.lang.String r0 = r3.A0J
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01ac
            long r0 = r4.A0H()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A09 = r0
        L_0x01ac:
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x01b8
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x01b8
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            r2.A05 = r0
        L_0x01b8:
            java.lang.String r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0020
            X.9TJ r1 = r6.A08
            r0 = 0
            r1.A01(r0, r7)
            return r7
        L_0x01c7:
            java.lang.String r0 = r3.A0C
            r2.A0C = r0
            java.lang.String r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = r3.A0E
            r2.A0E = r0
        L_0x01d7:
            java.lang.String r0 = r2.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = r3.A0D
            goto L_0x018e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196519ay.Axj(X.7yw):X.7yw");
    }
}
