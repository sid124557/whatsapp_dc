package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.73I  reason: invalid class name */
public final class AnonymousClass73I {
    public static C156067fy A00(C185628tz r4) {
        C156067fy r3 = new C156067fy();
        if (r4.Bgg() != C142156wj.START_OBJECT) {
            r4.BpQ();
            return null;
        }
        while (r4.BLY() != C142156wj.END_OBJECT) {
            String Bgf = r4.Bgf();
            boolean A1U = C18280x3.A1U(AnonymousClass73G.A00(Bgf), 32);
            r4.BLY();
            if (!A1U) {
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(Bgf)) {
                    r3.A01 = AnonymousClass6C8.A0e(r4);
                } else if ("payload".equals(Bgf)) {
                    r3.A00 = AnonymousClass73K.A00(r4);
                }
            }
            r4.BpQ();
        }
        return r3;
    }
}
