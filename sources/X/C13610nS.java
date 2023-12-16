package X;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* renamed from: X.0nS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13610nS implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass0OB A02;

    public final Object call() {
        AnonymousClass0OB r0 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        WorkDatabase workDatabase = r0.A00;
        int A002 = AnonymousClass0J2.A00(workDatabase, "next_job_scheduler_id");
        if (i > A002 || A002 > i2) {
            workDatabase.A0F().BGe(new AnonymousClass0PK("next_job_scheduler_id", Long.valueOf((long) (i + 1))));
        } else {
            i = A002;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ C13610nS(AnonymousClass0OB r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }
}
