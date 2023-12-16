package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Pw  reason: invalid class name and case insensitive filesystem */
public final class C67583Pw implements C188028yC {
    public C49982hR A00;
    public final C49552gi A01;

    public void BSt(Throwable th) {
        C162457s7.A0J(th, 0);
        Log.e("Error getting invite code with MEX", th);
        C49982hR r0 = this.A00;
        if (r0 != null) {
            r0.A00();
            return;
        }
        throw C18270x1.A0S("callback");
    }

    public void Ba9(C27871eo r5) {
        C162457s7.A0J(r5, 0);
        JSONArray jSONArray = r5.A01;
        if (jSONArray.length() > 0) {
            JSONObject A13 = AnonymousClass0x7.A13(jSONArray, 0);
            if (A13.has("message")) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Error getting invite code with MEX: ");
                C18260x0.A0n(A13.get("message"), A0o);
            }
        } else {
            String A0l = C18300x5.A0l("xwa2_growth_set_invite_code", r5.A00.A00);
            if (!C175738Zn.A0V(A0l)) {
                C49982hR r0 = this.A00;
                if (r0 != null) {
                    r0.A01(A0l);
                    return;
                }
                throw C18270x1.A0S("callback");
            }
        }
        C49982hR r02 = this.A00;
        if (r02 != null) {
            r02.A00();
            return;
        }
        throw C18270x1.A0S("callback");
    }

    public C67583Pw(C49552gi r1) {
        this.A01 = r1;
    }
}
