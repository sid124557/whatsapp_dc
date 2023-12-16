package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.5Wq  reason: invalid class name and case insensitive filesystem */
public class C105845Wq {
    public static final C105845Wq A0I = new AnonymousClass5R8().A00();
    public final C95814uZ A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final JSONObject A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public C105845Wq(C95814uZ r2, UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A04 = str;
        this.A08 = str2;
        this.A0E = z;
        this.A0F = z2;
        this.A0C = z3;
        this.A0G = z4;
        this.A0H = z5;
        this.A09 = str3;
        this.A05 = str5;
        this.A03 = str4;
        this.A00 = r2;
        this.A01 = userJid;
        this.A07 = str6;
        this.A06 = str7;
        this.A02 = str8;
        this.A0B = jSONObject;
        this.A0D = z6;
        this.A0A = list;
    }

    public Bundle A00() {
        String str;
        String str2;
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("data", this.A04);
        A082.putString("source", this.A08);
        A082.putBoolean("has_ib", this.A0E);
        A082.putBoolean("has_wm", this.A0F);
        A082.putBoolean("ads_logging_requires_tos", this.A0C);
        A082.putBoolean("show_ad_attribution", this.A0G);
        A082.putBoolean("show_keyboard", this.A0H);
        A082.putString("icebreaker", this.A05);
        A082.putString("ctwa_context", this.A03);
        A082.putString("source_url", this.A09);
        UserJid userJid = this.A01;
        String str3 = null;
        if (userJid != null) {
            str = userJid.getRawString();
        } else {
            str = null;
        }
        A082.putString("jid", str);
        C95814uZ r0 = this.A00;
        if (r0 != null) {
            str2 = r0.getRawString();
        } else {
            str2 = null;
        }
        A082.putString("lid", str2);
        A082.putString("productId", this.A07);
        A082.putString("land_on_whatsapp_catalog", this.A06);
        A082.putString("categoryId", this.A02);
        JSONObject jSONObject = this.A0B;
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        }
        A082.putString("banner", str3);
        A082.putBoolean("consumer_disclosure", this.A0D);
        List<C371221a> list = this.A0A;
        if (list != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (C371221a r02 : list) {
                A0s.add(r02.label);
            }
            A082.putStringArrayList("client_filters", A0s);
        }
        return A082;
    }
}
