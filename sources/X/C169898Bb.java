package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: X.8Bb  reason: invalid class name and case insensitive filesystem */
public final class C169898Bb implements C181168mJ {
    public OnSuccessListener A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final Executor A02;

    public C169898Bb(OnSuccessListener onSuccessListener, Executor executor) {
        this.A02 = executor;
        this.A00 = onSuccessListener;
    }

    public final void Btw(Task task) {
        if (task.isSuccessful()) {
            synchronized (this.A01) {
                if (this.A00 != null) {
                    AnonymousClass8MF.A01(task, this, this.A02, 44);
                }
            }
        }
    }
}
