package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.2yo  reason: invalid class name and case insensitive filesystem */
public class C60592yo {
    public final C56612sH A00;
    public final C83904Ag A01;

    public void A02(String str, String str2) {
        Log.i("ConnectionThreadRequestsImpl/on-attestation-request");
        C83904Ag r3 = this.A01;
        Message A0G = AnonymousClass0x7.A0G(179);
        Bundle data = A0G.getData();
        data.putString("nonce", str);
        data.putString("apiKey", str2);
        r3.Bfr(A0G);
    }

    public void A03(DeviceJid[] deviceJidArr, int i) {
        String[] strArr;
        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-error");
        C83904Ag r3 = this.A01;
        Bundle A08 = AnonymousClass002.A08();
        if (!A08.containsKey("jids")) {
            if (deviceJidArr != null) {
                strArr = C627336j.A0P(deviceJidArr);
            } else {
                strArr = null;
            }
            A08.putStringArray("jids", strArr);
            A08.putInt("errorCode", i);
            AnonymousClass0x2.A16(r3, A08, 76);
            return;
        }
        throw AnonymousClass000.A0F(" already used", AnonymousClass000.A0l("jids"));
    }

    public C60592yo(C56612sH r1, C83904Ag r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static void A00(int i) {
        C18260x0.A0y("ConnectionThreadRequestsImpl/on-qr-sync-error ", AnonymousClass001.A0o(), i);
    }

    public void A01(AnonymousClass36K r5, AnonymousClass39T r6, int i) {
        C18260x0.A0y("ConnectionThreadRequestsImpl/on-xmpp-recv type=", AnonymousClass001.A0o(), i);
        C83904Ag r3 = this.A01;
        Message obtain = Message.obtain((Handler) null, 0, i, 0, r5);
        if (r6 != null) {
            obtain.getData().putParcelable("stanzaKey", r6);
        }
        r3.Bfr(obtain);
    }
}
