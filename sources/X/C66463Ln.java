package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Ln  reason: invalid class name and case insensitive filesystem */
public class C66463Ln implements AnonymousClass485 {
    public final C55682qk A00;
    public final AnonymousClass31C A01;
    public final AnonymousClass4FS A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;

    public void A01(List list) {
        AnonymousClass31C r6 = this.A01;
        String A032 = r6.A03();
        AnonymousClass36K[] r3 = new AnonymousClass36K[list.size()];
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass39V[] r2 = new AnonymousClass39V[1];
            AnonymousClass39V.A02((Jid) list.get(i), "jid", r2, 0);
            AnonymousClass36K.A0U(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r2, r3, i);
        }
        AnonymousClass39V[] A0H = AnonymousClass39V.A0H(A032, 0);
        AnonymousClass39V.A09("xmlns", "encrypt", A0H);
        A0H[3] = AnonymousClass39V.A00();
        r6.A0K(new AnonymousClass4KT(list, 3, this), AnonymousClass36K.A0G(AnonymousClass36K.A0J("identity", (AnonymousClass39V[]) null, r3), A0H), A032, 153, 32000);
    }

    public C66463Ln(C55682qk r1, AnonymousClass31C r2, AnonymousClass4FS r3, C183538qC r4, C183538qC r5, C183538qC r6, C183538qC r7, C183538qC r8, C183538qC r9, C183538qC r10) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r4;
        this.A09 = r5;
        this.A08 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r9;
        this.A03 = r10;
    }

    public static /* synthetic */ void A00(C66463Ln r3, DeviceJid deviceJid, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("recvmessagelistener/on-get-identity-error/jid = ");
        A0o.append(deviceJid);
        C18260x0.A0z(" errorCode = ", A0o, i);
        Iterator A032 = C61102zi.A03((C61102zi) r3.A06.get());
        while (A032.hasNext()) {
            ((C84994En) A032.next()).BTz(deviceJid, i);
        }
        if (!AnonymousClass0x9.A1P(deviceJid)) {
            return;
        }
        if (((C621133n) r3.A07.get()).A0X()) {
            C71733ca.A01(r3.A02, deviceJid, r3, i, 45);
        } else {
            C48972fm.A02((C48972fm) r3.A08.get(), new C71733ca((Object) deviceJid, (Object) r3, i, 46));
        }
    }
}
