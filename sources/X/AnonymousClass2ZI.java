package X;

import java.util.Random;

/* renamed from: X.2ZI  reason: invalid class name */
public class AnonymousClass2ZI {
    public final C66663Mh A00;
    public final AnonymousClass1VX A01;
    public final Random A02;

    public final long A00(int i, int i2) {
        int nextInt;
        AnonymousClass1VX r2 = this.A01;
        C58422vE r1 = C58422vE.A02;
        if (r2.A0Y(r1, i)) {
            int A0O = r2.A0O(r1, i2);
            if (A0O <= 0) {
                return 0;
            }
            nextInt = this.A02.nextInt(A0O);
        } else {
            C66663Mh r22 = this.A00;
            Random random = this.A02;
            int A03 = r22.A03(C66663Mh.A1e);
            if (A03 <= 0) {
                return 0;
            }
            nextInt = random.nextInt(A03 * 2);
        }
        return C18290x4.A0A(nextInt);
    }

    public AnonymousClass2ZI(C66663Mh r1, AnonymousClass1VX r2, Random random) {
        this.A02 = random;
        this.A00 = r1;
        this.A01 = r2;
    }
}
