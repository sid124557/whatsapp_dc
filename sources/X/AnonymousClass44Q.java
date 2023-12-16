package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44Q  reason: invalid class name */
public final class AnonymousClass44Q extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C60272yH $userEntity;
    public final /* synthetic */ AnonymousClass3MU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44Q(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MU r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0071, code lost:
        if (r3 != 406) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
        if (r9.A03() == false) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r21
            X.24F r0 = (X.AnonymousClass24F) r0
            r1 = 0
            X.C162457s7.A0J(r0, r1)
            r1 = r20
            X.3MU r10 = r1.this$0
            java.security.cert.X509Certificate r13 = r1.$encryptionCert
            X.2yH r7 = r1.$userEntity
            java.security.PublicKey r12 = r1.$passwordPublicKey
            java.lang.Integer r11 = r1.$passwordKeyId
            X.4EJ r8 = r1.$callback
            X.2p5 r9 = r1.$operationRetryState
            X.3cV r6 = new X.3cV
            r6.<init>((X.C60272yH) r7, (X.AnonymousClass4EJ) r8, (X.C54662p5) r9, (X.AnonymousClass3MU) r10, (java.lang.Integer) r11, (java.security.PublicKey) r12, (java.security.cert.X509Certificate) r13)
            X.3MU r10 = r1.this$0
            X.335 r14 = r10.A02
            X.4EJ r8 = r1.$callback
            X.2p5 r9 = r1.$operationRetryState
            X.2yH r3 = r1.$userEntity
            X.44F r2 = new X.44F
            r2.<init>(r3, r8, r9, r10)
            java.security.cert.X509Certificate r13 = r1.$encryptionCert
            java.security.PublicKey r12 = r1.$passwordPublicKey
            java.lang.Integer r11 = r1.$passwordKeyId
            X.40C r7 = new X.40C
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.C18260x0.A0Q(r8, r9)
            X.36K r1 = r0.node
            int r3 = X.C57492tj.A01(r1)
            X.2oX r4 = r14.A01
            java.lang.String r5 = X.AnonymousClass335.A00(r3)
            r1 = 7
            r4.A02(r5, r1)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SupportUser/Refresh Token Error: "
            X.C18260x0.A0t(r1, r5, r4)
            X.1VX r5 = r14.A00
            r4 = 5823(0x16bf, float:8.16E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r5.A0Y(r1, r4)
            if (r1 == 0) goto L_0x0084
            r1 = 400(0x190, float:5.6E-43)
            if (r3 == r1) goto L_0x00b9
            r1 = 500(0x1f4, float:7.0E-43)
            if (r3 == r1) goto L_0x0076
            r1 = 503(0x1f7, float:7.05E-43)
            if (r3 == r1) goto L_0x0076
            r1 = 405(0x195, float:5.68E-43)
            if (r3 == r1) goto L_0x00af
            r1 = 406(0x196, float:5.69E-43)
            if (r3 == r1) goto L_0x0080
        L_0x0073:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0076:
            boolean r1 = r9.A04()
            if (r1 == 0) goto L_0x0080
            r6.run()
            goto L_0x0073
        L_0x0080:
            r8.BSB(r0)
            goto L_0x0073
        L_0x0084:
            r1 = 304(0x130, float:4.26E-43)
            if (r3 == r1) goto L_0x00a5
            r1 = 409(0x199, float:5.73E-43)
            if (r3 == r1) goto L_0x00a5
            r1 = 480(0x1e0, float:6.73E-43)
            if (r3 == r1) goto L_0x00b5
            r1 = 400(0x190, float:5.6E-43)
            if (r3 == r1) goto L_0x00a5
            r1 = 401(0x191, float:5.62E-43)
            if (r3 == r1) goto L_0x00a5
            r15 = r8
            r16 = r9
            r18 = r6
            r19 = r3
            r17 = r0
            r14.A01(r15, r16, r17, r18, r19)
            goto L_0x0073
        L_0x00a5:
            boolean r1 = r9.A03()
            if (r1 == 0) goto L_0x00b5
            r14.A03(r8, r0, r7)
            goto L_0x0073
        L_0x00af:
            boolean r1 = r9.A03()
            if (r1 != 0) goto L_0x00b9
        L_0x00b5:
            r14.A02(r8, r9, r0, r2)
            goto L_0x0073
        L_0x00b9:
            X.8qC r0 = r14.A04
            X.30P r0 = X.C18320x8.A0M(r0)
            X.2iy r1 = X.AnonymousClass2B8.A00
            X.8qC r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.308 r0 = (X.AnonymousClass308) r0
            r0.A03(r1)
            r7.invoke()
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44Q.invoke(java.lang.Object):java.lang.Object");
    }
}
