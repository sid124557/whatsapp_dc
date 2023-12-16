package X;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8Mp  reason: invalid class name and case insensitive filesystem */
public class C172758Mp implements Runnable, Future {
    public final C54292oU A00;
    public final /* synthetic */ C160257nK A01;

    public C172758Mp(C54292oU r1, C160257nK r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        C160257nK r1 = this.A01;
        if (r1.A02.await(j, timeUnit)) {
            return r1.A03.get();
        }
        throw new TimeoutException();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return AnonymousClass000.A1T((this.A01.A02.getCount() > 0 ? 1 : (this.A01.A02.getCount() == 0 ? 0 : -1)));
    }

    public void run() {
        Set set;
        Context context = this.A00.A00;
        Set A002 = C160257nK.A00(context, "primary-task-killer", C160257nK.A04);
        Set A003 = C160257nK.A00(context, "secondary-task-killer", C160257nK.A05);
        C160257nK r4 = this.A01;
        AtomicReference atomicReference = r4.A03;
        Set set2 = null;
        if (A002 != null) {
            set = Collections.unmodifiableSet(A002);
        } else {
            set = null;
        }
        if (A003 != null) {
            set2 = Collections.unmodifiableSet(A003);
        }
        atomicReference.set(new AnonymousClass5I5(set, set2));
        r4.A02.countDown();
    }

    public /* bridge */ /* synthetic */ Object get() {
        return null;
    }
}
