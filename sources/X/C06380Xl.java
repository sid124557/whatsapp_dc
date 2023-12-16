package X;

import com.whatsapp.util.Log;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Xl  reason: invalid class name and case insensitive filesystem */
public final class C06380Xl {
    public static int A00(C17390vS r4) {
        String str;
        int i = -1;
        List BFa = r4.BFa("Retry-After");
        if (BFa == null || BFa.isEmpty()) {
            str = "drive-util/getRetryAfter/no retry after header";
        } else {
            if (BFa.size() != 1) {
                Log.e(AnonymousClass000.A0P(BFa, "drive-util/getRetryAfter/too many retry after headers: ", AnonymousClass001.A0o()));
            }
            String A0n = AnonymousClass001.A0n(BFa, 0);
            i = C615531h.A01(A0n, -1);
            if (i < 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("drive-util/getRetryAfter/invalid retry after (");
                A0o.append(A0n);
                str = AnonymousClass000.A0e(A0o);
            }
            Log.d(AnonymousClass000.A0Y("drive-util/getRetryAfter/retry after: ", AnonymousClass001.A0o(), i));
            return i;
        }
        Log.e(str);
        Log.d(AnonymousClass000.A0Y("drive-util/getRetryAfter/retry after: ", AnonymousClass001.A0o(), i));
        return i;
    }

    public static void A02(C17390vS r4, String str, boolean z) {
        int A00;
        if (z) {
            A00 = -1;
        } else {
            A00 = A00(r4);
        }
        String B7O = r4.B7O();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("drive-util/");
        A0o.append(str);
        A0o.append("/too-many-requests (");
        A0o.append(B7O);
        Log.w(AnonymousClass000.A0Y(") retry-after=", A0o, A00));
        throw new AnonymousClass0EU(B7O, A00);
    }

    public static void A03(String str, HttpsURLConnection httpsURLConnection, boolean z) {
        A01(new C02130Ez(httpsURLConnection), str, z);
        throw AnonymousClass000.A0L();
    }

    public static void A04(String str, HttpsURLConnection httpsURLConnection, boolean z) {
        A02(new C02130Ez(httpsURLConnection), str, z);
        throw AnonymousClass000.A0L();
    }

    public static void A01(C17390vS r3, String str, boolean z) {
        try {
            String B7O = r3.B7O();
            if (B7O != null && "ACCOUNT_OUT_OF_STORAGE_QUOTA".equals(AnonymousClass355.A02("reason", new JSONObject(B7O).getJSONObject("error").getJSONArray("details").getJSONObject(0)))) {
                throw new AnonymousClass0EM();
            }
        } catch (JSONException e) {
            Log.e(AnonymousClass000.A0P(e, "gdrive-util/handleResourceExhaustedError/parsing error response failed: ", AnonymousClass001.A0o()));
        }
        A02(r3, str, z);
        throw AnonymousClass000.A0L();
    }
}
