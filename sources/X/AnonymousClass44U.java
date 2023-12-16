package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44U  reason: invalid class name */
public final class AnonymousClass44U extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ String $userDeleteReason;
    public final /* synthetic */ C60272yH $userEntity;
    public final /* synthetic */ AnonymousClass3MX this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass24F r10 = (AnonymousClass24F) obj;
        C162457s7.A0J(r10, 0);
        AnonymousClass3MX r5 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        C60272yH r2 = this.$userEntity;
        PublicKey publicKey = this.$passwordPublicKey;
        C71693cW r1 = new C71693cW(r2, this.$callback, this.$operationRetryState, r5, this.$passwordKeyId, this.$userDeleteReason, publicKey, x509Certificate);
        C49672gu r7 = this.this$0.A03;
        int A01 = C57492tj.A01(r10.node);
        r7.A00(this.$callback, this.$operationRetryState, r10, r1, A01);
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44U(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MX r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
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
}
