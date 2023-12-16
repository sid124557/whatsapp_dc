package X;

import java.util.List;

/* renamed from: X.6t6  reason: invalid class name and case insensitive filesystem */
public final class C140066t6 extends AnonymousClass75U {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C140066t6) && C162457s7.A0P(this.A00, ((C140066t6) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C140066t6(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Bullets(bulletItems=");
        return C18260x0.A04(this.A00, A0o);
    }
}
