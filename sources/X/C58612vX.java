package X;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.2vX  reason: invalid class name and case insensitive filesystem */
public class C58612vX {
    public C52882mC A00;
    public C52882mC A01;
    public final Set A02;

    public C58612vX(C52882mC r3, C52882mC r4, Set set) {
        ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet(new AnonymousClass4IU(20));
        this.A02 = concurrentSkipListSet;
        concurrentSkipListSet.addAll(set);
        this.A00 = r3;
        this.A01 = r4;
    }

    public C58612vX() {
        this.A02 = new ConcurrentSkipListSet(new AnonymousClass4IU(20));
    }
}
