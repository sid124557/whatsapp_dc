package X;

import java.util.Arrays;

/* renamed from: X.9SS  reason: invalid class name */
public class AnonymousClass9SS {
    public C166557yt A00;
    public final /* synthetic */ C194619Tt A01;

    public AnonymousClass9SS(C166557yt r1, C194619Tt r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9SS)) {
            return false;
        }
        AnonymousClass9SS r3 = (AnonymousClass9SS) obj;
        C166557yt r1 = this.A00;
        if (C161527pr.A03(r1)) {
            return C161527pr.A03(r3.A00);
        }
        return ((String) C1899593h.A0X(r1)).equals(C1899593h.A0X(r3.A00));
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = this.A00.A00;
        return Arrays.hashCode(A0L);
    }
}
