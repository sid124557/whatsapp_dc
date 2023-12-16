package X;

/* renamed from: X.8cx  reason: invalid class name and case insensitive filesystem */
public class C176408cx extends AnonymousClass8Q0 {
    public static final C176768dX A02 = C176768dX.A0B("1.3.6.1.5.5.7.48.2");
    public static final C176768dX A03 = C176768dX.A0B("1.3.6.1.5.5.7.48.1");
    public C176768dX A00;
    public C176608dH A01;

    public C176408cx(C176958dq r3) {
        if (r3.A0U() == 2) {
            this.A00 = C176768dX.A0A(C176958dq.A0A(r3));
            this.A01 = C176608dH.A0A(C176958dq.A0B(r3));
            return;
        }
        throw AnonymousClass001.A0c("wrong number of elements in sequence");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccessDescription: Oid(");
        A0o.append(this.A00.A01);
        return AnonymousClass000.A0e(A0o);
    }
}
