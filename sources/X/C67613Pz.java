package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;

/* renamed from: X.3Pz  reason: invalid class name and case insensitive filesystem */
public final class C67613Pz implements C188028yC {
    public AnonymousClass2P0 A00;
    public final C49552gi A01;

    public void Ba9(C27871eo r4) {
        C162457s7.A0J(r4, 0);
        JSONArray jSONArray = r4.A01;
        if (jSONArray.length() > 0) {
            Log.i("ValidateVerifierConfidenceManager/onResponse/error");
            if (jSONArray.length() > 1) {
                C52002kj A002 = C386428m.A00(AnonymousClass0x7.A13(jSONArray, 1));
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("ValidateVerifierConfidenceManager/onResponse/errorCode=");
                A0o.append(A002.A00);
                A0o.append("/errorDescription=");
                C18260x0.A1K(A0o, A002.A01);
            }
        } else if (r4.A00.A00.optBoolean("xwa2_autoconf_validate_confidence")) {
            Log.i("ValidateVerifierConfidenceManager/onResponse/success");
            return;
        } else {
            Log.i("ValidateVerifierConfidenceManager/onResponse/failure");
        }
        AnonymousClass2P0 r1 = this.A00;
        if (r1 != null) {
            Log.e("AutoConfConfidencePingManager/onValidateVerifierFailure/stop confidence ping");
            C18270x1.A0l(C18270x1.A03(r1.A00), "resend_confidence_ping", false);
            return;
        }
        throw C18270x1.A0S("callback");
    }

    public C67613Pz(C49552gi r1) {
        this.A01 = r1;
    }

    public void BSt(Throwable th) {
        C18260x0.A1Q(C18270x1.A0X(th), "ValidateVerifierConfidenceManager/onFailure/MEX error: ", th);
    }
}
