package X;

import java.util.List;

/* renamed from: X.0NI  reason: invalid class name */
public class AnonymousClass0NI {
    public int A00 = 0;
    public List A01 = null;

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        for (Object append : this.A01) {
            A0o.append(append);
            A0o.append(' ');
        }
        A0o.append('[');
        A0o.append(this.A00);
        return AnonymousClass001.A0j(A0o, ']');
    }
}
