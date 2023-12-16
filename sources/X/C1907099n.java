package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99n  reason: invalid class name and case insensitive filesystem */
public class C1907099n extends C54902pT {
    public final C56422rx A00;
    public final C1906899l A01;

    public C1907099n(C66663Mh r8, C56422rx r9, C56612sH r10, AnonymousClass1VX r11, C1906899l r12, C620933l r13, C153087ae r14, C385127z r15) {
        super(r8, r10, r11, r13, r14, r15);
        this.A01 = r12;
        this.A00 = r9;
    }

    public int A07(String str, boolean z) {
        C620933l r3 = this.A03;
        if (!r3.A03().getBoolean("pref_dogfooding_enabled", false) || r3.A03().getBoolean("pref_mocking_enabled", false)) {
            String A02 = C621333r.A02(str);
            Set<C161357pU> set = (Set) AnonymousClass9M4.A00.get(C161357pU.A01(A02));
            C153087ae r4 = this.A04;
            C161357pU A022 = r4.A02();
            if (set == null || A022 == null) {
                return 1;
            }
            for (C161357pU r0 : set) {
                if (r0.A03.equals(A022.A03)) {
                    r4.A02();
                    return (!z || !"91".equals(A02) || this.A02.A0X(5415)) ? 2 : 1;
                }
            }
            return 1;
        }
        return 2;
    }

    public boolean A0C() {
        return A03(1) && this.A02.A0X(1586);
    }

    public boolean A09() {
        if (C161357pU.A0F != this.A04.A02()) {
            return false;
        }
        C1906899l r1 = this.A01;
        if (r1.A0E() || r1.A0D()) {
            return true;
        }
        return false;
    }

    public boolean A0B() {
        String A0Q = this.A02.A0Q(3690);
        if (A0Q == null || A0Q.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean A0D() {
        if (!this.A00.A08(C66663Mh.A0b) || !this.A02.A0X(3461)) {
            return false;
        }
        return true;
    }

    public boolean A0F() {
        if (!this.A04.A04() || !this.A00.A08(C66663Mh.A0b) || !this.A02.A0X(1158)) {
            return false;
        }
        return true;
    }

    public boolean A0G() {
        JSONObject A0S = this.A02.A0S(4252);
        if (A0S.has("buyer_ed_order_content_update_enabled")) {
            try {
                if (A0S.getInt("buyer_ed_order_content_update_enabled") == 1) {
                    return true;
                }
            } catch (JSONException e) {
                Log.e("failed to parse config for ab prop BR_BUYER_ED_CAPABILITIES_CODE#isUpdateOrderContentEnabled", e);
            }
        }
        return false;
    }

    public boolean A0I(C95814uZ r4, String str, String str2) {
        C55502qS A002;
        if (!this.A02.A0X(4924) || r4 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str2.equals("GALLERY_QR_CODE") || A09() || (A002 = this.A00.A00(AnonymousClass32Y.A03(r4))) == null) {
            return false;
        }
        if (A002.A02() || A002.A03()) {
            return true;
        }
        return false;
    }

    public boolean A0J(String str) {
        JSONObject A0S = this.A02.A0S(5944);
        if (A0S.has(str)) {
            try {
                if (A0S.getInt(str) == 1) {
                    return true;
                }
            } catch (JSONException e) {
                Log.e(AnonymousClass000.A0V("failed to parse config for ab prop BR_BUYER_AWARENESS_EXPERIENCES_CODE#", str, AnonymousClass001.A0o()), e);
            }
        }
        return false;
    }

    public boolean A0L(String str, List list) {
        AnonymousClass1VX r1 = this.A02;
        if (r1.A0X(3740)) {
            String A0Q = r1.A0Q(3885);
            if (!TextUtils.isEmpty(A0Q)) {
                List A0t = C18310x6.A0t(A0Q);
                Iterator it = A0t.iterator();
                while (it.hasNext()) {
                    if (AnonymousClass000.A0V("payment_gateway:", AnonymousClass001.A0m(it), AnonymousClass001.A0o()).equals(str)) {
                        return true;
                    }
                }
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass394 r0 = (AnonymousClass394) it2.next();
                        C85184Fg r2 = r0.A00;
                        if (r2 != null && r0.A01.equals("payment_gateway")) {
                            return A0t.contains(((AnonymousClass3SO) r2).A01);
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean A0M(List list) {
        if (!this.A02.A0X(4295) || list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass394 r1 = (AnonymousClass394) it.next();
            if (r1.A00 != null && r1.A01.equals("payment_link")) {
                return true;
            }
        }
        return false;
    }

    public int A04(C95814uZ r4) {
        String A002;
        ArrayList A0s;
        String A02 = C621333r.A02(AnonymousClass36P.A06(r4));
        if (A02 == null || (A002 = C106675Zy.A00(A02)) == null) {
            return 2;
        }
        String A0Q = this.A02.A0Q(3690);
        if (!TextUtils.isEmpty(A0Q)) {
            A0s = AnonymousClass0x2.A0i(A0Q.split(","));
        } else {
            A0s = AnonymousClass001.A0s();
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            if (AnonymousClass001.A0m(it).equals(A002)) {
                return 1;
            }
        }
        return 2;
    }

    public int A05(UserJid userJid) {
        C55502qS A002;
        boolean z;
        String A06 = AnonymousClass36P.A06(userJid);
        C56422rx r1 = this.A00;
        C55502qS A003 = r1.A00(userJid);
        if ((A003 == null || !A003.A03()) && ((A002 = r1.A00(userJid)) == null || !A002.A02())) {
            z = false;
        } else {
            z = true;
        }
        return A07(A06, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A06(java.lang.String r3) {
        /*
            r2 = this;
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A08(r3)
            X.2rx r0 = r2.A00
            X.2qS r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.A03()
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            int r0 = r2.A07(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907099n.A06(java.lang.String):int");
    }

    public Map A08() {
        HashMap A0t = AnonymousClass001.A0t();
        String A0Q = this.A02.A0Q(2351);
        if (!TextUtils.isEmpty(A0Q)) {
            try {
                JSONArray optJSONArray = AnonymousClass0x9.A1H(A0Q).optJSONArray("psp_list");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        String optString2 = jSONObject.optString("display_name");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            A0t.put(optString, optString2);
                        }
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentsGatingManager/getP2mLitePspMap can't construct psp json map from abprops");
            }
        }
        return A0t;
    }

    public boolean A0A() {
        if (!A0C() || !this.A02.A0X(1746)) {
            return false;
        }
        return true;
    }

    public boolean A0E() {
        if (C1899693i.A0x(this)) {
            C161357pU r1 = C161357pU.A0E;
            C153087ae r2 = this.A04;
            if (r1 == r2.A02() && A0F()) {
                return true;
            }
            if (C161357pU.A0F == r2.A02() && this.A02.A0X(733)) {
                return true;
            }
        }
        C161357pU r12 = C161357pU.A0E;
        C153087ae r22 = this.A04;
        if ((r12 == r22.A02() || C161357pU.A0F == r22.A02()) && this.A02.A0X(888)) {
            return true;
        }
        return false;
    }

    public boolean A0H() {
        if (!A01()) {
            return false;
        }
        C620933l r3 = this.A03;
        if (r3.A03().getBoolean("has_p2mlite_account", false) || r3.A03().getBoolean("has_p2mlite_transactions", false)) {
            return true;
        }
        return false;
    }

    public boolean A0K(String str) {
        if (!TextUtils.isEmpty(str)) {
            return A08().containsKey(str);
        }
        return false;
    }
}
