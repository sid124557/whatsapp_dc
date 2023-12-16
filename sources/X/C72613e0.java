package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3e0  reason: invalid class name and case insensitive filesystem */
public final class C72613e0 implements AnonymousClass4C5 {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ AnonymousClass4C5 A01;

    public C72613e0(Comparator comparator, AnonymousClass4C5 r2) {
        this.A01 = r2;
        this.A00 = comparator;
    }

    public Iterator iterator() {
        List A02 = C829345m.A02(this.A01);
        C73753g1.A0a(A02, this.A00);
        return A02.iterator();
    }
}
