package X;

import com.whatsapp.infra.graphql.BaseMexCallback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.1en  reason: invalid class name and case insensitive filesystem */
public final class C27861en extends BaseMexCallback implements Future {
    public C27851em A00;
    public AnonymousClass3Z9 A01;
    public boolean A02;
    public final AnonymousClass7UH A03;
    public final CountDownLatch A04 = new CountDownLatch(1);

    public C27861en(AnonymousClass4GQ r3) {
        this.A03 = (AnonymousClass7UH) r3.invoke(this);
    }

    public void A00(C153197aq r2) {
        C162457s7.A0J(r2, 0);
        C27851em r0 = this.A00;
        if (r0 != null) {
            r0.A00(r2);
        }
    }

    public Object A05(long j, TimeUnit timeUnit) {
        C162457s7.A0J(timeUnit, 1);
        if (!isDone()) {
            this.A03.A00();
            if (!this.A04.await(j, timeUnit)) {
                A03(new TimeoutException());
            }
        }
        AnonymousClass3Z9 r0 = this.A01;
        if (r0 != null) {
            return r0.value;
        }
        return AnonymousClass3Z0.A01(new C135066k4("Expected a result but it was null", (Throwable) null));
    }

    public final void A07(TimeUnit timeUnit, AnonymousClass4GQ r3, long j) {
        C162457s7.A0J(timeUnit, 1);
        C27851em r0 = new C27851em();
        this.A00 = r0;
        r3.invoke(r0);
        A05(j, timeUnit);
    }

    public boolean A04(C160327nS r2) {
        C27851em r0 = this.A00;
        if (r0 != null) {
            return r0.A04(r2);
        }
        return false;
    }

    public final void A06(Object obj) {
        if (this.A01 == null) {
            this.A01 = new AnonymousClass3Z9(obj);
            this.A04.countDown();
        }
    }

    public boolean isDone() {
        return AnonymousClass000.A1T((this.A04.getCount() > 0 ? 1 : (this.A04.getCount() == 0 ? 0 : -1)));
    }

    public void A01(C27871eo r1) {
        A06(r1);
        super.A01(r1);
    }

    public void A03(Throwable th) {
        A06(AnonymousClass3Z0.A01(th));
        super.A03(th);
    }

    public boolean cancel(boolean z) {
        if (isDone()) {
            return false;
        }
        this.A02 = z;
        A06(AnonymousClass3Z0.A01(C135116k9.A00));
        return true;
    }

    public /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return new AnonymousClass3Z9(A05(j, timeUnit));
    }

    public boolean isCancelled() {
        return this.A02;
    }

    public /* bridge */ /* synthetic */ Object get() {
        return new AnonymousClass3Z9(A05(32000, TimeUnit.MILLISECONDS));
    }
}
