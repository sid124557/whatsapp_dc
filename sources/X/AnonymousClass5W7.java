package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5W7  reason: invalid class name */
public final class AnonymousClass5W7 {
    public final C69263Wi A00;
    public final AnonymousClass5QW A01;
    public final C620733j A02;
    public final AnonymousClass4FS A03;

    public static final boolean A00(C1223664c r5, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1223664c r2 = (C1223664c) it.next();
                if ((r2 instanceof C109045dz) && (r5 instanceof C109045dz) && C162457s7.A0P(((C109045dz) r2).A02, ((C109045dz) r5).A02)) {
                    return true;
                }
                if ((r2 instanceof C109025dx) && (r5 instanceof C109025dx) && C162457s7.A0P(((C109025dx) r2).A01, ((C109025dx) r5).A01)) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass5W7(C69263Wi r1, AnonymousClass5QW r2, C620733j r3, AnonymousClass4FS r4) {
        C18260x0.A0c(r1, r4, r3, r2);
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
