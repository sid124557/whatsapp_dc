package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3TE  reason: invalid class name */
public final class AnonymousClass3TE implements AnonymousClass4EZ {
    public final AnonymousClass31C A00;
    public final WeakReference A01;

    public AnonymousClass3TE(AnonymousClass31C r2, WeakReference weakReference) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = weakReference;
    }

    public final void A00(boolean z, String str) {
        String str2 = str;
        C162457s7.A0J(str2, 1);
        AnonymousClass31C r8 = this.A00;
        String A03 = r8.A03();
        AnonymousClass39V[] r4 = new AnonymousClass39V[2];
        boolean A0F = AnonymousClass39V.A0F("approve", String.valueOf(z), r4);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2, r4, 1);
        AnonymousClass36K A0I = AnonymousClass36K.A0I("device_logout", r4);
        AnonymousClass39V[] r42 = new AnonymousClass39V[5];
        AnonymousClass39V.A0B("xmlns", "w:account_defence", r42, A0F ? 1 : 0);
        AnonymousClass39V.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03, r42, 1, 2);
        r42[3] = new AnonymousClass39V("smax_id", 87);
        r42[4] = AnonymousClass39V.A00();
        r8.A0D(this, AnonymousClass36K.A0G(A0I, r42), A03, 354, 20000);
    }

    public void BSN(AnonymousClass36K r3, String str) {
        C162457s7.A0J(r3, 1);
        int A002 = AnonymousClass36K.A00(r3);
        AnonymousClass4CH r0 = (AnonymousClass4CH) this.A01.get();
        if (r0 != null) {
            r0.onError(A002);
        }
    }

    public void BdM(AnonymousClass36K r4, String str) {
        boolean z;
        String A0r;
        C162457s7.A0J(r4, 1);
        AnonymousClass36K A0l = r4.A0l("device_logout");
        if (A0l == null || (A0r = A0l.A0r("success", "true")) == null) {
            z = false;
        } else {
            z = A0r.equals("true");
        }
        AnonymousClass4CH r1 = (AnonymousClass4CH) this.A01.get();
        if (z) {
            if (r1 != null && ((AnonymousClass4KU) r1).A01 == 0) {
                Log.i("DeviceConfirmationRegAlertDialogFragment/ Successfully sent Do Not Allow IQ");
            }
        } else if (r1 != null) {
            r1.onError(-2);
        }
    }

    public void BQs(String str) {
        AnonymousClass4CH r1 = (AnonymousClass4CH) this.A01.get();
        if (r1 != null) {
            r1.onError(-1);
        }
    }
}
