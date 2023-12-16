package X;

/* renamed from: X.09r  reason: invalid class name and case insensitive filesystem */
public abstract class C012209r extends AnonymousClass0QE {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x017e, code lost:
        r3.Axt(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.Object r13) {
        /*
            r12 = this;
            X.0vK r3 = r12.A01()
            r0 = r12
            X.0vs r0 = (X.C17620vs) r0     // Catch:{ all -> 0x018e }
            int r0 = r0.A01     // Catch:{ all -> 0x018e }
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x003a;
                case 2: goto L_0x0055;
                case 3: goto L_0x002f;
                case 4: goto L_0x0187;
                case 5: goto L_0x006c;
                default: goto L_0x000c;
            }     // Catch:{ all -> 0x018e }
        L_0x000c:
            X.0LH r13 = (X.AnonymousClass0LH) r13     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A00     // Catch:{ all -> 0x018e }
            r0 = 1
            r3.Axu(r0, r1)     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A01     // Catch:{ all -> 0x018e }
        L_0x0016:
            r0 = 2
            r3.Axu(r0, r1)     // Catch:{ all -> 0x018e }
        L_0x001a:
            r0 = r3
            X.0A6 r0 = (X.AnonymousClass0A6) r0     // Catch:{ all -> 0x018e }
            android.database.sqlite.SQLiteStatement r0 = r0.A00     // Catch:{ all -> 0x018e }
            r0.executeInsert()     // Catch:{ all -> 0x018e }
            goto L_0x0183
        L_0x0024:
            X.0LF r13 = (X.AnonymousClass0LF) r13     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A01     // Catch:{ all -> 0x018e }
            r0 = 1
            r3.Axu(r0, r1)     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A00     // Catch:{ all -> 0x018e }
            goto L_0x0016
        L_0x002f:
            X.0LG r13 = (X.AnonymousClass0LG) r13     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A00     // Catch:{ all -> 0x018e }
            r0 = 1
            r3.Axu(r0, r1)     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A01     // Catch:{ all -> 0x018e }
            goto L_0x0016
        L_0x003a:
            X.0PK r13 = (X.AnonymousClass0PK) r13     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A01     // Catch:{ all -> 0x018e }
            r0 = 1
            if (r1 != 0) goto L_0x0051
            r3.Axt(r0)     // Catch:{ all -> 0x018e }
        L_0x0044:
            java.lang.Long r0 = r13.A00     // Catch:{ all -> 0x018e }
            r2 = 2
            if (r0 == 0) goto L_0x017e
            long r0 = r0.longValue()     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            goto L_0x001a
        L_0x0051:
            r3.Axu(r0, r1)     // Catch:{ all -> 0x018e }
            goto L_0x0044
        L_0x0055:
            X.0PX r13 = (X.AnonymousClass0PX) r13     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A02     // Catch:{ all -> 0x018e }
            r0 = 1
            r3.Axu(r0, r1)     // Catch:{ all -> 0x018e }
            int r0 = r13.A00     // Catch:{ all -> 0x018e }
            long r1 = (long) r0     // Catch:{ all -> 0x018e }
            r0 = 2
            r3.Axs(r0, r1)     // Catch:{ all -> 0x018e }
            int r0 = r13.A01     // Catch:{ all -> 0x018e }
            long r1 = (long) r0     // Catch:{ all -> 0x018e }
            r0 = 3
            r3.Axs(r0, r1)     // Catch:{ all -> 0x018e }
            goto L_0x001a
        L_0x006c:
            X.0Wv r13 = (X.C06250Wv) r13     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A0J     // Catch:{ all -> 0x018e }
            r0 = 1
            r3.Axu(r0, r1)     // Catch:{ all -> 0x018e }
            X.0GD r0 = r13.A0E     // Catch:{ all -> 0x018e }
            int r0 = X.AnonymousClass0YN.A03(r0)     // Catch:{ all -> 0x018e }
            r2 = 2
            long r0 = (long) r0     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A0G     // Catch:{ all -> 0x018e }
            r0 = 3
            r3.Axu(r0, r1)     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r13.A0F     // Catch:{ all -> 0x018e }
            r0 = 4
            if (r1 != 0) goto L_0x0164
            r3.Axt(r0)     // Catch:{ all -> 0x018e }
        L_0x008d:
            X.0Xq r0 = r13.A0B     // Catch:{ all -> 0x018e }
            byte[] r1 = X.AnonymousClass0Xq.A01(r0)     // Catch:{ all -> 0x018e }
            r0 = 5
            if (r1 != 0) goto L_0x015f
            r3.Axt(r0)     // Catch:{ all -> 0x018e }
        L_0x0099:
            X.0Xq r0 = r13.A0C     // Catch:{ all -> 0x018e }
            byte[] r1 = X.AnonymousClass0Xq.A01(r0)     // Catch:{ all -> 0x018e }
            r0 = 6
            if (r1 != 0) goto L_0x015a
            r3.Axt(r0)     // Catch:{ all -> 0x018e }
        L_0x00a5:
            r2 = 7
            long r0 = r13.A04     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            r2 = 8
            long r0 = r13.A05     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            r2 = 9
            long r0 = r13.A03     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            int r0 = r13.A01     // Catch:{ all -> 0x018e }
            long r1 = (long) r0     // Catch:{ all -> 0x018e }
            r0 = 10
            r3.Axs(r0, r1)     // Catch:{ all -> 0x018e }
            X.0FN r0 = r13.A09     // Catch:{ all -> 0x018e }
            int r0 = X.AnonymousClass0YN.A00(r0)     // Catch:{ all -> 0x018e }
            r2 = 11
            long r0 = (long) r0     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            r2 = 12
            long r0 = r13.A02     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            r2 = 13
            long r0 = r13.A06     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            r2 = 14
            long r0 = r13.A07     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            r2 = 15
            long r0 = r13.A08     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            boolean r0 = r13.A0H     // Catch:{ all -> 0x018e }
            r2 = 16
            long r0 = (long) r0     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            X.0FO r0 = r13.A0D     // Catch:{ all -> 0x018e }
            int r0 = X.AnonymousClass0YN.A02(r0)     // Catch:{ all -> 0x018e }
            r2 = 17
            long r0 = (long) r0     // Catch:{ all -> 0x018e }
            r3.Axs(r2, r0)     // Catch:{ all -> 0x018e }
            int r0 = r13.A00     // Catch:{ all -> 0x018e }
            long r1 = (long) r0     // Catch:{ all -> 0x018e }
            r0 = 18
            r3.Axs(r0, r1)     // Catch:{ all -> 0x018e }
            int r0 = r13.A0I     // Catch:{ all -> 0x018e }
            long r1 = (long) r0     // Catch:{ all -> 0x018e }
            r0 = 19
            r3.Axs(r0, r1)     // Catch:{ all -> 0x018e }
            X.0XS r4 = r13.A0A     // Catch:{ all -> 0x018e }
            r7 = 26
            r5 = 25
            r6 = 24
            r8 = 23
            r9 = 22
            r10 = 21
            r11 = 20
            r2 = 27
            if (r4 == 0) goto L_0x0169
            X.0Fy r0 = r4.A02     // Catch:{ all -> 0x018e }
            int r0 = X.AnonymousClass0YN.A01(r0)     // Catch:{ all -> 0x018e }
            long r0 = (long) r0     // Catch:{ all -> 0x018e }
            r3.Axs(r11, r0)     // Catch:{ all -> 0x018e }
            boolean r0 = r4.A05     // Catch:{ all -> 0x018e }
            long r0 = (long) r0     // Catch:{ all -> 0x018e }
            r3.Axs(r10, r0)     // Catch:{ all -> 0x018e }
            boolean r0 = r4.A00()     // Catch:{ all -> 0x018e }
            long r0 = (long) r0     // Catch:{ all -> 0x018e }
            r3.Axs(r9, r0)     // Catch:{ all -> 0x018e }
            boolean r0 = r4.A04     // Catch:{ all -> 0x018e }
            long r0 = (long) r0     // Catch:{ all -> 0x018e }
            r3.Axs(r8, r0)     // Catch:{ all -> 0x018e }
            boolean r0 = r4.A07     // Catch:{ all -> 0x018e }
            long r0 = (long) r0     // Catch:{ all -> 0x018e }
            r3.Axs(r6, r0)     // Catch:{ all -> 0x018e }
            long r0 = r4.A01     // Catch:{ all -> 0x018e }
            r3.Axs(r5, r0)     // Catch:{ all -> 0x018e }
            long r0 = r4.A00     // Catch:{ all -> 0x018e }
            r3.Axs(r7, r0)     // Catch:{ all -> 0x018e }
            java.util.Set r0 = r4.A03     // Catch:{ all -> 0x018e }
            byte[] r0 = X.AnonymousClass0YN.A09(r0)     // Catch:{ all -> 0x018e }
            r3.Axp(r2, r0)     // Catch:{ all -> 0x018e }
            goto L_0x001a
        L_0x015a:
            r3.Axp(r0, r1)     // Catch:{ all -> 0x018e }
            goto L_0x00a5
        L_0x015f:
            r3.Axp(r0, r1)     // Catch:{ all -> 0x018e }
            goto L_0x0099
        L_0x0164:
            r3.Axu(r0, r1)     // Catch:{ all -> 0x018e }
            goto L_0x008d
        L_0x0169:
            r3.Axt(r11)     // Catch:{ all -> 0x018e }
            r3.Axt(r10)     // Catch:{ all -> 0x018e }
            r3.Axt(r9)     // Catch:{ all -> 0x018e }
            r3.Axt(r8)     // Catch:{ all -> 0x018e }
            r3.Axt(r6)     // Catch:{ all -> 0x018e }
            r3.Axt(r5)     // Catch:{ all -> 0x018e }
            r3.Axt(r7)     // Catch:{ all -> 0x018e }
        L_0x017e:
            r3.Axt(r2)     // Catch:{ all -> 0x018e }
            goto L_0x001a
        L_0x0183:
            r12.A04(r3)
            return
        L_0x0187:
            java.lang.String r0 = "getWorkSpecId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x018e }
            throw r0     // Catch:{ all -> 0x018e }
        L_0x018e:
            r0 = move-exception
            r12.A04(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012209r.A05(java.lang.Object):void");
    }

    public C012209r(AnonymousClass0R5 r1) {
        super(r1);
    }
}
