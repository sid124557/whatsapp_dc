package X;

import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4fi  reason: invalid class name and case insensitive filesystem */
public abstract class C90034fi extends C103055Lj {
    public void A02(AnonymousClass0QU r3, C1229066h r4) {
        Log.i("AppAuthSettingsActivity/authenticate");
        C105275Ug r1 = ((C90024fh) this).A00.A04;
        C626936e.A0C(r1.A06());
        r1.A00.AxV(r3, r4);
    }

    public void A01() {
    }

    public void A03(byte[] bArr) {
        if (this instanceof C90024fh) {
            Log.i("AppAuthSettingsActivity/fingerprint-success");
            AppAuthSettingsActivity appAuthSettingsActivity = ((C90024fh) this).A00;
            C18270x1.A0l(C18270x1.A03(appAuthSettingsActivity.A09), "privacy_fingerprint_enabled", true);
            appAuthSettingsActivity.A04.A03(false);
            appAuthSettingsActivity.A0C.A07();
            appAuthSettingsActivity.A09.A01();
        }
    }
}
