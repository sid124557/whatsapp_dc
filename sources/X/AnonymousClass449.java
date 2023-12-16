package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.449  reason: invalid class name */
public final class AnonymousClass449 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ AnonymousClass3MX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass449(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MX r4) {
        super(1);
        this.this$0 = r4;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C53032mR r7 = (C53032mR) obj;
        C162457s7.A0J(r7, 0);
        AnonymousClass3MX r0 = this.this$0;
        X509Certificate x509Certificate = r7.A02;
        PublicKey publicKey = r7.A01;
        r0.A01(this.$callback, this.$operationRetryState, r7.A00, publicKey, x509Certificate);
        return C59022wD.A00;
    }
}
