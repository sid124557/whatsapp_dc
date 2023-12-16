package X;

import com.whatsapp.util.Log;

/* renamed from: X.3SZ  reason: invalid class name */
public class AnonymousClass3SZ implements AnonymousClass4EZ {
    public final C84854Dz A00;
    public final AnonymousClass31C A01;

    public void BQs(String str) {
        Log.e("delivery failure in getting block status for chat psa");
        C85684Hf r1 = (C85684Hf) this.A00;
        if (r1.A01 != 0) {
            ((C54142oF) r1.A00).A00();
        }
    }

    public void BSN(AnonymousClass36K r4, String str) {
        C84854Dz r1 = this.A00;
        int A012 = C57492tj.A01(r4);
        C85684Hf r12 = (C85684Hf) r1;
        if (r12.A01 != 0) {
            ((C54142oF) r12.A00).A01(A012);
        } else {
            C18260x0.A0x("error getting chat block status ", AnonymousClass001.A0o(), A012);
        }
    }

    public void BdM(AnonymousClass36K r2, String str) {
        this.A00.Bd8(r2);
    }

    public AnonymousClass3SZ(C84854Dz r1, AnonymousClass31C r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
