package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44I  reason: invalid class name */
public final class AnonymousClass44I extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C51952ke $data;
    public final /* synthetic */ AnonymousClass4EJ $operationCallback;
    public final /* synthetic */ C54662p5 $requestRetryState;
    public final /* synthetic */ AnonymousClass3MX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44I(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MX r4, C51952ke r5) {
        super(1);
        this.this$0 = r4;
        this.$data = r5;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C53032mR r8 = (C53032mR) obj;
        C162457s7.A0J(r8, 0);
        AnonymousClass3MX r0 = this.this$0;
        C51952ke r3 = this.$data;
        X509Certificate x509Certificate = r8.A02;
        PublicKey publicKey = r8.A01;
        r0.Bgn(this.$operationCallback, this.$requestRetryState, r3, r8.A00, publicKey, x509Certificate);
        return C59022wD.A00;
    }
}
