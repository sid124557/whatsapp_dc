package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2eg  reason: invalid class name and case insensitive filesystem */
public final class C48302eg {
    public final AnonymousClass4GP A00;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (r20 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r11 = (X.AnonymousClass3YL) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r8.A00(r11.A06, r11.A0F, r20, r15.A02, false, X.AnonymousClass000.A1T(r11.A0O ? 1 : 0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C833748d A00(X.AnonymousClass2U3 r29, java.util.List r30) {
        /*
            r28 = this;
            r4 = 0
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            r3 = r28
            X.4GP r0 = r3.A00
            java.lang.Object r2 = r0.invoke()
            X.2J0 r2 = (X.AnonymousClass2J0) r2
            java.util.Iterator r14 = r30.iterator()
        L_0x0017:
            boolean r0 = r14.hasNext()
            r10 = r29
            if (r0 == 0) goto L_0x0093
            java.lang.Object r1 = r14.next()
            X.48d r1 = (X.C833748d) r1
            X.C162457s7.A0J(r1, r4)
            r0 = 1
            X.2aQ r8 = r10.A0B
            r20 = 0
            java.util.List r7 = r2.A00     // Catch:{ Exception -> 0x009a }
            java.util.Iterator r13 = r7.iterator()     // Catch:{ Exception -> 0x009a }
        L_0x0033:
            boolean r7 = r13.hasNext()     // Catch:{ Exception -> 0x009a }
            if (r7 == 0) goto L_0x008e
            java.lang.Object r7 = r13.next()     // Catch:{ Exception -> 0x009a }
            X.4Dt r7 = (X.C84804Dt) r7     // Catch:{ Exception -> 0x009a }
            java.lang.String r20 = r7.BsV()     // Catch:{ Exception -> 0x009a }
            X.2TE r15 = r7.AxG(r10, r1)     // Catch:{ Exception -> 0x009a }
            boolean r7 = r15.A06     // Catch:{ Exception -> 0x009a }
            if (r7 != 0) goto L_0x004c
            goto L_0x006f
        L_0x004c:
            if (r20 == 0) goto L_0x006a
            r12 = r1
            X.3YL r12 = (X.AnonymousClass3YL) r12     // Catch:{ Exception -> 0x009a }
            java.lang.String r11 = r12.A0F     // Catch:{ Exception -> 0x009a }
            java.lang.String r9 = r15.A02     // Catch:{ Exception -> 0x009a }
            boolean r7 = r12.A0O     // Catch:{ Exception -> 0x009a }
            boolean r23 = X.AnonymousClass000.A1T(r7)
            X.2Iu r7 = r12.A06     // Catch:{ Exception -> 0x009a }
            r17 = r8
            r18 = r7
            r19 = r11
            r21 = r9
            r22 = r0
            r17.A00(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x009a }
        L_0x006a:
            boolean r7 = r15.A05     // Catch:{ Exception -> 0x009a }
            if (r7 == 0) goto L_0x0033
            goto L_0x00cc
        L_0x006f:
            if (r20 == 0) goto L_0x00cc
            r11 = r1
            X.3YL r11 = (X.AnonymousClass3YL) r11     // Catch:{ Exception -> 0x009a }
            java.lang.String r10 = r11.A0F     // Catch:{ Exception -> 0x009a }
            java.lang.String r9 = r15.A02     // Catch:{ Exception -> 0x009a }
            boolean r7 = r11.A0O     // Catch:{ Exception -> 0x009a }
            boolean r23 = X.AnonymousClass000.A1T(r7)
            X.2Iu r7 = r11.A06     // Catch:{ Exception -> 0x009a }
            r17 = r8
            r18 = r7
            r19 = r10
            r21 = r9
            r22 = r4
            r17.A00(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x009a }
            goto L_0x00cc
        L_0x008e:
            X.2TE r15 = X.C615831k.A00()
            goto L_0x00cc
        L_0x0093:
            r3.A01(r10, r5)
            r3.A01(r10, r6)
            goto L_0x00dc
        L_0x009a:
            r19 = move-exception
            if (r20 == 0) goto L_0x00b9
            r10 = r1
            X.3YL r10 = (X.AnonymousClass3YL) r10
            java.lang.String r9 = r10.A0F
            java.lang.String r25 = r19.toString()
            boolean r7 = r10.A0O
            r27 = r7 ^ 1
            X.2Iu r7 = r10.A06
            r21 = r8
            r22 = r7
            r23 = r9
            r26 = r4
            r24 = r20
            r21.A00(r22, r23, r24, r25, r26, r27)
        L_0x00b9:
            java.lang.String r18 = r19.getMessage()
            r16 = 0
            X.2TE r15 = new X.2TE
            r22 = r4
            r20 = r4
            r17 = r16
            r21 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
        L_0x00cc:
            boolean r7 = r15.A06
            if (r7 == 0) goto L_0x00ee
            boolean r7 = r15.A05
            if (r7 == 0) goto L_0x00e9
            X.48d[] r0 = new X.C833748d[r0]
            r0[r4] = r1
            java.util.ArrayList r5 = X.AnonymousClass8UF.A0m(r0)
        L_0x00dc:
            boolean r0 = X.AnonymousClass0x7.A1S(r5)
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r0 = r5.get(r4)
            X.48d r0 = (X.C833748d) r0
            return r0
        L_0x00e9:
            r5.add(r1)
            goto L_0x0017
        L_0x00ee:
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x0017
            r6.add(r1)
            goto L_0x0017
        L_0x00f7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48302eg.A00(X.2U3, java.util.List):X.48d");
    }

    public C48302eg(AnonymousClass4GP r1) {
        this.A00 = r1;
    }

    public final void A01(AnonymousClass2U3 r23, List list) {
        Boolean valueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass2U3 r2 = r23;
            C45692aQ r3 = r2.A0B;
            AnonymousClass3YL r1 = (AnonymousClass3YL) ((C833748d) it.next());
            String str = r1.A0C;
            if (!(str == null || str.length() == 0)) {
                String str2 = r1.A0F;
                boolean z = r1.A0L;
                C61182zq r4 = r2.A0C;
                String A03 = r4.A03(AnonymousClass000.A0T(str2, str));
                SharedPreferences sharedPreferences = r4.A00;
                if (!sharedPreferences.contains(A03) || (valueOf = Boolean.valueOf(sharedPreferences.getBoolean(A03, false))) == null || !C18320x8.A1W(valueOf, z)) {
                    AnonymousClass31C r15 = r3.A02;
                    String A032 = r15.A03();
                    r15.A0K(new AnonymousClass3SV(), C41032Ir.A05(new C35651xD(new C35381wm(A032, 18), AnonymousClass0x9.A0o(System.currentTimeMillis(), (long) 1000), str2, str, "exposure")), A032, 376, 0);
                }
                C18270x1.A0l(sharedPreferences.edit(), r4.A03(AnonymousClass000.A0T(str2, str)), z);
            }
        }
    }
}
