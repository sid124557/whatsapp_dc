package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2wd  reason: invalid class name and case insensitive filesystem */
public class C59262wd {
    public final C60152y5 A00;
    public final String A01;

    public C55012pe A01(UserJid userJid) {
        String string = this.A00.A03(this.A01).getString(userJid.getRawString(), (String) null);
        if (string != null) {
            return A00(string);
        }
        return null;
    }

    public C59262wd(C60152y5 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public static final C55012pe A00(String str) {
        StringBuilder sb;
        String str2;
        String str3;
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            UserJid A09 = AnonymousClass32Y.A09(A1H.getString("uj"));
            String string = A1H.getString("s");
            if (A1H.has("a")) {
                str3 = A1H.getString("a");
            } else {
                str3 = null;
            }
            AnonymousClass2TW r4 = new AnonymousClass2TW(A09, string, str3, A1H.getLong("ct"), A1H.getLong("lit"));
            r4.A02 = A1H.getBoolean("hcslm");
            r4.A00 = A1H.optInt("brc", -1);
            r4.A01 = A1H.optLong("fmts", -1);
            r4.A03 = A1H.optBoolean("wdtb", false);
            return new C55012pe(r4);
        } catch (JSONException e) {
            e = e;
            sb = AnonymousClass001.A0o();
            str2 = "CTWA: EntryPointConversionStore/getConversion/json error";
            C18260x0.A1Q(sb, str2, e);
            return null;
        } catch (AnonymousClass24P e2) {
            e = e2;
            sb = AnonymousClass001.A0o();
            str2 = "CTWA: EntryPointConversionStore/getConversion/invalid jid error";
            C18260x0.A1Q(sb, str2, e);
            return null;
        }
    }
}
