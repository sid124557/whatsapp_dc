package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9iy  reason: invalid class name and case insensitive filesystem */
public class C200839iy implements Runnable {
    public final /* synthetic */ C193399Oi A00;
    public final /* synthetic */ C195349Xk A01;
    public final /* synthetic */ File A02;

    public C200839iy(C193399Oi r1, C195349Xk r2, File file) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = file;
    }

    public void run() {
        boolean z;
        C194579Tm r1;
        AnonymousClass9K2 r0;
        C193399Oi r02 = this.A00;
        AnonymousClass9W5 r6 = r02.A00;
        C195349Xk r9 = this.A01;
        File file = this.A02;
        C194249Sd r5 = r02.A01;
        List<C194339Sm> A06 = r6.A06(r5);
        ArrayList A0p = AnonymousClass000.A0p(A06);
        boolean z2 = false;
        boolean z3 = false;
        for (C194339Sm r12 : A06) {
            A0p.add(r12.A08);
            if (!z3 && !r12.A00()) {
                z3 = true;
            }
        }
        if (r6.A02.Bki(r9.A02, new C195559Yj(r6, r9, A0p), file) != null) {
            z2 = true;
        }
        if (!z2) {
            r1 = new C194579Tm();
            r0 = AnonymousClass9K2.CACHE_PUT_FAILED;
        } else {
            synchronized (r6.A06) {
                List<C194339Sm> A062 = r6.A06(r5);
                Iterator it = A062.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((C194339Sm) it.next()).A00()) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    r6.A0A(r5, (C193209No) null, (AnonymousClass9KQ) null, true);
                } else {
                    ArrayList A0p2 = AnonymousClass000.A0p(A062);
                    for (C194339Sm r03 : A062) {
                        A0p2.add(r03.A08);
                    }
                    Map map = (Map) r6.A03(A0p2, Collections.singletonList(r5), true).A00;
                    if (!map.containsKey(r5)) {
                        r1 = new C194579Tm();
                        r0 = AnonymousClass9K2.CACHE_GET_AFTER_PUT_FAILED;
                    } else {
                        r6.A0A(r5, (C193209No) map.get(r5), (AnonymousClass9KQ) null, true);
                    }
                }
            }
            r6.A08();
        }
        r1.A00 = r0;
        r6.A0A(r5, (C193209No) null, r1.A00(), false);
        r6.A08();
    }
}
