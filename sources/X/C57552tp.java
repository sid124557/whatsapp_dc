package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2tp  reason: invalid class name and case insensitive filesystem */
public class C57552tp {
    public static String A00(C56612sH r9, AnonymousClass5LI r10) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        if (r10 == null) {
            return null;
        }
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("auth_token", r10.A08);
            A1G.put("conn_ttl", r10.A05);
            A1G.put("auth_ttl", r10.A03);
            A1G.put("max_buckets", r10.A06);
            List<C47502dM> list = r10.A0A;
            JSONArray A1F = AnonymousClass0x9.A1F();
            for (C47502dM r6 : list) {
                JSONObject A1G2 = AnonymousClass0x9.A1G();
                A1G2.put("hostname", r6.A04);
                A1G2.put("ip4", r6.A05);
                A1G2.put("ip6", r6.A06);
                A1G2.put("class", r6.A07);
                A1G2.put("fallback_hostname", r6.A00);
                A1G2.put("fallback_ip4", r6.A01);
                A1G2.put("fallback_ip6", r6.A02);
                A1G2.put("fallback_class", r6.A03);
                Set set = r6.A0B;
                if (set == null) {
                    jSONArray = null;
                } else {
                    jSONArray = AnonymousClass0x9.A1F();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        AnonymousClass0x7.A1L(it, jSONArray);
                    }
                }
                A1G2.put("upload", jSONArray);
                Set set2 = r6.A09;
                if (set2 == null) {
                    jSONArray2 = null;
                } else {
                    jSONArray2 = AnonymousClass0x9.A1F();
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass0x7.A1L(it2, jSONArray2);
                    }
                }
                A1G2.put("download", jSONArray2);
                Set set3 = r6.A0A;
                if (set3 == null) {
                    jSONArray3 = null;
                } else {
                    jSONArray3 = AnonymousClass0x9.A1F();
                    Iterator it3 = set3.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass0x7.A1L(it3, jSONArray3);
                    }
                }
                A1G2.put("download_buckets", jSONArray3);
                A1G2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r6.A08);
                A1G2.put("force_ip", r6.A0C);
                A1F.put(A1G2);
            }
            A1G.put("hosts", A1F);
            A1G.put("send_time_abs_ms", (r10.A07 - SystemClock.elapsedRealtime()) + r9.A0H());
            A1G.put("last_id", r10.A09);
            A1G.put("is_new", r10.A0B);
            A1G.put("max_autodownload_retry", r10.A00);
            A1G.put("max_manual_retry", r10.A01);
            return A1G.toString();
        } catch (JSONException e) {
            Log.e("routingresponse/can't serialize json", e);
            return null;
        }
    }
}
