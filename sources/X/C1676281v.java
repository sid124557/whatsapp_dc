package X;

import android.net.Uri;

/* renamed from: X.81v  reason: invalid class name and case insensitive filesystem */
public final class C1676281v implements C183688qS {
    public long A00;
    public long A01 = -1;
    public long A02;
    public C161387pX A03;
    public boolean A04 = true;
    public final Uri A05;
    public final AnonymousClass7A1 A06 = new AnonymousClass7A1();
    public final C148557Iv A07;
    public final C185788uF A08;
    public final C157987jF A09;
    public volatile boolean A0A;
    public final /* synthetic */ AnonymousClass812 A0B;

    public void Ayc() {
        this.A0A = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0096, code lost:
        r0 = r13.A02;
        r7.A00 = r0;
        r8.A00 = r0 - r8.A03.A01;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BJl() {
        /*
            r19 = this;
            r10 = 0
            r9 = 0
        L_0x0002:
            r8 = r19
            boolean r0 = r8.A0A
            if (r0 != 0) goto L_0x0107
            r12 = 1
            X.7A1 r7 = r8.A06     // Catch:{ all -> 0x0100 }
            long r5 = r7.A00     // Catch:{ all -> 0x0100 }
            android.net.Uri r1 = r8.A05     // Catch:{ all -> 0x0100 }
            r3 = -1
            X.812 r11 = r8.A0B     // Catch:{ all -> 0x0100 }
            X.7pX r0 = new X.7pX     // Catch:{ all -> 0x0100 }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x0100 }
            r8.A03 = r0     // Catch:{ all -> 0x0100 }
            X.8uF r14 = r8.A08     // Catch:{ all -> 0x0100 }
            long r0 = r14.Bfw(r0)     // Catch:{ all -> 0x0100 }
            r8.A01 = r0     // Catch:{ all -> 0x0100 }
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0029
            long r0 = r0 + r5
            r8.A01 = r0     // Catch:{ all -> 0x0100 }
        L_0x0029:
            X.7bJ r4 = new X.7bJ     // Catch:{ all -> 0x0100 }
            r15 = r5
            r17 = r0
            r13 = r4
            r13.<init>(r14, r15, r17)     // Catch:{ all -> 0x0100 }
            X.7Iv r1 = r8.A07     // Catch:{ all -> 0x00f1 }
            android.net.Uri r2 = r14.BE6()     // Catch:{ all -> 0x00f1 }
            X.8tH r13 = r1.A00     // Catch:{ all -> 0x00f1 }
            if (r13 != 0) goto L_0x005d
            X.8tH[] r15 = r1.A02     // Catch:{ all -> 0x00f1 }
            int r3 = r15.length     // Catch:{ all -> 0x00f1 }
            r13 = 0
        L_0x0040:
            if (r13 >= r3) goto L_0x0054
            r0 = r15[r13]     // Catch:{ all -> 0x00f1 }
            boolean r16 = r0.BpR(r4)     // Catch:{ EOFException -> 0x004d, all -> 0x00ed }
            if (r16 == 0) goto L_0x004d
            r1.A00 = r0     // Catch:{ EOFException -> 0x004d, all -> 0x00ed }
            goto L_0x0052
        L_0x004d:
            r4.A01 = r10     // Catch:{ all -> 0x00f1 }
            int r13 = r13 + 1
            goto L_0x0040
        L_0x0052:
            r4.A01 = r10     // Catch:{ all -> 0x00f1 }
        L_0x0054:
            X.8tH r13 = r1.A00     // Catch:{ all -> 0x00f1 }
            if (r13 == 0) goto L_0x00ab
            X.8sO r0 = r1.A01     // Catch:{ all -> 0x00f1 }
            r13.BFq(r0)     // Catch:{ all -> 0x00f1 }
        L_0x005d:
            boolean r0 = r8.A04     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0068
            long r0 = r8.A02     // Catch:{ all -> 0x00f1 }
            r13.Bkz(r5, r0)     // Catch:{ all -> 0x00f1 }
            r8.A04 = r10     // Catch:{ all -> 0x00f1 }
        L_0x0068:
            boolean r0 = r8.A0A     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x0096
            X.7jF r15 = r8.A09     // Catch:{ all -> 0x00f1 }
            monitor-enter(r15)     // Catch:{ all -> 0x00f1 }
        L_0x006f:
            boolean r0 = r15.A00     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0077
            r15.wait()     // Catch:{ all -> 0x00a8 }
            goto L_0x006f
        L_0x0077:
            monitor-exit(r15)     // Catch:{ all -> 0x00f1 }
            int r9 = r13.BiC(r4, r7)     // Catch:{ all -> 0x00f1 }
            long r2 = r4.A02     // Catch:{ all -> 0x00f1 }
            long r0 = r11.A0O     // Catch:{ all -> 0x00f1 }
            long r0 = r0 + r5
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 <= 0) goto L_0x0090
            r5 = r2
            r15.A00()     // Catch:{ all -> 0x00f1 }
            android.os.Handler r1 = r11.A0Q     // Catch:{ all -> 0x00f1 }
            java.lang.Runnable r0 = r11.A0Z     // Catch:{ all -> 0x00f1 }
            r1.post(r0)     // Catch:{ all -> 0x00f1 }
        L_0x0090:
            if (r9 == 0) goto L_0x0068
            if (r9 != r12) goto L_0x0096
            r9 = 0
            goto L_0x00a1
        L_0x0096:
            long r0 = r4.A02
            r7.A00 = r0
            X.7pX r2 = r8.A03
            long r2 = r2.A01
            long r0 = r0 - r2
            r8.A00 = r0
        L_0x00a1:
            r14.close()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            if (r9 != 0) goto L_0x0107
            goto L_0x0002
        L_0x00a8:
            r1 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f0
        L_0x00ab:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = ""
            r5.append(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "  Content Length: "
            r5.append(r0)     // Catch:{ all -> 0x00f1 }
            long r0 = r4.A04     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r5)     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "None of the available extractors ("
            java.lang.StringBuilder r1 = X.C18290x4.A0w(r0, r5)     // Catch:{ all -> 0x00f1 }
        L_0x00cd:
            if (r10 >= r3) goto L_0x00de
            r0 = r15[r10]     // Catch:{ all -> 0x00f1 }
            X.AnonymousClass000.A1A(r0, r1)     // Catch:{ all -> 0x00f1 }
            int r0 = r3 + -1
            if (r10 >= r0) goto L_0x00db
            X.AnonymousClass001.A1M(r1)     // Catch:{ all -> 0x00f1 }
        L_0x00db:
            int r10 = r10 + 1
            goto L_0x00cd
        L_0x00de:
            X.AnonymousClass000.A1B(r1, r5)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = ") could read the stream."
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r6, r5)     // Catch:{ all -> 0x00f1 }
            X.6JV r1 = new X.6JV     // Catch:{ all -> 0x00f1 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f0
        L_0x00ed:
            r1 = move-exception
            r4.A01 = r10     // Catch:{ all -> 0x00f1 }
        L_0x00f0:
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r5 = move-exception
            if (r9 == r12) goto L_0x0101
            long r2 = r4.A02
            r7.A00 = r2
            X.7pX r0 = r8.A03
            long r0 = r0.A01
            long r2 = r2 - r0
            r8.A00 = r2
            goto L_0x0101
        L_0x0100:
            r5 = move-exception
        L_0x0101:
            X.8uF r0 = r8.A08
            r0.close()     // Catch:{ IOException -> 0x0106 }
        L_0x0106:
            throw r5
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676281v.BJl():void");
    }

    public C1676281v(Uri uri, C148557Iv r4, AnonymousClass812 r5, C185788uF r6, C157987jF r7) {
        this.A0B = r5;
        this.A05 = uri;
        r6.getClass();
        this.A08 = r6;
        r4.getClass();
        this.A07 = r4;
        this.A09 = r7;
    }
}
