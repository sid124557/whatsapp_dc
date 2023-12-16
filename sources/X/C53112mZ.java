package X;

/* renamed from: X.2mZ  reason: invalid class name and case insensitive filesystem */
public abstract class C53112mZ {
    public final int A00;
    public final C48152eR A01;
    public final C55362qE A02;
    public final String A03;
    public final String A04;

    public C53112mZ(C48152eR r1, C55362qE r2, String str, String str2, int i) {
        this.A04 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = r1;
        this.A02 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8 A[Catch:{ all -> 0x011b, all -> 0x0120, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0102 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00(android.os.CancellationSignal r16) {
        /*
            r15 = this;
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            r1 = 1
            r10 = -1
            r0 = 1
        L_0x0008:
            boolean r2 = r16.isCanceled()
            if (r2 == 0) goto L_0x0013
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0013:
            r3 = r15
            boolean r2 = r15 instanceof X.C22221In
            if (r2 == 0) goto L_0x0061
            X.1In r3 = (X.C22221In) r3
            X.2EY r4 = r3.A01
            X.34k r8 = r4.A00
            java.lang.String r9 = r3.A04
            int r3 = r3.A00
            long r12 = (long) r3
            X.2JQ r9 = r8.A06(r9, r10, r12)
        L_0x0027:
            java.util.List r4 = r9.A01
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0145
            int r3 = r4.size()
            int r5 = r15.A00
            r11 = 0
            if (r3 <= r5) goto L_0x004d
            java.util.List r6 = r4.subList(r11, r5)
            int r3 = X.AnonymousClass002.A04(r6, r1)
            java.lang.Object r3 = r6.get(r3)
            long r3 = X.C18310x6.A0B(r3)
            X.2JQ r9 = new X.2JQ
            r9.<init>(r6, r3)
        L_0x004d:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r4 = r15.A03
            java.lang.Object[] r3 = new java.lang.Object[r1]
            X.AnonymousClass000.A1P(r3, r0, r11)
            java.lang.String r8 = java.lang.String.format(r6, r4, r3)
            X.2eR r3 = r15.A01
            java.io.File r10 = r3.A00(r8)
            goto L_0x0095
        L_0x0061:
            boolean r4 = r15 instanceof X.C22211Im
            if (r4 == 0) goto L_0x0075
            X.1Im r3 = (X.C22211Im) r3
            X.2EY r4 = r3.A00
            X.34k r8 = r4.A00
            java.lang.String r9 = r3.A01
            int r3 = r3.A00
            long r12 = (long) r3
            X.2JQ r9 = r8.A05(r9, r10, r12)
            goto L_0x0027
        L_0x0075:
            X.1Il r3 = (X.C22201Il) r3
            X.2Rx r4 = r3.A00
            X.34k r8 = r4.A00
            java.lang.String r9 = "message"
            int r4 = r3.A00
            long r12 = (long) r4
            X.2JQ r9 = r8.A05(r9, r10, r12)
            X.2Tf r3 = r3.A01
            X.2Rz r8 = r3.A02
            long r5 = r8.A01
            java.util.List r3 = r9.A01
            int r3 = r3.size()
            long r3 = (long) r3
            long r5 = r5 + r3
            r8.A01 = r5
            goto L_0x0027
        L_0x0095:
            java.io.FileOutputStream r3 = X.AnonymousClass0x9.A0h(r10)     // Catch:{ JSONException -> 0x012f }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0125 }
            r4.<init>(r3)     // Catch:{ all -> 0x0125 }
            java.util.List r6 = r9.A01     // Catch:{ all -> 0x011b }
            r13 = r15
            if (r2 == 0) goto L_0x00c0
            X.1In r13 = (X.C22221In) r13     // Catch:{ all -> 0x011b }
            java.util.ArrayList r12 = X.AnonymousClass000.A0p(r6)     // Catch:{ all -> 0x011b }
            X.1Io r14 = new X.1Io     // Catch:{ all -> 0x011b }
            r14.<init>(r13, r12)     // Catch:{ all -> 0x011b }
            android.os.CancellationSignal r2 = r13.A00     // Catch:{ all -> 0x011b }
            r14.A00(r2, r6)     // Catch:{ all -> 0x011b }
            int r2 = r12.size()     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00d5
            X.2oS r2 = r13.A02     // Catch:{ all -> 0x011b }
            org.json.JSONObject r12 = r2.A01(r12)     // Catch:{ all -> 0x011b }
            goto L_0x00d6
        L_0x00c0:
            boolean r2 = r15 instanceof X.C22211Im     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00cb
            int r2 = r6.size()     // Catch:{ all -> 0x011b }
            if (r2 != 0) goto L_0x00cb
            goto L_0x00d5
        L_0x00cb:
            X.1Ii r2 = new X.1Ii     // Catch:{ all -> 0x011b }
            r2.<init>()     // Catch:{ all -> 0x011b }
            org.json.JSONObject r12 = r2.A01(r6)     // Catch:{ all -> 0x011b }
            goto L_0x00d6
        L_0x00d5:
            r12 = 0
        L_0x00d6:
            if (r12 == 0) goto L_0x00e1
            r2 = 4
            java.lang.String r2 = r12.toString(r2)     // Catch:{ all -> 0x011b }
            r4.write(r2)     // Catch:{ all -> 0x011b }
            r11 = 1
        L_0x00e1:
            r4.close()     // Catch:{ all -> 0x0125 }
            r3.close()     // Catch:{ JSONException -> 0x012f }
            if (r11 == 0) goto L_0x0103
            X.2qE r2 = r15.A02
            long r10 = r2.A02(r10, r8, r1)
            r3 = 0
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0107
            r7.add(r8)
            int r0 = r0 + 1
        L_0x00fa:
            long r10 = r9.A00
            int r2 = r6.size()
            if (r2 >= r5) goto L_0x0008
            return r7
        L_0x0103:
            X.C18270x1.A0x(r10)
            goto L_0x00fa
        L_0x0107:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r15.A04
            r1.append(r0)
            java.lang.String r0 = "Failed to export required file with IDs."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x011b:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0120 }
            goto L_0x0124
        L_0x0120:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0125 }
        L_0x0124:
            throw r1     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x012a }
            goto L_0x012e
        L_0x012a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ JSONException -> 0x012f }
        L_0x012e:
            throw r1     // Catch:{ JSONException -> 0x012f }
        L_0x012f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r15.A04
            r1.append(r0)
            java.lang.String r0 = "Failed to write deleted message IDs to JSON"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x0145:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53112mZ.A00(android.os.CancellationSignal):java.util.List");
    }
}
