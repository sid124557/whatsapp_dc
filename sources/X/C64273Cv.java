package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.util.Log;

/* renamed from: X.3Cv  reason: invalid class name and case insensitive filesystem */
public class C64273Cv implements AnonymousClass4CG {
    public final /* synthetic */ DeleteAccountConfirmation A00;

    public C64273Cv(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.A00 = deleteAccountConfirmation;
    }

    public void BVh() {
        Intent A01;
        DeleteAccountConfirmation deleteAccountConfirmation = this.A00;
        C621433s.A00(deleteAccountConfirmation, 1);
        C27981fH A0H = deleteAccountConfirmation.A01.A0H();
        if (!deleteAccountConfirmation.A09.A06() || A0H == null) {
            A01 = C627736r.A01(deleteAccountConfirmation);
        } else {
            Log.i("DeleteAccountConfirmation/onLocalAccountDeletionEnded/remove current account");
            A01 = C627736r.A13(deleteAccountConfirmation, A0H.getRawString(), deleteAccountConfirmation.A0A.A02(), deleteAccountConfirmation.A09.A0C(), 13, SystemClock.elapsedRealtime());
        }
        deleteAccountConfirmation.A6T(A01, true);
    }

    public void BVi() {
        DeleteAccountConfirmation deleteAccountConfirmation = this.A00;
        AnonymousClass30P r0 = deleteAccountConfirmation.A0A;
        C50912iy r3 = AnonymousClass2BG.A00;
        if (r0.A01(r3) != null) {
            deleteAccountConfirmation.A0A.A06(new C85974Ii(deleteAccountConfirmation, 0), r3, (C54662p5) null, (String) null);
        }
        deleteAccountConfirmation.A01.removeMessages(0);
        C116985rC r1 = deleteAccountConfirmation.A04;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("deleteWhatsappBAccount");
        }
    }
}
