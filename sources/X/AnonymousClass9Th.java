package X;

import android.content.SharedPreferences;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Th  reason: invalid class name */
public class AnonymousClass9Th {
    public final C56972sr A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final C40612Hb A03;
    public final AnonymousClass2YY A04;
    public final C29501iv A05;
    public final C29511iw A06;

    public void A00(AnonymousClass39R r10, C624134x r11) {
        C624034w r0 = r11.A0P;
        if (r0 != null) {
            String A022 = AnonymousClass36S.A02(r0.A03);
            if ("p2p".equals(A022) || "p2m".equals(A022)) {
                AnonymousClass2YY r6 = this.A04;
                boolean A1W = AnonymousClass000.A1W(r10);
                boolean z = r11 instanceof AnonymousClass1nE;
                synchronized (r6) {
                    AnonymousClass7WN r5 = r6.A01;
                    C161307pP A002 = r5.A00();
                    A002.A05++;
                    if (A1W) {
                        A002.A0A++;
                    }
                    if (z) {
                        A002.A0B++;
                        if (A1W) {
                            A002.A09++;
                        }
                    }
                    r5.A01(A002);
                }
            }
        }
    }

    public void A01(C95814uZ r8, String str, String str2, String str3, long j) {
        int A002 = this.A05.A00(r8.user, str2, str3, j);
        AnonymousClass2YY r1 = this.A04;
        AnonymousClass7WN r5 = r1.A01;
        C161307pP A003 = r5.A00();
        try {
            JSONArray A0f = C1899693i.A0f(A003);
            JSONObject A004 = r1.A00(r8.user, A0f);
            A004.put("business_owner_jid", r8.user);
            A004.put("biz_platform", str);
            A004.put("messages_viewed_count", A002);
            A0f.put(A004);
            C1899693i.A0s(r5, A003, A0f);
        } catch (JSONException unused) {
            Log.e("PaymentDailyUsageSync/onQrCodeReceived Error building json payload.");
            C1899693i.A0s(r5, A003, new JSONArray());
        }
    }

    public void A02(C624134x r10) {
        C624034w r0;
        if (!r10.A1J.A02 && (r0 = r10.A0P) != null && r0.A0D == C56972sr.A04(this.A00)) {
            C624134x A0w = r10.A0w();
            if (!(A0w instanceof AnonymousClass1nE)) {
                A0w = null;
            }
            AnonymousClass2YY r6 = this.A04;
            boolean z = true;
            boolean A1W = AnonymousClass000.A1W(r10.A0P.A05());
            if (A0w == null) {
                z = false;
            }
            synchronized (r6) {
                AnonymousClass7WN r5 = r6.A01;
                C161307pP A002 = r5.A00();
                A002.A04++;
                if (A1W) {
                    A002.A07++;
                }
                if (z) {
                    A002.A08++;
                    if (A1W) {
                        A002.A06++;
                    }
                }
                r5.A01(A002);
            }
        }
    }

    public void A03(String str, String str2, String str3, int i) {
        String str4;
        try {
            C40612Hb r0 = this.A03;
            C18260x0.A0O(str, str2);
            C60152y5 r2 = r0.A00;
            SharedPreferences A032 = r2.A03("hybrid_payment_methods_used");
            C162457s7.A0D(A032);
            String A0Z = C18280x3.A0Z(A032, str);
            if (A0Z == null) {
                A0Z = "{}";
            }
            JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
            if (A1H.has(str2)) {
                i = A1H.getInt(str2) + 1;
            }
            A1H.put(str2, i);
            SharedPreferences A033 = r2.A03("hybrid_payment_methods_used");
            C162457s7.A0D(A033);
            C18270x1.A0e(A033.edit(), A1H, str);
            AnonymousClass7WN r3 = this.A04.A01;
            C161307pP A002 = r3.A00();
            try {
                JSONArray A0f = C1899693i.A0f(A002);
                int i2 = 0;
                while (i2 < A0f.length()) {
                    if (!str.equals(((JSONObject) A0f.get(i2)).optString("business_owner_jid"))) {
                        i2++;
                    } else if (i2 != -1) {
                        JSONObject jSONObject = (JSONObject) A0f.get(i2);
                        A0f.remove(i2);
                        Iterator<String> keys = A1H.keys();
                        int i3 = 0;
                        while (keys.hasNext()) {
                            i3 += A1H.getInt(AnonymousClass001.A0m(keys));
                        }
                        if (str3.equals("VPA")) {
                            str4 = "vpa_successful_transactions_count";
                        } else {
                            str4 = "successful_transactions_count";
                        }
                        jSONObject.put(str4, i3);
                        jSONObject.put("payment_method_used", A1H);
                        A0f.put(jSONObject);
                        C1899693i.A0s(r3, A002, A0f);
                        return;
                    } else {
                        return;
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentDailyUsageSync/onTransactionSuccess Error building json payload.");
                C1899693i.A0s(r3, A002, new JSONArray());
            }
        } catch (Exception unused2) {
            Log.e("PaymentDailyUsageManager/onTransactionSuccess error updating transaction count.");
        }
    }

    public AnonymousClass9Th(C56972sr r1, C56612sH r2, AnonymousClass1VX r3, C40612Hb r4, AnonymousClass2YY r5, C29501iv r6, C29511iw r7) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r5;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
    }

    public final boolean A04(C55722qo r11, String str, String str2, String str3, long j) {
        Set set;
        Set set2;
        Set set3;
        SharedPreferences A022 = r11.A02();
        C72063d7 r3 = C72063d7.A00;
        Set<String> stringSet = A022.getStringSet(str, r3);
        if (stringSet == null || (set = C73723fy.A0P(stringSet)) == null) {
            set = r3;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            C162457s7.A0J(A0m, 0);
            Set<String> stringSet2 = r11.A01().getStringSet(A0m, r3);
            if (stringSet2 == null || (set2 = C73723fy.A0P(stringSet2)) == null) {
                set2 = r3;
            }
            Iterator it2 = set2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    JSONObject A042 = r11.A04(AnonymousClass001.A0m(it2));
                    if (A042 != null) {
                        try {
                            if (str.equals(A042.getString("handle"))) {
                                if (this.A01.A0H() < A042.getLong("ts") + j) {
                                    Set<String> stringSet3 = r11.A03().getStringSet(A0m, r3);
                                    if (stringSet3 == null || (set3 = C73723fy.A0P(stringSet3)) == null) {
                                        set3 = r3;
                                    }
                                    HashSet hashSet = new HashSet(set3);
                                    hashSet.add(str2);
                                    r11.A03().edit().putStringSet(A0m, hashSet).apply();
                                    A03(A0m, SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, str3, hashSet.size());
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        } catch (Exception unused) {
                            Log.e("PaymentDailyUsageManager/checkAndUpdateTransactionCount Error in getting handle.");
                        }
                    }
                }
            }
        }
        return false;
    }
}
