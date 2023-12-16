package X;

import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9YR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9YR implements CancelableToken {
    public final /* synthetic */ AtomicBoolean A00;

    public final boolean cancel() {
        return this.A00.compareAndSet(false, true);
    }

    public /* synthetic */ AnonymousClass9YR(AtomicBoolean atomicBoolean) {
        this.A00 = atomicBoolean;
    }
}
