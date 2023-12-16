package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;

/* renamed from: X.3Ql  reason: invalid class name and case insensitive filesystem */
public class C67733Ql implements AnonymousClass4DA {
    public final C55682qk A00;
    public final C621133n A01;
    public final C48972fm A02;
    public final C621233o A03;
    public final C61222zu A04;
    public final AnonymousClass4FS A05;

    public int[] B81() {
        return new int[]{117, 206};
    }

    public boolean BFA(Message message, int i) {
        long j;
        if (i == 117) {
            Bundle data = message.getData();
            A00((UserJid) AnonymousClass32W.A00(data.getString("jid")), (C45442a1) message.obj, data.getLong("elapsed"));
            return true;
        } else if (i != 206) {
            return false;
        } else {
            AnonymousClass36K r3 = (AnonymousClass36K) message.obj;
            String A0r = r3.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            int i2 = 0;
            AnonymousClass36K A0k = r3.A0k(0);
            Jid A0g = r3.A0g(Jid.class, "from");
            C626936e.A06(A0g);
            if (AnonymousClass36K.A0W(A0k, "start")) {
                String A0r2 = A0k.A0r("duration", (String) null);
                if (A0r2 != null) {
                    j = Long.parseLong(A0r2);
                } else {
                    j = 0;
                }
                C621233o r7 = this.A03;
                C95814uZ A032 = C106405Yw.A03(A0g);
                C626936e.A06(A032);
                long j2 = j * 1000;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("LocationSharingManager/onStartLocationReporting; jid=");
                A0o.append(A032);
                C18260x0.A12("; duration=", A0o, j2);
                if (r7.A0d(A032)) {
                    Context context = r7.A0E.A00;
                    Log.d("LocationSharingService/start-location-reporting");
                    LocationSharingService.A03(context, AnonymousClass0x9.A08(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_LOCATION_REPORTING").putExtra("duration", j2));
                    synchronized (r7.A0P) {
                        r7.A00 = 2 | r7.A00;
                    }
                    i2 = 0;
                } else {
                    C18260x0.A1S(AnonymousClass001.A0o(), "LocationSharingManager/onStartLocationReporting/sharing not enabled; jid=", A032);
                    i2 = 401;
                }
            } else if (AnonymousClass36K.A0W(A0k, "stop")) {
                this.A03.A0H();
            } else if (!AnonymousClass36K.A0W(A0k, "enable")) {
                this.A04.A01(A0g, A0r, 501);
                return true;
            }
            this.A04.A01(A0g, A0r, i2);
            return true;
        }
    }

    public C67733Ql(C55682qk r1, C621133n r2, C48972fm r3, C621233o r4, C61222zu r5, AnonymousClass4FS r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void A00(UserJid userJid, C45442a1 r10, long j) {
        StringBuilder A0o;
        String str;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("LiveLocationXmppMessageHandler/on-location-update; jid=");
        UserJid userJid2 = userJid;
        A0o2.append(userJid);
        long j2 = j;
        C18260x0.A12("; elapsed=", A0o2, j);
        C45442a1 r4 = r10;
        int i = r10.A01;
        if (i != 2) {
            A0o = AnonymousClass001.A0o();
            str = "LiveLocationXmppMessageHandler/invalid ciphertext version; ciphertextVersion=";
        } else {
            i = r10.A00;
            if (i != 3) {
                A0o = AnonymousClass001.A0o();
                str = "LiveLocationXmppMessageHandler/invalid ciphertext type; ciphertextType=";
            } else {
                if (this.A01.A0X()) {
                    this.A05.BkM(new C71513cE(this, userJid2, r4, 7, j2));
                    return;
                } else {
                    C48972fm.A02(this.A02, new C71513cE(this, userJid2, r4, 8, j2));
                    return;
                }
            }
        }
        C18260x0.A0z(str, A0o, i);
    }
}
