package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2qo  reason: invalid class name and case insensitive filesystem */
public abstract class C55722qo {
    public final C60152y5 A00;
    public final String A01;

    public C55722qo(C60152y5 r2, String str) {
        C162457s7.A0J(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public final JSONObject A04(String str) {
        C162457s7.A0J(str, 0);
        try {
            return AnonymousClass0x9.A1H(str);
        } catch (JSONException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(this.A01);
            C18260x0.A1K(A0o, "/toJsonObject Error building json object.");
            return null;
        }
    }

    public SharedPreferences A01() {
        if (this instanceof C29511iw) {
            C29511iw r2 = (C29511iw) this;
            SharedPreferences sharedPreferences = r2.A00;
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            SharedPreferences A03 = r2.A00.A03("vpa_daily_prefs");
            r2.A00 = A03;
            if (A03 != null) {
                return A03;
            }
            throw C18290x4.A0Y();
        }
        C29501iv r22 = (C29501iv) this;
        SharedPreferences sharedPreferences2 = r22.A00;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        SharedPreferences A032 = r22.A00.A03("qr_code_daily_prefs");
        r22.A00 = A032;
        return A032;
    }

    public SharedPreferences A02() {
        if (this instanceof C29511iw) {
            C29511iw r2 = (C29511iw) this;
            SharedPreferences sharedPreferences = r2.A01;
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            SharedPreferences A03 = r2.A00.A03("vpa_payment_handle_prefs");
            r2.A01 = A03;
            if (A03 != null) {
                return A03;
            }
            throw C18290x4.A0Y();
        }
        C29501iv r22 = (C29501iv) this;
        SharedPreferences sharedPreferences2 = r22.A01;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        SharedPreferences A032 = r22.A00.A03("payment_handle_prefs");
        r22.A01 = A032;
        return A032;
    }

    public SharedPreferences A03() {
        if (this instanceof C29511iw) {
            C29511iw r2 = (C29511iw) this;
            SharedPreferences sharedPreferences = r2.A02;
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            SharedPreferences A03 = r2.A00.A03("vpa_txn_prefs");
            r2.A02 = A03;
            if (A03 != null) {
                return A03;
            }
            throw C18290x4.A0Y();
        }
        C29501iv r22 = (C29501iv) this;
        SharedPreferences sharedPreferences2 = r22.A02;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        SharedPreferences A032 = r22.A00.A03("qr_code_txn_prefs");
        r22.A02 = A032;
        return A032;
    }

    public final int A00(String str, String str2, String str3, long j) {
        Set set;
        Set set2;
        C18260x0.A0O(str, str2);
        C162457s7.A0J(str3, 3);
        SharedPreferences A012 = A01();
        C72063d7 r3 = C72063d7.A00;
        Set<String> stringSet = A012.getStringSet(str, r3);
        if (stringSet == null || (set = C73723fy.A0P(stringSet)) == null) {
            set = r3;
        }
        HashSet A15 = AnonymousClass0x9.A15(set);
        Iterator it = A15.iterator();
        String str4 = null;
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            JSONObject A04 = A04(A0m);
            if (A04 != null) {
                try {
                    if (C162457s7.A0P(A04.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), str2)) {
                        str4 = A0m;
                    }
                } catch (Exception unused) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(this.A01);
                    C18260x0.A1K(A0o, "/updateDailyMessageMetadata Error in getting id.");
                }
            }
        }
        if (!(str4 == null || str4.length() == 0)) {
            AnonymousClass360.A00(A15).remove(str4);
        }
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
            A1G.put("ts", j);
            String A0y = AnonymousClass0x9.A0y(str3, "handle", A1G);
            if (A0y != null) {
                A15.add(A0y);
            }
        } catch (JSONException unused2) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append(this.A01);
            C18260x0.A1K(A0o2, "/toJsonString Error building json payload.");
        }
        C18300x5.A15(A01().edit(), str, A15);
        Set<String> stringSet2 = A02().getStringSet(str3, r3);
        if (stringSet2 == null || (set2 = C73723fy.A0P(stringSet2)) == null) {
            set2 = r3;
        }
        HashSet A152 = AnonymousClass0x9.A15(set2);
        A152.add(str);
        C18300x5.A15(A02().edit(), str3, A152);
        return A15.size();
    }

    public final void A05() {
        C18270x1.A0m(A01());
        C18270x1.A0m(A02());
        C18270x1.A0m(A03());
    }
}
