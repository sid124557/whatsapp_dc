package X;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7pa  reason: invalid class name and case insensitive filesystem */
public class C161417pa {
    public static C161417pa A02;
    public static final Lock A03 = new ReentrantLock();
    public final SharedPreferences A00;
    public final Lock A01 = new ReentrantLock();

    public GoogleSignInAccount A01() {
        String A032;
        Uri uri;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String A033 = A03("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A033) && (A032 = A03(AnonymousClass000.A0V(":", A033, AnonymousClass000.A0l("googleSignInAccount")))) != null) {
            try {
                String str6 = null;
                if (!TextUtils.isEmpty(A032)) {
                    JSONObject A1H = AnonymousClass0x9.A1H(A032);
                    String optString = A1H.optString("photoUrl");
                    if (!TextUtils.isEmpty(optString)) {
                        uri = Uri.parse(optString);
                    } else {
                        uri = null;
                    }
                    long parseLong = Long.parseLong(A1H.getString("expirationTime"));
                    HashSet A0K = AnonymousClass002.A0K();
                    JSONArray jSONArray = A1H.getJSONArray("grantedScopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        A0K.add(new Scope(1, jSONArray.getString(i)));
                    }
                    String optString2 = A1H.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (A1H.has("tokenId")) {
                        str = A1H.optString("tokenId");
                    } else {
                        str = null;
                    }
                    if (A1H.has("email")) {
                        str2 = A1H.optString("email");
                    } else {
                        str2 = null;
                    }
                    if (A1H.has(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME)) {
                        str3 = A1H.optString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
                    } else {
                        str3 = null;
                    }
                    if (A1H.has("givenName")) {
                        str4 = A1H.optString("givenName");
                    } else {
                        str4 = null;
                    }
                    if (A1H.has("familyName")) {
                        str5 = A1H.optString("familyName");
                    } else {
                        str5 = null;
                    }
                    String string = A1H.getString("obfuscatedIdentifier");
                    C162177rO.A05(string);
                    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(uri, optString2, str, str2, str3, (String) null, string, str4, str5, AnonymousClass002.A0J(A0K), 3, parseLong);
                    if (A1H.has("serverAuthCode")) {
                        str6 = A1H.optString("serverAuthCode");
                    }
                    googleSignInAccount.A06 = str6;
                    return googleSignInAccount;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions A02() {
        String A032;
        String str;
        Account account;
        String str2;
        String A033 = A03("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A033) && (A032 = A03(AnonymousClass000.A0V(":", A033, AnonymousClass000.A0l("googleSignInOptions")))) != null) {
            try {
                String str3 = null;
                if (!TextUtils.isEmpty(A032)) {
                    JSONObject A1H = AnonymousClass0x9.A1H(A032);
                    HashSet A0K = AnonymousClass002.A0K();
                    JSONArray jSONArray = A1H.getJSONArray("scopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        A0K.add(new Scope(1, jSONArray.getString(i)));
                    }
                    if (A1H.has("accountName")) {
                        str = A1H.optString("accountName");
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        account = new Account(str, "com.google");
                    } else {
                        account = null;
                    }
                    ArrayList A0J = AnonymousClass002.A0J(A0K);
                    boolean z = A1H.getBoolean("idTokenRequested");
                    boolean z2 = A1H.getBoolean("serverAuthRequested");
                    boolean z3 = A1H.getBoolean("forceCodeForRefreshToken");
                    if (A1H.has("serverClientId")) {
                        str2 = A1H.optString("serverClientId");
                    } else {
                        str2 = null;
                    }
                    if (A1H.has("hostedDomain")) {
                        str3 = A1H.optString("hostedDomain");
                    }
                    return new GoogleSignInOptions(account, str2, str3, (String) null, A0J, AnonymousClass001.A0t(), 3, z, z2, z3);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String A03(String str) {
        Lock lock = this.A01;
        lock.lock();
        try {
            return C18280x3.A0Z(this.A00, str);
        } finally {
            lock.unlock();
        }
    }

    public final void A04(String str, String str2) {
        Lock lock = this.A01;
        lock.lock();
        try {
            C18270x1.A0j(this.A00.edit(), str, str2);
        } finally {
            lock.unlock();
        }
    }

    public C161417pa(Context context) {
        this.A00 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C161417pa A00(Context context) {
        C162177rO.A02(context);
        Lock lock = A03;
        lock.lock();
        try {
            C161417pa r1 = A02;
            if (r1 == null) {
                r1 = new C161417pa(context.getApplicationContext());
                A02 = r1;
            }
            return r1;
        } finally {
            lock.unlock();
        }
    }
}
