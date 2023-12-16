package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4zL  reason: invalid class name and case insensitive filesystem */
public class C97844zL extends C156137g5 {
    public final long A00;
    public final AnonymousClass3ZH A01;
    public final Set A02;

    public C97844zL(AnonymousClass3ZH r3, Set set, long j) {
        super(r3.A0H, 25);
        HashSet A0K = AnonymousClass002.A0K();
        this.A02 = A0K;
        this.A01 = r3;
        this.A00 = j;
        if (set != null) {
            A0K.addAll(set);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C97844zL r7 = (C97844zL) obj;
            if (this.A00 == r7.A00 && this.A01.equals(r7.A01)) {
                return this.A02.equals(r7.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A00(C18300x5.A04(this.A01), this.A00) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SearchResult{group=");
        A0o.append(this.A01);
        A0o.append(", lastMessageTimestamp=");
        A0o.append(this.A00);
        A0o.append(", matchingContact=");
        return AnonymousClass000.A0Q(this.A02, A0o);
    }
}
