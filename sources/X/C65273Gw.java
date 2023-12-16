package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Gw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65273Gw implements C837349o {
    public final /* synthetic */ C625835r A00;
    public final /* synthetic */ AnonymousClass4BZ A01;

    public final C59852xb Bk7() {
        C625835r r7 = this.A00;
        AnonymousClass4BZ r6 = this.A01;
        r7.A0S.A00();
        r7.A0Q.A03();
        r7.A0B();
        ArrayList A0P = r7.A0P();
        if (A0P.size() <= 0) {
            Log.i("MessageStoreBackup/restore/backupfiles/none-found");
            return new C59852xb(0);
        }
        Iterator it = A0P.iterator();
        while (it.hasNext()) {
            File A0f = AnonymousClass0x9.A0f(it);
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A0y(A0f, "MessageStoreBackup/restore/backupfiles ", A0o);
            C18280x3.A11(A0f, " (", A0o);
            C18260x0.A1L(A0o, ")");
        }
        C72303dV r2 = r7.A0R;
        r2.A05();
        File file = r2.A05;
        if (C625835r.A09(file, "restore")) {
            r2.A05();
            C627536m.A0O(file);
        }
        return r7.A0H(r6, A0P, 100);
    }

    public /* synthetic */ C65273Gw(C625835r r1, AnonymousClass4BZ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
