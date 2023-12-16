package X;

import com.whatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.5oi  reason: invalid class name and case insensitive filesystem */
public class C115465oi implements C184578sA {
    public final /* synthetic */ VerifyPhoneNumber A00;

    public C115465oi(VerifyPhoneNumber verifyPhoneNumber) {
        this.A00 = verifyPhoneNumber;
    }

    public void BhU() {
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        if (verifyPhoneNumber.A0h.A02("android.permission.RECEIVE_SMS") == 0) {
            verifyPhoneNumber.A7c(verifyPhoneNumber.A76("sms"), verifyPhoneNumber.A76("voice"));
        } else {
            AnonymousClass36l.A0L(verifyPhoneNumber, 701);
        }
    }

    public void Bpy() {
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        verifyPhoneNumber.A1W = true;
        verifyPhoneNumber.A7c(verifyPhoneNumber.A76("sms"), verifyPhoneNumber.A76("voice"));
    }
}
