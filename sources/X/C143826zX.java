package X;

/* renamed from: X.6zX  reason: invalid class name and case insensitive filesystem */
public class C143826zX extends Exception {
    public final C160577nt codecInfo;
    public final String diagnosticInfo;
    public final C143826zX fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C143826zX(X.C166637z1 r11, java.lang.Throwable r12, int r13, boolean r14) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Decoder init failed: ["
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = "], "
            java.lang.String r5 = X.AnonymousClass000.A0P(r11, r0, r1)
            java.lang.String r6 = r11.A0S
            r3 = 0
            java.lang.String r2 = "neg_"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "com.facebook.android.exoplayer2.mediacodec.MediaCodecRenderer_"
            r1.append(r0)
            r1.append(r2)
            int r0 = java.lang.Math.abs(r13)
            java.lang.String r7 = X.AnonymousClass000.A0h(r1, r0)
            r2 = r10
            r8 = r12
            r9 = r14
            r4 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143826zX.<init>(X.7z1, java.lang.Throwable, int, boolean):void");
    }

    public C143826zX(C160577nt r1, C143826zX r2, String str, String str2, String str3, Throwable th, boolean z) {
        super(str, th);
        this.mimeType = str2;
        this.secureDecoderRequired = z;
        this.codecInfo = r1;
        this.diagnosticInfo = str3;
        this.fallbackDecoderInitializationException = r2;
    }
}
