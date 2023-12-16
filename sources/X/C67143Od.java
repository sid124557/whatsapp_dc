package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Od  reason: invalid class name and case insensitive filesystem */
public final class C67143Od implements AnonymousClass4AO {
    public final AnonymousClass2XR A00;
    public final AnonymousClass4AO A01;

    public /* bridge */ /* synthetic */ Object Azj(JSONObject jSONObject, long j) {
        JSONObject optJSONObject;
        C148047Gs r7;
        Object Azj;
        C162457s7.A0J(jSONObject, 0);
        try {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("xwa_product_catalog_get_product_catalog");
            if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("product_catalog")) == null)) {
                String[] A1Y = AnonymousClass0x9.A1Y();
                A1Y[0] = "products";
                if (C57332tT.A03(optJSONObject, A1Y)) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("products");
                    if (optJSONArray == null) {
                        return new AnonymousClass2JW((C64523Dv) null, false);
                    }
                    ArrayList A0s = AnonymousClass001.A0s();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                        if (!(optJSONObject3 == null || (Azj = this.A01.Azj(optJSONObject3, j)) == null)) {
                            A0s.add(Azj);
                        }
                    }
                    boolean z = false;
                    if (!C57332tT.A03(optJSONObject, new String[]{"paging"})) {
                        r7 = new C148047Gs(false, (String) null);
                    } else {
                        JSONObject optJSONObject4 = optJSONObject.optJSONObject("paging");
                        if (optJSONObject4 != null) {
                            String A002 = C57332tT.A00("after", optJSONObject4);
                            if (A002 == null || A002.length() == 0) {
                                z = true;
                            }
                            r7 = new C148047Gs(true ^ z, A002);
                        } else {
                            throw C18290x4.A0Y();
                        }
                    }
                    boolean A0P = C162457s7.A0P(C57332tT.A00("cart_enabled", optJSONObject), "CARTENABLED_TRUE");
                    C64523Dv r1 = new C64523Dv(r7, A0s);
                    this.A00.A00(r1, optJSONObject);
                    return new AnonymousClass2JW(r1, A0P);
                }
            }
            return new AnonymousClass2JW((C64523Dv) null, false);
        } catch (Exception e) {
            Log.e("GetProductCatalogGraphQLResponseConverter/convert/Could not create GetProductCatalogPageResult from GetProductCatalog GraphQL response", e);
            return new AnonymousClass2JW((C64523Dv) null, false);
        }
    }

    public C67143Od(AnonymousClass2XR r1, AnonymousClass4AO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
