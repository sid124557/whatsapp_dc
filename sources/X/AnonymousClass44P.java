package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.44P  reason: invalid class name */
public final class AnonymousClass44P extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass3MX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44P(AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MX r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass24F r14 = (AnonymousClass24F) obj;
        C162457s7.A0J(r14, 0);
        AnonymousClass3MX r6 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        C71723cZ r3 = new C71723cZ(this.$callback, this.$operationRetryState, r6, this.$passwordKeyId, publicKey, x509Certificate);
        AnonymousClass3MX r7 = this.this$0;
        C49672gu r11 = r7.A03;
        C54662p5 r62 = this.$operationRetryState;
        AnonymousClass4EJ r5 = this.$callback;
        AnonymousClass449 r2 = new AnonymousClass449(r5, r62, r7);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        AnonymousClass40D r4 = new AnonymousClass40D(r5, r62, r7, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2);
        C18260x0.A0R(r62, r5);
        if (C57492tj.A01(r14.node) == 304) {
            C18320x8.A0M(r11.A02).A06(new C85954Ig(r5, r14, r4, 2), AnonymousClass2BB.A00, (C54662p5) null, (String) null);
        } else {
            r11.A01(r5, r62, r14, r3, r4, r2);
        }
        return C59022wD.A00;
    }
}
