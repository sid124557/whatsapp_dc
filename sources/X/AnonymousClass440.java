package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.440  reason: invalid class name */
public final class AnonymousClass440 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ AnonymousClass3MV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass440(AnonymousClass3MV r2, AnonymousClass4EJ r3, C54662p5 r4) {
        super(1);
        this.this$0 = r2;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C52772m1 r7 = (C52772m1) obj;
        C162457s7.A0J(r7, 0);
        AnonymousClass3MV r0 = this.this$0;
        X509Certificate x509Certificate = r7.A02;
        PublicKey publicKey = r7.A01;
        r0.A00(this.$callback, this.$operationRetryState, r7.A00, publicKey, x509Certificate);
        return C59022wD.A00;
    }
}
