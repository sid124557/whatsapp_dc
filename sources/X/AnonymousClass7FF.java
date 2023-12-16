package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/* renamed from: X.7FF  reason: invalid class name */
public class AnonymousClass7FF {
    public final BlockingQueue A00 = new DelayQueue();
    public final C173718Rj[] A01;

    public static void A00(C172748Mo r2, String str) {
        r2.A02 = str;
        r2.A01 = 0;
        C161847qe.A00().A00.add(r2);
    }

    public AnonymousClass7FF(int i) {
        this.A01 = new C173718Rj[i];
        int i2 = 0;
        while (true) {
            C173718Rj[] r1 = this.A01;
            if (i2 < r1.length) {
                r1[i2] = new C173718Rj(this);
                this.A01[i2].setName(AnonymousClass000.A0Y("GCD-Thread #", AnonymousClass001.A0o(), i2));
                this.A01[i2].start();
                i2++;
            } else {
                return;
            }
        }
    }
}
