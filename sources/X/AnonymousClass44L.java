package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44L  reason: invalid class name */
public final class AnonymousClass44L extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ String $userDeleteReason;
    public final /* synthetic */ C60272yH $userEntity;
    public final /* synthetic */ AnonymousClass3MU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44L(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MU r5, String str) {
        super(1);
        this.this$0 = r5;
        this.$userEntity = r2;
        this.$callback = r3;
        this.$operationRetryState = r4;
        this.$userDeleteReason = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C52962mK r9 = (C52962mK) obj;
        C162457s7.A0J(r9, 0);
        AnonymousClass3MU r0 = this.this$0;
        X509Certificate x509Certificate = r9.A02;
        C60272yH r1 = this.$userEntity;
        AnonymousClass4EJ r2 = this.$callback;
        PublicKey publicKey = r9.A01;
        r0.Bgp(r1, r2, this.$operationRetryState, r9.A00, this.$userDeleteReason, publicKey, x509Certificate);
        return C59022wD.A00;
    }
}
