package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4hw  reason: invalid class name and case insensitive filesystem */
public class C90624hw extends C95444tg {
    public final AnonymousClass5ZO A00;
    public final AnonymousClass1VX A01;

    public C90624hw(C55682qk r13, C181668n8 r14, C111525iE r15, AnonymousClass5ZO r16, C57162tC r17, C620733j r18, AnonymousClass1VX r19, C184408rk r20, C59722xN r21, AnonymousClass8E9 r22, AnonymousClass4FS r23) {
        super(r13, r14, r22, r15, r17, r18, r20, r21, (AnonymousClass5ZI) null, r23);
        this.A01 = r19;
        this.A00 = r16;
    }

    public String A06() {
        return "categories";
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        ArrayList A0s = AnonymousClass001.A0s();
        JSONArray jSONArray = jSONObject.getJSONArray("categories");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            C626936e.A05(string);
            String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            C626936e.A05(string2);
            A0s.add(new C166447yh(string, string2));
        }
        return A0s;
    }

    public Map A07() {
        HashMap A0t = AnonymousClass001.A0t();
        C95444tg.A03(this.A00, A0t);
        A0t.put("tiered_onboarding_supported", Boolean.TRUE);
        return A0t;
    }
}
