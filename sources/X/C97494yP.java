package X;

import java.util.Arrays;

/* renamed from: X.4yP  reason: invalid class name and case insensitive filesystem */
public class C97494yP extends AnonymousClass7EO {
    public C97494yP() {
        super(-1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97494yP)) {
            return false;
        }
        return AnonymousClass75J.A00(Integer.valueOf(this.A00), Integer.valueOf(((AnonymousClass7EO) obj).A00));
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }
}
