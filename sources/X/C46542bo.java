package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2bo  reason: invalid class name and case insensitive filesystem */
public class C46542bo {
    public final C56612sH A00;
    public final C56142rU A01;
    public final C41582Ku A02;
    public final AnonymousClass2YD A03;
    public final AnonymousClass31C A04;

    public void A00(boolean z) {
        SharedPreferences sharedPreferences;
        String string;
        String str;
        AnonymousClass31C r6 = this.A04;
        String A032 = r6.A03();
        C56142rU r4 = this.A01;
        synchronized (r4) {
            sharedPreferences = r4.A00;
            string = sharedPreferences.getString("ab_props:sys:config_hash", (String) null);
        }
        if (string == null || z) {
            str = "";
        } else {
            synchronized (r4) {
                str = sharedPreferences.getString("ab_props:sys:config_hash", (String) null);
            }
        }
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        r2[0] = new AnonymousClass39V("protocol", 1);
        AnonymousClass39V.A0B("hash", str, r2, 1);
        AnonymousClass36K A0I = AnonymousClass36K.A0I("props", r2);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0E(A1W, 0);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A1W, 1);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W, 2);
        r6.A0K(new AnonymousClass4KQ(this, 8), AnonymousClass36K.A0E(A0I, "xmlns", "abt", A1W), A032, 220, 32000);
    }

    public C46542bo(C56612sH r1, C56142rU r2, C41582Ku r3, AnonymousClass2YD r4, AnonymousClass31C r5) {
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
    }
}
