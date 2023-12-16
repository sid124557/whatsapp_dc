package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Pc  reason: invalid class name and case insensitive filesystem */
public class C67393Pc implements C1228866f {
    public C53512nD A00;
    public final C60872zJ A01;
    public final C46992cX A02;
    public final C54672p6 A03;
    public final C102645Js A04;
    public final String A05;
    public final String A06;

    public /* synthetic */ void BPk(String str) {
    }

    public /* synthetic */ void BQe(long j) {
    }

    public C67393Pc(C60872zJ r1, C46992cX r2, C54672p6 r3, C102645Js r4, String str, String str2) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = str;
        this.A04 = r4;
        this.A06 = str2;
    }

    public void BSF(String str) {
        C18260x0.A0r("httpresumecheck/error = ", str, AnonymousClass001.A0o());
    }

    public void BaA(String str, Map map) {
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            if (!A1H.has("resume")) {
                return;
            }
            if ("complete".equals(A1H.optString("resume"))) {
                this.A00.A05 = A1H.optString("url");
                this.A00.A03 = A1H.optString("direct_path");
                this.A00.A02 = AnonymousClass580.COMPLETE;
                return;
            }
            this.A00.A01 = A1H.optInt("resume");
            this.A00.A02 = AnonymousClass580.RESUME;
        } catch (JSONException e) {
            Log.w("mediaupload/MMS upload resume form post failed to parse JSON response; ", e);
            this.A00.A02 = AnonymousClass580.FAILURE;
        }
    }
}
