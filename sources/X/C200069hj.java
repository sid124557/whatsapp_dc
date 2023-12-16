package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9hj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200069hj implements Runnable {
    public final /* synthetic */ AnonymousClass9b0 A00;
    public final /* synthetic */ List A01;

    public final void run() {
        AnonymousClass9b0 r3 = this.A00;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            r3.A06.A08(C1899693i.A0E(it));
        }
    }

    public /* synthetic */ C200069hj(AnonymousClass9b0 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }
}
