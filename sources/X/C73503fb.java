package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.3fb  reason: invalid class name and case insensitive filesystem */
public class C73503fb extends FutureTask {
    public final /* synthetic */ AnonymousClass1I8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73503fb(AnonymousClass1I8 r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        AnonymousClass1I8 r2 = this.A00;
        if (r2.A02.isCancelled()) {
            r2.A00.A05(Boolean.TRUE);
        }
        r2.A01.countDown();
    }
}
