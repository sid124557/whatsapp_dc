package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass000;
import X.AnonymousClass0WA;
import X.AnonymousClass0x9;
import X.AnonymousClass6C9;
import X.AnonymousClass80R;
import X.AnonymousClass8NR;
import X.C003203q;
import X.C157437iI;
import X.C161417pa;
import X.C162177rO;
import X.C18330xA;
import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
public class SignInHubActivity extends C003203q {
    public static boolean A05;
    public int A00;
    public Intent A01;
    public SignInConfiguration A02;
    public boolean A03 = false;
    public boolean A04;

    public final void A5e(int i) {
        Status status = new Status(i, (String) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        A05 = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        RuntimeException runtimeException;
        if (!this.A03) {
            setResult(0);
            if (i == 40962) {
                int i3 = 8;
                Intent intent2 = intent;
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent2.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.A00) != null) {
                        C157437iI A002 = C157437iI.A00(this);
                        GoogleSignInOptions googleSignInOptions = this.A02.A00;
                        synchronized (A002) {
                            C161417pa r5 = A002.A02;
                            C162177rO.A02(googleSignInOptions);
                            String str = googleSignInAccount.A07;
                            r5.A04("defaultGoogleSignInAccount", str);
                            C162177rO.A02(googleSignInOptions);
                            String A0V = AnonymousClass000.A0V(":", str, AnonymousClass000.A0l("googleSignInAccount"));
                            JSONObject A1G = AnonymousClass0x9.A1G();
                            try {
                                String str2 = googleSignInAccount.A02;
                                if (str2 != null) {
                                    A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                                }
                                String str3 = googleSignInAccount.A03;
                                if (str3 != null) {
                                    A1G.put("tokenId", str3);
                                }
                                String str4 = googleSignInAccount.A04;
                                if (str4 != null) {
                                    A1G.put("email", str4);
                                }
                                String str5 = googleSignInAccount.A05;
                                if (str5 != null) {
                                    A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str5);
                                }
                                String str6 = googleSignInAccount.A08;
                                if (str6 != null) {
                                    A1G.put("givenName", str6);
                                }
                                String str7 = googleSignInAccount.A09;
                                if (str7 != null) {
                                    A1G.put("familyName", str7);
                                }
                                Uri uri = googleSignInAccount.A01;
                                if (uri != null) {
                                    A1G.put("photoUrl", uri.toString());
                                }
                                String str8 = googleSignInAccount.A06;
                                if (str8 != null) {
                                    A1G.put("serverAuthCode", str8);
                                }
                                A1G.put("expirationTime", googleSignInAccount.A00);
                                A1G.put("obfuscatedIdentifier", str);
                                JSONArray A1F = AnonymousClass0x9.A1F();
                                List list = googleSignInAccount.A0A;
                                Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
                                Arrays.sort(scopeArr, AnonymousClass8NR.A00);
                                for (Scope scope : scopeArr) {
                                    A1F.put(scope.A01);
                                }
                                A1G.put("grantedScopes", A1F);
                                A1G.remove("serverAuthCode");
                                r5.A04(A0V, A1G.toString());
                                String A0V2 = AnonymousClass000.A0V(":", str, AnonymousClass000.A0l("googleSignInOptions"));
                                JSONObject A1G2 = AnonymousClass0x9.A1G();
                                try {
                                    JSONArray A1F2 = AnonymousClass0x9.A1F();
                                    ArrayList arrayList = googleSignInOptions.A08;
                                    Collections.sort(arrayList, GoogleSignInOptions.A0B);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        A1F2.put(((Scope) it.next()).A01);
                                    }
                                    A1G2.put("scopes", A1F2);
                                    Account account = googleSignInOptions.A00;
                                    if (account != null) {
                                        A1G2.put("accountName", account.name);
                                    }
                                    A1G2.put("idTokenRequested", googleSignInOptions.A06);
                                    A1G2.put("forceCodeForRefreshToken", googleSignInOptions.A0A);
                                    A1G2.put("serverAuthRequested", googleSignInOptions.A09);
                                    String str9 = googleSignInOptions.A01;
                                    if (!TextUtils.isEmpty(str9)) {
                                        A1G2.put("serverClientId", str9);
                                    }
                                    String str10 = googleSignInOptions.A02;
                                    if (!TextUtils.isEmpty(str10)) {
                                        A1G2.put("hostedDomain", str10);
                                    }
                                    r5.A04(A0V2, A1G2.toString());
                                    A002.A00 = googleSignInAccount;
                                    A002.A01 = googleSignInOptions;
                                } catch (JSONException e) {
                                    runtimeException = C18330xA.A09(e);
                                    throw runtimeException;
                                }
                            } catch (JSONException e2) {
                                runtimeException = C18330xA.A09(e2);
                                throw runtimeException;
                            }
                        }
                        intent2.removeExtra("signInAccount");
                        intent2.putExtra("googleSignInAccount", googleSignInAccount);
                        this.A04 = true;
                        this.A00 = i2;
                        this.A01 = intent2;
                        AnonymousClass0WA.A00(this).A03(new AnonymousClass80R(this));
                        A05 = false;
                        return;
                    } else if (intent2.hasExtra("errorCode") && (i3 = intent2.getIntExtra("errorCode", 8)) == 13) {
                        i3 = 12501;
                    }
                }
                A5e(i3);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        String packageName;
        int i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            i = 12500;
        } else {
            boolean equals = action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN");
            if (equals || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                Bundle bundleExtra = intent.getBundleExtra("config");
                bundleExtra.getClass();
                SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
                if (signInConfiguration == null) {
                    Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                    setResult(0);
                } else {
                    this.A02 = signInConfiguration;
                    if (bundle != null) {
                        boolean z = bundle.getBoolean("signingInGoogleApiClients");
                        this.A04 = z;
                        if (z) {
                            this.A00 = bundle.getInt("signInResultCode");
                            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                            intent2.getClass();
                            this.A01 = intent2;
                            AnonymousClass0WA.A00(this).A03(new AnonymousClass80R(this));
                            A05 = false;
                            return;
                        }
                        return;
                    } else if (A05) {
                        setResult(0);
                        i = 12502;
                    } else {
                        A05 = true;
                        Intent A09 = AnonymousClass0x9.A09(action);
                        if (equals) {
                            packageName = "com.google.android.gms";
                        } else {
                            packageName = getPackageName();
                        }
                        A09.setPackage(packageName);
                        A09.putExtra("config", this.A02);
                        try {
                            startActivityForResult(A09, 40962);
                            return;
                        } catch (ActivityNotFoundException unused) {
                            this.A03 = true;
                            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                            A5e(17);
                            return;
                        }
                    }
                }
            } else {
                AnonymousClass6C9.A14("Unknown action: ", String.valueOf(intent.getAction()), "AuthSignInClient");
            }
            finish();
            return;
        }
        A5e(i);
    }

    public final void onDestroy() {
        super.onDestroy();
        A05 = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.A04);
        if (this.A04) {
            bundle.putInt("signInResultCode", this.A00);
            bundle.putParcelable("signInResultData", this.A01);
        }
    }
}
