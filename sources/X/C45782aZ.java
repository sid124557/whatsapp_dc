package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2aZ  reason: invalid class name and case insensitive filesystem */
public class C45782aZ {
    public long A00;
    public long A01;
    public String A02;
    public String A03;

    public C45782aZ(long j, String str, long j2, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("shard-key", this.A03);
            A1G.put("entry-key", this.A02);
            A1G.put("expiration-time", this.A01);
            A1G.put("create-time", this.A00);
        } catch (JSONException unused) {
            Log.e("BkCacheSaveOnDiskHelper:BkCacheValueHelper/toJson threw exception");
        }
        return A1G.toString();
    }
}
