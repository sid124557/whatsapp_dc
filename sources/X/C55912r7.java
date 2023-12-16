package X;

import android.content.SharedPreferences;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2r7  reason: invalid class name and case insensitive filesystem */
public class C55912r7 {
    public final Handler A00 = AnonymousClass000.A0A();
    public final C69263Wi A01;
    public final C29441ip A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass31C A04;
    public final AnonymousClass3S3 A05;
    public final Runnable A06;
    public final Map A07 = AnonymousClass0x7.A0y();
    public final Set A08 = C18320x8.A0u();

    public static void A00(C55912r7 r3) {
        r3.A01.BkS(new C70043Zq(r3, 5));
    }

    public int A01(String str) {
        AnonymousClass33p r0 = this.A03;
        int i = AnonymousClass0x2.A0F(r0).getInt(AnonymousClass35B.A01(str), 0);
        AnonymousClass2ES r02 = (AnonymousClass2ES) this.A07.get(str);
        if (r02 != null) {
            i = AnonymousClass35B.A00(r02.A00);
        }
        return Math.max(0, i);
    }

    public void A02(C46112b6 r13) {
        C68183Se r6 = new C68183Se(new AnonymousClass2JH(this, r13), this.A04);
        Log.i("PrivacySettingsProtocolHelper/sendGetPrivacySettingsRequest");
        AnonymousClass31C r5 = r6.A01;
        String A032 = r5.A03();
        AnonymousClass36K A0I = AnonymousClass36K.A0I("privacy", (AnonymousClass39V[]) null);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        A1W[0] = AnonymousClass39V.A00();
        AnonymousClass39V.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
        AnonymousClass39V.A06("xmlns", "privacy", A1W);
        r5.A0K(r6, AnonymousClass36K.A0E(A0I, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A1W), A032, 70, 0);
    }

    public void A03(String str, String str2) {
        String str3 = str2;
        String str4 = str;
        this.A07.put(str4, new AnonymousClass2ES(str3));
        C68183Se r9 = new C68183Se(new AnonymousClass2JH(this, (C46112b6) null), this.A04);
        C162457s7.A0J(str4, 0);
        Log.i("PrivacySettingsProtocolHelper/sendSetPrivacySettingsRequest");
        AnonymousClass31C r8 = r9.A01;
        String A032 = r8.A03();
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str4, r2, 0);
        int A0G = AnonymousClass39V.A0G("value", str3, r2);
        AnonymousClass36K[] r1 = new AnonymousClass36K[A0G];
        AnonymousClass36K.A0U("category", r2, r1, 0);
        AnonymousClass36K A0J = AnonymousClass36K.A0J("privacy", (AnonymousClass39V[]) null, r1);
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0E(A1W, 0);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W, A0G);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W, 2);
        r8.A0K(r9, AnonymousClass36K.A0E(A0J, "xmlns", "privacy", A1W), A032, 69, 0);
        A00(this);
    }

    public boolean A05(String str, String str2) {
        if (!this.A02.A0F()) {
            this.A01.A0I(R.string.f11nameremoved, 0);
            return false;
        }
        A03(str, str2);
        Handler handler = this.A00;
        Runnable runnable = this.A06;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 20000);
        return true;
    }

    public C55912r7(C69263Wi r3, C29441ip r4, AnonymousClass33p r5, AnonymousClass31C r6, AnonymousClass3S3 r7) {
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
        this.A02 = r4;
        this.A06 = new C70173a4(r3, 25, this);
    }

    public void A04(Map map) {
        boolean equals;
        AnonymousClass33p r3;
        SharedPreferences A0F;
        String str;
        Iterator A0q = AnonymousClass000.A0q(map);
        boolean z = false;
        boolean z2 = false;
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String A0q2 = C18310x6.A0q(A0w);
            String A12 = AnonymousClass0x9.A12(A0w);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("settingsprivacy/received ");
            A0o.append(A0q2);
            C18260x0.A0s(":", A12, A0o);
            int A002 = AnonymousClass35B.A00(A12);
            if (A002 < 0 || (!(equals = "online".equals(A0q2)) ? !(A002 != 3 ? A002 != 4 : "status".equals(A0q2) || "groupadd".equals(A0q2) || "last".equals(A0q2) || "profile".equals(A0q2)) : !(A002 == 0 || A002 == 4))) {
                this.A07.remove(A0q2);
                z = true;
            } else {
                Map map2 = this.A07;
                AnonymousClass2ES r0 = (AnonymousClass2ES) map2.get(A0q2);
                if (r0 == null || r0.A00.equals(A12)) {
                    map2.remove(A0q2);
                    if ("last".equals(A0q2)) {
                        r3 = this.A03;
                        A0F = AnonymousClass0x2.A0F(r3);
                        str = "privacy_last_seen";
                    } else if (equals) {
                        r3 = this.A03;
                        A0F = AnonymousClass0x2.A0F(r3);
                        str = "privacy_online";
                    } else if ("readreceipts".equals(A0q2)) {
                        AnonymousClass33p r1 = this.A03;
                        C18270x1.A0l(C18270x1.A03(r1), "read_receipts_enabled", "all".contentEquals(A12));
                    } else {
                        try {
                            C18260x0.A0L(this.A03, AnonymousClass35B.A01(A0q2), A002);
                        } catch (IllegalArgumentException e) {
                            Log.i("Received unexpected privacy category from the server", e);
                        }
                    }
                    int A022 = C18280x3.A02(A0F, str);
                    C18260x0.A0L(r3, str, A002);
                    if (A022 != A002) {
                        z2 = true;
                    }
                }
            }
        }
        if (z) {
            C69263Wi.A00(this.A01, this, 6);
        }
        if (z2) {
            C69263Wi.A00(this.A01, this, 7);
        }
        A00(this);
    }
}
