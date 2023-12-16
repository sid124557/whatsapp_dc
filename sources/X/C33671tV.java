package X;

import java.util.Map;

/* renamed from: X.1tV  reason: invalid class name and case insensitive filesystem */
public class C33671tV extends AnonymousClass5ZM {
    public boolean A00 = false;
    public final C56492s4 A01;
    public final C85034Er A02;
    public final C56782sY A03;
    public final AnonymousClass33K A04;
    public final C55132pq A05;
    public final C54832pM A06 = new C54832pM(1, 1000);
    public final Integer A07;
    public final Object A08;
    public final String A09;
    public final Map A0A;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Integer num = (Integer) obj;
        this.A03.A09 = false;
        C85034Er r1 = this.A02;
        if (r1 == null) {
            return;
        }
        if (num.intValue() == 0) {
            r1.onSuccess();
        } else if (this.A00) {
            r1.Be9(num);
        } else {
            r1.BSD(num);
        }
    }

    public C33671tV(C56492s4 r6, C85034Er r7, C56782sY r8, AnonymousClass33K r9, C55132pq r10, Integer num, Object obj, String str, Map map) {
        this.A01 = r6;
        this.A05 = r10;
        this.A03 = r8;
        this.A04 = r9;
        this.A09 = str;
        this.A08 = obj;
        this.A0A = map;
        this.A02 = r7;
        this.A07 = num;
        r8.A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0119, code lost:
        return java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0110 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r15) {
        /*
            r14 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FetchAssetAsyncTask: endpoint = "
            r1.append(r0)
            java.lang.String r9 = r14.A09
            X.C18260x0.A1J(r1, r9)
            X.2pM r8 = r14.A06
            r8.A02()
            X.2sY r7 = r14.A03
            r6 = 0
            java.lang.String r1 = r7.A04(r6)
            boolean r0 = r7.A0C(r6)
            if (r0 == 0) goto L_0x0021
            r6 = r1
        L_0x0021:
            r5 = 1
            r4 = 0
            r11 = 1
        L_0x0024:
            int r0 = r7.A00
            if (r4 >= r0) goto L_0x0106
            r3 = 0
            java.lang.String r10 = "FetchAssetAsyncTask: "
            r0 = 14
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.33K r1 = r14.A04     // Catch:{ Exception -> 0x00f7 }
            X.2pq r0 = r14.A05     // Catch:{ Exception -> 0x00f7 }
            X.4GL r2 = r1.A01(r0, r9, r6)     // Catch:{ Exception -> 0x00f7 }
            r0 = r2
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x00ed }
            java.net.HttpURLConnection r11 = r0.A01     // Catch:{ all -> 0x00ed }
            int r1 = r11.getResponseCode()     // Catch:{ all -> 0x00ed }
            r0 = 304(0x130, float:4.26E-43)
            if (r1 != r0) goto L_0x004a
            r7.A07()     // Catch:{ all -> 0x00ed }
            goto L_0x00cb
        L_0x004a:
            int r1 = r11.getResponseCode()     // Catch:{ all -> 0x00ed }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0067
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r10, r9)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = " Request fails, response code: "
            r1.append(r0)     // Catch:{ all -> 0x00ed }
            int r0 = r11.getResponseCode()     // Catch:{ all -> 0x00ed }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x00ed }
            r2.close()     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0101
        L_0x0067:
            X.2s4 r1 = r14.A01     // Catch:{ all -> 0x00ed }
            java.lang.Integer r0 = r14.A07     // Catch:{ all -> 0x00ed }
            java.io.InputStream r13 = r2.B47(r1, r3, r0)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "signature"
            java.lang.String r0 = r11.getHeaderField(r0)     // Catch:{ all -> 0x00e3 }
            byte[] r1 = X.C624535b.A05(r13)     // Catch:{ all -> 0x00e3 }
            java.util.Map r12 = r14.A0A     // Catch:{ all -> 0x00e3 }
            boolean r0 = r7.A0D(r0, r12, r1)     // Catch:{ all -> 0x00e3 }
            if (r0 != 0) goto L_0x0096
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r10, r9)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = " Signature verify fails."
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x00e3 }
            r13.close()     // Catch:{ all -> 0x00ed }
            r2.close()     // Catch:{ Exception -> 0x00f7 }
            android.net.TrafficStats.clearThreadStatsTag()
            r11 = 2
            goto L_0x010e
        L_0x0096:
            java.lang.String r0 = "Is-Encrypted"
            r2.BFZ(r0)     // Catch:{ all -> 0x00e3 }
            java.io.ByteArrayInputStream r1 = X.AnonymousClass0x9.A0d(r1)     // Catch:{ all -> 0x00e3 }
            java.lang.Object r0 = r14.A08     // Catch:{ all -> 0x00e3 }
            boolean r0 = r7.A0B(r1, r0, r12)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r7.A0A()     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x00bf
            r7.A07()     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "etag"
            java.lang.String r1 = r11.getHeaderField(r0)     // Catch:{ all -> 0x00e3 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00e3 }
            if (r0 != 0) goto L_0x00bf
            r7.A09(r3, r1)     // Catch:{ all -> 0x00e3 }
        L_0x00bf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r10, r9)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = " Store succeeds."
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x00e3 }
            r13.close()     // Catch:{ all -> 0x00ed }
        L_0x00cb:
            r2.close()     // Catch:{ Exception -> 0x00f7 }
            goto L_0x010a
        L_0x00cf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r10, r9)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = " Store fails."
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x00e3 }
            r13.close()     // Catch:{ all -> 0x00ed }
            r2.close()     // Catch:{ Exception -> 0x00f7 }
            android.net.TrafficStats.clearThreadStatsTag()
            r11 = 4
            goto L_0x010e
        L_0x00e3:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ed }
        L_0x00ec:
            throw r1     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x00f6
        L_0x00f2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x00f7 }
        L_0x00f6:
            throw r1     // Catch:{ Exception -> 0x00f7 }
        L_0x00f7:
            r2 = move-exception
            java.lang.String r1 = " Exception: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r10, r9)     // Catch:{ all -> 0x013e }
            X.C18260x0.A1Q(r0, r1, r2)     // Catch:{ all -> 0x013e }
        L_0x0101:
            android.net.TrafficStats.clearThreadStatsTag()
            r11 = 1
            goto L_0x010e
        L_0x0106:
            r7.A05()
            goto L_0x0115
        L_0x010a:
            android.net.TrafficStats.clearThreadStatsTag()
            r11 = 0
        L_0x010e:
            if (r11 != 0) goto L_0x011a
            r7.A08(r4)
            r7.A08 = r5
        L_0x0115:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            return r0
        L_0x011a:
            int r0 = r7.A01
            if (r4 != r0) goto L_0x0121
            r14.A00 = r5
            goto L_0x0115
        L_0x0121:
            int r0 = r7.A00
            int r0 = r0 - r5
            if (r4 >= r0) goto L_0x013a
            long r2 = r8.A01()     // Catch:{ InterruptedException -> 0x0131 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x0131 }
            goto L_0x013a
        L_0x0131:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r10, r9)
            java.lang.String r0 = " retries/interrupted"
            X.C18260x0.A1J(r1, r0)
        L_0x013a:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x013e:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33671tV.A08(java.lang.Object[]):java.lang.Object");
    }
}
