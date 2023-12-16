package X;

import com.whatsapp.util.Log;

/* renamed from: X.3MR  reason: invalid class name */
public class AnonymousClass3MR implements AnonymousClass4EJ {
    public final AnonymousClass4EI A00;
    public final C50912iy A01;
    public final C183538qC A02;
    public final C183538qC A03;

    public final void BQp() {
        Log.e("FBUserEntityManagement : Network failed while sending the payload");
        this.A00.BQp();
    }

    public final void BSB(Exception exc) {
        Log.e("FBUserEntityManagement : On error response while sending the payload", exc);
        this.A00.BSB(exc);
    }

    public final void Bd3(C60272yH r3) {
        boolean z;
        AnonymousClass308 r1 = (AnonymousClass308) this.A02.get();
        if (r3 != null) {
            z = r1.A04(r3);
        } else {
            r1.A03(this.A01);
            z = true;
        }
        AnonymousClass4EI r12 = this.A00;
        if (z) {
            r12.Bd3(r3);
        } else {
            r12.BSB(AnonymousClass001.A0e("Unable to perform operation."));
        }
    }

    public AnonymousClass3MR(AnonymousClass4EI r1, C50912iy r2, C183538qC r3, C183538qC r4) {
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r2;
        this.A00 = r1;
    }
}
