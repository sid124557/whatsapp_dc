package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3FS  reason: invalid class name */
public final class AnonymousClass3FS implements AnonymousClass4E8 {
    public final C620233e A00;
    public final C113995mK A01;

    public void BQX() {
        C113995mK r5 = this.A01;
        List A06 = this.A00.A06();
        AnonymousClass1ZA r4 = new AnonymousClass1ZA();
        Long A0T = AnonymousClass0x2.A0T();
        r4.A01 = A0T;
        r4.A03 = A0T;
        r4.A00 = A0T;
        r4.A02 = A0T;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A06) {
            if (!AnonymousClass000.A1Y(((C623534r) next).A0A, AnonymousClass1fY.A00)) {
                A0s.add(next);
            }
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C623534r r6 = (C623534r) it.next();
            r4.A01 = AnonymousClass0x9.A0n(AnonymousClass0x2.A0D(r4.A01), 1);
            if (r6.A02() != r6.A03()) {
                r4.A03 = AnonymousClass0x9.A0n(AnonymousClass0x2.A0D(r4.A03), 1);
            }
            r4.A00 = AnonymousClass0x9.A0n(AnonymousClass0x2.A0D(r4.A00), (long) r6.A02());
            r4.A02 = AnonymousClass0x9.A0n(AnonymousClass0x2.A0D(r4.A02), (long) (r6.A02() - r6.A03()));
        }
        r5.A08.BhB(r4);
    }

    public AnonymousClass3FS(C620233e r1, C113995mK r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BDW() {
        return "StatusDailyCron";
    }

    public /* synthetic */ void BQW() {
    }
}
