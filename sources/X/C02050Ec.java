package X;

import java.util.Arrays;

/* renamed from: X.0Ec  reason: invalid class name and case insensitive filesystem */
public final class C02050Ec extends AnonymousClass0JM {
    public final int A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && AnonymousClass001.A1a(obj, C02050Ec.class) && this.A00 == ((C02050Ec) obj).A00;
        }
        return true;
    }

    public C02050Ec(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NoParamsStatusMessage{type=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
