package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4hB  reason: invalid class name and case insensitive filesystem */
public final class C90354hB extends C67163Of {
    public final AnonymousClass4AO A00;
    public final AnonymousClass4AO A01;
    public final AnonymousClass4AO A02;

    public /* bridge */ /* synthetic */ Object A02(JSONObject jSONObject, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Object Azj;
        if (!C57332tT.A01("variant_properties", jSONObject)) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        JSONArray optJSONArray = jSONObject.optJSONArray("types");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (!(optJSONObject3 == null || (Azj = this.A02.Azj(optJSONObject3, j)) == null)) {
                    A0s.add(Azj);
                }
            }
        }
        if (A0s.size() > 2) {
            return null;
        }
        int i2 = 0;
        if (!A0s.isEmpty()) {
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                if ((it.next() instanceof C132216et) && (i2 = i2 + 1) < 0) {
                    AnonymousClass8UF.A0q();
                    throw AnonymousClass000.A0L();
                }
            }
            if (i2 > 1) {
                return null;
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("variant_properties");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i3);
                if (optJSONObject4 != null) {
                    String A002 = C57332tT.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, optJSONObject4);
                    if (A002 != null) {
                        String A003 = C57332tT.A00("value", optJSONObject4);
                        if (A003 != null) {
                            A0s2.add(new C165977xw(A002, A003));
                        } else {
                            throw AnonymousClass001.A0e("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass001.A0e("Required value was null.");
                    }
                }
            }
        }
        C108695dP r0 = null;
        if (C57332tT.A01("listing_details", jSONObject) && (optJSONObject2 = jSONObject.optJSONObject("listing_details")) != null) {
            r0 = (C108695dP) this.A01.Azj(optJSONObject2, j);
        }
        C108665dM r1 = null;
        if (C57332tT.A01("availability", jSONObject) && (optJSONObject = jSONObject.optJSONObject("availability")) != null) {
            r1 = (C108665dM) this.A00.Azj(optJSONObject, j);
        }
        return new C108755dV(r1, r0, A0s, A0s2);
    }

    public C90354hB(AnonymousClass4AO r1, AnonymousClass4AO r2, AnonymousClass4AO r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
