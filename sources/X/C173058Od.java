package X;

import android.os.HandlerThread;
import java.util.concurrent.Callable;

/* renamed from: X.8Od  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C173058Od implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass8KC A02;
    public final /* synthetic */ AnonymousClass7X0 A03;

    public final Object call() {
        int i;
        AnonymousClass8KC r5 = this.A02;
        AnonymousClass7X0 r4 = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        HandlerThread handlerThread = r5.A0B;
        C626936e.A03(handlerThread);
        r5.A08 = true;
        if (!r5.A0E()) {
            i = -6;
        } else {
            boolean A012 = r4.A01(r5.A0G, i2, i3);
            i = -7;
            if (A012) {
                C626936e.A03(handlerThread);
                r5.A08 = false;
                i = r5.A02();
            }
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ C173058Od(AnonymousClass8KC r1, AnonymousClass7X0 r2, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
    }
}
