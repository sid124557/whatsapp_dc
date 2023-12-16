package X;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.7iS  reason: invalid class name and case insensitive filesystem */
public final class C157527iS {
    public static C157527iS A04;
    public int A00 = 1;
    public C162757sh A01 = new C162757sh(this);
    public final Context A02;
    public final ScheduledExecutorService A03;

    public final synchronized Task A01(C153277ay r5) {
        if (AnonymousClass6C9.A1Q("MessengerIpcClient")) {
            String valueOf = String.valueOf(r5);
            AnonymousClass6C7.A1G("Queueing ", valueOf, "MessengerIpcClient", AnonymousClass6CA.A0Y(valueOf.length() + 9));
        }
        if (!this.A01.A03(r5)) {
            C162757sh r0 = new C162757sh(this);
            this.A01 = r0;
            r0.A03(r5);
        }
        return r5.A03.A00;
    }

    public static synchronized C157527iS A00(Context context) {
        C157527iS r1;
        synchronized (C157527iS.class) {
            r1 = A04;
            if (r1 == null) {
                r1 = new C157527iS(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C173208Os("MessengerIpcClient"))));
                A04 = r1;
            }
        }
        return r1;
    }

    public C157527iS(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }
}
