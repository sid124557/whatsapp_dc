package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: X.8BZ  reason: invalid class name */
public final class AnonymousClass8BZ implements C181168mJ {
    public OnCompleteListener A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final Executor A02;

    public final void Btw(Task task) {
        synchronized (this.A01) {
            if (this.A00 != null) {
                AnonymousClass8MF.A01(task, this, this.A02, 42);
            }
        }
    }

    public AnonymousClass8BZ(OnCompleteListener onCompleteListener, Executor executor) {
        this.A02 = executor;
        this.A00 = onCompleteListener;
    }
}
