package X;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.46Q  reason: invalid class name */
public abstract class AnonymousClass46Q extends C73853gB implements Closeable {
    public static final C73873gD A00 = new C73873gD();

    public void close() {
        ExecutorService executorService;
        if (this instanceof AnonymousClass46N) {
            throw AnonymousClass002.A0G("Dispatchers.Default cannot be closed");
        } else if (this instanceof AnonymousClass46O) {
            throw AnonymousClass001.A0e("Cannot be invoked on Dispatchers.IO");
        } else {
            Executor executor = ((AnonymousClass46P) this).A00;
            if ((executor instanceof ExecutorService) && (executorService = (ExecutorService) executor) != null) {
                executorService.shutdown();
            }
        }
    }
}
