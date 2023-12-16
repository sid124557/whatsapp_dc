package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: X.8BJ  reason: invalid class name */
public final class AnonymousClass8BJ implements C181148mE, OnFailureListener, OnSuccessListener, C181168mJ {
    public final C181138mD A00;
    public final AnonymousClass6YV A01;
    public final Executor A02;

    public final void BOR() {
        this.A01.A00();
    }

    public final void Btw(Task task) {
        AnonymousClass8MF.A01(task, this, this.A02, 41);
    }

    public final void onFailure(Exception exc) {
        this.A01.A03(exc);
    }

    public final void onSuccess(Object obj) {
        this.A01.A04(obj);
    }

    public AnonymousClass8BJ(C181138mD r1, AnonymousClass6YV r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r1;
        this.A01 = r2;
    }
}
