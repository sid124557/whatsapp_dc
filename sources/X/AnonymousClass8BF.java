package X;

import android.util.Pair;
import com.google.android.gms.tasks.Task;

/* renamed from: X.8BF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8BF implements C181138mD {
    public final Pair A00;
    public final AnonymousClass7GV A01;

    public final Object Bqf(Task task) {
        AnonymousClass7GV r2 = this.A01;
        Pair pair = this.A00;
        synchronized (r2) {
            r2.A00.remove(pair);
        }
        return task;
    }

    public AnonymousClass8BF(Pair pair, AnonymousClass7GV r2) {
        this.A01 = r2;
        this.A00 = pair;
    }
}
