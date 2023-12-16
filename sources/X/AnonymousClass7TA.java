package X;

/* renamed from: X.7TA  reason: invalid class name */
public class AnonymousClass7TA {
    public long A00;
    public C141596vp A01 = C141596vp.Insignificant;
    public final C151037Te A02 = new C151037Te();

    public void A00() {
        C151037Te r3 = this.A02;
        synchronized (r3) {
            int i = 0;
            r3.A01 = 0;
            r3.A02 = 0;
            r3.A00 = 0;
            while (true) {
                Object[] objArr = r3.A03;
                if (i < objArr.length) {
                    objArr[i] = null;
                    i++;
                }
            }
        }
    }
}
