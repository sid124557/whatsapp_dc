package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9Yu  reason: invalid class name and case insensitive filesystem */
public class C195619Yu implements Reference {
    public final C195629Yv A00;
    public final AtomicBoolean A01 = C18280x3.A0l();

    public void finalize() {
        if (!this.A01.getAndSet(true)) {
            this.A00.release();
        }
        super.finalize();
    }

    public Object get() {
        if (!this.A01.get()) {
            return this.A00.get();
        }
        throw AnonymousClass001.A0e("Accessing released reference.");
    }

    public void release() {
        if (!this.A01.getAndSet(true)) {
            this.A00.release();
            return;
        }
        throw AnonymousClass001.A0e("Reference was already released.");
    }

    public C195619Yu(C195629Yv r2) {
        this.A00 = r2;
    }
}
