package X;

/* renamed from: X.8cf  reason: invalid class name and case insensitive filesystem */
public class C176228cf extends AnonymousClass8Q0 {
    public C176068cP A00;

    public String toString() {
        int A0B;
        byte[] A0U = this.A00.A0U();
        int length = A0U.length;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (length == 1) {
            A0o.append("KeyUsage: 0x");
            A0B = A0U[0] & 255;
        } else {
            A0o.append("KeyUsage: 0x");
            A0B = AnonymousClass6CA.A0B(A0U, 0, AnonymousClass6C9.A0F(A0U, 1));
        }
        AnonymousClass001.A1N(A0o, A0B);
        return A0o.toString();
    }

    public C176228cf(C176068cP r1) {
        this.A00 = r1;
    }
}
