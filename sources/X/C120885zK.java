package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5zK  reason: invalid class name and case insensitive filesystem */
public final class C120885zK extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C108895dj $accessTokenWrapped;
    public final /* synthetic */ C105585Vp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120885zK(C108895dj r2, C105585Vp r3) {
        super(0);
        this.$accessTokenWrapped = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$accessTokenWrapped.A00("XFAM_CROSSPOSTING_WEB_AUTH_PROFILE_DATA_FETCH_GQL");
        if (A00 != null) {
            AnonymousClass5JM A01 = this.this$0.A00.A01((String) A00, C18290x4.A12(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
            C105585Vp.A00(A01);
            String str = null;
            try {
                JSONObject jSONObject = A01.A03;
                if (jSONObject != null) {
                    str = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }
                AnonymousClass3QD r2 = new AnonymousClass3QD();
                Class<String> cls = String.class;
                if (str != null) {
                    return new C108895dj(new C166557yt(r2, cls, str, "XFamilyFbFullName"), 2);
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
