package X;

import android.content.Context;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Rs  reason: invalid class name and case insensitive filesystem */
public class C194139Rs {
    public String A00;
    public final Context A01;
    public final C69263Wi A02;
    public final C40602Ha A03;
    public final AnonymousClass9U5 A04;
    public final AnonymousClass9VU A05;
    public final C194259Se A06;

    public C194139Rs(Context context, C69263Wi r8, C40602Ha r9, AnonymousClass9U5 r10, AnonymousClass9VU r11, C194259Se r12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11 = str5;
        String str12 = str6;
        this.A01 = context;
        this.A02 = r8;
        this.A06 = r12;
        this.A04 = r10;
        this.A03 = r9;
        this.A05 = r11;
        if (str3.length() == 12) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(str3.substring(0, 4));
            A0o.append("9");
            str3 = AnonymousClass000.A0X(str3.substring(4), A0o);
        }
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("fullName", str);
            A1G.put("personalID", str2);
            JSONObject A0z = C18300x5.A0z(str3, "phone", A1G);
            A0z.put("street", str4);
            String str13 = "";
            A0z.put("addressNumber", str5 == null ? str13 : str11);
            A0z.put("extraLine", str6 == null ? str13 : str12);
            A0z.put("neighborhood", str7 != null ? str7 : str13);
            A0z.put("city", str8);
            A0z.put("state", str9);
            A0z.put("addressCode", str10);
            A0z.put("country", "BR");
            this.A00 = AnonymousClass0x9.A0y(A0z, "address", A1G);
        } catch (JSONException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: BrazilSendKYCAction Exception: ", e);
        }
    }

    public final void A00(C203059n3 r19, C67993Rl r20, String str) {
        Context context = this.A01;
        C69263Wi r10 = this.A02;
        C194259Se r14 = this.A06;
        C193789Pz r8 = new C193789Pz(context, r10, this.A03, this.A04, this.A05, r14);
        try {
            AnonymousClass36K[] r3 = new AnonymousClass36K[1];
            C67993Rl r6 = r20;
            byte[] A12 = C1899693i.A12(r6, this.A00.getBytes(C58152un.A0B));
            C160757oG r2 = r8.A05;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("sendKyc Text Blob : ");
            C1899593h.A1J(r2, Base64.encodeToString(A12, 2), A0o);
            AnonymousClass39V[] r22 = new AnonymousClass39V[1];
            int A0F = AnonymousClass39V.A0F("key-type", r6.A03, r22);
            r3[A0F] = new AnonymousClass36K("text", A12, r22);
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass39V.A03("action", "send-kyc-data", A0s);
            String str2 = r6.A05;
            AnonymousClass39V.A03("provider", str2, A0s);
            AnonymousClass39V.A03("key-version", r6.A04, A0s);
            String str3 = str;
            if (str != null) {
                AnonymousClass39V.A03("kyc-action-type", str3, A0s);
            }
            AnonymousClass39V.A03("device-id", r8.A06.A01(), A0s);
            AnonymousClass36K r142 = new AnonymousClass36K("account", C18300x5.A1Z(A0s, A0F), r3);
            r8.A03.A0G(new C1907699t(r8.A00, r8.A02, r19, r8, r8.A01, "send-kyc-data", str2), r142, "set", 0);
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }
}
