package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.1I2  reason: invalid class name */
public class AnonymousClass1I2 extends AnonymousClass3XA {
    public int A00;
    public boolean A01 = false;
    public final List A02;
    public final List A03;

    public final void A07() {
        ArrayList arrayList;
        AnonymousClass24L r1;
        synchronized (this) {
            arrayList = null;
            if (this.A01) {
                r1 = null;
                arrayList = AnonymousClass002.A0J(this.A02);
            } else {
                r1 = new AnonymousClass24L(this.A03);
            }
        }
        if (arrayList != null) {
            A05(arrayList);
        } else {
            A06(r1);
        }
    }

    public AnonymousClass1I2(List list) {
        C626936e.A0E(AnonymousClass001.A1W(list.size()), "AllOfAsyncFuture: futures list is empty");
        this.A02 = AnonymousClass002.A0J(Collections.nCopies(list.size(), (Object) null));
        this.A03 = AnonymousClass002.A0J(Collections.nCopies(list.size(), (Object) null));
        this.A00 = list.size();
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass3XA r2 = (AnonymousClass3XA) list.get(i);
            r2.A03(new AnonymousClass92W(this, i, 0));
            r2.A00.A04(new AnonymousClass92W(this, i, 1), (Executor) null);
        }
    }
}
