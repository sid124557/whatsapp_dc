package X;

import android.content.Context;

/* renamed from: X.9S6  reason: invalid class name */
public class AnonymousClass9S6 {
    public final Context A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C56612sH A03;
    public final C617332a A04;
    public final AnonymousClass31C A05;
    public final C40602Ha A06;
    public final AnonymousClass9U5 A07;
    public final AnonymousClass9U4 A08;
    public final AnonymousClass9VU A09;
    public final C160757oG A0A = C160757oG.A00("BrazilAddCredentialAction", "network", "BR");
    public final AnonymousClass9TJ A0B;

    public AnonymousClass9S6(Context context, C69263Wi r5, C56972sr r6, C56612sH r7, C617332a r8, AnonymousClass31C r9, C40602Ha r10, AnonymousClass9U5 r11, AnonymousClass9U4 r12, AnonymousClass9VU r13, AnonymousClass9TJ r14) {
        this.A03 = r7;
        this.A00 = context;
        this.A01 = r5;
        this.A02 = r6;
        this.A05 = r9;
        this.A08 = r12;
        this.A0B = r14;
        this.A07 = r11;
        this.A04 = r8;
        this.A06 = r10;
        this.A09 = r13;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C67993Rl r36, X.AnonymousClass9OJ r37, java.lang.Boolean r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42) {
        /*
            r35 = this;
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            java.lang.String r0 = "pushAccountData"
            r1 = r39
            r2.put(r0, r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            java.lang.String r0 = "phone"
            r1 = r41
            r2.put(r0, r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            r3 = r40
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            java.lang.String r1 = "issuer"
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "MASTERCARD"
            boolean r0 = r3.equals(r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "VISA"
            boolean r0 = r3.equals(r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "V"
            r2.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            goto L_0x0037
        L_0x0032:
            java.lang.String r0 = "M"
            r2.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
        L_0x0037:
            java.lang.String r1 = r2.toString()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            r3 = r36
            byte[] r9 = X.C1899693i.A12(r3, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0124 }
            r0 = r35
            X.2sH r2 = r0.A03
            X.2sr r1 = r0.A02
            java.lang.String r13 = X.AnonymousClass35J.A02(r1, r2)
            X.31C r14 = r0.A05
            java.lang.String r17 = r14.A03()
            java.lang.String r12 = r3.A05
            java.lang.String r1 = r3.A04
            long r6 = java.lang.Long.parseLong(r1)
            java.lang.Long r29 = java.lang.Long.valueOf(r6)
            if (r38 == 0) goto L_0x0120
            boolean r1 = r38.booleanValue()
            if (r1 != 0) goto L_0x0120
            java.lang.String r5 = "0"
        L_0x006d:
            java.lang.String r1 = r3.A03
            java.lang.String r10 = "CARD"
            java.lang.String r2 = "credential"
            X.2rL r8 = X.C56052rL.A04(r2)
            r3 = 1
            r21 = 100
            r23 = 0
            r18 = r1
            r19 = r3
            boolean r2 = X.C626836d.A0M(r18, r19, r21, r23)
            if (r2 == 0) goto L_0x008c
            java.lang.String r2 = "key_type"
            X.C56052rL.A0D(r8, r2, r1)
        L_0x008c:
            r1 = 32786(0x8012, double:1.61984E-319)
            X.C626836d.A0H(r9, r3, r1)
            r8.A01 = r9
            java.lang.String r2 = "type"
            java.util.ArrayList r1 = X.AnonymousClass9IK.A00
            r8.A0L(r10, r2, r1)
            X.36K r9 = r8.A0F()
            X.1wj r8 = X.C1899693i.A0W(r17)
            X.2rL r2 = X.C56052rL.A01()
            X.C1899593h.A1M(r2)
            X.2rL r1 = X.C1899593h.A0U()
            java.lang.String r11 = "action"
            java.lang.String r10 = "br-add-credential"
            X.C56052rL.A0D(r1, r11, r10)
            r26 = 255(0xff, double:1.26E-321)
            r28 = 0
            r11 = r42
            r23 = r11
            r24 = r3
            boolean r10 = X.C626836d.A0M(r23, r24, r26, r28)
            if (r10 == 0) goto L_0x00ca
            java.lang.String r10 = "device_id"
            X.C56052rL.A0D(r1, r10, r11)
        L_0x00ca:
            X.C1899593h.A1N(r1, r13)
            r18 = r12
            r23 = r28
            boolean r3 = X.C626836d.A0M(r18, r19, r21, r23)
            if (r3 == 0) goto L_0x00dc
            java.lang.String r3 = "provider"
            X.C56052rL.A0D(r1, r3, r12)
        L_0x00dc:
            r30 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            r32 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r34 = r28
            boolean r3 = X.C626836d.A0J(r29, r30, r32, r34)
            if (r3 == 0) goto L_0x00f8
            java.lang.String r4 = "key_version"
            X.39V r3 = new X.39V
            r3.<init>((java.lang.String) r4, (long) r6)
            r1.A0G(r3)
        L_0x00f8:
            java.lang.String r4 = "is_first_card"
            java.util.ArrayList r3 = X.C192079Ic.A00
            r1.A0L(r5, r4, r3)
            r1.A0H(r9)
            X.36K r16 = X.C41032Ir.A03(r1, r2, r8)
            android.content.Context r4 = r0.A00
            X.3Wi r2 = r0.A01
            X.2Ha r1 = r0.A06
            r9 = 5
            X.9oU r3 = new X.9oU
            r8 = r37
            r5 = r1
            r6 = r2
            r7 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r18 = 204(0xcc, float:2.86E-43)
            r19 = 0
            r15 = r3
            r14.A0D(r15, r16, r17, r18, r19)
            return
        L_0x0120:
            java.lang.String r5 = "1"
            goto L_0x006d
        L_0x0124:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9S6.A00(X.3Rl, X.9OJ, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
