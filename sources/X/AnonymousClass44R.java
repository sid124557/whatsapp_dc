package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44R  reason: invalid class name */
public final class AnonymousClass44R extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C51952ke $data;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass4EJ $operationCallback;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C54662p5 $requestRetryState;
    public final /* synthetic */ AnonymousClass3MX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44R(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MX r4, C51952ke r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$data = r5;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass24F r14 = (AnonymousClass24F) obj;
        C162457s7.A0J(r14, 0);
        AnonymousClass3MX r6 = this.this$0;
        C51952ke r7 = this.$data;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        C71683cV r3 = new C71683cV(this.$operationCallback, this.$requestRetryState, r6, r7, this.$passwordKeyId, publicKey, x509Certificate);
        AnonymousClass3MX r72 = this.this$0;
        C49672gu r11 = r72.A03;
        C54662p5 r62 = this.$requestRetryState;
        AnonymousClass4EJ r5 = this.$operationCallback;
        AnonymousClass44I r1 = new AnonymousClass44I(r5, r62, r72, this.$data);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        r11.A01(r5, r62, r14, r3, new AnonymousClass40E(r5, r62, r72, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2), r1);
        return C59022wD.A00;
    }
}
