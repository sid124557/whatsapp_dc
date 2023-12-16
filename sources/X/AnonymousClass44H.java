package X;

import java.security.KeyPair;
import java.security.PrivateKey;

/* renamed from: X.44H  reason: invalid class name */
public final class AnonymousClass44H extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ AnonymousClass4EJ $operationCallback;
    public final /* synthetic */ String $password;
    public final /* synthetic */ AnonymousClass3MX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44H(AnonymousClass4EJ r2, AnonymousClass3MX r3, String str, KeyPair keyPair) {
        super(1);
        this.this$0 = r3;
        this.$keyPair = keyPair;
        this.$password = str;
        this.$operationCallback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass36K r7 = (AnonymousClass36K) obj;
        C162457s7.A0J(r7, 0);
        AnonymousClass3MX r5 = this.this$0;
        PrivateKey privateKey = this.$keyPair.getPrivate();
        C162457s7.A0D(privateKey);
        String str = this.$password;
        this.$operationCallback.Bd3(AnonymousClass31V.A00(AnonymousClass2BB.A00, str, C50672ia.A01(AnonymousClass3MN.A00(r7), r5.A00, privateKey)));
        return C59022wD.A00;
    }
}
