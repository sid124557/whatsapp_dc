package X;

import java.util.TreeSet;

/* renamed from: X.5PZ  reason: invalid class name */
public final class AnonymousClass5PZ {
    public final AnonymousClass5WZ A00;
    public final TreeSet A01 = new TreeSet();

    public void A01(Class cls) {
        C162457s7.A0J(cls, 0);
        C117035rH A002 = this.A00.A00(cls);
        if (A002 != null) {
            C117035rH A003 = A00();
            if (!C162457s7.A0P(A003, A002) && A002.A06()) {
                if (A003 != null) {
                    if (Integer.compare(A002.A00, A003.A00) < 0) {
                        C117035rH A004 = A00();
                        if (A004 != null) {
                            A004.A04(new C171128Fw(), false);
                        }
                    } else {
                        this.A01.add(A002);
                        return;
                    }
                }
                this.A01.add(A002);
                A002.A02();
            }
        }
    }

    public C117035rH A00() {
        TreeSet treeSet = this.A01;
        if (treeSet.isEmpty()) {
            return null;
        }
        return (C117035rH) treeSet.first();
    }

    public AnonymousClass5PZ(AnonymousClass5WZ r2) {
        this.A00 = r2;
    }
}
