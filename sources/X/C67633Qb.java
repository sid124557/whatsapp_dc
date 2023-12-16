package X;

import android.os.Message;

/* renamed from: X.3Qb  reason: invalid class name and case insensitive filesystem */
public class C67633Qb implements AnonymousClass4DA {
    public final C55132pq A00;
    public final AnonymousClass4FS A01;

    public boolean BFA(Message message, int i) {
        if (i != 101) {
            return false;
        }
        this.A01.BkM(new C71323bv(45, (String) message.obj, this));
        return true;
    }

    public C67633Qb(C55132pq r1, AnonymousClass4FS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int[] B81() {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 101;
        return A0E;
    }
}
