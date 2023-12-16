package X;

import java.util.Objects;

/* renamed from: X.0N9  reason: invalid class name */
public final class AnonymousClass0N9 {
    public final int A00;
    public final String A01;

    public AnonymousClass0N9(String str, int i) {
        Objects.requireNonNull(str);
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        A0o.append(", uid: ");
        return AnonymousClass000.A0h(A0o, this.A00);
    }
}
