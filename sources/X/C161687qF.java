package X;

import com.whatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.7qF  reason: invalid class name and case insensitive filesystem */
public class C161687qF implements C181588n0 {
    public Object A00;
    public final int A01;

    public C161687qF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Ayv() {
        if (this.A01 != 0) {
            Runnable runnable = (Runnable) this.A00;
            C162457s7.A0J(runnable, 0);
            runnable.run();
            return;
        }
        VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A00;
        verifyPhoneNumber.A14.A04("verification_complete_dialog", "click_verification_complete_dialog_learn_more");
        verifyPhoneNumber.A14.A01("verification_complete_dialog");
    }
}
