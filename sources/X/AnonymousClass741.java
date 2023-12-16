package X;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.TimeUnit;

/* renamed from: X.741  reason: invalid class name */
public class AnonymousClass741 implements C180348kt {
    public Object A00;
    public final int A01;

    public AnonymousClass741(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ Object get() {
        switch (this.A01) {
            case 0:
                return ((AnonymousClass7OI) this.A00).A00.getApplicationContext().getCacheDir();
            case 1:
                return this.A00;
            case 2:
                return ((AnimatedFactoryV2Impl) this.A00).A07;
            default:
                AnonymousClass7NO r2 = (AnonymousClass7NO) this.A00;
                int i = r2.A02;
                return new AnonymousClass7OL(TimeUnit.SECONDS.toMillis(5), i, Integer.MAX_VALUE, (int) (((float) i) * r2.A00), 50, r2.A01);
        }
    }
}
