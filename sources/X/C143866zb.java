package X;

/* renamed from: X.6zb  reason: invalid class name and case insensitive filesystem */
public class C143866zb extends Exception {
    public int a;
    public String b;

    public C143866zb(C140936ul r2) {
        super(r2.j);
        this.a = r2.i;
        this.b = r2.j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error ");
        A0o.append(this.a);
        A0o.append(" : ");
        return AnonymousClass000.A0X(this.b, A0o);
    }

    public C143866zb() {
    }
}
