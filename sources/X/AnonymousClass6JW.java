package X;

/* renamed from: X.6JW  reason: invalid class name */
public final class AnonymousClass6JW extends C143946zk {
    public final boolean isRecoverable;
    public final AnonymousClass701 mediaPeriodId;
    public final C166637z1 rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6JW(X.C166637z1 r12, java.lang.String r13, java.lang.Throwable r14, int r15, int r16, int r17, int r18) {
        /*
            r11 = this;
            r2 = 0
            r7 = r14
            r3 = r18
            r4 = r17
            if (r14 == 0) goto L_0x002f
            java.lang.String r6 = r14.getMessage()
            if (r6 == 0) goto L_0x002f
        L_0x000e:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r1 = 0
            r5 = r11
            r8 = r16
            r5.<init>(r6, r7, r8, r9)
            r0 = 0
            if (r14 == 0) goto L_0x001d
            r0 = 1
        L_0x001d:
            X.C159197lM.A01(r0)
            r11.type = r15
            r11.rendererName = r13
            r11.rendererIndex = r4
            r11.rendererFormat = r12
            r11.rendererFormatSupport = r3
            r11.mediaPeriodId = r2
            r11.isRecoverable = r1
            return
        L_0x002f:
            if (r15 == 0) goto L_0x0069
            r0 = 1
            if (r15 == r0) goto L_0x0047
            java.lang.String r6 = "Unexpected runtime error"
        L_0x0036:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x000e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)
            java.lang.String r0 = ": "
            java.lang.String r6 = X.AnonymousClass000.A0V(r0, r2, r1)
            goto L_0x000e
        L_0x0047:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r13)
            java.lang.String r0 = " error, index="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", format="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", format_supported="
            r1.append(r0)
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A08(r3)
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0036
        L_0x0069:
            java.lang.String r6 = "Source error"
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JW.<init>(X.7z1, java.lang.String, java.lang.Throwable, int, int, int, int):void");
    }

    public static AnonymousClass6JW A00(Throwable th, int i, int i2) {
        return new AnonymousClass6JW((C166637z1) null, (String) null, th, i, i2, -1, 4);
    }
}
