package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.44E  reason: invalid class name */
public final class AnonymousClass44E extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4EJ $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ C60272yH $userEntity;
    public final /* synthetic */ AnonymousClass3MU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44E(C60272yH r2, AnonymousClass4EJ r3, AnonymousClass3MU r4, KeyPair keyPair) {
        super(1);
        this.this$0 = r4;
        this.$keyPair = keyPair;
        this.$userEntity = r2;
        this.$callback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2Q4 r6 = (AnonymousClass2Q4) obj;
        if (r6 != null) {
            AnonymousClass3MU r4 = this.this$0;
            KeyPair keyPair = this.$keyPair;
            C60272yH r3 = this.$userEntity;
            AnonymousClass4EJ r2 = this.$callback;
            PrivateKey privateKey = keyPair.getPrivate();
            C162457s7.A0D(privateKey);
            try {
                JSONObject A01 = C50672ia.A01(r6, r4.A00, privateKey);
                Object A08 = C18330xA.A08(r3.A04);
                C162457s7.A0D(A08);
                C60272yH.A00(r3, r2, A08, A01);
            } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
                r2.BSB(e);
            }
        }
        return C59022wD.A00;
    }
}
