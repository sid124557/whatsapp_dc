package X;

import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4tf  reason: invalid class name and case insensitive filesystem */
public abstract class C95434tf extends AnonymousClass8E7 {
    public final C57162tC A00;
    public final C620733j A01;
    public final AnonymousClass5GZ A02;

    public C95434tf(C55682qk r10, C181668n8 r11, C57162tC r12, C620733j r13, C184408rk r14, C59722xN r15, AnonymousClass5ZI r16, AnonymousClass5GZ r17, AnonymousClass4FS r18) {
        super(r10, r11, r14, r15, r16, r18, "WA_BizAPIGlobalSearch");
        this.A01 = r13;
        this.A02 = r17;
        this.A00 = r12;
    }

    public int A0C() {
        return 33;
    }

    public int A0D() {
        return 0;
    }

    public int A0E() {
        return 20;
    }

    public String A0F() {
        return C58172up.A06;
    }

    public void A0I(Integer num, Integer num2) {
        String str;
        if (num != null && num.intValue() != 4) {
            C55682qk r4 = this.A02;
            JSONObject A1G = AnonymousClass0x9.A1G();
            try {
                A1G.put("error_code", num);
                if (num2 != null) {
                    A1G.put("error_reason", num2);
                }
            } catch (JSONException e) {
                Log.d(AnonymousClass000.A0a("BusinessApiSearchNetworkRequest/getAcsInfo ", AnonymousClass001.A0o(), e));
            } catch (Throwable unused) {
                str = A1G.toString();
            }
            str = A1G.toString();
            r4.A0A("BusinessApiSearchNetworkRequest/onAcsError", false, str);
        }
    }

    public JSONObject A0G() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        C56972sr r0 = this.A02.A00.A00;
        r0.A0P();
        Me me = r0.A00;
        C626936e.A06(me);
        String A0w = AnonymousClass0x9.A0w(me);
        String A0o = C18290x4.A0o(new Locale(this.A01.A07(), A0w));
        if ("in_ID".equalsIgnoreCase(A0o)) {
            A0o = "id_ID";
        } else if ("en".equalsIgnoreCase(A0o)) {
            A0o = "en_US";
        } else if ("iw_IL".equalsIgnoreCase(A0o)) {
            A0o = "he_IL";
        } else if ("ES".equalsIgnoreCase(A0o)) {
            A0o = "es_ES";
        }
        A1G.put("locale", A0o);
        A1G.put("country_code", A0w);
        if (!TextUtils.isEmpty(this.A01)) {
            A1G.put("credential", this.A01);
        }
        A1G.put("version", "1.0");
        Iterator A0q = AnonymousClass000.A0q(A07());
        while (A0q.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0q);
            A1G.put(C18310x6.A0q(A0w2), A0w2.getValue());
        }
        return A1G;
    }

    public void A0H(C149757Nt r1) {
    }

    public void A0L(String str) {
    }

    public void A0J(Integer num, Long l, String str, String str2, String str3, String str4) {
    }

    public void A0K(Integer num, Long l, String str, String str2, String str3, String str4) {
    }
}
