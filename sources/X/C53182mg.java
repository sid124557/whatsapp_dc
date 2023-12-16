package X;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2mg  reason: invalid class name and case insensitive filesystem */
public class C53182mg {
    public final C55682qk A00;
    public final C57182tE A01;
    public final C50652iY A02;
    public final C48632fD A03;
    public final Set A04;

    public final Map A00() {
        String A0Z = C18280x3.A0Z(this.A03.A00(), "pref_fb_user_certs_encrypted");
        if (A0Z != null) {
            C46402bZ A002 = C57182tE.A00(A0Z);
            if (A002 == null) {
                C626936e.A0D(false, "null key data");
            } else {
                byte[] A012 = this.A02.A01(A002, C58172up.A0T);
                if (A012 != null) {
                    HashMap A0t = AnonymousClass001.A0t();
                    JSONObject A1H = AnonymousClass0x9.A1H(new String(A012, C58152un.A0D));
                    Iterator<String> keys = A1H.keys();
                    while (keys.hasNext()) {
                        String A0m = AnonymousClass001.A0m(keys);
                        A0t.put(new C50912iy(A0m), new C58842vu(A1H.getString(A0m)));
                    }
                    return A0t;
                }
            }
            C626936e.A0D(false, "null decrypt result");
        }
        return AnonymousClass001.A0t();
    }

    public C53182mg(C55682qk r1, C57182tE r2, C50652iY r3, C48632fD r4, Set set) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = set;
    }

    public void A01(C50912iy r2) {
        try {
            Map A002 = A00();
            A002.remove(r2);
            A02(A002);
        } catch (CertificateException | JSONException e) {
            C626936e.A0A(e);
        }
    }

    public final void A02(Map map) {
        byte[] A012;
        String str;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String str2 = ((C50912iy) A0w.getKey()).A00;
            C58842vu r6 = (C58842vu) A0w.getValue();
            A0t.put(str2, AnonymousClass0x9.A1G().put("e_cert", Base64.encodeToString(r6.A04.getEncoded(), 3)).put("s_cert", Base64.encodeToString(r6.A05.getEncoded(), 3)).put("ttl", r6.A00).put("ts", r6.A01).put("ppk", r6.A03).put("ppk_id", r6.A02).toString());
        }
        String A0d = C18280x3.A0d(A0t);
        C50652iY r4 = this.A02;
        Charset charset = C58152un.A0D;
        byte[] bytes = A0d.getBytes(charset);
        String str3 = C58172up.A0T;
        C46402bZ A002 = r4.A00(str3, bytes);
        if (A002 == null) {
            str = "null keyData";
        } else {
            String A003 = A002.A00();
            if (TextUtils.isEmpty(A003)) {
                str = "empty result";
            } else {
                C46402bZ A004 = C57182tE.A00(A003);
                if (A004 == null) {
                    C626936e.A0D(false, "null key data");
                    A012 = null;
                } else {
                    A012 = r4.A01(A004, str3);
                }
                if (!new String(A012, charset).equals(A0d)) {
                    C626936e.A0D(false, "decrypted does not match original");
                    this.A00.A0A("FbUserEntityCertificateCache/encryptAndStoreMap", true, "Failed to encrypt cert");
                    return;
                }
                C18270x1.A0j(this.A03.A00().edit(), "pref_fb_user_certs_encrypted", A003);
                return;
            }
        }
        C626936e.A0D(false, str);
    }
}
