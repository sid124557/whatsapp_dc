package X;

/* renamed from: X.7Xf  reason: invalid class name and case insensitive filesystem */
public class C152017Xf {
    public final AnonymousClass6YV A00 = new AnonymousClass6YV();

    public void A00(Object obj) {
        this.A00.A04(obj);
    }

    public boolean A01(Exception exc) {
        AnonymousClass6YV r2 = this.A00;
        C162177rO.A03(exc, "Exception must not be null");
        synchronized (r2.A04) {
            if (r2.A02) {
                return false;
            }
            r2.A02 = true;
            r2.A00 = exc;
            r2.A03.A00(r2);
            return true;
        }
    }

    public boolean A02(Object obj) {
        AnonymousClass6YV r2 = this.A00;
        synchronized (r2.A04) {
            if (r2.A02) {
                return false;
            }
            r2.A02 = true;
            r2.A01 = obj;
            r2.A03.A00(r2);
            return true;
        }
    }
}
