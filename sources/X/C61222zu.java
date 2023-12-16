package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Future;

/* renamed from: X.2zu  reason: invalid class name and case insensitive filesystem */
public class C61222zu {
    public static final AnonymousClass39V[] A05 = new AnonymousClass39V[0];
    public final C55682qk A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass31C A02;
    public final C183538qC A03;
    public final C183538qC A04;

    public Future A00(C95814uZ r9, C95814uZ r10, C45442a1 r11, String str, int i) {
        AnonymousClass39V[] r1;
        AnonymousClass31C r3 = this.A02;
        String A042 = r3.A04();
        AnonymousClass39V[] r2 = new AnonymousClass39V[3];
        boolean A0F = AnonymousClass39V.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A042, r2);
        r2[1] = new AnonymousClass39V((Jid) r9, "to");
        r2[2] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location");
        if (r10 == null) {
            r1 = new AnonymousClass39V[1];
            AnonymousClass39V.A0B("final", str, r1, A0F);
        } else {
            r1 = new AnonymousClass39V[2];
            AnonymousClass39V.A0B("final", str, r1, A0F ? 1 : 0);
            AnonymousClass39V.A02(r10, "context", r1, 1);
        }
        AnonymousClass36K A0F2 = AnonymousClass36K.A0F(AnonymousClass36K.A0F(AnonymousClass35A.A00(r11, i), "location", r1), "notification", r2);
        C50412i8 r0 = new C50412i8();
        r0.A05 = "notification";
        r0.A08 = "location";
        r0.A02 = r9;
        r0.A07 = A042;
        return r3.A07(A0F2, r0.A01(), 188);
    }

    public void A02(AnonymousClass2YN r13) {
        AnonymousClass39V[] r2;
        AnonymousClass31C r5 = this.A02;
        String A032 = r5.A03();
        C18260x0.A0s("LocationSubscriptionSendMethods/subscribe; iqId=", A032, AnonymousClass001.A0o());
        if (r13.A01) {
            r2 = AnonymousClass0x9.A1V();
            AnonymousClass39V.A04("participants", "true", r2);
        } else {
            r2 = null;
        }
        AnonymousClass36K A0I = AnonymousClass36K.A0I("subscribe", r2);
        ArrayList A0I2 = AnonymousClass002.A0I(5);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A0I2);
        AnonymousClass39V.A03("xmlns", "location", A0I2);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A0I2);
        String str = "to";
        if (this.A01.A0Y(C58422vE.A02, 4177)) {
            AnonymousClass39V.A01(C135206kI.A00, str, A0I2);
            str = "target";
        }
        AnonymousClass39V.A01(r13.A00, str, A0I2);
        r5.A0D(new AnonymousClass4KT(r13, 7, this), AnonymousClass36K.A0G(A0I, (AnonymousClass39V[]) A0I2.toArray(A05)), A032, 82, 32000);
    }

    public C61222zu(C55682qk r1, AnonymousClass1VX r2, AnonymousClass31C r3, C183538qC r4, C183538qC r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public void A01(Jid jid, String str, int i) {
        AnonymousClass36K A0I;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A01(jid, "to", A0s);
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A0s);
        if (i == 0) {
            AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "result", A0s);
            A0I = null;
        } else {
            AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "error", A0s);
            AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
            AnonymousClass39V.A04("code", Integer.toString(i), A1V);
            A0I = AnonymousClass36K.A0I("error", A1V);
        }
        AnonymousClass36K A0G = AnonymousClass36K.A0G(A0I, (AnonymousClass39V[]) A0s.toArray(A05));
        AnonymousClass31C r2 = this.A02;
        C29411im r1 = r2.A02;
        if (!r1.A06 || !AnonymousClass000.A1U(r1.A04, 2)) {
            Log.d("MessageClient/sendProtocolTreeNodeIfConnected not ready/connected");
        } else {
            r2.A0B(C383827i.A00(A0G, (Boolean) null, (String) null, 225, false, true), false);
        }
    }

    public void A03(C45442a1 r7, long j) {
        AnonymousClass39V[] r2;
        C18260x0.A12("sendmethods/sendLocation elapsed=", AnonymousClass001.A0o(), j);
        AnonymousClass36K A002 = AnonymousClass35A.A00(r7, 0);
        if (j != 0) {
            r2 = AnonymousClass0x9.A1V();
            AnonymousClass39V.A0B("elapsed", Long.toString(j), r2, 0);
        } else {
            r2 = A05;
        }
        this.A02.A0G(AnonymousClass36K.A0F(AnonymousClass36K.A0F(A002, "location", r2), "ib", (AnonymousClass39V[]) null), 84);
    }
}
