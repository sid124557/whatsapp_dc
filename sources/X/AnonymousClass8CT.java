package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.8CT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8CT implements C181338mb {
    public final Set A00;

    public Object get() {
        Set<AnonymousClass8CV> set = this.A00;
        HashSet A0K = AnonymousClass002.A0K();
        for (AnonymousClass8CV r0 : set) {
            A0K.add(r0.get());
        }
        return Collections.unmodifiableSet(A0K);
    }

    public AnonymousClass8CT(Set set) {
        this.A00 = set;
    }
}
