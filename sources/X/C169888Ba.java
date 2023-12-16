package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: X.8Ba  reason: invalid class name and case insensitive filesystem */
public final class C169888Ba implements C181168mJ {
    public OnFailureListener A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final Executor A02;

    public C169888Ba(OnFailureListener onFailureListener, Executor executor) {
        this.A02 = executor;
        this.A00 = onFailureListener;
    }

    public final void Btw(Task task) {
        if (!task.isSuccessful() && !((AnonymousClass6YV) task).A05) {
            synchronized (this.A01) {
                if (this.A00 != null) {
                    AnonymousClass8MF.A01(task, this, this.A02, 43);
                }
            }
        }
    }
}
