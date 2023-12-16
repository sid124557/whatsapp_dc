package X;

import com.whatsapp.infra.graphql.generated.autoconf.GetAutoConfConfidenceChallengeResponseImpl;
import com.whatsapp.infra.graphql.generated.autoconf.ValidateVerifierConfidenceMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.autoconf.ValidateVerifierConfidenceResponseImpl;
import com.whatsapp.util.Log;
import org.json.JSONArray;

/* renamed from: X.3Py  reason: invalid class name and case insensitive filesystem */
public final class C67603Py implements C188028yC {
    public AnonymousClass2P0 A00;
    public final C49552gi A01;

    public void Ba9(C27871eo r6) {
        C162457s7.A0J(r6, 0);
        JSONArray jSONArray = r6.A01;
        int i = 405;
        if (jSONArray.length() > 0) {
            Log.i("RequestConfidenceChallengeManager/onResponse/error");
            if (jSONArray.length() > 1) {
                C52002kj A002 = C386428m.A00(AnonymousClass0x7.A13(jSONArray, 1));
                i = A002.A00;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("RequestConfidenceChallengeManager/onResponse/errorCode=");
                A0o.append(i);
                A0o.append("/errorDescription=");
                C18260x0.A1K(A0o, A002.A01);
            }
        } else {
            String A0l = C18300x5.A0l("auth_challenge", r6.A00.A00(GetAutoConfConfidenceChallengeResponseImpl.Xwa2AutoconfRequestConfidenceChallenge.class, "xwa2_autoconf_request_confidence_challenge").A00);
            if (!C175738Zn.A0V(A0l)) {
                Log.i("RequestConfidenceChallengeManager/onResponse/valid authChallenge");
                AnonymousClass2P0 r2 = this.A00;
                if (r2 != null) {
                    Log.i("AutoConfConfidencePingManager/onRequestChallengeSuccess");
                    byte[] A02 = r2.A02.A02(A0l);
                    if (A02 == null) {
                        Log.e("AutoConfConfidencePingManager/onRequestChallengeSuccess/failed to query authResponse from FEO2 client");
                        return;
                    }
                    Log.i("AutoConfConfidencePingManager/onRequestChallengeSuccess/successfully queried authResponse, validate verifier");
                    C67613Pz r4 = new C67613Pz(r2.A01);
                    String A0t = C18290x4.A0t(A02);
                    C162457s7.A0D(A0t);
                    r4.A00 = r2;
                    C50712ie r3 = new ValidateVerifierConfidenceMutationImpl$Builder().A00;
                    r3.A02("authResponse", A0t);
                    r4.A01.A00(new AnonymousClass7J9(r3, ValidateVerifierConfidenceResponseImpl.class, "ValidateVerifierConfidence"), r4).A00();
                    return;
                }
                throw C18270x1.A0S("callback");
            }
            Log.i("RequestConfidenceChallengeManager/onResponse/blank authChallenge");
        }
        AnonymousClass2P0 r22 = this.A00;
        if (r22 == null) {
            throw C18270x1.A0S("callback");
        } else if (i != 405) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("AutoConfConfidencePingManager/onRequestChallengeFailure/errorCode=");
            A0o2.append(i);
            C18260x0.A1K(A0o2, "/stop confidence ping");
            C18270x1.A0l(C18270x1.A03(r22.A00), "resend_confidence_ping", false);
        }
    }

    public C67603Py(C49552gi r1) {
        this.A01 = r1;
    }

    public void BSt(Throwable th) {
        C18260x0.A1Q(C18270x1.A0X(th), "RequestConfidenceChallengeManager/onFailure/MEX error: ", th);
    }
}
