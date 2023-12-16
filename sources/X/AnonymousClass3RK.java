package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3RK  reason: invalid class name */
public final class AnonymousClass3RK implements AnonymousClass4DH {
    public /* synthetic */ void BS5(AnonymousClass8SE r1) {
    }

    public void BiS(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1RL r4 = (AnonymousClass1RL) it.next();
            StringBuilder A0o = AnonymousClass001.A0o();
            StringBuilder A0w = C18290x4.A0w("\nNewsletter/directory ", A0o);
            A0w.append(r4.A0H);
            A0w.append(" (");
            A0w.append(r4.A05);
            A0w.append(") | Member: ");
            A0w.append(!AnonymousClass000.A1Y(r4.A07, C372821q.GUEST));
            A0w.append(" | Verified: ");
            A0w.append(r4.A0L());
            AnonymousClass000.A1B(A0w, A0o);
            C18270x1.A1E(A0o, 10);
        }
    }
}
