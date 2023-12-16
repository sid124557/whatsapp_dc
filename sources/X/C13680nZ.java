package X;

import java.util.concurrent.Executor;

/* renamed from: X.0nZ  reason: invalid class name and case insensitive filesystem */
public class C13680nZ implements Executor {
    public final /* synthetic */ C09160fk A00;

    public C13680nZ(C09160fk r1) {
        this.A00 = r1;
    }

    public void execute(Runnable runnable) {
        this.A00.A00.post(runnable);
    }
}
