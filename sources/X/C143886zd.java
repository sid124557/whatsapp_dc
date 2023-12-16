package X;

/* renamed from: X.6zd  reason: invalid class name and case insensitive filesystem */
public final class C143886zd extends Exception {
    public final Throwable cause;
    public final boolean isRecoverable;
    public final C158567kB mediaPeriodId;
    public final C166527yp rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final long timestampMs;
    public final int type;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C143886zd(X.C166527yp r14, java.lang.String r15, java.lang.Throwable r16, int r17, int r18, int r19, boolean r20) {
        /*
            r13 = this;
            r3 = 0
            r2 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            if (r17 == 0) goto L_0x0067
            r0 = 1
            if (r7 == r0) goto L_0x002d
            java.lang.String r4 = "Unexpected runtime error"
        L_0x0010:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r4)
            java.lang.String r0 = ": "
            java.lang.String r4 = X.AnonymousClass000.A0V(r0, r3, r1)
        L_0x0020:
            long r10 = android.os.SystemClock.elapsedRealtime()
            r1 = r13
            r6 = r16
            r12 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        L_0x002d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = " error, index="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", format="
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = ", format_supported="
            r1.append(r0)
            if (r19 == 0) goto L_0x0064
            r0 = 1
            if (r9 == r0) goto L_0x0061
            r0 = 2
            if (r9 == r0) goto L_0x005e
            r0 = 3
            if (r9 == r0) goto L_0x005b
            r0 = 4
            if (r9 != r0) goto L_0x006a
            java.lang.String r0 = "YES"
        L_0x0056:
            java.lang.String r4 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0010
        L_0x005b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L_0x0056
        L_0x005e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L_0x0056
        L_0x0061:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L_0x0056
        L_0x0064:
            java.lang.String r0 = "NO"
            goto L_0x0056
        L_0x0067:
            java.lang.String r4 = "Source error"
            goto L_0x0010
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143886zd.<init>(X.7yp, java.lang.String, java.lang.Throwable, int, int, int, boolean):void");
    }

    public C143886zd A00(C158567kB r13) {
        String message = getMessage();
        Throwable th = this.cause;
        int i = this.type;
        return new C143886zd(this.rendererFormat, r13, message, this.rendererName, th, i, this.rendererIndex, this.rendererFormatSupport, this.timestampMs, this.isRecoverable);
    }

    public C143886zd(C166527yp r1, C158567kB r2, String str, String str2, Throwable th, int i, int i2, int i3, long j, boolean z) {
        super(str, th);
        this.type = i;
        this.cause = th;
        this.rendererName = str2;
        this.rendererIndex = i2;
        this.rendererFormat = r1;
        this.rendererFormatSupport = i3;
        this.mediaPeriodId = r2;
        this.timestampMs = j;
        this.isRecoverable = z;
    }
}
