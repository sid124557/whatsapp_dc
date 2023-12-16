package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5zJ  reason: invalid class name and case insensitive filesystem */
public final class C120875zJ extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C108895dj $accessTokenWrapped;
    public final /* synthetic */ C105585Vp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120875zJ(C108895dj r2, C105585Vp r3) {
        super(0);
        this.$accessTokenWrapped = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        JSONObject optJSONObject;
        Object A00 = this.$accessTokenWrapped.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_PROFILE_DATA_FETCH_GQL");
        if (A00 != null) {
            String str = (String) A00;
            AnonymousClass5JM A01 = this.this$0.A00.A01(str, AnonymousClass8UF.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "picture.type(large)"));
            C105585Vp.A00(A01);
            String str2 = null;
            try {
                JSONObject jSONObject = A01.A03;
                if (jSONObject != null) {
                    String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("picture");
                    if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("data")) == null)) {
                        str2 = optJSONObject.optString("url");
                    }
                    if (string != null) {
                        C162457s7.A0J(str, 0);
                        Class<String> cls = String.class;
                        return new C108735dT(new C108895dj(new C166557yt(new AnonymousClass3QD(), cls, str, "XFamilyFbAccessToken"), 2), new C108895dj(new C166557yt(new AnonymousClass3QD(), cls, string, "XFamilyFbFullName"), 2), new C108895dj(new C166557yt(new AnonymousClass3QD(), cls, str2, "XFamilyProfilePicUrl"), 2));
                    }
                }
                throw AnonymousClass001.A0e("Required value was null.");
            } catch (JSONException e) {
                throw new AnonymousClass57I(e);
            }
        } else {
            throw AnonymousClass001.A0e("Required value was null.");
        }
    }
}
