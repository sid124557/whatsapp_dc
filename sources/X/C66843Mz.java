package X;

/* renamed from: X.3Mz  reason: invalid class name and case insensitive filesystem */
public class C66843Mz implements C84554Cu {
    public final C49802h7 A00;
    public final AnonymousClass1VX A01;

    public synchronized void A00(C613030d r5) {
        C30471mV r3 = r5.A04;
        if (!r5.A05()) {
            C41832Lt A002 = this.A00.A00(r3.A1J);
            if (A002 != null) {
                byte[] bArr = A002.A00;
                int[] iArr = A002.A01;
                synchronized (r5) {
                    if (!r5.A00) {
                        r5.A02(bArr, iArr);
                    }
                }
                r5.A05 = C624234y.A01(this.A01, r3);
            }
            r5.A00 = true;
        }
    }

    public boolean BLR(C51692kE r3, C624134x r4) {
        C613030d A1v;
        if (!(r4 instanceof C30471mV) || (A1v = ((C30471mV) r4).A1v()) == null || A1v.A05()) {
            return false;
        }
        return true;
    }

    public C66843Mz(C49802h7 r1, AnonymousClass1VX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BJr(C51692kE r2, C624134x r3) {
        C613030d A1v;
        if (BLR(r2, r3) && (r3 instanceof C30471mV) && (A1v = ((C30471mV) r3).A1v()) != null) {
            A00(A1v);
        }
    }
}
