package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7n7  reason: invalid class name and case insensitive filesystem */
public class C160147n7 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public static C160147n7 A00(String str) {
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            return new C160147n7(A1H.optString("media_codec_encoder", (String) null), A1H.optString("media_codec_decoder", (String) null), A1H.optInt("color_format_encoder", -1), A1H.optInt("color_format_decoder", -1), A1H.optInt("forced_frame_conv_id_encoder", -1), A1H.optInt("forced_frame_conv_id_decoder", -1));
        } catch (JSONException unused) {
            return null;
        }
    }

    public C160147n7(String str, String str2, int i, int i2, int i3, int i4) {
        this.A05 = str;
        this.A01 = i;
        this.A03 = i3;
        this.A04 = str2;
        this.A00 = i2;
        this.A02 = i4;
    }

    public C160147n7() {
        this((String) null, (String) null, -1, -1, -1, -1);
    }
}
