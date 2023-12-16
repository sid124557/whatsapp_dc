package X;

/* renamed from: X.6zY  reason: invalid class name and case insensitive filesystem */
public class C143836zY extends Exception {
    public final C160687o8 codecInfo;
    public final String diagnosticInfo;
    public final C143836zY fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C143836zY(X.C166527yp r11, java.lang.Throwable r12, int r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Decoder init failed: ["
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = "], "
            java.lang.String r5 = X.AnonymousClass000.A0P(r11, r0, r1)
            java.lang.String r6 = r11.A0T
            r3 = 0
            java.lang.String r2 = "neg_"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
            r1.append(r0)
            r1.append(r2)
            int r0 = java.lang.Math.abs(r13)
            java.lang.String r7 = X.AnonymousClass000.A0h(r1, r0)
            r9 = 0
            r2 = r10
            r8 = r12
            r4 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143836zY.<init>(X.7yp, java.lang.Throwable, int):void");
    }

    public C143836zY(C160687o8 r1, C143836zY r2, String str, String str2, String str3, Throwable th, boolean z) {
        super(str, th);
        this.mimeType = str2;
        this.secureDecoderRequired = z;
        this.codecInfo = r1;
        this.diagnosticInfo = str3;
        this.fallbackDecoderInitializationException = r2;
    }
}
