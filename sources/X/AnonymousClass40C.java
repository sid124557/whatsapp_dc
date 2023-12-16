package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.40C  reason: invalid class name */
public final class AnonymousClass40C extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass3MU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass40C(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MU r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(0);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3MU r0 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        r0.A00(this.$callback, this.$operationRetryState, this.$passwordKeyId, publicKey, x509Certificate);
        return C59022wD.A00;
    }
}
