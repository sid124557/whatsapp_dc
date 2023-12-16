package X;

/* renamed from: X.6k5  reason: invalid class name and case insensitive filesystem */
public final class C135076k5 extends C143956zl {
    public final Throwable cause;
    public final int code;
    public final String failedKey;
    public final String message;
    public final Object parsedErrors;

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C135076k5(java.lang.String r17, java.lang.Throwable[] r18) {
        /*
            r16 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r17)
            java.lang.String r0 = " due to: "
            r1.append(r0)
            r0 = 0
            r4 = r18
            r0 = r18[r0]
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r0.getMessage()
        L_0x0014:
            java.lang.String r12 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r4.length
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0055
            int r0 = r1 + -1
            r9 = r18[r1]
        L_0x0021:
            if (r0 < 0) goto L_0x004a
            int r3 = r0 + -1
            r2 = r18[r0]
            X.6k5 r5 = new X.6k5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "caused by "
            r1.append(r0)
            if (r2 == 0) goto L_0x0046
            java.lang.String r0 = r2.getMessage()
        L_0x0038:
            java.lang.String r7 = X.AnonymousClass000.A0X(r0, r1)
            r6 = 0
            r10 = 417(0x1a1, float:5.84E-43)
            r8 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = r3
            r9 = r5
            goto L_0x0021
        L_0x0046:
            r0 = 0
            goto L_0x0038
        L_0x0048:
            r0 = 0
            goto L_0x0014
        L_0x004a:
            r11 = 0
            r15 = 472(0x1d8, float:6.61E-43)
            r10 = r16
            r13 = r11
            r14 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            return
        L_0x0055:
            java.lang.String r0 = "Empty array can't be reduced."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135076k5.<init>(java.lang.String, java.lang.Throwable[]):void");
    }

    public C135076k5(Object obj, String str, String str2, Throwable th, int i) {
        super(str, "CLIENT", th, i);
        this.message = str;
        this.cause = th;
        this.code = i;
        this.parsedErrors = obj;
        this.failedKey = str2;
    }
}
