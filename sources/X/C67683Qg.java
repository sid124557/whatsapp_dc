package X;

import android.os.Message;

/* renamed from: X.3Qg  reason: invalid class name and case insensitive filesystem */
public class C67683Qg implements AnonymousClass4DA {
    public final C41462Ki A00;
    public final AnonymousClass33S A01;
    public final C55892r5 A02;
    public final AnonymousClass4FS A03;

    public boolean BFA(Message message, int i) {
        if (i != 221) {
            return false;
        }
        Object obj = message.obj;
        C626936e.A06(obj);
        AnonymousClass39T r4 = (AnonymousClass39T) obj;
        C56202rb A012 = this.A02.A01(1, r4.A00);
        if (A012 != null) {
            A012.A03(3);
        }
        C70113Zy.A01(this.A03, this, r4, 20);
        return true;
    }

    public C67683Qg(C41462Ki r1, AnonymousClass33S r2, C55892r5 r3, AnonymousClass4FS r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public int[] B81() {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 221;
        return A0E;
    }
}
