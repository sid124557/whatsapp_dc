package X;

import com.whatsapp.util.Log;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2iA  reason: invalid class name and case insensitive filesystem */
public class C50432iA {
    public boolean A00;
    public final C29441ip A01;
    public final C56612sH A02;
    public final C620733j A03;
    public final AnonymousClass4FV A04;
    public final AnonymousClass4ES A05;
    public final AnonymousClass4D5 A06;
    public final AnonymousClass4F7 A07;
    public final C52512lb A08;
    public final AnonymousClass4FS A09;
    public final Set A0A = AnonymousClass0x9.A17();

    public boolean A01(C58852vv r6) {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("request_etag", r6.A04);
            A1G.put("language", r6.A03);
            A1G.put("cache_fetch_time", r6.A00);
            A1G.put("last_fetch_attempt_time", r6.A01);
            this.A06.BmA(C18280x3.A0c(r6.A05, "language_attempted_to_fetch", A1G));
            return true;
        } catch (JSONException e) {
            Log.d("dictionaryloader/save/fail", e);
            return false;
        }
    }

    public C58852vv A00() {
        String B73 = this.A06.B73();
        if (B73 == null) {
            return new C58852vv((AnonymousClass225) null, (String) null, (String) null, (String) null, 0, 0);
        }
        String str = null;
        try {
            C58852vv r4 = new C58852vv((AnonymousClass225) null, (String) null, (String) null, (String) null, 0, 0);
            JSONObject A1H = AnonymousClass0x9.A1H(B73);
            String optString = A1H.optString("request_etag");
            C162457s7.A0H(optString);
            if (C175738Zn.A0V(optString)) {
                optString = null;
            }
            r4.A04 = optString;
            r4.A00 = A1H.optLong("cache_fetch_time", 0);
            String optString2 = A1H.optString("language");
            C162457s7.A0H(optString2);
            if (C175738Zn.A0V(optString2)) {
                optString2 = null;
            }
            r4.A03 = optString2;
            r4.A01 = A1H.optLong("last_fetch_attempt_time", 0);
            String optString3 = A1H.optString("language_attempted_to_fetch");
            C162457s7.A0H(optString3);
            if (!C175738Zn.A0V(optString3)) {
                str = optString3;
            }
            r4.A05 = str;
            return r4;
        } catch (JSONException e) {
            Log.d("dictionaryloader/load/fail", e);
            return new C58852vv((AnonymousClass225) null, (String) null, (String) null, (String) null, 0, 0);
        }
    }

    public C50432iA(C29441ip r2, C56612sH r3, C620733j r4, AnonymousClass4FV r5, AnonymousClass4ES r6, AnonymousClass4D5 r7, AnonymousClass4F7 r8, C52512lb r9, AnonymousClass4FS r10) {
        C18260x0.A0f(r3, r10, r5, r4, r8);
        C18260x0.A0W(r2, r7, r6);
        C162457s7.A0J(r9, 9);
        this.A02 = r3;
        this.A09 = r10;
        this.A04 = r5;
        this.A03 = r4;
        this.A07 = r8;
        this.A01 = r2;
        this.A06 = r7;
        this.A05 = r6;
        this.A08 = r9;
    }
}
