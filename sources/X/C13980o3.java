package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.0o3  reason: invalid class name and case insensitive filesystem */
public class C13980o3 extends FutureTask {
    public final /* synthetic */ AnonymousClass0UA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13980o3(AnonymousClass0UA r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        if (!isCancelled()) {
            try {
                this.A00.A02((C05510Tu) get());
            } catch (InterruptedException | ExecutionException e) {
                this.A00.A02(new C05510Tu(e));
            }
        }
    }
}
