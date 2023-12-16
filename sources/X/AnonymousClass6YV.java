package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.6YV  reason: invalid class name */
public final class AnonymousClass6YV extends Task {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public final AnonymousClass7WE A03 = new AnonymousClass7WE();
    public final Object A04 = AnonymousClass002.A0D();
    public volatile boolean A05;

    public final void A00() {
        synchronized (this.A04) {
            if (!this.A02) {
                this.A02 = true;
                this.A05 = true;
                this.A03.A00(this);
            }
        }
    }

    public final void A01() {
        String str;
        if (this.A02) {
            if (!isComplete()) {
                throw AnonymousClass001.A0e("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception exception = getException();
            if (exception != null) {
                str = "failure";
            } else if (isSuccessful()) {
                str = "result ".concat(String.valueOf(getResult()));
            } else if (this.A05) {
                str = "cancellation";
            } else {
                str = "unknown issue";
            }
            throw new C143996zp("Complete with: ".concat(str), exception);
        }
    }

    public final void A02() {
        synchronized (this.A04) {
            if (this.A02) {
                this.A03.A00(this);
            }
        }
    }

    public final void A03(Exception exc) {
        C162177rO.A03(exc, "Exception must not be null");
        synchronized (this.A04) {
            A01();
            this.A02 = true;
            this.A00 = exc;
        }
        this.A03.A00(this);
    }

    public final void A04(Object obj) {
        synchronized (this.A04) {
            A01();
            this.A02 = true;
            this.A01 = obj;
        }
        this.A03.A00(this);
    }

    public final Task addOnCanceledListener(Executor executor, C181148mE r4) {
        this.A03.A01(new AnonymousClass8BY(r4, executor));
        A02();
        return this;
    }

    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        this.A03.A01(new AnonymousClass8BZ(onCompleteListener, executor));
        A02();
        return this;
    }

    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.A03.A01(new C169888Ba(onFailureListener, executor));
        A02();
        return this;
    }

    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        this.A03.A01(new C169898Bb(onSuccessListener, executor));
        A02();
        return this;
    }

    public final Task continueWith(Executor executor, C181138mD r5) {
        AnonymousClass6YV r2 = new AnonymousClass6YV();
        this.A03.A01(new AnonymousClass8BX(r5, r2, executor));
        A02();
        return r2;
    }

    public final Task continueWithTask(Executor executor, C181138mD r5) {
        AnonymousClass6YV r2 = new AnonymousClass6YV();
        this.A03.A01(new AnonymousClass8BJ(r5, r2, executor));
        A02();
        return r2;
    }

    public final Exception getException() {
        Exception exc;
        synchronized (this.A04) {
            exc = this.A00;
        }
        return exc;
    }

    public final Object getResult(Class cls) {
        Throwable th;
        Object obj;
        synchronized (this.A04) {
            C162177rO.A04("Task is not yet complete", this.A02);
            if (this.A05) {
                th = new CancellationException("Task is already canceled.");
            } else if (!cls.isInstance(this.A00)) {
                Exception exc = this.A00;
                if (exc == null) {
                    obj = this.A01;
                } else {
                    th = new RuntimeExecutionException(exc);
                }
            } else {
                th = (Throwable) cls.cast(this.A00);
            }
            throw th;
        }
        return obj;
    }

    public final boolean isComplete() {
        boolean z;
        synchronized (this.A04) {
            z = this.A02;
        }
        return z;
    }

    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.A04) {
            z = false;
            if (this.A02 && !this.A05 && this.A00 == null) {
                z = true;
            }
        }
        return z;
    }

    public final Task onSuccessTask(Executor executor, C181158mI r5) {
        AnonymousClass6YV r2 = new AnonymousClass6YV();
        this.A03.A01(new AnonymousClass8BK(r5, r2, executor));
        A02();
        return r2;
    }

    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.A03.A01(new AnonymousClass8BZ(onCompleteListener, TaskExecutors.MAIN_THREAD));
        A02();
        return this;
    }

    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
        return this;
    }

    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
        return this;
    }

    public final Object getResult() {
        Throwable th;
        Object obj;
        synchronized (this.A04) {
            C162177rO.A04("Task is not yet complete", this.A02);
            if (!this.A05) {
                Exception exc = this.A00;
                if (exc == null) {
                    obj = this.A01;
                } else {
                    th = new RuntimeExecutionException(exc);
                }
            } else {
                th = new CancellationException("Task is already canceled.");
            }
            throw th;
        }
        return obj;
    }
}
