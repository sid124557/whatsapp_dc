package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5NU  reason: invalid class name */
public final class AnonymousClass5NU {
    public final int A00;
    public final C56972sr A01;
    public final AnonymousClass5ZU A02;

    public final List A00(Collection collection, HashSet hashSet) {
        C56972sr r0 = this.A01;
        AnonymousClass5ZU r6 = this.A02;
        C117855sb r5 = new C117855sb(r0, r6, this, hashSet);
        ArrayList A0c = C73783g4.A0c(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            A0c.add(new AnonymousClass5Rm(r6.A0D(A0R, this.A00, false, false), A0R));
        }
        List<AnonymousClass5Rm> A0L = C73723fy.A0L(A0c, r5);
        ArrayList A0c2 = C73783g4.A0c(A0L);
        for (AnonymousClass5Rm r02 : A0L) {
            A0c2.add(r02.A01);
        }
        return A0c2;
    }

    public AnonymousClass5NU(C56972sr r1, AnonymousClass5ZU r2, int i) {
        C18260x0.A0Q(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }
}
