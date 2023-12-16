package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1V8  reason: invalid class name */
public class AnonymousClass1V8 extends AnonymousClass3MJ {
    public final /* synthetic */ AnonymousClass3MW A00;
    public final /* synthetic */ C60272yH A01;
    public final /* synthetic */ AnonymousClass4EJ A02;
    public final /* synthetic */ KeyPair A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1V8(AnonymousClass3MW r1, C60272yH r2, AnonymousClass4EJ r3, AnonymousClass4EJ r4, KeyPair keyPair) {
        super(r3);
        this.A00 = r1;
        this.A03 = keyPair;
        this.A02 = r4;
        this.A01 = r2;
    }

    public void BdS(AnonymousClass2Q4 r5, Integer num) {
        try {
            JSONObject A012 = C50672ia.A01(r5, this.A00.A02, this.A03.getPrivate());
            AnonymousClass4EJ r2 = this.A02;
            C60272yH r1 = this.A01;
            C60272yH.A00(r1, r2, C18330xA.A08(r1.A04), A012);
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e) {
            this.A02.BSB(e);
        }
    }
}
