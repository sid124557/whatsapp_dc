package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.40E  reason: invalid class name */
public final class AnonymousClass40E extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass4EJ $operationCallback;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C54662p5 $requestRetryState;
    public final /* synthetic */ AnonymousClass3MX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass40E(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MX r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(0);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3MX r0 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        r0.A01(this.$operationCallback, this.$requestRetryState, this.$passwordKeyId, publicKey, x509Certificate);
        return C59022wD.A00;
    }
}
