package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.70w  reason: invalid class name */
public final class AnonymousClass70w {
    public static byte[] A00(byte[] bArr) {
        if (Util.A00 >= 27) {
            return bArr;
        }
        try {
            Charset charset = AnonymousClass79T.A05;
            JSONObject A1H = AnonymousClass0x9.A1H(new String(bArr, charset));
            StringBuilder A0A = C18330xA.A0A("{\"keys\":[");
            JSONArray jSONArray = A1H.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    C18320x8.A1K(A0A);
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                A0A.append("{\"k\":\"");
                A0A.append(jSONObject.getString("k").replace('-', '+').replace('_', '/'));
                A0A.append("\",\"kid\":\"");
                A0A.append(jSONObject.getString("kid").replace('-', '+').replace('_', '/'));
                A0A.append("\",\"kty\":\"");
                A0A.append(jSONObject.getString("kty"));
                A0A.append("\"}");
            }
            return AnonymousClass000.A0X("]}", A0A).getBytes(charset);
        } catch (JSONException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Failed to adjust response data: ");
            Log.e("ClearKeyUtil", AnonymousClass000.A0X(new String(bArr, AnonymousClass79T.A05), A0o), e);
            return bArr;
        }
    }
}
