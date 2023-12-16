package X;

import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3TS  reason: invalid class name */
public class AnonymousClass3TS implements AnonymousClass4EZ {
    public AnonymousClass4CM A00;
    public final int A01;
    public final Handler A02 = AnonymousClass000.A0A();
    public final C55682qk A03;
    public final C56972sr A04;
    public final C620433g A05;
    public final C29291ia A06;
    public final UserJid A07;
    public final AnonymousClass31C A08;
    public final C105255Ue A09;
    public final String A0A;

    public void A00(AnonymousClass4CM r17) {
        AnonymousClass39V[] r1;
        UserJid userJid;
        this.A00 = r17;
        AnonymousClass31C r9 = this.A08;
        String A032 = r9.A03();
        this.A09.A04("profile_view_tag");
        String str = this.A0A;
        if (str != null) {
            r1 = new AnonymousClass39V[2];
            userJid = this.A07;
            AnonymousClass39V.A02(userJid, "jid", r1, 0);
            AnonymousClass39V.A0B("tag", str, r1, 1);
        } else {
            r1 = new AnonymousClass39V[1];
            userJid = this.A07;
            AnonymousClass39V.A02(userJid, "jid", r1, 0);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass36K.A0R("profile", A0s, r1);
        this.A04.A0a(userJid);
        AnonymousClass36K A0J = AnonymousClass36K.A0J("business_profile", new AnonymousClass39V[]{new AnonymousClass39V("v", this.A01)}, C18280x3.A1a(A0s, 0));
        AnonymousClass39V[] r2 = new AnonymousClass39V[3];
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r2, 0);
        AnonymousClass39V.A0C("xmlns", "w:biz", r2, 1, 2);
        AnonymousClass36K A0G = AnonymousClass36K.A0G(A0J, r2);
        C18260x0.A1P(AnonymousClass001.A0o(), "sendGetBusinessProfile/iq node: ", A0G);
        r9.A0D(this, A0G, A032, 132, 32000);
        C18260x0.A1R(AnonymousClass001.A0o(), "sendGetBusinessProfile jid=", userJid);
    }

    public void BQs(String str) {
        this.A09.A03("profile_view_tag");
        Log.i("sendGetBusinessProfile/delivery-error");
        this.A02.post(new C71323bv(9, str, this));
    }

    public void BSN(AnonymousClass36K r4, String str) {
        this.A09.A03("profile_view_tag");
        Log.i("sendGetBusinessProfile/response-error");
        this.A02.post(new C117715sN(this, r4, str, 9));
    }

    public void BdM(AnonymousClass36K r6, String str) {
        C55682qk r1;
        String str2;
        this.A09.A03("profile_view_tag");
        AnonymousClass36K A0l = r6.A0l("business_profile");
        if (A0l == null) {
            r1 = this.A03;
            str2 = "payload businessProfileNode doesn't match server";
        } else {
            AnonymousClass36K A0l2 = A0l.A0l("profile");
            if (A0l2 == null) {
                r1 = this.A03;
                str2 = "payload profileNode doesn't match server";
            } else {
                C56972sr r0 = this.A04;
                UserJid userJid = this.A07;
                r0.A0a(userJid);
                C108985dt A002 = AnonymousClass5YY.A00(userJid, A0l2);
                this.A05.A0A(A002, userJid);
                this.A02.post(new C117165rU(this, 35, A002));
                return;
            }
        }
        r1.A0A("smb-reg-business-profile-fetch-failed", false, str2);
        BSN(r6, str);
    }

    public AnonymousClass3TS(C55682qk r2, C56972sr r3, C620433g r4, C29291ia r5, UserJid userJid, AnonymousClass31C r7, C105255Ue r8, String str, int i) {
        this.A01 = i;
        this.A07 = userJid;
        this.A0A = str;
        this.A03 = r2;
        this.A04 = r3;
        this.A09 = r8;
        this.A08 = r7;
        this.A05 = r4;
        this.A06 = r5;
    }
}
