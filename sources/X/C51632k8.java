package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.2k8  reason: invalid class name and case insensitive filesystem */
public final class C51632k8 {
    public final LinkedHashSet A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51632k8) {
                C51632k8 r5 = (C51632k8) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C51632k8(LinkedHashSet linkedHashSet, Set set) {
        this.A00 = linkedHashSet;
        this.A01 = set;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UnsentCrosspostingSession(messageRowIds=");
        A0o.append(this.A00);
        A0o.append(", destinationAppList=");
        return C18260x0.A04(this.A01, A0o);
    }
}
