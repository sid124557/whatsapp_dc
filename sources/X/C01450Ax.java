package X;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Ax  reason: invalid class name and case insensitive filesystem */
public final class C01450Ax extends C04770Qp {
    public /* bridge */ /* synthetic */ AnonymousClass0NS A01() {
        if (this.A02 && Build.VERSION.SDK_INT >= 23 && this.A00.A0A.A00()) {
            throw AnonymousClass001.A0c("Cannot set backoff criteria on an idle mode job");
        } else if (!this.A00.A0H) {
            return new C01470Az(this);
        } else {
            throw AnonymousClass001.A0c("PeriodicWorkRequests cannot be expedited");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C01450Ax(Class cls, TimeUnit timeUnit, TimeUnit timeUnit2) {
        super(cls);
        C162457s7.A0J(timeUnit, 3);
        C162457s7.A0J(timeUnit2, 5);
        this.A00.A04(timeUnit.toMillis(43200000), timeUnit2.toMillis(21600000));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C01450Ax(Class cls, TimeUnit timeUnit) {
        super(cls);
        C162457s7.A0J(timeUnit, 3);
        C06250Wv r6 = this.A00;
        long millis = timeUnit.toMillis(24);
        if (millis < 900000) {
            C06240Wu.A00();
            Log.w(C06250Wv.A0L, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        millis = millis < 900000 ? 900000 : millis;
        r6.A04(millis, millis);
    }
}
