package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: X.30e  reason: invalid class name and case insensitive filesystem */
public class C613130e {
    public static final long A0F = TimeUnit.SECONDS.toMillis(35);
    public static final long[] A0G;
    public SharedPreferences A00;
    public boolean A01;
    public final C55682qk A02;
    public final C69263Wi A03;
    public final C49712gy A04;
    public final C29441ip A05;
    public final C56612sH A06;
    public final C57182tE A07;
    public final C50652iY A08;
    public final AnonymousClass1VX A09;
    public final C60152y5 A0A;
    public final AnonymousClass2P5 A0B;
    public final AnonymousClass4FS A0C;
    public final List A0D = AnonymousClass0x9.A18();
    public volatile String A0E;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        A0G = new long[]{timeUnit.toMillis(6), timeUnit.toMillis(12), timeUnit2.toMillis(1), timeUnit2.toMillis(1), timeUnit2.toMillis(3), timeUnit2.toMillis(7)};
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A0A.A03(C58152un.A0A);
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public final String A02(String str) {
        byte[] A012;
        try {
            C46402bZ A002 = C57182tE.A00(str);
            if (A002 == null || (A012 = this.A08.A01(A002, C58172up.A0T)) == null) {
                return null;
            }
            return new String(A012, C58152un.A0D);
        } catch (JSONException e) {
            Log.w("TwoFactorAuthManager/decryptCode/cannot create Json", e);
            return null;
        }
    }

    public String A01() {
        if (this.A0E == null) {
            synchronized (this) {
                if (this.A0E == null) {
                    String string = A00().getString("two_factor_auth_code", (String) null);
                    String str = "";
                    if (string == null) {
                        this.A0E = str;
                    } else {
                        boolean z = A00().getBoolean("two_factor_auth_using_encryption", false);
                        if (!z || (string = A02(string)) != null) {
                            str = string;
                        } else {
                            this.A02.A0A("TwoFactorAuthManager/loadCodeInMemory/EncryptedCodeFailure", false, (String) null);
                        }
                        this.A0E = str;
                        C18260x0.A1E("TwoFactorAuthManager/loadCodeInMemory/isUsingEncryption: ", AnonymousClass001.A0o(), z);
                    }
                }
            }
        }
        String str2 = this.A0E;
        C626936e.A06(str2);
        return str2;
    }

    public void A04(String str, String str2) {
        if (!this.A05.A0F()) {
            Log.i("TwoFactorAuthManager/setTwoFactorAuthSettings/no internet connection, cancelling");
            this.A03.BkS(new C117095rN(this, 17));
            return;
        }
        Log.i("TwoFactorAuthManager/setTwoFactorAuthSettings");
        AnonymousClass2P5 r4 = this.A0B;
        AnonymousClass31C r9 = r4.A01;
        String A032 = r9.A03();
        C18260x0.A0s("TwoFactorXmppMethods/sendSetTwoFactorAuth; iq=", A032, AnonymousClass001.A0o());
        ArrayList A0I = AnonymousClass002.A0I(2);
        String str3 = str;
        if (str != null) {
            AnonymousClass36K.A0P("code", str3, A0I);
        }
        String str4 = str2;
        if (str2 != null) {
            AnonymousClass36K.A0P("email", str4, A0I);
        }
        AnonymousClass36K A0J = AnonymousClass36K.A0J("2fa", (AnonymousClass39V[]) null, C18280x3.A1a(A0I, 0));
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0E(A1W, 0);
        AnonymousClass39V.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
        AnonymousClass39V.A0B("xmlns", "urn:xmpp:whatsapp:account", A1W, 2);
        r9.A0K(new C68263Sm(r4, str3, str4), AnonymousClass36K.A0E(A0J, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W), A032, 111, 32000);
    }

    public C613130e(C55682qk r2, C69263Wi r3, C49712gy r4, C29441ip r5, C56612sH r6, C57182tE r7, C50652iY r8, AnonymousClass1VX r9, C60152y5 r10, AnonymousClass2P5 r11, AnonymousClass4FS r12) {
        this.A06 = r6;
        this.A09 = r9;
        this.A03 = r3;
        this.A02 = r2;
        this.A0C = r12;
        this.A07 = r7;
        this.A04 = r4;
        this.A0B = r11;
        this.A08 = r8;
        this.A0A = r10;
        this.A05 = r5;
    }

    public void A03(String str, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TwoFactorAuthManager/onAuthSettingsError errorCode [");
        A0o.append(i);
        A0o.append("] errorMessage [");
        A0o.append(str);
        C18260x0.A1M(A0o, "]");
        for (C84674Dg Bel : this.A0D) {
            Bel.Bel(i);
        }
    }

    public void A05(boolean z) {
        int max;
        int i = A00().getInt("two_factor_auth_nag_interval", 0);
        if (z) {
            max = Math.min(i + 1, 5);
        } else {
            max = Math.max(i - 1, 0);
        }
        C18270x1.A0l(A00().edit().putLong("two_factor_auth_nag_time", this.A06.A0H()).putInt("two_factor_auth_nag_interval", max), "two_factor_auth_last_code_correctness", z);
    }

    public boolean A06() {
        long j;
        if (!(!A01().isEmpty())) {
            return false;
        }
        long A0A2 = AnonymousClass0x2.A0A(A00(), "two_factor_auth_nag_time");
        C56612sH r6 = this.A06;
        long A0H = r6.A0H();
        AnonymousClass1VX r2 = this.A09;
        C58422vE r1 = C58422vE.A02;
        if (r2.A0Y(r1, 5571)) {
            j = TimeUnit.DAYS.toMillis((long) r2.A0O(r1, 5595));
        } else {
            j = A0G[Math.min(5, A00().getInt("two_factor_auth_nag_interval", 0))];
        }
        boolean A1W = AnonymousClass001.A1W((A0H > (j + A0A2) ? 1 : (A0H == (j + A0A2) ? 0 : -1)));
        boolean z = A00().getBoolean("two_factor_auth_last_code_correctness", false);
        boolean z2 = false;
        if (r6.A0H() < A0A2) {
            z2 = true;
            Log.w("TwoFactorAuthManager/clock-moved-back");
        }
        if (A1W || !z || z2) {
            return true;
        }
        return false;
    }
}
