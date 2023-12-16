package X;

import java.util.concurrent.Executor;

/* renamed from: X.46O  reason: invalid class name */
public final class AnonymousClass46O extends AnonymousClass46Q implements Executor {
    public static final C73853gB A00;
    public static final AnonymousClass46O A01 = new AnonymousClass46O();

    static {
        AnonymousClass46C r3 = AnonymousClass46C.A00;
        int i = C39292Bk.A00;
        int i2 = 64;
        if (64 < i) {
            i2 = i;
        }
        A00 = r3.A00((int) AnonymousClass2AS.A00("kotlinx.coroutines.io.parallelism", (long) i2, (long) 1, (long) Integer.MAX_VALUE));
    }

    public void execute(Runnable runnable) {
        A00.A01(runnable, C72553du.A00);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
