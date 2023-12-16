package X;

import java.util.Arrays;

/* renamed from: X.4yR  reason: invalid class name and case insensitive filesystem */
public class C97514yR extends AnonymousClass7EO {
    public String A00 = "";

    public C97514yR() {
        super(-2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97514yR)) {
            return false;
        }
        return AnonymousClass75J.A00(this.A00, ((C97514yR) obj).A00);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A00);
        AnonymousClass000.A1M(A0M, this.A00.hashCode());
        return Arrays.hashCode(A0M);
    }
}
