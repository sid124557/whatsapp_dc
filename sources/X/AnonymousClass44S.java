package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44S  reason: invalid class name */
public final class AnonymousClass44S extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C60272yH $userEntity;
    public final /* synthetic */ AnonymousClass3MX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44S(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MX r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass24F r14 = (AnonymousClass24F) obj;
        C162457s7.A0J(r14, 0);
        AnonymousClass3MX r7 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        C60272yH r4 = this.$userEntity;
        PublicKey publicKey = this.$passwordPublicKey;
        C71683cV r3 = new C71683cV(r4, this.$callback, this.$operationRetryState, r7, this.$passwordKeyId, publicKey, x509Certificate);
        AnonymousClass3MX r72 = this.this$0;
        C49672gu r11 = r72.A03;
        C54662p5 r6 = this.$operationRetryState;
        AnonymousClass4EJ r5 = this.$callback;
        AnonymousClass44K r1 = new AnonymousClass44K(this.$userEntity, r5, r6, r72);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        r11.A01(r5, r6, r14, r3, new AnonymousClass40F(r5, r6, r72, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2), r1);
        return C59022wD.A00;
    }
}
