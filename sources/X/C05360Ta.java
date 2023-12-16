package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0Ta  reason: invalid class name and case insensitive filesystem */
public final class C05360Ta {
    public static Executor A02;
    public static final Object A03 = AnonymousClass002.A0D();
    public Executor A00;
    public final AnonymousClass0O4 A01;

    public AnonymousClass0LC A00() {
        Executor executor = this.A00;
        if (executor == null) {
            synchronized (A03) {
                if (A02 == null) {
                    A02 = Executors.newFixedThreadPool(2);
                }
            }
            executor = A02;
            this.A00 = executor;
        }
        return new AnonymousClass0LC(this.A01, executor);
    }

    public C05360Ta(AnonymousClass0O4 r1) {
        this.A01 = r1;
    }
}
