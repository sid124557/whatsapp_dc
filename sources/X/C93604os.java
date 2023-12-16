package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4os  reason: invalid class name and case insensitive filesystem */
public final class C93604os extends C113225l5 {
    public final C56972sr A00;

    public boolean BoM(Collection collection) {
        C162457s7.A0J(collection, 0);
        if (!super.BoM(collection) || this.A00.A0Y()) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (C627636p.A0l(C18300x5.A0T(it))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93604os(C56972sr r1, C47052cd r2) {
        super(r2);
        C18260x0.A0Q(r2, r1);
        this.A00 = r1;
    }
}
