package X;

import android.content.Intent;
import com.whatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.5rc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117245rc implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ VerifyPhoneNumber A02;
    public final /* synthetic */ boolean A03;

    public final void run() {
        Intent A0A;
        VerifyPhoneNumber verifyPhoneNumber = this.A02;
        boolean z = this.A03;
        long j = this.A00;
        long j2 = this.A01;
        C621433s.A00(verifyPhoneNumber, 44);
        boolean z2 = verifyPhoneNumber.A1G;
        if (z) {
            A0A = C627736r.A0E(verifyPhoneNumber, j, j2, z2, verifyPhoneNumber.A1W);
        } else {
            A0A = C627736r.A0A(verifyPhoneNumber, 0, 1, j, j2, 0, z2, verifyPhoneNumber.A1W);
        }
        verifyPhoneNumber.finish();
        verifyPhoneNumber.startActivity(A0A);
        verifyPhoneNumber.overridePendingTransition(0, 0);
    }

    public /* synthetic */ C117245rc(VerifyPhoneNumber verifyPhoneNumber, long j, long j2, boolean z) {
        this.A02 = verifyPhoneNumber;
        this.A03 = z;
        this.A00 = j;
        this.A01 = j2;
    }
}
