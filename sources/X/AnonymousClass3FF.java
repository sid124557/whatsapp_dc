package X;

import com.whatsapp.SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment;
import com.whatsapp.SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment;

/* renamed from: X.3FF  reason: invalid class name */
public class AnonymousClass3FF implements C85014Ep {
    public final C003203q A00;

    public void BZP(String str) {
        A00(this.A00);
    }

    public void BZQ() {
        C08240dc A0J = AnonymousClass0x2.A0J(this.A00);
        A0J.A0C(new SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment(), (String) null);
        A0J.A02();
    }

    public void Beo(String str) {
        A00(this.A00);
    }

    public void Bep() {
        C08240dc A0J = AnonymousClass0x2.A0J(this.A00);
        A0J.A0C(new SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment(), (String) null);
        A0J.A02();
    }

    public AnonymousClass3FF(C003203q r1) {
        this.A00 = r1;
    }

    public static void A00(C003203q r2) {
        C08240dc A0J = AnonymousClass0x2.A0J(r2);
        A0J.A0C(new SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment(), (String) null);
        A0J.A02();
    }
}
