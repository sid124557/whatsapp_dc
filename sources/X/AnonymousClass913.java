package X;

import android.content.DialogInterface;
import com.whatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.913  reason: invalid class name */
public class AnonymousClass913 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass913(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A02 != 0) {
            VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A01;
            C621433s.A00(verifyPhoneNumber, this.A00);
            verifyPhoneNumber.A7L();
            return;
        }
        C108145cU r2 = (C108145cU) this.A01;
        C621433s.A00(r2.A0X, this.A00);
        if (r2.A0Y == C141956wP.LIVE_LOCATION_MODE) {
            r2.A06();
        }
    }
}
