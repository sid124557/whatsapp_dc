package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.2kq  reason: invalid class name and case insensitive filesystem */
public final class C52072kq {
    public final AnonymousClass223 A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52072kq) {
                C52072kq r5 = (C52072kq) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00, C18310x6.A09(this.A01)) + 79233237;
    }

    public C52072kq(AnonymousClass223 r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C52072kq) it.next()).A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostDestination(destinationIdentity=");
        A0o.append(this.A01);
        A0o.append(", destinationApp=");
        A0o.append(this.A00);
        A0o.append(", destinationSurface=");
        return C18260x0.A07("STORY", A0o);
    }
}
