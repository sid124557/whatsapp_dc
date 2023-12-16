package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7cr  reason: invalid class name and case insensitive filesystem */
public final class C154247cr {
    public static final C152777a6 A00(C187458xF r5, AnonymousClass7Lv r6) {
        String str = r6.A00;
        if (str.length() <= 0) {
            str = r6.A01;
            if (str.length() == 0) {
                str = "";
            }
        }
        C166577yv A00 = C166577yv.A00(Uri.parse(str), r6.A03, "wa-avatar", (String) null, AnonymousClass001.A0t());
        A00.A0R = true;
        C151277Uc r1 = new C151277Uc(C141266vI.IN_PLAY, A00, "WA_BOT", C141076uz.AUDIO_VIDEO.mValue);
        r1.A0C = true;
        r1.A02 = 1000;
        r1.A09 = r6.A02;
        C152777a6 A002 = r1.A00();
        A002.A04 = r5;
        return A002;
    }

    public static final List A01(JSONArray jSONArray) {
        ArrayList A0s = AnonymousClass001.A0s();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("video_id");
            String string2 = jSONObject.getString("sd_progressive_url");
            String string3 = jSONObject.getString("hd_progressive_url");
            String string4 = jSONObject.getString("dash_manifest");
            long j = jSONObject.getLong("duration_ms");
            long j2 = jSONObject.getLong("expiry");
            boolean z = jSONObject.getBoolean("fallback");
            C162457s7.A0H(string);
            C162457s7.A0H(string2);
            C162457s7.A0H(string3);
            if (string4.length() == 0) {
                string4 = null;
            }
            A0s.add(new AnonymousClass7Zt(string, string2, string3, string4, C86604Kt.A0k(), j, j2, z));
        }
        return A0s;
    }
}
