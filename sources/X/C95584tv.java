package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4tv  reason: invalid class name and case insensitive filesystem */
public final class C95584tv extends C67303Ot {
    public final C108575dD A00;
    public final ArrayList A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95584tv(X.C56492s4 r14, X.C108575dD r15, X.AnonymousClass33p r16, X.AnonymousClass1VX r17, X.C183538qC r18, java.lang.String r19, java.util.ArrayList r20, X.AnonymousClass4C1 r21, X.AnonymousClass4C1 r22) {
        /*
            r13 = this;
            r2 = r14
            r3 = r16
            r4 = r17
            r6 = r18
            r10 = r21
            X.C18260x0.A0f(r4, r14, r3, r6, r10)
            r0 = 6
            r9 = r22
            X.C162457s7.A0J(r9, r0)
            r11 = 5094142160706930(0x12191865ec9d72, double:2.5168406366367925E-308)
            r5 = 0
            r1 = r13
            r7 = r19
            r8 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r20
            r13.A01 = r0
            r13.A00 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95584tv.<init>(X.2s4, X.5dD, X.33p, X.1VX, X.8qC, java.lang.String, java.util.ArrayList, X.4C1, X.4C1):void");
    }

    public void A07(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C108515d7 r2 = (C108515d7) it.next();
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r2.A00);
            A1G.put("version", r2.A01);
            A1F.put(A1G);
        }
        JSONArray A1F2 = AnonymousClass0x9.A1F();
        C108575dD r4 = this.A00;
        List<C108555dB> list = r4.A03;
        if (list != null) {
            for (C108555dB r5 : list) {
                JSONObject A1G2 = AnonymousClass0x9.A1G();
                A1G2.put("modelName", r5.A04);
                A1G2.put("assetName", r5.A01);
                A1G2.put("md5Hash", r5.A03);
                A1G2.put("assetHandler", r5.A00);
                A1G2.put("cacheKey", r5.A02);
                A1G2.put("modelVersion", r5.A05);
                A1F2.put(A1G2);
            }
        }
        JSONArray A1F3 = AnonymousClass0x9.A1F();
        List<C108525d8> list2 = r4.A04;
        if (list2 != null) {
            for (C108525d8 r7 : list2) {
                JSONObject A1G3 = AnonymousClass0x9.A1G();
                A1G3.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r7.A02);
                A1G3.put("argument_count", r7.A00);
                A1G3.put("version", r7.A01);
                A1F3.put(A1G3);
            }
        }
        JSONObject A1G4 = AnonymousClass0x9.A1G();
        A1G4.put("bytecodeVersion", new JSONArray(r4.A06));
        A1G4.put("cachedModelAssets", new JSONArray(r4.A02));
        A1G4.put("cachedModelMetadatas", A1F2);
        A1G4.put("operators", A1F3);
        A1G4.put("operatorsHash", (Object) null);
        A1G4.put("supportedCompressions", new JSONArray(r4.A05));
        JSONObject A0z = C18300x5.A0z((Object) null, "vulkan_version", A1G4);
        A0z.put("model_request_metadatas", A1F);
        A0z.put("client_capability_metadata", A1G4);
        jSONObject.put("variables", A0z);
    }
}
