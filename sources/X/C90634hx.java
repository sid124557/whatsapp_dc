package X;

import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4hx  reason: invalid class name and case insensitive filesystem */
public class C90634hx extends C95444tg {
    public final int A00 = 256;
    public final LatLng A01;

    public C90634hx(LatLng latLng, C55682qk r14, C181668n8 r15, C181688nA r16, AnonymousClass8r5 r17, C57162tC r18, C620733j r19, C184408rk r20, C59722xN r21, AnonymousClass5ZI r22, AnonymousClass4FS r23) {
        super(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        this.A01 = latLng;
    }

    public String A06() {
        return "imprecise_location_tile";
    }

    public /* bridge */ /* synthetic */ Object A05(JSONObject jSONObject) {
        HashMap A0t = AnonymousClass001.A0t();
        JSONArray jSONArray = jSONObject.getJSONArray("tiles");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            AnonymousClass0x2.A1I(jSONObject2.getString("tile_id"), A0t, jSONObject2.getInt("imprecise_location_tile_level"));
        }
        return new C147107Cv(A0t);
    }

    public Map A07() {
        HashMap A0t = AnonymousClass001.A0t();
        JSONObject A1G = AnonymousClass0x9.A1G();
        LatLng latLng = this.A01;
        A1G.put("wa_biz_directory_lat", latLng.A00);
        A1G.put("wa_biz_directory_long", latLng.A01);
        A0t.put("location", A1G);
        A0t.put("max_tiles", Integer.valueOf(this.A00));
        return A0t;
    }
}
