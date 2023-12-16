package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44K  reason: invalid class name */
public final class AnonymousClass44K extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ C60272yH $userEntity;
    public final /* synthetic */ AnonymousClass3MX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44K(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MX r5) {
        super(1);
        this.this$0 = r5;
        this.$userEntity = r2;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C53032mR r8 = (C53032mR) obj;
        C162457s7.A0J(r8, 0);
        AnonymousClass3MX r0 = this.this$0;
        X509Certificate x509Certificate = r8.A02;
        C60272yH r1 = this.$userEntity;
        PublicKey publicKey = r8.A01;
        r0.Bgr(r1, this.$callback, this.$operationRetryState, r8.A00, publicKey, x509Certificate);
        return C59022wD.A00;
    }
}
