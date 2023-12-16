package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0yQ  reason: invalid class name and case insensitive filesystem */
public class C18890yQ extends Handler {
    public File A00;
    public final C54292oU A01;
    public final C48092eK A02;

    public final synchronized void A00() {
        if (this.A00 == null) {
            File A0A = AnonymousClass002.A0A(C54292oU.A03(this.A01), "network_statistics.json");
            this.A00 = A0A;
            if (A0A.exists()) {
                try {
                    String str = new String(C382926u.A00(A0A));
                    C18260x0.A0q("networkStatsHandler/dataFromDisk: ", str, AnonymousClass001.A0o());
                    JSONObject A1H = AnonymousClass0x9.A1H(str);
                    try {
                        JSONObject jSONObject = A1H.getJSONObject("tx_data");
                        JSONObject jSONObject2 = A1H.getJSONObject("rx_data");
                        HashMap hashMap = C58052ud.A00;
                        hashMap.clear();
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String A0m = AnonymousClass001.A0m(keys);
                            AnonymousClass0x2.A1J(Integer.valueOf(Integer.parseInt(A0m)), hashMap, jSONObject2.getLong(A0m));
                        }
                        HashMap hashMap2 = C58052ud.A01;
                        hashMap2.clear();
                        Iterator<String> keys2 = jSONObject.keys();
                        while (keys2.hasNext()) {
                            String A0m2 = AnonymousClass001.A0m(keys2);
                            AnonymousClass0x2.A1J(Integer.valueOf(Integer.parseInt(A0m2)), hashMap2, jSONObject.getLong(A0m2));
                        }
                    } catch (JSONException e) {
                        Log.e("networkStatsHandler/load: error parsing JSON", e);
                    }
                } catch (IOException e2) {
                    Log.e("networkStatsHandler/load: I/O error", e2);
                } catch (JSONException e3) {
                    Log.e("networkStatsHandler/load: JSON error", e3);
                    A0A.delete();
                }
            }
        }
    }

    public synchronized void handleMessage(Message message) {
        AnonymousClass202 r0;
        long j;
        int i;
        long j2;
        int i2;
        A00();
        int i3 = message.what;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i2 = message.arg1;
                    j2 = (long) message.arg2;
                } else if (i3 == 4) {
                    i = message.arg1;
                    j = message.getData().getLong("long_value");
                } else if (i3 != 5) {
                    Log.d("NetworkStatsHandler unhandled message code");
                } else {
                    i2 = message.arg1;
                    j2 = message.getData().getLong("long_value");
                }
                HashMap hashMap = C58052ud.A00;
                Integer valueOf = Integer.valueOf(i2);
                Long l = (Long) hashMap.get(valueOf);
                if (l == null) {
                    l = AnonymousClass0x2.A0T();
                }
                AnonymousClass0x2.A1J(valueOf, hashMap, l.longValue() + j2);
            } else {
                i = message.arg1;
                j = (long) message.arg2;
            }
            HashMap hashMap2 = C58052ud.A01;
            Integer valueOf2 = Integer.valueOf(i);
            Long l2 = (Long) hashMap2.get(valueOf2);
            if (l2 == null) {
                l2 = AnonymousClass0x2.A0T();
            }
            AnonymousClass0x2.A1J(valueOf2, hashMap2, l2.longValue() + j);
        } else {
            C626936e.A06(this.A00);
            try {
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.putOpt("rx_data", C58052ud.A00(C58052ud.A00));
                A1G.putOpt("tx_data", C58052ud.A00(C58052ud.A01));
                String obj = A1G.toString();
                try {
                    r0 = new AnonymousClass202(this.A02.A00, this.A00);
                    AnonymousClass0x2.A1L(obj, r0);
                    r0.close();
                } catch (IOException e) {
                    Log.e("networkStatsHandler/save: error saving", e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (JSONException e2) {
                Log.e("networkStatistics/save: error converting to JSON", e2);
            }
        }
        return;
        throw th;
    }

    public C18890yQ(Looper looper, C54292oU r2, C48092eK r3) {
        super(looper);
        this.A01 = r2;
        this.A02 = r3;
    }
}
