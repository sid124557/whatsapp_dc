package X;

import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1QZ  reason: invalid class name */
public class AnonymousClass1QZ extends C22781Qb {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    public AnonymousClass1QZ(C624134x r4, String str, String str2, int i) {
        super(i, str, str2);
        String str3;
        byte b = r4.A1I;
        if (b == 32) {
            this.A00 = C22781Qb.A01(((C31921p4) r4).A02);
        } else {
            if (b == 27) {
                str3 = "text";
            } else if (b == 25) {
                str3 = "image";
            } else if (b == 30) {
                str3 = "location";
            } else if (b == 28) {
                str3 = "video";
            } else if (b == 26) {
                str3 = "document";
            } else if (b == 29) {
                str3 = "gif";
            } else {
                str3 = "unsupported";
            }
            this.A01 = str3;
        }
        if (r4 instanceof AnonymousClass4FG) {
            C47142cm BDY = ((AnonymousClass4FG) r4).BDY();
            this.A02 = C22781Qb.A01(BDY.A05);
            List<C58932w3> list = BDY.A06;
            if (list != null) {
                this.A03 = AnonymousClass001.A0s();
                for (C58932w3 r0 : list) {
                    this.A03.add(C22781Qb.A01(r0.A08));
                }
            }
        }
    }

    public boolean A04(String str) {
        try {
            super.A04(str);
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            this.A01 = A1H.optString("header_type");
            this.A02 = A1H.optString("template_id_hash");
            JSONArray optJSONArray = A1H.optJSONArray("button_id_hashes");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.A03 = AnonymousClass001.A0s();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.A03.add(optJSONArray.get(i).toString());
                }
            }
            if (!A1H.has("template_button_reply_selected_id_hash")) {
                return true;
            }
            this.A00 = A1H.optString("template_button_reply_selected_id_hash");
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchHSMEvent: fromJsonString threw: ", e);
            return false;
        }
    }

    public AnonymousClass1QZ() {
        super(-1, "unknown", "unknown");
    }
}
