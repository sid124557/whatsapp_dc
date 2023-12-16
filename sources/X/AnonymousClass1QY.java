package X;

import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.1QY  reason: invalid class name */
public class AnonymousClass1QY extends C22781Qb {
    public boolean A00;

    public boolean A04(String str) {
        try {
            super.A04(str);
            this.A00 = AnonymousClass0x9.A1H(str).optBoolean("contains_url", false);
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchTextEvent: fromJsonString threw: ", e);
            return false;
        }
    }

    public AnonymousClass1QY(int i, String str, boolean z) {
        super(i, str, "text");
        this.A00 = z;
    }

    public AnonymousClass1QY() {
        super(-1, "unknown", "text");
        this.A00 = false;
    }
}
