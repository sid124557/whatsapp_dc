package androidx.work;

import X.AnonymousClass001;
import X.AnonymousClass0BT;
import X.AnonymousClass0PW;
import X.AnonymousClass0QH;
import X.C03070Is;
import X.C11120j8;
import X.C12000ko;
import X.C188268yc;
import android.content.Context;

public abstract class Worker extends AnonymousClass0QH {
    public AnonymousClass0BT A00;

    public abstract C03070Is A0C();

    public AnonymousClass0PW A0B() {
        throw AnonymousClass001.A0e("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public C188268yc A08() {
        AnonymousClass0BT A002 = AnonymousClass0BT.A00();
        this.A01.A09.execute(new C12000ko(this, A002));
        return A002;
    }

    public final C188268yc A09() {
        this.A00 = AnonymousClass0BT.A00();
        this.A01.A09.execute(new C11120j8(this));
        return this.A00;
    }
}
