package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7kV  reason: invalid class name and case insensitive filesystem */
public final class C158757kV {
    public C196629bS A00;
    public final C380625j A01;
    public final AnonymousClass66R A02 = AnonymousClass8P7.A00(new AnonymousClass8X8(this));

    public final AnonymousClass7ZK A00(String str) {
        long j;
        C162457s7.A0J(str, 0);
        AnonymousClass66R r5 = this.A02;
        AnonymousClass7ZK r0 = (AnonymousClass7ZK) ((Map) r5.getValue()).get(str);
        if (r0 != null) {
            j = r0.A00;
        } else {
            j = 0;
        }
        if (j < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            A01(str);
        }
        return (AnonymousClass7ZK) ((Map) r5.getValue()).get(str);
    }

    public final void A01(String str) {
        AnonymousClass66R r1 = this.A02;
        ((Map) r1.getValue()).remove(str);
        A02((Map) r1.getValue());
    }

    public final boolean A03() {
        AnonymousClass66R r7 = this.A02;
        Iterator A0q = AnonymousClass000.A0q((Map) r7.getValue());
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (((AnonymousClass7ZK) A0w.getValue()).A00 < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                A01(((AnonymousClass7ZK) A0w.getValue()).A03);
            }
        }
        return !((Map) r7.getValue()).isEmpty();
    }

    public C158757kV(C380625j r2, C196629bS r3) {
        C18260x0.A0Q(r3, r2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final void A02(Map map) {
        JSONArray A1F = AnonymousClass0x9.A1F();
        try {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                AnonymousClass7ZK r4 = (AnonymousClass7ZK) AnonymousClass0x2.A0W(A0q);
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("credentialId", r4.A03);
                A1G.put("internationalActivationStatus", r4.A02);
                A1G.put("startTime", r4.A01);
                A1G.put("endTime", r4.A00);
                A1F.put(A1G);
            }
            this.A00.A0M(A1F);
        } catch (JSONException unused) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs saveInternationalState threw: an exception ");
        }
    }
}
