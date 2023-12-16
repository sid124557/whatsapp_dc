package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5l0  reason: invalid class name and case insensitive filesystem */
public abstract class C113175l0 implements C1229266j {
    public final AnonymousClass1VX A00;
    public final AnonymousClass5U1 A01;

    public boolean B7f() {
        return true;
    }

    public C113175l0(AnonymousClass1VX r1, AnonymousClass5U1 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean A00(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            AnonymousClass5U1 r1 = this.A01;
            if (!r1.A05(A0T) || (!A0T.A1F && r1.A01(A0T))) {
                return true;
            }
        }
        return false;
    }
}
