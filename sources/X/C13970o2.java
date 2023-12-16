package X;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.0o2  reason: invalid class name and case insensitive filesystem */
public class C13970o2 extends FutureTask {
    public final /* synthetic */ C13330n0 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13970o2(C13330n0 r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        try {
            Object obj = get();
            C13330n0 r1 = this.A00;
            if (!r1.A04.get()) {
                r1.A00(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            C13330n0 r2 = this.A00;
            if (!r2.A04.get()) {
                r2.A00((Object) null);
            }
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
