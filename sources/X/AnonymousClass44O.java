package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44O  reason: invalid class name */
public final class AnonymousClass44O extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass3MU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44O(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MU r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0062, code lost:
        if (r13 != 406) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r11 = r19
            X.24F r11 = (X.AnonymousClass24F) r11
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            r1 = r18
            X.3MU r7 = r1.this$0
            java.security.cert.X509Certificate r10 = r1.$encryptionCert
            java.security.PublicKey r9 = r1.$passwordPublicKey
            java.lang.Integer r8 = r1.$passwordKeyId
            X.4EJ r5 = r1.$callback
            X.2p5 r6 = r1.$operationRetryState
            X.3cZ r4 = new X.3cZ
            r4.<init>((X.AnonymousClass4EJ) r5, (X.C54662p5) r6, (X.AnonymousClass3MU) r7, (java.lang.Integer) r8, (java.security.PublicKey) r9, (java.security.cert.X509Certificate) r10)
            X.3MU r0 = r1.this$0
            X.335 r8 = r0.A02
            X.4EJ r9 = r1.$callback
            X.2p5 r10 = r1.$operationRetryState
            X.445 r1 = new X.445
            r1.<init>(r9, r10, r0)
            X.C18260x0.A0Q(r9, r10)
            r2 = 3
            X.36K r0 = r11.node
            int r13 = X.C57492tj.A01(r0)
            X.2oX r0 = r8.A01
            java.lang.String r3 = X.AnonymousClass335.A00(r13)
            r0.A02(r3, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SupportUser/Create User Error: "
            X.C18260x0.A0t(r0, r3, r2)
            X.1VX r3 = r8.A00
            r2 = 5823(0x16bf, float:8.16E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r2)
            if (r0 == 0) goto L_0x0075
            r0 = 400(0x190, float:5.6E-43)
            if (r13 == r0) goto L_0x0071
            r0 = 500(0x1f4, float:7.0E-43)
            if (r13 == r0) goto L_0x0067
            r0 = 503(0x1f7, float:7.05E-43)
            if (r13 == r0) goto L_0x0067
            r0 = 405(0x195, float:5.68E-43)
            if (r13 == r0) goto L_0x00a4
            r0 = 406(0x196, float:5.69E-43)
            if (r13 == r0) goto L_0x0071
        L_0x0064:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0067:
            boolean r0 = r10.A04()
            if (r0 == 0) goto L_0x0071
            r4.run()
            goto L_0x0064
        L_0x0071:
            r9.BSB(r11)
            goto L_0x0064
        L_0x0075:
            r0 = 304(0x130, float:4.26E-43)
            if (r13 == r0) goto L_0x008e
            r0 = 409(0x199, float:5.73E-43)
            if (r13 == r0) goto L_0x008e
            r0 = 480(0x1e0, float:6.73E-43)
            if (r13 == r0) goto L_0x00a4
            r0 = 400(0x190, float:5.6E-43)
            if (r13 == r0) goto L_0x008e
            r0 = 401(0x191, float:5.62E-43)
            if (r13 == r0) goto L_0x008e
            r12 = r4
            r8.A01(r9, r10, r11, r12, r13)
            goto L_0x0064
        L_0x008e:
            boolean r0 = r10.A03()
            if (r0 == 0) goto L_0x00a4
            X.409 r12 = new X.409
            r13 = r9
            r14 = r10
            r15 = r8
            r16 = r11
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            r8.A03(r9, r11, r12)
            goto L_0x0064
        L_0x00a4:
            r8.A02(r9, r10, r11, r1)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44O.invoke(java.lang.Object):java.lang.Object");
    }
}
