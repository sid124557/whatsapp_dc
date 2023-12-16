package X;

import android.graphics.Paint;

/* renamed from: X.7jS  reason: invalid class name and case insensitive filesystem */
public abstract class C158117jS {
    public static final C158117jS A03 = new C189098zz(2);
    public static final C158117jS A04 = new C189098zz(0);
    public static final C158117jS A05 = new C189098zz(1);
    public Paint A00 = new Paint();
    public final C06290Wz A01 = new C06290Wz();
    public final Object A02 = AnonymousClass002.A0D();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (X.AnonymousClass0S9.A00(r4.A00, r0.toString()) != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.Object r2 = r7.A02
            monitor-enter(r2)
            X.0Wz r3 = r7.A01     // Catch:{ all -> 0x0079 }
            java.lang.Object r0 = r3.get(r8)     // Catch:{ all -> 0x0079 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0079 }
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0013:
            r4 = r7
            X.8zz r4 = (X.C189098zz) r4
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x0066;
                default: goto L_0x001b;
            }
        L_0x001b:
            r6 = 0
        L_0x001c:
            int r0 = r8.length()
            if (r6 >= r0) goto L_0x0064
            int r5 = r8.codePointAt(r6)
            r0 = 255(0xff, float:3.57E-43)
            if (r5 <= r0) goto L_0x0049
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r5 > r0) goto L_0x003f
            char r0 = (char) r5
            java.lang.String r1 = java.lang.Character.toString(r0)
        L_0x0034:
            android.graphics.Paint r0 = r4.A00
            boolean r0 = X.AnonymousClass0S9.A00(r0, r1)
            if (r0 != 0) goto L_0x0049
            r1 = 0
        L_0x003d:
            monitor-enter(r2)
            goto L_0x006d
        L_0x003f:
            char[] r0 = java.lang.Character.toChars(r5)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L_0x0034
        L_0x0049:
            int r0 = java.lang.Character.charCount(r5)
            int r6 = r6 + r0
            goto L_0x001c
        L_0x004f:
            X.0Wz r0 = X.AnonymousClass79V.A02
            java.lang.Object r0 = r0.get(r8)
            if (r0 == 0) goto L_0x0064
            java.lang.String r1 = r0.toString()
            android.graphics.Paint r0 = r4.A00
            boolean r0 = X.AnonymousClass0S9.A00(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x003d
        L_0x0064:
            r1 = 1
            goto L_0x003d
        L_0x0066:
            android.graphics.Paint r0 = r4.A00
            boolean r1 = X.AnonymousClass0S9.A00(r0, r8)
            goto L_0x003d
        L_0x006d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0076 }
            r3.put(r8, r0)     // Catch:{ all -> 0x0076 }
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            return r1
        L_0x0076:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            throw r0
        L_0x0079:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158117jS.A00(java.lang.String):boolean");
    }
}
