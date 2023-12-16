package X;

import java.io.IOException;

/* renamed from: X.3Oq  reason: invalid class name and case insensitive filesystem */
public class C67273Oq implements AnonymousClass4EN {
    public final /* synthetic */ C55552qX A00;
    public final /* synthetic */ C54662p5 A01;
    public final /* synthetic */ C46202bF A02;
    public final /* synthetic */ AnonymousClass39C A03;
    public final /* synthetic */ C84724Dl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public C67273Oq(C55552qX r1, C54662p5 r2, C46202bF r3, AnonymousClass39C r4, C84724Dl r5, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A00 = r1;
        this.A07 = str;
        this.A03 = r4;
        this.A05 = str2;
        this.A06 = str3;
        this.A0A = z;
        this.A02 = r3;
        this.A09 = z2;
        this.A04 = r5;
        this.A01 = r2;
        this.A08 = str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ba, code lost:
        r2 = r3.A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyP(X.AnonymousClass2SI r22) {
        /*
            r21 = this;
            r1 = r22
            X.2fE r4 = r1.A04
            X.2WN r7 = r1.A03
            int r0 = r1.A00
            r11 = r21
            if (r0 != 0) goto L_0x0076
            X.2qX r6 = r11.A00
            java.lang.String r4 = r11.A07
            java.lang.Object r0 = r7.A00
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r0.length()
            long r0 = r1.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "EVENT_PARAM_COMPRESSED_SIZE"
            r2.put(r0, r1)
        L_0x002d:
            java.lang.String r1 = "EVENT_PARAM_UNCOMPRESSED_SIZE"
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.put(r1, r0)
            X.2xa r1 = r6.A06
            java.lang.String r0 = "PAYLOAD_SIZE"
            r1.A02(r4, r0, r2)
            X.39C r10 = r11.A03
            if (r10 == 0) goto L_0x0064
            X.2qq r9 = r6.A09     // Catch:{ Exception -> 0x005e }
            java.lang.String r8 = r10.A01     // Catch:{ Exception -> 0x005e }
            X.2wc r2 = r6.A03     // Catch:{ Exception -> 0x005e }
            java.lang.String r1 = r11.A05     // Catch:{ Exception -> 0x005e }
            java.lang.String r0 = r11.A06     // Catch:{ Exception -> 0x005e }
            X.2Uf r5 = r2.A00(r1, r0)     // Catch:{ Exception -> 0x005e }
            java.lang.Object r4 = r7.A00     // Catch:{ Exception -> 0x005e }
            long r2 = r10.A00     // Catch:{ Exception -> 0x005e }
            boolean r1 = r10.A02     // Catch:{ Exception -> 0x005e }
            X.32G r0 = new X.32G     // Catch:{ Exception -> 0x005e }
            r0.<init>((java.lang.Object) r4, (long) r2, (boolean) r1)     // Catch:{ Exception -> 0x005e }
            r9.A02(r5, r0, r8)     // Catch:{ Exception -> 0x005e }
            goto L_0x0064
        L_0x005e:
            r1 = move-exception
            java.lang.String r0 = "Failed to save the bk-cache"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0064:
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r3 = r7.A00
            java.lang.String r3 = (java.lang.String) r3
            X.2bF r2 = r11.A02
            boolean r1 = r11.A09
            X.4Dl r0 = r11.A04
            r6.A02(r2, r0, r3, r1)
            return
        L_0x0076:
            X.2qX r3 = r11.A00
            X.2bF r13 = r11.A02
            java.lang.String r1 = r11.A05
            X.2p5 r12 = r11.A01
            java.lang.String r6 = r11.A06
            boolean r5 = r11.A09
            X.39C r14 = r11.A03
            java.lang.String r2 = r11.A08
            boolean r0 = r11.A0A
            X.4Dl r15 = r11.A04
            X.3ba r10 = new X.3ba
            r16 = r1
            r17 = r6
            r18 = r2
            r19 = r5
            r20 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r5 = r11.A07
            r6 = 4
            if (r4 == 0) goto L_0x011f
            java.util.Map r0 = r4.A00
            if (r0 == 0) goto L_0x011f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x011f
            java.lang.Object r7 = r4.A00(r13)
            java.lang.String r7 = (java.lang.String) r7
            X.2aa r0 = r3.A05
            X.2Jj r0 = r0.A00(r1)
            X.2Ji r0 = r0.A01
            X.2iy r0 = r0.A01
            if (r0 == 0) goto L_0x00c9
            X.30P r2 = r3.A07
            X.2yH r1 = r2.A01(r0)
            if (r1 == 0) goto L_0x00c9
            int r0 = r13.A00
            if (r0 == r6) goto L_0x00cf
            switch(r0) {
                case 8: goto L_0x00e3;
                case 9: goto L_0x00f8;
                case 10: goto L_0x010d;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            if (r7 == 0) goto L_0x0124
            r3.A01(r13, r15, r7)
        L_0x00ce:
            return
        L_0x00cf:
            java.lang.Exception r0 = r13.A02
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r0 instanceof org.json.JSONException
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r12.A04()
            if (r0 == 0) goto L_0x00e3
            X.4FS r0 = r3.A08
            r0.BkM(r10)
            return
        L_0x00e3:
            boolean r0 = r12.A04()
            if (r0 == 0) goto L_0x00f8
            r9 = 2
            X.4If r0 = new X.4If
            r4 = r0
            r5 = r10
            r6 = r13
            r7 = r15
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A03(r1, r0, r12)
            return
        L_0x00f8:
            boolean r0 = r12.A04()
            if (r0 == 0) goto L_0x010d
            r9 = 3
            X.4If r0 = new X.4If
            r4 = r0
            r5 = r10
            r6 = r13
            r7 = r15
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A02(r1, r0, r12)
            return
        L_0x010d:
            java.lang.Long r0 = r12.A01()
            if (r0 == 0) goto L_0x00c9
            X.4FS r3 = r3.A08
            long r1 = r0.longValue()
            java.lang.String r0 = "BloksLayoutFetcherImpl/retryWithBackoff"
            r3.Bkn(r10, r0, r1)
            return
        L_0x011f:
            r13.A00 = r6
            java.lang.String r0 = "Something went wrong"
            goto L_0x0157
        L_0x0124:
            java.util.Map r0 = r4.A00
            java.util.Iterator r0 = X.AnonymousClass000.A0q(r0)
            java.lang.Object r4 = X.AnonymousClass0x2.A0W(r0)
            X.32n r4 = (X.C618532n) r4
            r13.A00 = r6
            X.244 r0 = new X.244
            r0.<init>(r4)
            r13.A02 = r0
            int r1 = r4.A01
            r0 = 2498098(0x261e32, float:3.500581E-39)
            if (r1 != r0) goto L_0x0148
            X.2xa r2 = r3.A06
            java.lang.String r1 = "DROP_QPL_LOGGING_MARKER"
            r0 = 0
            r2.A02(r5, r1, r0)
        L_0x0148:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Something went wrong :"
            r1.append(r0)
            java.lang.String r0 = r4.A05
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0157:
            r3.A01(r13, r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67273Oq.AyP(X.2SI):void");
    }

    public void BQq(IOException iOException) {
        C46202bF r3 = this.A02;
        r3.A02 = iOException;
        r3.A00 = 7;
        this.A00.A01(r3, this.A04, iOException.getLocalizedMessage());
    }

    public void BSB(Exception exc) {
        C46202bF r3 = this.A02;
        r3.A02 = exc;
        r3.A00 = 4;
        this.A00.A01(r3, this.A04, exc.getLocalizedMessage());
    }
}
