package X;

/* renamed from: X.8DL  reason: invalid class name */
public final class AnonymousClass8DL implements C181468mo {
    public final C181468mo A00;

    public boolean AxC(AnonymousClass7MS r2) {
        return this.A00.AxC(r2);
    }

    public String toString() {
        String str;
        String obj = this.A00.toString();
        boolean startsWith = obj.startsWith("(");
        StringBuilder A0o = AnonymousClass001.A0o();
        if (startsWith) {
            A0o.append("[?");
            A0o.append(obj);
            str = "]";
        } else {
            A0o.append("[?(");
            A0o.append(obj);
            str = ")]";
        }
        return AnonymousClass000.A0X(str, A0o);
    }

    public AnonymousClass8DL(C181468mo r1) {
        this.A00 = r1;
    }

    public AnonymousClass8DL() {
    }
}
