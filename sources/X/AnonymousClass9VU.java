package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9VU  reason: invalid class name */
public class AnonymousClass9VU {
    public static final byte[] A04 = Base64.decode("l6AjIyMhJYdTCB0+urtee7k2HmerRdr4c6seZyY2Pmw=", 2);
    public static final byte[] A05 = Base64.decode("oHsO+vVXYHOZXitgkZS2DI9N4+L+klLpMby3+JOPVGo=", 2);
    public final C56612sH A00;
    public final AnonymousClass9T6 A01;
    public final C160757oG A02 = C160757oG.A00("PaymentsProviderKeyManager", "infra", "COMMON");
    public final AnonymousClass28X A03;

    public C67993Rl A00(AnonymousClass36K r15) {
        Long valueOf;
        byte[] bytes;
        String A0q = r15.A0q("key-type");
        String A0q2 = r15.A0q("provider");
        String A0q3 = r15.A0q("key-version");
        String A0q4 = r15.A0q("key-scope");
        byte[] bArr = null;
        String A0r = r15.A0r("expiry-ts", (String) null);
        if (!"none".equals(A0q)) {
            bArr = r15.A0m("data").A01;
        }
        if (TextUtils.isEmpty(A0r)) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(C615531h.A03(A0r));
        }
        C67993Rl r7 = new C67993Rl(valueOf, A0q2, A0q4, A0q, A0q3, bArr);
        if (!"DOC-UPLOAD".equals(A0q4) && !"DYI-REPORT".equals(A0q4)) {
            byte[] bArr2 = r15.A0m(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE).A01;
            C626936e.A06(bArr2);
            C72413dg r4 = new C72413dg(A04);
            byte[][] bArr3 = new byte[6][];
            bArr3[0] = r7.A05.getBytes();
            bArr3[1] = r7.A03.getBytes();
            bArr3[2] = r7.A04.getBytes();
            byte[] bArr4 = r7.A06;
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArr3[3] = bArr4;
            bArr3[4] = r7.A02.getBytes();
            Long l = r7.A01;
            if (l == null) {
                bytes = new byte[0];
            } else {
                bytes = String.valueOf(l).getBytes();
            }
            bArr3[5] = bytes;
            if (!C158317jm.A00().A01(r4.A01, AnonymousClass36A.A06(bArr3), bArr2)) {
                return null;
            }
        }
        return r7;
    }

    public C67993Rl A01(String str, String str2) {
        Long l;
        AnonymousClass9T6 r6 = this.A01;
        C67993Rl A012 = r6.A01(str, str2);
        if (A012 == null || (l = A012.A01) == null || l.longValue() * 1000 >= this.A00.A0H()) {
            return A012;
        }
        r6.A02(str, str2);
        return null;
    }

    public void A02(AnonymousClass34V r5, String str, String str2) {
        this.A01.A02(str, str2);
        AnonymousClass36K r0 = r5.A03;
        if (r0 != null) {
            try {
                C67993Rl A002 = A00(r0);
                if (A002 != null) {
                    A03(A002);
                }
            } catch (AnonymousClass24Y e) {
                C1899593h.A1G(this.A02, e, "handleStaleKey/failed to parse key node/exception: ", AnonymousClass001.A0o());
            }
        }
    }

    public void A03(C67993Rl r9) {
        AnonymousClass9T6 r4 = this.A01;
        String str = r9.A02;
        SharedPreferences.Editor edit = r4.A00().edit();
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("key_type", r9.A03).put("key_version", r9.A04);
            byte[] bArr = r9.A06;
            if (bArr != null) {
                A1G.put("key_data", Base64.encodeToString(bArr, 2));
            }
            Long l = r9.A01;
            if (l != null) {
                A1G.put("key_expiry", AnonymousClass000.A0P(l, "", AnonymousClass001.A0o()));
            }
            edit.putString(AnonymousClass000.A0V("::", str, AnonymousClass000.A0l(r9.A05)), A1G.toString());
            edit.apply();
        } catch (JSONException e) {
            C1899593h.A1G(r4.A01, e, "storeProviderKey threw ", AnonymousClass001.A0o());
        }
    }

    public AnonymousClass9VU(C56612sH r4, AnonymousClass9T6 r5, AnonymousClass28X r6) {
        this.A00 = r4;
        this.A03 = r6;
        this.A01 = r5;
    }
}
