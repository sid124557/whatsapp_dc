package X;

import android.content.Intent;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;
import com.whatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.3aC  reason: invalid class name and case insensitive filesystem */
public class C70253aC implements Runnable {
    public long A00;
    public long A01;
    public Object A02;
    public final int A03;

    public C70253aC(Object obj, int i, long j, long j2) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void run() {
        Intent A0A;
        switch (this.A03) {
            case 0:
                ((C56662sM) this.A02).A00.A08(this.A00, this.A01);
                return;
            case 1:
                ((ExportMigrationActivity) this.A02).A75(this.A00 - this.A01);
                return;
            default:
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A02;
                long j = this.A00;
                long j2 = this.A01;
                if (!verifyPhoneNumber.A8C()) {
                    C621433s.A00(verifyPhoneNumber, 43);
                }
                if (verifyPhoneNumber.A02 == 0) {
                    A0A = C627736r.A0y(verifyPhoneNumber, (String) null, -1, 0, 0, j, j2, 0, 0, verifyPhoneNumber.A1W, verifyPhoneNumber.A8C(), verifyPhoneNumber.A1G, false, false);
                } else {
                    A0A = C627736r.A0A(verifyPhoneNumber, 0, 3, j, j2, 0, verifyPhoneNumber.A1G, verifyPhoneNumber.A1W);
                }
                verifyPhoneNumber.A0w.A0B(verifyPhoneNumber.A74(), true);
                verifyPhoneNumber.finish();
                verifyPhoneNumber.startActivity(A0A);
                return;
        }
    }
}
