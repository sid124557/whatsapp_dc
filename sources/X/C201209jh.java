package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.9jh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201209jh implements Runnable {
    public final /* synthetic */ Exception A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ boolean A03;

    public final void run() {
        boolean z = this.A03;
        ArrayList arrayList = this.A02;
        Exception exc = this.A00;
        Object obj = this.A01;
        if (z || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass9SG r1 = (AnonymousClass9SG) it.next();
                if (z) {
                    r1.A01(obj);
                } else {
                    if (!(exc instanceof CancellationException)) {
                        exc.getClass();
                    }
                    r1.A00(exc);
                }
            }
            return;
        }
        throw new RuntimeException(exc);
    }

    public /* synthetic */ C201209jh(Exception exc, Object obj, ArrayList arrayList, boolean z) {
        this.A03 = z;
        this.A02 = arrayList;
        this.A00 = exc;
        this.A01 = obj;
    }
}
