package X;

import android.util.Pair;
import java.util.Map;

/* renamed from: X.6PM  reason: invalid class name */
public final class AnonymousClass6PM extends AnonymousClass6PJ {
    public final int A00;
    public final AnonymousClass6PN A01;
    public final Map A02 = AnonymousClass001.A0t();
    public final Map A03 = AnonymousClass001.A0t();

    public C187628xY B0w(AnonymousClass6PS r4, C183888qp r5, long j) {
        if (this.A00 == Integer.MAX_VALUE) {
            return this.A01.B0w(r4, r5, j);
        }
        AnonymousClass6PS A002 = r4.A00(((Pair) r4.A04).second);
        this.A02.put(A002, r4);
        C1690187q A04 = this.A01.B0w(A002, r5, j);
        this.A03.put(A04, A002);
        return A04;
    }

    public C151877Wq B9V() {
        return this.A01.A07.B9V();
    }

    public void Biv(C187628xY r3) {
        this.A01.Biv(r3);
        Object remove = this.A03.remove(r3);
        if (remove != null) {
            this.A02.remove(remove);
        }
    }

    public AnonymousClass6PM(C186428vI r3, int i) {
        C161487pm.A03(AnonymousClass001.A1W(i));
        this.A01 = new AnonymousClass6PN(r3, false);
        this.A00 = i;
    }

    public void A02(C178288hI r3) {
        super.A02(r3);
        A03(this.A01, (Object) null);
    }
}
