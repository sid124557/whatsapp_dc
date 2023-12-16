package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;

/* renamed from: X.44B  reason: invalid class name */
public final class AnonymousClass44B extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ String $password;
    public final /* synthetic */ AnonymousClass3MV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44B(AnonymousClass3MV r2, AnonymousClass4EJ r3, String str, KeyPair keyPair) {
        super(1);
        this.$keyPair = keyPair;
        this.this$0 = r2;
        this.$password = str;
        this.$callback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2Q4 r6 = (AnonymousClass2Q4) obj;
        if (r6 != null) {
            KeyPair keyPair = this.$keyPair;
            AnonymousClass3MV r0 = this.this$0;
            String str = this.$password;
            AnonymousClass4EJ r3 = this.$callback;
            if (keyPair != null) {
                C46302bP r02 = r0.A03;
                PrivateKey privateKey = keyPair.getPrivate();
                C162457s7.A0D(privateKey);
                C18260x0.A0S(str, r3);
                try {
                    r3.Bd3(AnonymousClass31V.A00(new C50912iy("shops"), str, C50672ia.A01(r6, r02.A03, privateKey)));
                } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                    r3.BSB(e);
                }
            }
        }
        return C59022wD.A00;
    }
}
