package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Oe  reason: invalid class name and case insensitive filesystem */
public final class C67153Oe implements AnonymousClass4AO {
    public final AnonymousClass2XR A00;
    public final AnonymousClass4AO A01;

    public C67153Oe(AnonymousClass2XR r1, AnonymousClass4AO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object Azj(JSONObject jSONObject, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Object Azj;
        C162457s7.A0J(jSONObject, 0);
        try {
            if (!C57332tT.A01("xwa_product_catalog_get_product_list", jSONObject) || (optJSONObject = jSONObject.optJSONObject("xwa_product_catalog_get_product_list")) == null || !C57332tT.A01("product_list", optJSONObject) || (optJSONObject2 = optJSONObject.optJSONObject("product_list")) == null || !C57332tT.A01("products", optJSONObject2)) {
                return new C64543Dx(4);
            }
            JSONArray optJSONArray = optJSONObject2.optJSONArray("products");
            if (optJSONArray == null) {
                return new C64543Dx(4);
            }
            ArrayList A0s = AnonymousClass001.A0s();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (!(optJSONObject3 == null || (Azj = this.A01.Azj(optJSONObject3, j)) == null)) {
                    A0s.add(Azj);
                }
            }
            boolean A0P = C162457s7.A0P(C57332tT.A00("cart_enabled", optJSONObject2), "CARTENABLED_TRUE");
            if (A0s.isEmpty()) {
                return new C64543Dx(4);
            }
            C64543Dx r2 = new C64543Dx(1);
            r2.A02 = A0s;
            r2.A03 = A0P;
            this.A00.A00(r2, optJSONObject2);
            return r2;
        } catch (Exception e) {
            Log.e("CatalogPageGraphQLResponseConverter/convert/Could not create CatalogPage from GetProductList GraphQL response", e);
            return new C64543Dx(2);
        }
    }
}
