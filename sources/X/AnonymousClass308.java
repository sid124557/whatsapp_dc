package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.308  reason: invalid class name */
public class AnonymousClass308 {
    public final C55682qk A00;
    public final AnonymousClass33p A01;
    public final C57182tE A02;
    public final C50652iY A03;
    public final AnonymousClass31V A04;
    public final C183538qC A05;

    public String A00(String str) {
        String A002;
        C46402bZ A003 = this.A03.A00(C58172up.A0T, str.getBytes(C58152un.A0D));
        if (A003 != null && (A002 = A003.A00()) != null && str.equals(A01(A002))) {
            return A002;
        }
        this.A00.A0A("FBCredentialsStore/encryptFbUsers", true, "Failed to encrypt fb users");
        throw AnonymousClass001.A0e("Failed to encrypt fb users");
    }

    public final String A01(String str) {
        byte[] bArr;
        try {
            C46402bZ A002 = C57182tE.A00(str);
            if (A002 == null) {
                bArr = null;
            } else {
                bArr = this.A03.A01(A002, C58172up.A0T);
            }
            if (bArr != null) {
                return new String(bArr, C58152un.A0D);
            }
            this.A00.A0A("FBCredentialsStore/decryptFbUsers", true, "Failed to decrypt fb users");
            throw AnonymousClass001.A0e("Failed to decrypt fb users");
        } catch (JSONException e) {
            C55682qk.A05(this.A00, "FBCredentialsStore/decryptFbUsers", e);
            throw new IllegalStateException("Failed to decrypt fb users", e);
        }
    }

    public final Map A02() {
        String A012;
        C183538qC r7 = this.A05;
        String string = ((C48632fD) r7.get()).A00().getString("pref_fb_user_credentials_encrypted", (String) null);
        if (string == null) {
            AnonymousClass33p r4 = this.A01;
            A012 = AnonymousClass0x2.A0F(r4).getString("pref_fb_user_credentials", (String) null);
            if (A012 != null) {
                ((C48632fD) r7.get()).A01(A00(A012));
                C18260x0.A0K(r4, "pref_fb_user_credentials");
            }
        } else {
            A012 = A01(string);
        }
        if (A012 == null) {
            return AnonymousClass001.A0t();
        }
        try {
            HashMap A0t = AnonymousClass001.A0t();
            JSONObject A1H = AnonymousClass0x9.A1H(A012);
            Iterator<String> keys = A1H.keys();
            while (keys.hasNext()) {
                String A0m = AnonymousClass001.A0m(keys);
                A0t.put(A0m, A1H.getString(A0m));
            }
            Iterator A11 = C18290x4.A11(A0t);
            boolean z = false;
            while (A11.hasNext()) {
                Object next = A11.next();
                JSONObject A1H2 = AnonymousClass0x9.A1H(C18320x8.A0e(next, A0t));
                if (A1H2.has("accessToken")) {
                    String string2 = A1H2.getString("accessToken");
                    A1H2.remove("accessToken");
                    A0t.put(next, AnonymousClass0x9.A0y(string2, "access_token", A1H2));
                    z = true;
                }
            }
            if (!z) {
                return A0t;
            }
            C48632fD r42 = (C48632fD) r7.get();
            JSONObject A1G = AnonymousClass0x9.A1G();
            Iterator A0q = AnonymousClass000.A0q(A0t);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A1G.put(C18310x6.A0q(A0w), A0w.getValue());
            }
            r42.A01(A00(A1G.toString()));
            return A0t;
        } catch (JSONException e) {
            throw new IllegalStateException("FBCredentialsStore : Failed to parse data from store", e);
        }
    }

    public AnonymousClass308(C55682qk r1, AnonymousClass33p r2, C57182tE r3, C50652iY r4, AnonymousClass31V r5, C183538qC r6) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public void A03(C50912iy r5) {
        Map A022 = A02();
        String str = r5.A00;
        if (!TextUtils.isEmpty(C18310x6.A0o(str, A022))) {
            A022.remove(str);
            ((C48632fD) this.A05.get()).A01(A00(new JSONObject(A022).toString()));
        }
    }

    public boolean A04(C60272yH r8) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FBCredentialsStore/storeFbIdentity/FbUserType");
        C50912iy r0 = r8.A01;
        C18260x0.A0o(r0, A0o);
        Map A022 = A02();
        try {
            String str2 = r0.A00;
            JSONObject put = AnonymousClass0x9.A1G().put("fbid", C18310x6.A0B(C18330xA.A08(r8.A04))).put("password", C18330xA.A08(r8.A05)).put("access_token", C18330xA.A08(r8.A02)).put("timestamp", r8.A00).put("ttl", r8.A07).put("analytics_claim", r8.A08).put("usertype", str2);
            C166557yt r02 = r8.A03;
            if (r02 != null) {
                put.put("session_cookie_current_user", ((C633738z) C18330xA.A08(r02)).A00());
            }
            C166557yt r03 = r8.A06;
            if (r03 != null) {
                put.put("session_cookie_session_identifier", ((C633738z) C18330xA.A08(r03)).A00());
            }
            A022.put(str2, put.toString());
            try {
                C48632fD r4 = (C48632fD) this.A05.get();
                JSONObject A1G = AnonymousClass0x9.A1G();
                Iterator A0q = AnonymousClass000.A0q(A022);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    A1G.put(C18310x6.A0q(A0w), A0w.getValue());
                }
                r4.A01(A00(A1G.toString()));
                return true;
            } catch (JSONException e) {
                e = e;
                str = "FBCredentialsStore/storeFbIdentity/setPrefFbUserCredentialsEncrypted/JSONException";
                Log.e(str);
                C626936e.A0A(e);
                return false;
            }
        } catch (JSONException e2) {
            e = e2;
            str = "FBCredentialsStore/storeFbIdentity/getEntityAsJsonString/JSONException";
            Log.e(str);
            C626936e.A0A(e);
            return false;
        }
    }
}
