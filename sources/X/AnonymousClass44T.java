package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44T  reason: invalid class name */
public final class AnonymousClass44T extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ String $userDeleteReason;
    public final /* synthetic */ C60272yH $userEntity;
    public final /* synthetic */ AnonymousClass3MU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44T(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MU r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
        this.$userDeleteReason = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (r15 != 406) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        if (r7.A03() == false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r13 = r17
            X.24F r13 = (X.AnonymousClass24F) r13
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            r0 = r16
            X.3MU r7 = r0.this$0
            java.security.cert.X509Certificate r11 = r0.$encryptionCert
            X.2yH r4 = r0.$userEntity
            java.security.PublicKey r10 = r0.$passwordPublicKey
            java.lang.Integer r8 = r0.$passwordKeyId
            X.4EJ r5 = r0.$callback
            X.2p5 r6 = r0.$operationRetryState
            java.lang.String r9 = r0.$userDeleteReason
            r1 = 1
            X.3cW r3 = new X.3cW
            r3.<init>((X.C60272yH) r4, (X.AnonymousClass4EJ) r5, (X.C54662p5) r6, (X.AnonymousClass3MU) r7, (java.lang.Integer) r8, (java.lang.String) r9, (java.security.PublicKey) r10, (java.security.cert.X509Certificate) r11)
            X.3MU r8 = r0.this$0
            X.335 r10 = r8.A02
            X.4EJ r6 = r0.$callback
            X.2p5 r7 = r0.$operationRetryState
            X.2yH r5 = r0.$userEntity
            java.lang.String r9 = r0.$userDeleteReason
            X.44L r4 = new X.44L
            r4.<init>(r5, r6, r7, r8, r9)
            X.C18270x1.A10(r6, r1, r7)
            X.36K r0 = r13.node
            int r15 = X.C57492tj.A01(r0)
            X.2oX r1 = r10.A01
            java.lang.String r2 = X.AnonymousClass335.A00(r15)
            r0 = 6
            r1.A02(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SupportUser/Delete User Error: "
            X.C18260x0.A0t(r0, r2, r1)
            X.1VX r2 = r10.A00
            r1 = 5823(0x16bf, float:8.16E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0077
            r0 = 400(0x190, float:5.6E-43)
            if (r15 != r0) goto L_0x0064
            r0 = 0
            r6.Bd3(r0)
        L_0x0061:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0064:
            if (r15 == r0) goto L_0x00a6
            r0 = 500(0x1f4, float:7.0E-43)
            if (r15 == r0) goto L_0x009c
            r0 = 503(0x1f7, float:7.05E-43)
            if (r15 == r0) goto L_0x009c
            r0 = 405(0x195, float:5.68E-43)
            if (r15 == r0) goto L_0x0098
            r0 = 406(0x196, float:5.69E-43)
            if (r15 == r0) goto L_0x00a6
            goto L_0x0061
        L_0x0077:
            r0 = 304(0x130, float:4.26E-43)
            if (r15 == r0) goto L_0x0092
            r0 = 409(0x199, float:5.73E-43)
            if (r15 == r0) goto L_0x0092
            r0 = 480(0x1e0, float:6.73E-43)
            if (r15 == r0) goto L_0x0098
            r0 = 400(0x190, float:5.6E-43)
            if (r15 == r0) goto L_0x0092
            r0 = 401(0x191, float:5.62E-43)
            if (r15 == r0) goto L_0x0092
            r11 = r6
            r12 = r7
            r14 = r3
            r10.A01(r11, r12, r13, r14, r15)
            goto L_0x0061
        L_0x0092:
            boolean r0 = r7.A03()
            if (r0 != 0) goto L_0x009c
        L_0x0098:
            r10.A02(r6, r7, r13, r4)
            goto L_0x0061
        L_0x009c:
            boolean r0 = r7.A04()
            if (r0 == 0) goto L_0x00a6
            r3.run()
            goto L_0x0061
        L_0x00a6:
            r6.BSB(r13)
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44T.invoke(java.lang.Object):java.lang.Object");
    }
}
