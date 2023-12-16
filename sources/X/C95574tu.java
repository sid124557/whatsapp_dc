package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4tu  reason: invalid class name and case insensitive filesystem */
public final class C95574tu extends C67303Ot {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95574tu(X.C56492s4 r14, X.AnonymousClass33p r15, X.AnonymousClass1VX r16, X.C183538qC r17, X.AnonymousClass4C1 r18, X.AnonymousClass4C1 r19, int r20) {
        /*
            r13 = this;
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r17
            r10 = r18
            X.C18260x0.A0f(r4, r14, r15, r6, r10)
            r0 = 6
            r9 = r19
            X.C162457s7.A0J(r9, r0)
            r11 = 6150488995041261(0x15d9d64fbe8fed, double:3.03874531757454E-308)
            r5 = 0
            r1 = r13
            r7 = r5
            r8 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r20
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95574tu.<init>(X.2s4, X.33p, X.1VX, X.8qC, X.4C1, X.4C1, int):void");
    }

    public void A07(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        JSONArray A1F = AnonymousClass0x9.A1F();
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "wa_bwe_pl_classifier_mobile");
        A1G.put("version", this.A00);
        JSONArray put = A1F.put(A1G);
        JSONObject A1G2 = AnonymousClass0x9.A1G();
        A1G2.put("bytecodeVersion", AnonymousClass0x9.A1F());
        JSONObject A0z = C18300x5.A0z(AnonymousClass0x9.A1F().put("NONE"), "supportedCompressions", A1G2);
        A0z.put("model_request_metadatas", put);
        A0z.put("client_capability_metadata", A1G2);
        jSONObject.put("variables", A0z);
    }
}
