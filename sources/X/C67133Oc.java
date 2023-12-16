package X;

import org.json.JSONObject;

/* renamed from: X.3Oc  reason: invalid class name and case insensitive filesystem */
public final class C67133Oc implements AnonymousClass4AO {
    public final AnonymousClass4AO A00;

    public /* bridge */ /* synthetic */ Object Azj(JSONObject jSONObject, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        C162457s7.A0J(jSONObject, 0);
        JSONObject jSONObject2 = null;
        if (C57332tT.A01("xwa_product_catalog_get_product", jSONObject) && (optJSONObject2 = jSONObject.optJSONObject("xwa_product_catalog_get_product")) != null && C57332tT.A01("product_catalog", optJSONObject2) && (optJSONObject3 = optJSONObject2.optJSONObject("product_catalog")) != null && C57332tT.A01("product", optJSONObject3)) {
            jSONObject2 = optJSONObject3;
        }
        if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("product")) == null) {
            return new AnonymousClass2JX((C109015dw) null, false);
        }
        return new AnonymousClass2JX((C109015dw) this.A00.Azj(optJSONObject, j), C162457s7.A0P(C57332tT.A00("cart_enabled", jSONObject2), "CARTENABLED_TRUE"));
    }

    public C67133Oc(AnonymousClass4AO r1) {
        this.A00 = r1;
    }
}
