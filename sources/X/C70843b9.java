package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3b9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70843b9 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C95814uZ A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ AnonymousClass1gL A04;
    public final /* synthetic */ AnonymousClass39T A05;
    public final /* synthetic */ String A06;

    public final void run() {
        AnonymousClass39V[] r4;
        StringBuilder A0o;
        AnonymousClass1gL r7 = this.A04;
        AnonymousClass39T r6 = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        C95814uZ r3 = this.A02;
        DeviceJid deviceJid = this.A03;
        String str = this.A06;
        C18260x0.A1R(AnonymousClass001.A0o(), "LocationNotificationHandler/onFinalLocationNotification/need to send retry receipt; stanzaKey=", r6);
        if (i > 1) {
            r7.A01.A0B();
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("LocationNotificationHandler/onFinalLocationNotification/axolotl sending retry receipt; stanzaKey=");
        A0o2.append(r6);
        C18260x0.A0y("; localRegistrationId=", A0o2, i2);
        C621233o r62 = r7.A06;
        UserJid userJid = deviceJid.userJid;
        byte[] A012 = AnonymousClass36A.A01(i2);
        int i3 = i + 1;
        StringBuilder A0o3 = AnonymousClass001.A0o();
        AnonymousClass0x2.A1E(r3, userJid, "LocationSharingManager/sendFinalLocationRetryRequest/jid=", A0o3);
        A0o3.append("; msgId=");
        A0o3.append(str);
        C18260x0.A0y("; retryCount=", A0o3, i3);
        if (i3 > 4) {
            A0o = AnonymousClass001.A0o();
            A0o.append("LocationSharingManager/sendFinalLocationRetryRequest/reached max retry; remote_resource=");
            A0o.append(userJid);
        } else if (r62.A08(AnonymousClass2z0.A05(r3, str, false)) == null) {
            A0o = AnonymousClass001.A0o();
            A0o.append("LocationSharingManager/sendFinalLocationRetryRequest/can't find the live location message; jid=");
            A0o.append(r3);
            AnonymousClass000.A17(userJid, "; senderJid=", "; msgId=", A0o);
            A0o.append(str);
        } else {
            AnonymousClass31C r5 = r62.A0K.A02;
            AnonymousClass39V[] r72 = new AnonymousClass39V[3];
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r5.A03(), r72, 0);
            r72[1] = new AnonymousClass39V((Jid) userJid, "to");
            r72[2] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location");
            if (C627336j.A0K(r3)) {
                r4 = new AnonymousClass39V[2];
                AnonymousClass39V.A0B("final", str, r4, 0);
                AnonymousClass39V.A02(r3, "context", r4, 1);
            } else {
                r4 = new AnonymousClass39V[1];
                AnonymousClass39V.A0B("final", str, r4, 0);
            }
            AnonymousClass36K[] r32 = new AnonymousClass36K[2];
            AnonymousClass39V[] r2 = new AnonymousClass39V[1];
            AnonymousClass39V.A0B("retry", String.valueOf(i3), r2, 0);
            AnonymousClass36K.A0U("request", r2, r32, 0);
            AnonymousClass36K.A0T("registration", A012, r32, 1);
            r5.A0G(AnonymousClass36K.A0F(AnonymousClass36K.A0J("location", r4, r32), "notification", r72), 191);
            return;
        }
        C18260x0.A0z("; retryCount=", A0o, i3);
    }

    public /* synthetic */ C70843b9(C95814uZ r1, DeviceJid deviceJid, AnonymousClass1gL r3, AnonymousClass39T r4, String str, int i, int i2) {
        this.A04 = r3;
        this.A05 = r4;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A03 = deviceJid;
        this.A06 = str;
    }
}
