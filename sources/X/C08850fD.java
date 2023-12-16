package X;

import android.app.Activity;
import java.util.Iterator;

/* renamed from: X.0fD  reason: invalid class name and case insensitive filesystem */
public final class C08850fD implements C16110sU {
    public final /* synthetic */ C08900fI A00;

    public void Bfq(Activity activity, AnonymousClass0P8 r6) {
        C162457s7.A0J(activity, 0);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0MA r2 = (AnonymousClass0MA) it.next();
            if (C162457s7.A0P(r2.A01, activity)) {
                r2.A00 = r6;
                r2.A03.execute(new C11990kn(r2, r6));
            }
        }
    }

    public C08850fD(C08900fI r1) {
        this.A00 = r1;
    }
}
