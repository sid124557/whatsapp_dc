package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6dg  reason: invalid class name and case insensitive filesystem */
public class C131496dg extends C159187lJ implements Iterable {
    public List A00 = AnonymousClass001.A0s();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C131496dg)) {
            return false;
        }
        return this.A00.equals(((C131496dg) obj).A00);
    }

    public Iterator iterator() {
        return this.A00.iterator();
    }

    public C131496dg(Collection collection) {
        for (Object A01 : collection) {
            this.A00.add(C159187lJ.A01(A01));
        }
    }

    public String toString() {
        return AnonymousClass000.A0W(C160947oi.A00(this.A00, ",", ""), AnonymousClass001.A0p());
    }
}
