package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1V4  reason: invalid class name */
public class AnonymousClass1V4 extends AnonymousClass3MJ {
    public final /* synthetic */ AnonymousClass3MW A00;
    public final /* synthetic */ AnonymousClass4EJ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ KeyPair A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1V4(AnonymousClass3MW r1, AnonymousClass4EJ r2, AnonymousClass4EJ r3, String str, KeyPair keyPair) {
        super(r2);
        this.A00 = r1;
        this.A03 = keyPair;
        this.A02 = str;
        this.A01 = r3;
    }

    public void BdS(AnonymousClass2Q4 r5, Integer num) {
        try {
            AnonymousClass3MW r3 = this.A00;
            JSONObject A012 = C50672ia.A01(r5, r3.A02, this.A03.getPrivate());
            this.A01.Bd3(AnonymousClass31V.A00(r3.A04, this.A02, A012));
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            this.A01.BSB(e);
        }
    }
}
