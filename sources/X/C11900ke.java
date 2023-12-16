package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0ke  reason: invalid class name and case insensitive filesystem */
public class C11900ke implements Runnable {
    public final /* synthetic */ C12950mO A00;
    public final /* synthetic */ AnonymousClass0U0 A01;

    public C11900ke(C12950mO r1, AnonymousClass0U0 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        C12950mO r3 = this.A00;
        C05460Tk r2 = r3.A01;
        if (r2.A00 == r3.A00) {
            List list = r3.A02;
            AnonymousClass0U0 r1 = this.A01;
            r2.A01 = list;
            r2.A02 = Collections.unmodifiableList(list);
            r1.A01(r2.A05);
            Iterator it = r2.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
