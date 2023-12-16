package X;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: X.8BY  reason: invalid class name */
public final class AnonymousClass8BY implements C181168mJ {
    public C181148mE A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final Executor A02;

    public final void Btw(Task task) {
        if (((AnonymousClass6YV) task).A05) {
            synchronized (this.A01) {
            }
            this.A02.execute(new C172668Mf(this, 32));
        }
    }

    public AnonymousClass8BY(C181148mE r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }
}
