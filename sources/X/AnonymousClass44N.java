package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44N  reason: invalid class name */
public final class AnonymousClass44N extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass3MV this$0;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r1 != 503) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            r12 = r15
            X.24F r12 = (X.AnonymousClass24F) r12
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            X.3MV r6 = r14.this$0
            java.security.cert.X509Certificate r11 = r14.$encryptionCert
            java.security.PublicKey r10 = r14.$passwordPublicKey
            java.lang.Integer r9 = r14.$passwordKeyId
            X.4EJ r7 = r14.$callback
            X.2p5 r8 = r14.$operationRetryState
            r1 = 1
            X.3cZ r5 = new X.3cZ
            r5.<init>((X.AnonymousClass3MV) r6, (X.AnonymousClass4EJ) r7, (X.C54662p5) r8, (java.lang.Integer) r9, (java.security.PublicKey) r10, (java.security.cert.X509Certificate) r11)
            X.3MV r0 = r14.this$0
            X.2Qo r9 = r0.A01
            X.4EJ r10 = r14.$callback
            X.2p5 r11 = r14.$operationRetryState
            X.440 r4 = new X.440
            r4.<init>(r0, r10, r11)
            X.C18270x1.A10(r10, r1, r11)
            X.36K r0 = r12.node
            int r1 = X.C57492tj.A01(r0)
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L_0x00bb
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x00bb
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 == r0) goto L_0x007e
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x00bb
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x00bb
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x00b7
            r0 = 406(0x196, float:5.69E-43)
            if (r1 == r0) goto L_0x006c
            r0 = 408(0x198, float:5.72E-43)
            if (r1 == r0) goto L_0x006c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x006c
            r0 = 481(0x1e1, float:6.74E-43)
            if (r1 == r0) goto L_0x0062
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x006c
            r0 = 503(0x1f7, float:7.05E-43)
            if (r1 == r0) goto L_0x00b7
        L_0x005f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0062:
            boolean r0 = r11.A04()
            if (r0 == 0) goto L_0x00b7
            r5.run()
            goto L_0x005f
        L_0x006c:
            java.lang.Long r0 = r11.A01()
            if (r0 == 0) goto L_0x00b7
            X.4FS r3 = r9.A01
            long r1 = r0.longValue()
            java.lang.String r0 = "CommonUserIqErrorHelper/retryOperationWithDelay"
            r3.Bkn(r5, r0, r1)
            goto L_0x005f
        L_0x007e:
            boolean r0 = r11.A04()
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r11.A03()
            if (r0 != 0) goto L_0x00b7
            r11.A02()
            X.8qC r0 = r9.A02
            java.lang.Object r2 = r0.get()
            X.2mg r2 = (X.C53182mg) r2
            java.lang.String r1 = "shops"
            X.2iy r0 = new X.2iy
            r0.<init>(r1)
            r2.A01(r0)
            X.8qC r0 = r9.A04
            java.lang.Object r3 = r0.get()
            X.2x4 r3 = (X.C59532x4) r3
            X.2iy r2 = new X.2iy
            r2.<init>(r1)
            r1 = 0
            X.28A r0 = new X.28A
            r0.<init>(r10, r1, r4)
            r3.A01(r2, r0)
            goto L_0x005f
        L_0x00b7:
            r10.BSB(r12)
            goto L_0x005f
        L_0x00bb:
            X.407 r8 = new X.407
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            X.8qC r3 = r9.A03
            X.30P r2 = X.C18320x8.A0M(r3)
            java.lang.String r1 = "shops"
            X.2iy r0 = new X.2iy
            r0.<init>(r1)
            X.2yH r0 = r2.A01(r0)
            if (r0 != 0) goto L_0x00d9
            r8.invoke()
            goto L_0x005f
        L_0x00d9:
            X.30P r3 = X.C18320x8.A0M(r3)
            X.2iy r2 = new X.2iy
            r2.<init>(r1)
            r0 = 0
            X.4Ig r1 = new X.4Ig
            r1.<init>(r10, r12, r8, r0)
            r0 = 0
            r3.A06(r1, r2, r0, r0)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44N.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44N(AnonymousClass3MV r2, AnonymousClass4EJ r3, C54662p5 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r2;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }
}
