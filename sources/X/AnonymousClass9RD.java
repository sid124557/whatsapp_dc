package X;

import android.os.Trace;
import android.util.SparseArray;

/* renamed from: X.9RD  reason: invalid class name */
public class AnonymousClass9RD {
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();
    public final C157207hv A02;

    public void A00(AnonymousClass7Ow r5, C186198uu r6) {
        try {
            Trace.beginSection("sendOutputData");
            AnonymousClass9ZF r3 = (AnonymousClass9ZF) this.A00.get(0);
            if (r3 == null) {
                this.A02.A00(C142216wp.A0B);
            } else if (r6 != null) {
                r6.BAK();
                C185558ts B6O = r3.A00.B6O();
                if (r3.A01 == null) {
                    C1680183u r0 = new C1680183u(r3.A02);
                    r3.A01 = r0;
                    r0.AxN(B6O);
                }
                r3.A01.A00(B6O, r5, r6);
            } else {
                r3.A01(r5);
            }
        } finally {
            Trace.endSection();
        }
    }

    public AnonymousClass9RD(C157207hv r2) {
        this.A02 = r2;
    }
}
