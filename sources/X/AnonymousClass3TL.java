package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3TL  reason: invalid class name */
public class AnonymousClass3TL implements AnonymousClass4EZ {
    public final C69263Wi A00;
    public final AnonymousClass31C A01;
    public final AnonymousClass4BD A02;

    public final void A00(int i) {
        this.A00.BkS(C70133a0.A00(this, new C43242Ri((UserJid) null, (String) null, (String) null, -1, i), 46));
    }

    public AnonymousClass3TL(C69263Wi r1, AnonymousClass31C r2, AnonymousClass4BD r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BQs(String str) {
        Log.e("sendScanContactQr/delivery-error");
        A00(408);
    }

    public void BSN(AnonymousClass36K r2, String str) {
        Log.e("sendScanContactQr/response-error");
        A00(C57492tj.A01(r2));
    }

    public void BdM(AnonymousClass36K r10, String str) {
        String str2;
        int i;
        AnonymousClass36K A0l = r10.A0l("qr");
        if (A0l != null) {
            String A0r = A0l.A0r("jid", (String) null);
            String A0r2 = A0l.A0r("notify", (String) null);
            UserJid A08 = AnonymousClass32Y.A08(A0r);
            if (A08 == null) {
                str2 = "sendScanContactQr/error: invalid jid";
            } else {
                String A0K = AnonymousClass36K.A0K(A0l);
                String str3 = null;
                if ("contact".equals(A0K)) {
                    i = 0;
                } else if ("subscribe".equals(A0K)) {
                    i = 1;
                } else if ("message".equals(A0K)) {
                    AnonymousClass36K A0l2 = A0l.A0l("message");
                    if (A0l2 != null) {
                        str3 = A0l2.A0n();
                    }
                    i = 2;
                } else {
                    str2 = AnonymousClass000.A0V("sendScanContactQr/error: invalid type ", A0K, AnonymousClass001.A0o());
                }
                Log.e("sendScanContactQr/success");
                this.A00.BkS(C70133a0.A00(this, new C43242Ri(A08, A0r2, str3, i, 0), 46));
                return;
            }
        } else {
            str2 = "sendScanContactQr/error: missing node";
        }
        Log.e(str2);
        A00(0);
    }
}
