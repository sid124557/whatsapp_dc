package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.333  reason: invalid class name */
public class AnonymousClass333 {
    public static final AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass333.class, "_handled");
    public final Throwable A00;
    public volatile int _handled;

    public /* synthetic */ AnonymousClass333(Throwable th) {
        this(th, false);
    }

    public final boolean A00() {
        return AnonymousClass000.A1S(A01.get(this));
    }

    public final boolean A01() {
        return A01.compareAndSet(this, 0, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o);
        A0o.append('[');
        A0o.append(this.A00);
        return AnonymousClass0x2.A0f(A0o);
    }

    public AnonymousClass333(Throwable th, boolean z) {
        this.A00 = th;
        this._handled = z ? 1 : 0;
    }
}
