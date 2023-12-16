package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.2en  reason: invalid class name and case insensitive filesystem */
public class C48372en {
    public final C66663Mh A00;
    public final AnonymousClass1VX A01;

    public int A00() {
        int A0O = this.A01.A0O(C58422vE.A02, 471);
        if (A0O <= 0) {
            A0O = this.A00.A03(C66663Mh.A16);
        }
        return A0O & 12284;
    }

    public boolean A01() {
        if (!this.A01.A0Y(C58422vE.A02, 3214) || (A00() & DefaultCrypto.BUFFER_SIZE) <= 0) {
            return false;
        }
        return true;
    }

    public C48372en(C66663Mh r1, AnonymousClass1VX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
