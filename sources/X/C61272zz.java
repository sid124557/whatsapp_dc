package X;

import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2zz  reason: invalid class name and case insensitive filesystem */
public class C61272zz {
    public int A00 = 0;
    public boolean A01;
    public final AnonymousClass227 A02;
    public final List A03 = AnonymousClass001.A0s();
    public final List A04;
    public final Set A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public void A02(C33161sX r3) {
        List list = this.A03;
        synchronized (list) {
            list.add(r3);
        }
    }

    public boolean A03() {
        List<C33161sX> list = this.A03;
        synchronized (list) {
            for (C33161sX r0 : list) {
                if (r0.A00) {
                    return true;
                }
            }
            return false;
        }
    }

    public C61272zz(C60982zU r3) {
        this.A02 = r3.A05;
        this.A01 = r3.A02;
        this.A07 = r3.A03;
        this.A08 = r3.A04;
        this.A06 = r3.A01;
        this.A04 = r3.A06;
        this.A05 = r3.A07;
        C59812xW r1 = r3.A00;
        this.A0B = r1.A02;
        this.A0H = r1.A08;
        this.A0I = r1.A09;
        this.A0G = r1.A07;
        this.A0A = r1.A01;
        this.A0C = r1.A03;
        this.A0F = r1.A06;
        this.A0D = r1.A04;
        this.A0E = r1.A05;
        this.A09 = r1.A00;
        this.A0K = r1.A0B;
        this.A0J = r1.A0A;
    }

    public static C61272zz A00(String str) {
        JSONObject A1H = AnonymousClass0x9.A1H(str);
        ArrayList A0s = AnonymousClass001.A0s();
        if (A1H.has("sync_jid_hash")) {
            JSONArray jSONArray = A1H.getJSONArray("sync_jid_hash");
            for (int i = 0; i < jSONArray.length(); i++) {
                A0s.add(Base64.decode((String) jSONArray.get(i), 0));
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (A1H.has("sync_jid")) {
            JSONArray jSONArray2 = A1H.getJSONArray("sync_jid");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                AnonymousClass32Y.A0C(UserJid.Companion, (String) jSONArray2.get(i2), A0s2);
            }
        }
        int i3 = A1H.getInt("sync_type_code");
        for (AnonymousClass227 r5 : AnonymousClass227.values()) {
            if (r5.code == i3) {
                C60982zU r1 = new C60982zU(r5);
                r1.A02 = A1H.getBoolean("sync_is_urgent");
                r1.A03 = A1H.getBoolean("sync_only_if_changed");
                r1.A04 = A1H.getBoolean("sync_only_if_registered");
                r1.A01 = A1H.getBoolean("sync_clear_whatsapp_sync_data");
                r1.A00 = new C59812xW(A1H.optBoolean("sync_sidelist", true), A1H.optBoolean("sync_status", true), A1H.optBoolean("sync_picture", true), A1H.optBoolean("sync_business", true), A1H.optBoolean("sync_devices", true), A1H.optBoolean("sync_payment", true), A1H.optBoolean("sync_disappearing_mode", true), A1H.optBoolean("sync_lid", true), A1H.optBoolean("sync_contact", true), A1H.optBoolean("sync_bot"), A1H.optBoolean("sync_username", true), A1H.optBoolean("sync_text_status", true));
                C60982zU.A01(r1, A0s);
                r1.A07.addAll(A0s2);
                C61272zz A022 = r1.A02();
                A022.A00 = A1H.getInt("sync_retry_count");
                if (A1H.getBoolean("sync_should_retry")) {
                    A022.A02(new C33161sX(true));
                }
                return A022;
            }
        }
        return null;
    }

    public String A01() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("sync_type_code", this.A02.code);
        A1G.put("sync_is_urgent", this.A01);
        A1G.put("sync_only_if_changed", this.A07);
        A1G.put("sync_only_if_registered", this.A08);
        A1G.put("sync_clear_whatsapp_sync_data", this.A06);
        A1G.put("sync_should_retry", A03());
        A1G.put("sync_retry_count", this.A00);
        A1G.put("sync_contact", this.A0B);
        A1G.put("sync_sidelist", this.A0H);
        A1G.put("sync_status", this.A0I);
        A1G.put("sync_picture", this.A0G);
        A1G.put("sync_disappearing_mode", this.A0D);
        A1G.put("sync_lid", this.A0E);
        A1G.put("sync_devices", this.A0C);
        A1G.put("sync_bot", this.A09);
        A1G.put("sync_username", this.A0K);
        A1G.put("sync_text_status", this.A0J);
        List<byte[]> list = this.A04;
        if (!list.isEmpty()) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (byte[] encodeToString : list) {
                A0s.add(Base64.encodeToString(encodeToString, 0));
            }
            A1G.put("sync_jid_hash", new JSONArray(A0s));
        }
        Set set = this.A05;
        if (!set.isEmpty()) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Jid A0S = AnonymousClass0x7.A0S(it);
                if (A0S != null) {
                    A0s2.add(A0S.getRawString());
                }
            }
            A1G.put("sync_jid", new JSONArray(A0s2));
        }
        return A1G.toString();
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncRequest, mode=");
        AnonymousClass227 r1 = this.A02;
        A0o.append(r1.mode.modeString);
        A0o.append(", context=");
        A0o.append(r1.context.contextString);
        A0o.append(", protocols=");
        String str10 = "";
        if (this.A0B) {
            str = "C";
        } else {
            str = str10;
        }
        A0o.append(str);
        if (this.A0H) {
            str2 = "I";
        } else {
            str2 = str10;
        }
        A0o.append(str2);
        if (this.A0I) {
            str3 = "S";
        } else {
            str3 = str10;
        }
        A0o.append(str3);
        if (this.A0A) {
            str4 = "B";
        } else {
            str4 = str10;
        }
        A0o.append(str4);
        if (this.A0C) {
            str5 = "D";
        } else {
            str5 = str10;
        }
        A0o.append(str5);
        if (this.A0F) {
            str6 = "P";
        } else {
            str6 = str10;
        }
        A0o.append(str6);
        if (this.A0D) {
            str7 = "M";
        } else {
            str7 = str10;
        }
        A0o.append(str7);
        if (this.A0E) {
            str8 = "L";
        } else {
            str8 = str10;
        }
        A0o.append(str8);
        if (this.A09) {
            str9 = "T";
        } else {
            str9 = str10;
        }
        A0o.append(str9);
        if (this.A0J) {
            str10 = "E";
        }
        return AnonymousClass000.A0X(str10, A0o);
    }
}
