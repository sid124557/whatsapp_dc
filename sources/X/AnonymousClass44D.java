package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;

/* renamed from: X.44D  reason: invalid class name */
public final class AnonymousClass44D extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ String $password;
    public final /* synthetic */ AnonymousClass3MU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44D(AnonymousClass4EJ r2, AnonymousClass3MU r3, String str, KeyPair keyPair) {
        super(1);
        this.this$0 = r3;
        this.$keyPair = keyPair;
        this.$password = str;
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2Q4 r6 = (AnonymousClass2Q4) obj;
        if (r6 != null) {
            AnonymousClass3MU r4 = this.this$0;
            KeyPair keyPair = this.$keyPair;
            String str = this.$password;
            AnonymousClass4EJ r2 = this.$callback;
            PrivateKey privateKey = keyPair.getPrivate();
            C162457s7.A0D(privateKey);
            try {
                r2.Bd3(AnonymousClass31V.A00(AnonymousClass2B8.A00, str, C50672ia.A01(r6, r4.A00, privateKey)));
            } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                r2.BSB(e);
            }
        }
        return C59022wD.A00;
    }
}
