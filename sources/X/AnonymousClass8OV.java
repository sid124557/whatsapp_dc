package X;

import java.util.concurrent.Callable;

/* renamed from: X.8OV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8OV implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass8KC A01;

    public final Object call() {
        int i;
        AnonymousClass8KC r2 = this.A01;
        float f = this.A00;
        if (!r2.A0I.get()) {
            i = -6;
        } else {
            r2.A0G.setCornerRadius(f);
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ AnonymousClass8OV(AnonymousClass8KC r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }
}
